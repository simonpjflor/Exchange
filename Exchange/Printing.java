/*shows info according to the input use case*/
package Exchange;

import com.google.gson.JsonObject;

import java.util.Arrays;

public class Printing {

    public static void Validation(JsonObject conversionRates, float amount, String initialCurrency, String desiredCurrency){

        if (amount <0){
            amount =-amount;
        }if (amount ==0 || amount ==1) {
            Printing.unitPrinting(conversionRates,initialCurrency,desiredCurrency);
        }else{
            Printing.amountPrinting(conversionRates,initialCurrency,desiredCurrency,amount);
            Printing.unitPrinting(conversionRates,initialCurrency,desiredCurrency);
        }
    }
    public static void unitPrinting(JsonObject conversionRates, String initialCurrency, String desiredCurrency ){
        String[] currencies = {"USD","EUR","JPY","GBP","AUD"};
        String[] topCurrencies = new String[7];
        int i =2;
        if (conversionRates.has(desiredCurrency)){
            topCurrencies[0]="1 "+initialCurrency+" = 1 "+desiredCurrency+" : "+conversionRates.get(desiredCurrency).getAsFloat()+"\n";
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

    public static void amountPrinting(JsonObject conversionRates, String initialCurrency,String desiredCurrency, float amount){
        System.out.printf("\nresult: "+conversionRates+"\n");

    }
}
