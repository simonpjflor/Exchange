/*
Main, instancia la clase divisas y llama a la Api
*/
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        //Entrada
        Divisa cantidadConvertir = new Divisa();

        System.out.println("conversor COP a USD");
        System.out.println("Ingrese la cantidad  a convertir");
        Scanner consoleInput = new Scanner(System.in);
        cantidadConvertir.setInputValue(consoleInput.nextFloat());// hace falta una excepcion?
        //llamar API

    }


}
