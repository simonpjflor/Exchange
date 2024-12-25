/*
Main//Gets inputs//calls Divisa static method
*/
package Exchange;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        float amount = 0.0f;
        String digitedCurrency = "";
        String desiredCurrency="";
//inputs
        System.out.println("Ingrese la cantidad  a convertir");
        Scanner consoleInput = new Scanner(System.in);
        amount = consoleInput.nextFloat();
        System.out.println("Ingrese la divisa actual");
        digitedCurrency = consoleInput.next();
        System.out.println("Ingrese la divisa deseada");
        digitedCurrency = consoleInput.next();
//
        Gson gson = new Gson();
        Jason currentConvertion = gson.fromJson(API.apiConsume(digitedCurrency),Jason.class);
        currentConvertion.Validation(amount,digitedCurrency);
    }
}
