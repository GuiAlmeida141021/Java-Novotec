//Guilherme 17/05/2023
//Algoritmo que verifica numeros inteiros de 94 a 456

//import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex7{
    
    //inicio
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        //variavel
        int n1;
        
        //Pede ao usuario Digitar um numero
        System.out.println("Digite um numero inteiro");
        n1 = leitor.nextInt();
        
        //comeco do if, verifica se o usuario digitou um numero entre 94 a 456
        if(n1 >= 94 && n1 <= 456){
            System.out.println("Acertou");
        }else{
            System.out.println("Tente Novamente");
        }
        
    }}
//Fim