//Guilherme 17/05/2023
//Codigo que some o valor do picoles 

//Import do Scanner para receber a resposta do usuario
//Imprt do DecimalFormat para deixar o frmato do double em 0.00
import java.util.Scanner;
import java.text.DecimalFormat;

public class GuilhermeAlmeida_ex6{
    
    //inicui
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
        //Variaveis
    double pk, pl, pr, Result;
    
        //Aqui comeca o algoritmo para inserir a quantidade de picole 
    System.out.println("Quantiade de picole de Kiwi: ");
    pk = leitor.nextDouble();
    
    System.out.println("Quantiade de picole de Laranja: ");
    pl = leitor.nextDouble();
    
    System.out.println("Quantiade de picole de Romã: ");
    pr = leitor.nextDouble();
        
    //aqui sao os precos do picole     
    pk = pk*3.20;
    pl = pl*2.39;
    pr = pr*7.99;
    Result = pk+pl+pr;
    
        //por fim mostra o resultado com o valor da compra 
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.print("Total da compra: " + df.format(Result));
}}
//fim