import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTransfer {

    public FileTransfer() throws FileNotFoundException { // pobiera miasta z pliku
        File file = new File("cities.txt");
        Scanner scan = new Scanner(file);
        String city = " ";
        while (scan.hasNextLine()) {
            city = scan.nextLine();
        }
    }
}
