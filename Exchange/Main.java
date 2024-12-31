/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
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

/*            float[] amountVEC = {-5.0f,0.0f,1.0f,4.0f};
            String[] initialCurrencyVEC = {"EUR","USD","AUD","GBP"};
            String[] desiredCurrencyVEC = {"COP","COP","JPY","COP"};//strings passed within 'cop' single quotes are taken as one single char
            JsonObject [] jsonObject = new JsonObject[4];
            JsonObject [] conversionRates = new JsonObject[4];

        for (int i=0; i<=3; i++){
            jsonObject [i]= JsonParser.parseString(API.apiConsume(initialCurrencyVEC[i])).getAsJsonObject();
            conversionRates [i]= jsonObject[i].getAsJsonObject("conversion_rates");
            System.out.println(" iterador "+i+"\ndivisa inicial "+initialCurrencyVEC[i]+"\n divisa deseada "+desiredCurrencyVEC[i]+"\n cantidad "+amountVEC[i] +"\n full http json response"+"\n"+jsonObject[i] );
            Thread.sleep(10000);
            Printing.Validation(conversionRates[i],amountVEC[i], initialCurrencyVEC[i], desiredCurrencyVEC[i]);}*/
    }
}
