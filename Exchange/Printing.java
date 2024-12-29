/*shows info according to the input use case*/
package Exchange;

public class Printing {
    public static void Validation(JsonDto jsonMapped, float amount, String initialCurrency){

        if (amount <0){
            amount =-amount;
        }if (amount ==0 || amount ==1) {
            Printing.Printing(jsonMapped,initialCurrency);
        }else{
            Printing.Printing(jsonMapped,initialCurrency,amount);
            Printing.Printing(jsonMapped,initialCurrency);
        }
    }
    public static void Printing(JsonDto jsonMapped, String initialCurrency ){
        System.out.println("result: "+ jsonMapped+"\n");
    }

    public static void Printing(JsonDto jsonMapped, String initialCurrency, float amount){
        System.out.println("result: "+ jsonMapped+"\n");

    }
}
