/*
Main//Gets inputs//calls methods
*/
package Exchange;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.InputMismatchException;
public class Main {

    public static void main(){
        String retorno = null;
        while (true){
            try{
                retorno = InputHandler.calling();
                System.out.println("Class Main line 17 exxeption Try::Success: ");
                break;
            }catch(NullPointerException e){
                System.out.println("Class Main line 21 exxeption Excepcion ::Catch Divisa actual erronea: ");
            } catch(InputMismatchException e){
                System.out.println("Class Main line 24 exxeption Excepcion ::Catch cantidad erroneoa: ");
            }catch (JsonSyntaxException e){
                System.out.println("weird shit going on InputMismatchException");
            }finally {
                System.out.println(retorno);
                System.out.println("intentalo nuevamente");
            }
        }
    }
}
