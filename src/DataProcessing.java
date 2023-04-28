import java.util.List;
import java.util.stream.Stream;

public interface DataProcessing {
    Stream<Venta> proccesing(List<Venta> p);
}
