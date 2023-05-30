//Guilherme 29/05/2023
//Algiritmo que soma a raiz quadradas dos numeros

//import do scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuiAlmeida_ex6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        int soma = 0;
        int cont = 0;
        
        //inicio do while para repetir o print
        while (cont < 10) {
            System.out.println("Digite um valor inteiro positivo: ");
            int valor = leitor.nextInt();
            
            //inicio do if
            if (valor >= 0) {
                soma += valor;
                cont++;
            }
        }
        //variavel double para amazenar a resposta 
        double RaizQua = Math.sqrt(soma);
        System.out.println("A raiz quadrada da soma dos numeros é: " + RaizQua);
    }
}
//Fim