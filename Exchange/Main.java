/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.InputMismatchException;
public class Main {

    public static void main() throws IOException, InterruptedException {//cubre el caso en que la divisa actual no sea valida
        String retorno = null;
        while (true){
            try{
                retorno = InputHandler.calling();
                System.out.println("Class Main line 17 exxeption Try::Success: ");
                System.out.println(retorno);
                break;
            }catch(NullPointerException e){
                System.out.println("Class Main line 21 exxeption Excepcion ::Catch Divisa actual erronea: ");
                System.out.println(retorno);
                System.out.println("intentalo nuevamente");
            } catch(InputMismatchException e){
                System.out.println("Class Main line 24 exxeption Excepcion ::Catch cantidad erroneoa: ");
                System.out.println(retorno);
                System.out.println("intentalo nuevamente");
            }catch (JsonSyntaxException e){
                System.out.println("weird shit going on InputMismatchException\nintentalo nuevamente ");
            }
        }
    }
}
