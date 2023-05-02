import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Procesamiento {


    //Recibe un List<Venta>, lo filtra por Nueva York y retorna un Stream<Venta> con solo las Venta
    static DataFilter byCity = list -> list.stream().filter(c-> c.getCity().equals("NYC"));


    //Recibe un Stream<Venta> y retorna un double con la cantidad de sales
    static DataSales bySales = list -> list.reduce(0.0,(x, s)-> x+s.getSales(),Double::sum);


    //Recibe un Stream<Venta> y un String, y retorna un double de los sales filtrados por tipo de producto(ProductLine)
    static DataProduct byProduct = (list,p)->list.filter(v ->v.getProductLine().equals(p))
            .reduce(0.0,(x, s)-> x+s.getSales(),Double::sum);


    /*Recibe un Stream<Venta> y un String, filtra el Stream segun si el ProductLine de la Venta coincide con el String
    recibido, para despues retornar la sumatoria de la cantidad pedida de los productos filtrados*/
    static DataProduct byQuantity = (list,p)->list.filter(v ->v.getProductLine().equals(p))
            .reduce(0.0,(x, s)-> x+s.getQuantityOrdered(),Double::sum);


    //Recibe un Stream<Venta> y retorna un Map<String, Double> con el nombre del cliente y la cantidad total  de sus sales
    static  Mapping toMap = list->list.collect(Collectors.groupingBy (Venta::getCustomerName, Collectors.summingDouble(Venta::getSales)));


    /*Recibe un Map<String,Double> y un boolean, retorna un String con el nombre del cliente, segun si el boolean es true el cliente con mas ventas
    o el cliente con menor cantidad de ventas si el boolean es false*/
    static DataName toClient = (s, m) ->((m?s.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(""):s.entrySet().stream()
                .min(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("")));


    //Recibe un Stream<Venta> y retorna un String con el nombre del cliente con mas ventas de carros en NY
    static DataMax maxByNYCClient = list -> toClient.client(toMap.mapped(list.filter(v -> v.getCity().equals("NYC") &&
                (v.getProductLine().equals("Classic Cars") || v.getProductLine().equals("Vintage Cars")))),true);


    //Recibe un Stream<Venta> y retorna un String con el nombre del cliente con mas ventas en general
    static DataMax maxByAllClient = list -> toClient.client(toMap.mapped(list),true);


    //Recibe un Stream<Venta> y retorna un String con el nombre del cliente con menos ventas en general
    static DataMax minByAllClient = list -> toClient.client(toMap.mapped(list),false);
}