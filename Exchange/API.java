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

    private static String apiUrl ="https://v6.exchangerate-api.com/v6/fa37220fcc819142601953c3/latest/";
    private static String requestetCurrency = "";

    public static String getApiUrl() {return apiUrl;}
    public static void setApiUrl() {apiUrl +=getRequestetCurrency() ;}

    public static String getRequestetCurrency() {return requestetCurrency;}
    public static void setRequestetCurrency(String digitedCurrency){ requestetCurrency = digitedCurrency;}

    //los parametros en metodos en java no aceptan valores predeterminado

    public static String apiConsume(String digitedCurrency) throws IOException, InterruptedException {
        setRequestetCurrency(digitedCurrency);
        setApiUrl();
        HttpClient myHttpClient = HttpClient.newHttpClient();
        HttpRequest myHttpRequest = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        HttpResponse<String> apiResponse = myHttpClient.send(myHttpRequest, HttpResponse.BodyHandlers.ofString());
        return  apiResponse.body();
    }
}