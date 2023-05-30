//Guilherme 29/05/202e
//Algoritmo que analisa se a palavra tem 10 letra

//import do scanner para receber a resposta do usuario
import java.util.Scanner;

public class Guialmeida_ex4 {
    
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);    
        
        //Variavel
    						String texto;
        
        //Pede ao usuario dugutar uma palavra 
        System.out.println("Digite uma palavra");
        texto = leitor.nextLine();
            
        //Comeco do if 
        if(texto.length() <= 10){
                System.out.println("você digitou uma palavrinha");
                
        }else{
                System.out.println("Você digitou um palavrāo");
            }
        
    }
}
//Fim