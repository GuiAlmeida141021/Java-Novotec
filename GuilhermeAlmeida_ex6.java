//Guilherme 9/05/2023
//Descobrir o Raio de um circulo

//import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex6 {
    
    //inicio
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        double raio, perimetro;
        
        //Pede o usuario a inserir o rqio do circulo
        System.out.println("Digite o raio do circulo: ");
        raio = leitor.nextDouble();
        
        //Math.PI seeve para substituir o π
        perimetro = 2 * Math.PI * raio;
        
        //aqui mostra ao usuario a resposta ao usuqrio
        System.out.print("o valor do perimetro do circulo é:" + perimetro);
    }
    
}
//Fim
