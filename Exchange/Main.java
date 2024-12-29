/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create(); //all json inputs in capitals
        JsonDto JsonObject = gson.fromJson(API.apiConsume(initialCurrency),JsonDto.class);
        Printing.Validation(JsonObject,amount, initialCurrency);
    }
}
