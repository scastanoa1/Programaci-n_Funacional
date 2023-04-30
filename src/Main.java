import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //sales_data.csv
        System.out.print("Please type the name of the file: ");

        try {
            List<Venta> recorrer = Entrada.prueba.read(scan.nextLine());
            Stream<Venta> streamCity = Procesamiento.byCity.proccesing(recorrer);
            //System.out.println(Procesamiento.allClients.clientes(recorrer.stream())); // Imprime todo el csv
            streamCity.forEach(System.out::println); //ventas en NY
            System.out.println(Procesamiento.bysales.sales(streamCity)); //sales en NY
            System.out.println(Procesamiento.byQuantity.product(streamCity,"Classic Cars")); //cantidad en NY por auto clasico
            System.out.println(Procesamiento.byProduct.product(streamCity,"Classic Cars")); //sales en NY por auto clasico
            System.out.println(Procesamiento.byQuantity.product(streamCity,"Motorcycles")); //cantidad en NY por moto
            System.out.println(Procesamiento.byProduct.product(streamCity,"Motorcycles"));//sales en NY por moto
            System.out.println(Procesamiento.maxByNYCClient.customers(recorrer.stream())); //cliente con mas ventas de carros en NY
            System.out.println(Procesamiento.maxByAllClient.customers(recorrer.stream()));//cliente con mas ventas en general
            System.out.println(Procesamiento.minByAllClient.customers(recorrer.stream()));//cliente con menos ventas en general
            //System.out.println(Procesamiento.allClients.clientes(streamCity)); //Es de prueba
            //System.out.println(Procesamiento.byNYCClient.sales(recorrer.stream())); //Es de prueba
        }
        catch(NullPointerException e){
            System.out.println("Error de algun tipo");}
    }
}

