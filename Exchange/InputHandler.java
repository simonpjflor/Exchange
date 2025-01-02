package Exchange;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Scanner;

public class InputHandler {
    public static String calling()throws IOException, InterruptedException{
//inputs
        System.out.println("Ingrese la cantidad  a convertir");
        Scanner consoleInput = new Scanner(System.in);
        float amount = consoleInput.nextFloat();
        System.out.println("Ingrese la divisa actual");
        String initialCurrency = consoleInput.next().toUpperCase();
        System.out.println("Ingrese la divisa deseada");
        String desiredCurrency = consoleInput.next().toUpperCase();
// Using JsonObjects
        JsonObject jsonObject = JsonParser.parseString(API.apiConsume(initialCurrency)).getAsJsonObject();
        JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
        Printing.Validation(conversionRates,amount, initialCurrency, desiredCurrency);
        return amount+":"+initialCurrency+":"+desiredCurrency;


  /*      float[] amountVEC = {-5.0f,0.0f,1.0f,4.0f};
        String[] initialCurrencyVEC = {"EUR","USD","AUD","GBP"};
        String[] desiredCurrencyVEC = {"COP","COP","JPY","cop"};//strings passed within 'cop' single quotes are taken as one single char
        for (int i=0; i<=3; i++){
            JsonObject jsonObject = JsonParser.parseString(API.apiConsume(initialCurrencyVEC[i])).getAsJsonObject();
            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            System.out.println(" iterador "+i+"\ndivisa inicial "+initialCurrencyVEC[i]+"\n divisa deseada "+desiredCurrencyVEC[i]+"\n cantidad "+amountVEC[i] +"\n full http json response"+"\n"+jsonObject );
            Thread.sleep(10500);
            Printing.Validation(conversionRates,amountVEC[i], initialCurrencyVEC[i], desiredCurrencyVEC[i]);
        }*/
        //return amountVEC+""+initialCurrencyVEC+desiredCurrencyVEC;
    }
}


