package Exchange;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void writing(JsonObject conversionRates, float amount, String initialCurrency, String desiredCurrency ){
        try {
            FileWriter HistoricoConversiones = new FileWriter("HistoricoConversiones.txt");
            HistoricoConversiones.write(
                    "Historico:\n"
                    +"Cantidad: " + amount
                    +"Divisa Inicial: "+ initialCurrency
                    +"Divisa Deseada: "+desiredCurrency
                    +"Respuesta completa Json: "+ conversionRates
            );
            HistoricoConversiones.close();
        }catch (IOException e){
            System.out.println("writing method//create file//line 12//IO exception");
            System.out.println(e.getMessage());
        }

    }
}
