//Guilherme 17/05/2023
//Algoritmo que descobre a area do triangulo

//import do Scanner para receber a resposta do usuario 
import java.util.Scanner;
import java.text.DecimalFormat;
//import do DecimalFormat para deixar a resposta assim(0.00)

public class GuilhermeAlmeida_ex3{
    
    //inicio
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
        //variaveis
    double base, altura, area;
        
    //Pede ao usuario digitar a base do triangulo
    System.out.println("Digite a base do triangulo");
    base = leitor.nextDouble();
        
    //Pede ao usuario digitar a altura do triangulo     
    System.out.println("Agora digite a altura do triangulo");
    altura = leitor.nextDouble();
    
    // Como e feito para descobrir a area    
    area = (base*altura)/2;
    
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("A area do triangulo é: " + df.format(area));
    }
}
//Fim