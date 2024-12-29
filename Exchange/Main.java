/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.Gson;

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
// Using DTO
        Gson gson = new Gson();
        Jason JsonObject = gson.fromJson(API.apiConsume(initialCurrency),Jason.class);
        Printing.Validation(JsonObject,amount, initialCurrency);
    }
}
