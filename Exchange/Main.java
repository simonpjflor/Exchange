/*
Main, instancia la clase divisas y llama a la Api
*/
package Exchange;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        float quantityInput = 0.0f;
        String currencyInput = "";

        System.out.println("Ingrese la cantidad  a convertir");
        Scanner consoleInput = new Scanner(System.in);
        quantityInput = consoleInput.nextFloat();
        System.out.println("Ingrese la divisa actual");
        currencyInput = consoleInput.next();

        Divisa.ConvertCurrency(quantityInput,currencyInput);
    }
}
