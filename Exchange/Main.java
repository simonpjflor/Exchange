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
        String[] currencies = {"USD","EUR","JPY","GBP","AUD"};
        String[] topCurrencies = new String[7];
        int i =2;
        if (conversionRates.has(desiredCurrency)){
            topCurrencies[0]=desiredCurrency+" : "+conversionRates.get(desiredCurrency).getAsFloat()+"\n";
            topCurrencies[1]="\nMost Traded Currencies\n";
            }
        for (String currency : currencies) {//looks each top currency component in the Json
            if (conversionRates.has(currency)) {
                float rate = conversionRates.get(currency).getAsFloat();
                topCurrencies[i]=currency+" : "+rate+"\n";
                i++;
            }
        }
        System.out.println(Arrays.toString(topCurrencies));
    }
}
