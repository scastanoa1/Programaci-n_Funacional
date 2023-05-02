import java.util.List;
import java.util.stream.Stream;

public interface DataFilter {
    Stream<Venta> proccesing(List<Venta> p);
}
