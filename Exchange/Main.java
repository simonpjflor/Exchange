/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main() throws IOException, InterruptedException {
//inputs
        System.out.println("Ingrese la cantidad  a convertir");
        Scanner consoleInput = new Scanner(System.in);
        float amount = consoleInput.nextFloat();
        System.out.println("Ingrese la divisa actual");
        String initialCurrency = consoleInput.next();
        System.out.println("Ingrese la divisa deseada");
        String desiredCurrency = consoleInput.next();
// Using JsonObjects
        JsonObject jsonObject = JsonParser.parseString(API.apiConsume(initialCurrency)).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        Printing.Validation(conversionRates,amount, initialCurrency, desiredCurrency);
    }
}
