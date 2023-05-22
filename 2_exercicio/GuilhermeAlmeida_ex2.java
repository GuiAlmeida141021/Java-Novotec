//Guilherme 17/05/2023
//Algoritmo que verifica qual numero e maior

//import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex2{
    
    //inicio
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
    //variaveis    
    int n1, n2, n3;
    
        //Pede ao usuario digitar o primeiro numero
    System.out.println("Digite o primeiro numero: ");
    n1 = leitor.nextInt();
    
        //Pede ao usuario digitar o segundo numero
    System.out.println("Digite o segundo numero: ");
    n2 = leitor.nextInt();
    
        //Pede ao usuario digitar o terceiro numero
    System.out.println("Digite o terceiro numero:");
    n3 = leitor.nextInt();
        
    //comeco do if. verifica qual numero e maior    
    if(n1>n2 && n1>n3 ){
        System.out.println("O primeiro numero é maior ");
    }else if(n2>n1 && n2>n3){
        System.out.println("O segundo numero é maior");
    }else{
        System.out.println("o terceiro numero é maior");
    }
    
}}
//Fim