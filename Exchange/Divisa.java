package Exchange;

import com.google.gson.Gson;

import java.io.IOException;

public class Divisa {

    private float amount = 0.0f;
    private String digitedCurrency = "";

    public float getamount(){return amount;}
    public String getdigitedCurrency() {return digitedCurrency;}

    public void setamount(float amount) {this.amount = amount;}
    public void setdigitedCurrency(String digitedCurrency) {this.digitedCurrency = digitedCurrency;}

    public static void ConvertCurrency(float amount, String digitedCurrency) throws IOException, InterruptedException {//excepcion para requests http
        String apiResultJson = API.apiConsume(digitedCurrency);
       System.out.println("Full API Responde\n"+ apiResultJson);
     //   Jason currentConvertion = new Jason();
        Gson jsonMapper = new Gson();
        String prueba =""" 
        {
        "result" : succes,
        "Conversions":
        {"USD":1,
        "AUD":1.6002,
        "EGP":50.9104,
        "ERN":15.0000,
        "EUR":0.9603,
        "GGP":0.7962,
        "JPY":156.4750
        }
        }""";

        Jason currentConvertion = jsonMapper.fromJson(apiResultJson,Jason.class); // no esta guardando en el interno
        currentConvertion.Printo();
    }
}
