//Guilherme 9/05/2023
//algoritmo que soma os quadrados dos numeros 

//import do scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex2 {
    
    //inicio
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //variaveis 
        double n1, n2, n3, n4, Res;
        
        //algoritmo que pede ao usuario inserir numeros
        System.out.println("Digite o primeiro numero");
        n1 = leitor.nextDouble();
        
        System.out.println("Digite o segundo numero ");
        n2 = leitor.nextDouble();
        
        System.out.println("Digite o terceiro numero ");
        n3 = leitor.nextDouble();
        
        System.out.println("Digite o quarto numero");
        n4 = leitor.nextDouble();
        
        //algoritmo para deixar os numeros ao quadrado
        Res = Math.pow(n1, 2) + Math.pow(n2, 2) + Math.pow(n3, 2) + Math.pow(n4, 2);
        
        System.out.print("O Resultado é: " + Res);
    }
    
}
//fim
