import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.*;
import java.nio.file.Files;
public class Entrada {
    //public static Venta addVenta(Data func, String line){
        //return func.read(Str)
    //};
    public static void main(String[] args){
    File archivo = new File("sales_data.csv");
    Path path = archivo.toPath();

        try  {
        Files.lines(path).skip(1).map(Entrada::addVenta).forEach(d -> System.out.println(d));
        System.out.println(Venta.x);

    } catch (IOException ex) {
            System.out.println("Error al econtrar el archivo");
        }
    }
    private static Venta addVenta(String line){   //String[] trying = line.split(",");
        String [] trying = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        return new Venta(trying[0],Integer.parseInt(trying[1]),Double.valueOf(trying[2]),trying[3],trying[4],trying[5]
                ,trying[6],trying[7],trying[8],trying[9],trying[10],trying[11],trying[12],trying[13],trying[14],trying[15]
                ,trying[16],trying[17],trying[18],trying[19],trying[20],trying[21],trying[22],trying[23],trying[24]);
    }
}
