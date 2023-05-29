//Guilherme 26/05/2023
//Algoritmo que faz a media de 500 numeros 

//Import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuiAlmeida_ex3{
    
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in); 
        
        //Variaveis
        double Num = 0, media;
        int contador = 0;
        
        //Comeco do while
        while(contador <= 500){
            //Pede ao usurio Digite 500 numeros
            System.out.println("Digite um numero");
            Num = leitor.nextDouble();
            contador++;
        }
        //variavel media    
        media = Num / 500;
        
        //Mostra ao usuario a media dos 500 numeros 
        System.out.println("A media dos nuneros sao: " + media);
    }
}