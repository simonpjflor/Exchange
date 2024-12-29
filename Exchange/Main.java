/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

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
        JsonDto JsonObject = gson.fromJson(API.apiConsume(initialCurrency),JsonDto.class);
        Printing.Validation(JsonObject,amount, initialCurrency);
    }
}
