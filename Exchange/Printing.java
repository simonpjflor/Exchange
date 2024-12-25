/*shows info according to the input use case*/
package Exchange;

public class Printing {
    public static void Validation(Jason jsonMapped, float amount, String initialCurrency, String desiredCurrency){

        if (amount <0){
            amount =-amount;
        }if (amount ==0 || amount ==1) {
            Printing.ToString(jsonMapped,initialCurrency);
        }else{
            Printing.ToString(jsonMapped,initialCurrency,amount);
            Printing.ToString(jsonMapped,initialCurrency);
        }
    }
    public static void ToString(Jason jsonMapped, String initialCurrency ){
        System.out.printf("\nresult: %s\n"
                +" "+initialCurrency+" = USD: "+ String.format("%f",jsonMapped.storedConversions.getUsd())+"\n"
                +" "+initialCurrency+" = EUR: "+String.format("%f",jsonMapped.storedConversions.getEur())+"\n"
                +" "+initialCurrency+" = JPY: "+String.format("%f",jsonMapped.storedConversions.getJpy())+"\n"
                +" "+initialCurrency+" = GBP: "+String.format("%f",jsonMapped.storedConversions.getGbp())+"\n"
                +" "+initialCurrency+" = AUD: "+String.format("%f",jsonMapped.storedConversions.getAud())+"\n");
    }

    public static void ToString(Jason jsonMapped, String initialCurrency, float amount){
        System.out.printf("\nresult: "+jsonMapped.getApiResponseStatus()+"\n"
                +amount+" "+initialCurrency+" = USD: "+ String.format("%f", amount *jsonMapped.storedConversions.getUsd())+"\n"
                +amount+" "+initialCurrency+" = EUR: "+String.format("%f", amount*jsonMapped.storedConversions.getEur())+"\n"
                +amount+" "+initialCurrency+" = JPY: "+String.format("%f", amount*jsonMapped.storedConversions.getJpy())+"\n"
                +amount+" "+initialCurrency+" = GBP: "+String.format("%f", amount*jsonMapped.storedConversions.getGbp())+"\n"
                +amount+" "+initialCurrency+" = AUD: "+String.format("%f", amount*jsonMapped.storedConversions.getAud())+"\n");
    }
}
