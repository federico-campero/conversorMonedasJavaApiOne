import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        CalculadoraConversion calculadoraConversion = new CalculadoraConversion();

        Scanner lectura = new Scanner(System.in);

        String bienvenida = """
                ----------------------------------------------------
                
                Bienvenido/a al Conversor de Monedas
                
                1) Dolar a Peso Argentino
                2) Peso Argentino a Dolar
                3) Dolar a Peso Chileno
                4) Peso Chileno a Dolar
                5) Dolar a Real Brasileño
                6) Real Brasileño a Dolar
                7) salir
                
                Indique que conversion desea realizar:
      
                ----------------------------------------------------
                """;

        System.out.println(bienvenida);


        while(true){

            int eleccion =  lectura.nextInt();

            if(eleccion == 7){
                break;
            }
            if(eleccion == 1){

                System.out.println("Ingrese el importe que desea convertir");
                double importe = lectura.nextDouble();

                double conversionRealizada = calculadoraConversion.deDolarAPesoArgentino(importe);

                System.out.println(conversionRealizada);

                continue;
            }




        }



    }
}

