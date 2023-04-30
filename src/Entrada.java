import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.util.stream.*;

public class Entrada {
    private static Venta addVenta(String line){
        String [] trying = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        return new Venta(trying[0],Integer.parseInt(trying[1]),Double.parseDouble(trying[2]),trying[3],Double.parseDouble(trying[4]),trying[5]
                ,trying[6],trying[7],trying[8],trying[9],trying[10],trying[11],trying[12],trying[13],trying[14],trying[15]
                ,trying[16],trying[17],trying[18],trying[19],trying[20],trying[21],trying[22],trying[23],trying[24]);
    }

    static Data prueba = n -> {
        File archivo = new File(n);
        Path path = archivo.toPath();
        try  {
            return Files.lines(path).skip(1).map(Entrada::addVenta).collect(Collectors.toList());
        } catch (IOException ex) {
            System.out.println("Error file not found");
            return null;
        }
    };
}
