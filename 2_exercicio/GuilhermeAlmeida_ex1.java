//import do Scanner para receber a resposta do usuario 
import java.util.Scanner;
import java.text.DecimalFormat;
//import do DecimalFormat para deixar a resposta assim(0.00)

public class GuilhermeAlmeida_ex1{
    
    //inicio
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        //variaveis
        double valor, valorD;
        
        //Pede ao usuario digitar o valor
        System.out.println("Digite o valor:");
        valor = leitor.nextDouble();
        
        //Assim que e feito o desconto de 15%
        valorD = (valor)* 0.85;
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        //mostra o valor com desconto e sem desconto ao usuario
        System.out.println("Valor inserido sem desconto "+ df.format(valor));
        System.out.println("valor inserido com um desconto de 15% "+ df.format(valorD));
    }
}