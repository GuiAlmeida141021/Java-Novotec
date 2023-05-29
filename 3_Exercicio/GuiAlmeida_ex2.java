//Guilherme 26/05/2023
//Algoritmo que mostre os numeros inteiros entre os numeros digitados 

//Import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuiAlmeida_ex2{
    public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);   
        
        //Vqriaveia
        int nDigitado1, nDigitado2;
        
            //Pede ao usuario que digite o primeiro numero
        System.out.println("Digite o primeiro numero");
        nDigitado1 = leitor.nextInt();
        
        //Pede ao usuario que digite o segundo numero
        System.out.println("Digite o segundo numero numero");
        nDigitado2 = leitor.nextInt();
        
        //Comeco do if para que o codigo nao de erro se o usuario digitar um nunero maior no segundo numero
        if(nDigitado1 < nDigitado2){
            for(int i = nDigitado1; i < nDigitado2; i++){
                System.out.println(i);
            }
        }else{
            for(int i = nDigitado2; i < nDigitado1; i++){
                System.out.println(i);
        }
        
    }
            
    }
    //Fim
}

