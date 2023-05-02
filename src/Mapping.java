import java.util.Map;
import java.util.stream.Stream;
public interface Mapping {
    Map<String, Double> mapped(Stream<Venta> p);
}
