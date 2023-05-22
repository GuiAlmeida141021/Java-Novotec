//Guilherme 17/05/2023
//Algoritmo que verifuca se o numero e maior ou igual ao outro

//import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class NumerosIguais{
    
    //inicio
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        //variaveis
        int n1, n2;
        
        //pede ao usuario digitar o num1
        System.out.println("Digite o primeiro numero");
        n1 =  leitor.nextInt();
        
        //pede ao usuario digitar o num2
        System.out.println("Digite o segundo numero");
        n2 = leitor.nextInt();
        
        //Comeco do if. verifica se os numeros sao iguais ou maior
        if(n1 == n2){
            System.out.println("Os numeros sao iguais");
        } else if(n1<n2){
            System.out.println("O primeiro numero é maior");
        }else{
            System.out.println("O segundo numero é maior");
        }
        
    }
}
//Fim