/*
llama a la API con la divisa seleccionada
*/
package Exchange;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;

public class API {

    private static String apiUrl =new String ("https://v6.exchangerate-api.com/v6/fa37220fcc819142601953c3/latest/");
    private static String requestetCurrency = new String("COP");

    public static String getApiUrl() {return apiUrl;}
    public static String getRequestetCurrency() {return requestetCurrency;}
    public static void setApiUrl() {apiUrl +=getRequestetCurrency() ;}
    public static void setRequestetCurrency(String userRequestetCurrency){ requestetCurrency = userRequestetCurrency;}
    //los parametros en metodos en java no aceptan valores predeterminado

    public static void apiConsume() throws IOException, InterruptedException {
    setApiUrl();
    HttpClient mioClient = HttpClient.newHttpClient();
    HttpRequest miaRequesta = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        System.out.println("metodo estatico de la clase API, este metodo esta hecho para consumir la api");

    HttpResponse<String> response = mioClient.send(miaRequesta, HttpResponse.BodyHandlers.ofString());
    }
}