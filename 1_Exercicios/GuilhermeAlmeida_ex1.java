//Guilherme  9/05/2023 
// Algoritmo que recebe 4 numeros e faca a media

//import do scanner para receber a resposta do usuario 
import java.util.Scanner;

public class GuilhermeAlmeida_ex1 {
    
    //inicio
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //variaveis
        double n1, n2, n3, n4, media;
        
        //pede ao usuario digitar 4 numeros para fazer a media
        System.out.println("digite a primeira nota");
        n1 = leitor.nextDouble();
        
        System.out.println("digite a segunda nota");
        n2 = leitor.nextDouble();
        
        System.out.println("digite a terceira nota");
        n3 = leitor.nextDouble();
        
        System.out.println("digite a quarta nota");
        n4 = leitor.nextDouble();
        
        //variavel media 
        media = (n1+n2+n3+n4)/4;
        
        //este algiritmo mostra se a media dele e boa ou ruim 
        if(media >= 6){
            System.out.print("boa mlk");
        } else if(media >= 4 && media <= 5.9) {
            System.out.println("nota ok");
        } else {
            System.out.println("Reprovado");
        }
    }   
}
//fim
