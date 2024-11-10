import java.util.Scanner;
public class Main {
    private float inputValue = 0.0f;
    private float outputValue = 0.0f;
    public static void main(String[] args) {
    //Entrada
        System.out.println("conversor COP a USD");
        System.out.println("Ingrese la cantidad a convertir");
        Scanner consoleInput = new Scanner(System.in);
        thi.setInputValue(consoleInput.nextFloat());
    }


    public float getInputValue(){
        return inputValue;
    }

    public float getOutputValue() {
        return outputValue;
    }


    public void setInputValue(float inputValue) {
        this.inputValue = inputValue;
    }

    public void setOutputValue(float outputValue) {
        this.outputValue = outputValue;
    }

}
