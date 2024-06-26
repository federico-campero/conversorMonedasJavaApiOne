import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversion {


    public Conversion buscarConversion(String codigo) {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/d6cbf08e4626a2341e8e7ae7/latest/" + codigo);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();



        try {
            HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
