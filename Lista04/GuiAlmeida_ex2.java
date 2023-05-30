//Guilherme 29/05/2023
//Algoritmo que soma os numeros para chegar em uma resposta correta

//import do scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuiAlmeida_ex2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        int n1, n2, n3, soma = 0;
        
        //Inicio do..While
        do{
            
            System.out.print("Digite o primeiro numero: ");
            n1 = leitor.nextInt();
            
            System.out.print("Digite o segundo numero: ");
            n2 = leitor.nextInt();
            
            System.out.print("Digite o teeceiro numero: ");
            n3 = leitor.nextInt();
            
            //Variavel soma para somar os numeros
            soma = n1 + n2 + n3;
            
            //Inicio do if
            if(soma == 48 || soma == 71){
                System.out.println(" o numero esta correto " + soma);
            }else{
                System.out.println("tente novamente");
            }
        } while(soma != 48 && soma != 71);
    }
}
//Fim