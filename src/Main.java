import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type the name of the file: ");
        try {
            List<Venta> recorrer = Entrada.loadData.read(scan.nextLine());
            List<Venta> streamCity = Procesamiento.byCity.proccesing(recorrer).toList();
            System.out.println("------------------------VENTAS EN NUEVA YORK-------------------------------");
            streamCity.stream().forEach(System.out::println); //ventas en NY NO Quitar el .stream()
            System.out.println("------------------------SALES TOTALES EN NUEVA YORK-------------------------------");
            System.out.println(Procesamiento.bySales.sales(streamCity.stream())); //sales en NY
            System.out.println("----------------------CANTIDAD DE CLASSIC CARS EN NUEVA YORK------------------------- ");
            System.out.println(Procesamiento.byQuantity.product(streamCity.stream(),"Classic Cars")); //cantidad en NY por auto clasico
            System.out.println("----------------------SALES TOTALES DE CLASSIC CARS EN NUEVA YORK------------------------------");
            System.out.println(Procesamiento.byProduct.product(streamCity.stream(),"Classic Cars")); //sales en NY por auto clasico
            System.out.println("----------------------CANTIDAD DE MOTOS EN NUEVA YORK------------------------------");
            System.out.println(Procesamiento.byQuantity.product(streamCity.stream(),"Motorcycles")); //cantidad en NY por moto
            System.out.println("----------------------SALES TOTALES DE MOTOS EN NUEVA YORK--------------------");
            System.out.println(Procesamiento.byProduct.product(streamCity.stream(),"Motorcycles"));//sales en NY por moto
            System.out.println("----------------------CLIENTE CON MAYOR CANTIDAD DE SALES DE CARROS EN NUEVA YORK------------------");
            System.out.println(Procesamiento.maxByNYCClient.customers(recorrer.stream())); //cliente con mas ventas de carros en NY
            System.out.println("----------------------CLIENTE CON MAYOR CANTIDAD DE SALES--------------------------------------");
            System.out.println(Procesamiento.maxByAllClient.customers(recorrer.stream()));//cliente con mas ventas en general
            System.out.println("----------------------CLIENTE CON MENOR CANTIDAD DE SALES---------------------------------");
            System.out.println(Procesamiento.minByAllClient.customers(recorrer.stream()));//cliente con menos ventas en general
        }
        catch(NullPointerException e){
            System.out.println("Error de algun tipo");}
    }
}

