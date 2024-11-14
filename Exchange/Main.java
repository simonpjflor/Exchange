/*
Main, instancia la clase divisas y llama a la Api
*/
package Exchange;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Entrada
        //Divisa cantidadConvertir = new Divisa();
        float quantityInput = 0.0f;
        String currencyInput = "";
        System.out.println("Ingrese la cantidad  a convertir");
        Scanner consoleInput = new Scanner(System.in);
        quantityInput = consoleInput.nextFloat();
        System.out.println("Ingrese la divisa a convertir");
        currencyInput = consoleInput.next();
        API.setRequestetCurrency(currencyInput);
        //cantidadConvertir.setInputValue(consoleInput.nextFloat()  );
        //llamar API
       // System.out.println(cantidadConvertir.getInputValue());
        System.out.println(API.apiConsume());// necesita una excepción en el main pq las request http pueden fallar por muchas cosas
      //  cantidadConvertir.setOutputValue(1.0f); //asignar api https://v6.exchangerate-api.com/v6/fa37220fcc819142601953c3/latest/COP

    }
/*que he logrado,
* Recibo la info y la guardo correctamente en la instancia de la clase divisa y la puedo recuperar para imprimirla en el main
* llamo a los metodos estaticos de la clase API , esta no es estatica aunqe debería si eso significa que no admite instancias, y que por lo tanto funcionara solo como un metodo con variables cerradas
*
* */
/**Que me falta? falta consumir la api realmente, visitar la url y recuperar el Json es en lo qeu tengo el vacio de conocimiento y porlo tanto lo que encuentro en este momento coplicado, el curso no va a al punto**/
/** que me falta? despues de recuperar el Json sacar y resentar la info de manera personalizada */
}
