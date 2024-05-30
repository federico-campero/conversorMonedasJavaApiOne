import java.util.Map;

public record Conversion(String base_code, Map<String, Double> conversion_rates) {
}
