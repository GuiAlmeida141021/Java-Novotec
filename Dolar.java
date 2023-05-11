//Guilhermw 9/05/2023
//Algiritmo que coverte o real para dolar

//import do scanner para receber a respos do usuario
import java.util.Scanner;

public class Dolar {
    
    //inicio
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //variaveis
        double num1, result;
        
        //converte real em dolar, cotacão(9/05/2023)
        System.out.println("Digite o valor em real: ");
        num1 = leitor.nextDouble();
        
        result = num1 / 4.94;
        
        String formattedResult = String.format("%.2f", result);
            System.out.println("O valor em dolares é: " + formattedResult);

    }
}
//Fim