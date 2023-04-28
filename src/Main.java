import java.util.*;
public class Main {
    static DataProcessing byCity = city ->{
        city.stream().filter(c-> c.getCity().equals("NYC")).forEach(System.out::println);
        return city.stream().filter(c-> c.getCity().equals("NYC")) ;};
    //static DataProcessing sales = sale -> {
       // sale.stream().map(Venta::getSales).sum();
    //}
}