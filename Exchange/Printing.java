/*shows info according to the input use case*/
package Exchange;

public class Printing {
    public static void Validation(Jason jsonMapped, float amount, String initialCurrency){

        if (amount <0){
            amount =-amount;
        }if (amount ==0 || amount ==1) {
            Printing.Printing(jsonMapped,initialCurrency);
        }else{
            Printing.Printing(jsonMapped,initialCurrency,amount);
            Printing.Printing(jsonMapped,initialCurrency);
        }
    }
    public static void Printing(Jason jsonMapped, String initialCurrency ){
        System.out.printf("\nresult: "+jsonMapped.getApiResponseStatus()+ "\n"
                +"1 "+initialCurrency+" = "+ String.format("%f",jsonMapped.storedConversions.getUsd())+" USD\n"
                +"1 "+initialCurrency+" = "+String.format("%f",jsonMapped.storedConversions.getEur())+" EUR\n"
                +"1 "+initialCurrency+" = "+String.format("%f",jsonMapped.storedConversions.getJpy())+" JPY\n"
                +"1 "+initialCurrency+" = "+String.format("%f",jsonMapped.storedConversions.getGbp())+" GBP\n"
                +"1 "+initialCurrency+" = "+String.format("%f",jsonMapped.storedConversions.getAud())+" AUD\n");
    }

    public static void Printing(Jason jsonMapped, String initialCurrency, float amount){
        System.out.printf("\nresult: "+jsonMapped.getApiResponseStatus()+"\n"
                +amount+" "+initialCurrency+" = "+ String.format("%f", amount *jsonMapped.storedConversions.getUsd())+" USD \n"
                +amount+" "+initialCurrency+" = "+String.format("%f", amount*jsonMapped.storedConversions.getEur())+" EUR\n"
                +amount+" "+initialCurrency+" = "+String.format("%f", amount*jsonMapped.storedConversions.getJpy())+" JPY\n"
                +amount+" "+initialCurrency+" = "+String.format("%f", amount*jsonMapped.storedConversions.getGbp())+" GBP\n"
                +amount+" "+initialCurrency+" = "+String.format("%f", amount*jsonMapped.storedConversions.getAud())+" AUD \n");
    }
}
