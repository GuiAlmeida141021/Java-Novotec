//Guilherme 26/05/2023
//Desafio: Algoritmo que repete o mesmo tanto de numeros que o usuario digitou

//Import do Scanner paa receber a resposta do usuario
import java.util.Scanner;

public class GuiAlmeida_Desafio2 {
    
    
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        int num;
        int contador = 1;
        
        //Pede o usuario digitar um numero maior do que 1
        System.out.print(" Digite um numero maior do que 1: ");
        num = leitor.nextInt();
        
        //Verifica se o numero e maior do que 1 para dar continuidade ao if
        if(num > 1){
            
        while (contador <= num) {
            System.out.println(num);
            contador++;
         	//Se o numero for igual a 1 ira exibir que 1 nao pode ser inserido   
        }}else{
            System.out.println("O numero 1 não pode ser inserido");
        }
    }
}
//Fim