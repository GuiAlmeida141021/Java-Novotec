//Guilherme 17/05/2023
//Algoritmo que troca os valores das variaveis

//import do Scanner para receber a resposta do usuario 
import java.util.Scanner;

public class GuilhermeAlmeida_ex4{
    
    //inicio
    public static void main	(String[] args){
    Scanner leitor = new Scanner(System.in);
    
    //Variaveis    
    int A= 10;
    int B= 14;
        
    //variavel "temporaria"    
    int C = A;
    A = B;
    B = C;
    
    System.out.println("O valor de A é: " + A);
    System.out.println("O valor de B é: " + B);
}
}


