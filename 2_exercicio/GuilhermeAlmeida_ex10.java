//Guilherme 17/05/2023
//Algoritmo que ver se o numero e impar ou par
 
//import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex10{
    
    //inicio
    public static void main(String[] args){
										Scanner leitor= new Scanner(System.in);
        
        //variavel
        int n1;
        
        //Pede ao usuario digitar um numero
        System.out.println("Digite um numero");
        n1 = leitor.nextInt();
        
        //comeco do if
        if(n1 % 2==0){
            System.out.println("O numero é PAR");
        }else{
            System.out.println("O numero é IMPAR");
        }
    }
}
//Fim