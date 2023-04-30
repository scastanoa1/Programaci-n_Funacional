import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Procesamiento {
    //static Map<String, Double> salesByCustomer;
    static DataProcessing byCity = list ->{
    //list.stream().filter(c-> c.getCity().equals("NYC")).forEach(System.out::println);
        return list.stream().filter(c-> c.getCity().equals("NYC")) ;};


    static DataSales bysales = list -> {
        return list.reduce(0.0,(x, s)-> x+s.getSales(),Double::sum);
    };

    static DataProduct byProduct = (list,p)->{

        return list.filter(v ->v.getProductLine().equals(p)).reduce(0.0,(x, s)-> x+s.getSales(),Double::sum);
    };
    static DataProduct byQuantity = (list,p)->{

        return list.filter(v ->v.getProductLine().equals(p)).reduce(0.0,(x, s)-> x+s.getQuantityOrdered(),Double::sum);
    };

    /*static DataName allClients = list -> {
        salesByCustomer = list.collect(Collectors.groupingBy
                (Venta::getCustomerName, Collectors.summingDouble(Venta::getSales)));
        List<String> customerNames = list.map(Venta::getCustomerName).distinct().collect(Collectors.toList());
        //customerNames.forEach(System.out::println);
        return customerNames;
    };*/

    static DataSales byNYCClient = list ->{
        //return s.filter(v -> v.getProductLine().equals("Classic Cars")).mapToDouble(Venta::getSales).max();
        return list.filter(v -> v.getCity().equals("NYC") &&
                (v.getProductLine().equals("Classic Cars") || v.getProductLine().equals("Vintage Cars"))).
                mapToDouble(Venta::getSales).sum();
    };

    static DataMax maxByNYCClient = list ->{
        Map<String, Double> salesByCustomer = list.filter(v -> v.getCity().equals("NYC") &&
                (v.getProductLine().equals("Classic Cars") || v.getProductLine().equals("Vintage Cars"))).collect(Collectors.groupingBy
                (Venta::getCustomerName, Collectors.summingDouble(Venta::getSales)));
        //return s.filter(v -> v.getProductLine().equals("Classic Cars")).mapToDouble(Venta::getSales).max();
        return salesByCustomer.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("");
    };

    static DataMax maxByAllClient = list ->{
        Map<String, Double> salesByCustomer = list.collect(Collectors.groupingBy
                (Venta::getCustomerName, Collectors.summingDouble(Venta::getSales)));
        return salesByCustomer.entrySet().stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("");
    };

    static DataMax minByAllClient = list ->{
        Map<String, Double> salesByCustomer = list.collect(Collectors.groupingBy
                (Venta::getCustomerName, Collectors.summingDouble(Venta::getSales)));
        return salesByCustomer.entrySet().stream()
                .min(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("");
    };
}