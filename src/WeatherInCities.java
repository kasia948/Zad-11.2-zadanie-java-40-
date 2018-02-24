import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WeatherInCities {
    public static void main(String[] args) throws IOException {
            File file = new File("cities.txt");
            Scanner scan = new Scanner(file);
            String city = " ";

            while (scan.hasNextLine()) {
                 city = scan.nextLine();
                    try {
                        WeatherApi api = new WeatherApi();

                        String description = api.getDescription(city);
                        int temperature = api.getTemperature(city);

                        System.out.printf("Pogoda w mieście %s: %s\n", city, description);
                        System.out.printf("Aktualna temperatura: %d stopni\n", temperature);
                    } catch (IOException e) {
                        System.err.println("Nie udało się pobrać informacji dla miasta " + city);
                    } catch (NoSuchElementException e) {
                        System.out.println("brak temperatury dla " + city);
                    }
                }
                scan.close();

//            List <WeatherInfo> lista = new ArrayList<>();
//            WeatherInfo info = new WeatherInfo();
//            WeatherApi api = new WeatherApi();
//
//        for (int i = 0; i <lista.size() ; i++) { //wypełnia listę lista obiektami klasy WeatherInfo
//            info.setCity(city);
//            info.setDescription(api.getDescription(city));
//            info.setTemperature(api.getTemperature(city));
//            lista.add(info);
//            }
//            System.out.println(lista.toString());

    }
}
