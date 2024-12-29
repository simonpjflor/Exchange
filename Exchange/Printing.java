/*shows info according to the input use case*/
package Exchange;

import com.google.gson.JsonObject;

public class Printing {
    public static void Validation(JsonObject conversionRates, float amount, String initialCurrency, String desiredCurrency){

        if (amount <0){
            amount =-amount;
        }if (amount ==0 || amount ==1) {
            Printing.ToString(conversionRates,initialCurrency);
        }else{
            Printing.ToString(conversionRates,initialCurrency,amount);
            Printing.ToString(conversionRates,initialCurrency);
        }
    }
    public static void ToString(JsonObject conversionRates, String initialCurrency ){
        System.out.printf("\nresult: "+conversionRates+"\n");

    }

    public static void ToString(JsonObject conversionRates, String initialCurrency, float amount){
        System.out.printf("\nresult: "+conversionRates+"\n");

    }
}
