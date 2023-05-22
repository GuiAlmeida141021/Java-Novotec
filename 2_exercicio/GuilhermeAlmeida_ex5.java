//Guilherme 17/05/2023 
//Algoritmo que mistra ao usuario o anteceasor e o sucessor do numero inserido

//import do Scanner para receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex5{
    
    //inicio
    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
        
        //Variaveis
        int n1, ant, suc;
        
        //Pede ao usuario inserir o numero 
        System.out.println("Digite um nunero");
        n1 = leitor.nextInt();
        
        //Aqui mostra como e feito o antecessor e o sucessor
        ant = n1 -1;
        suc = n1 +1;
        
        //Aqui mostra ao usuario o ante e sucessor 
        System.out.println("O antecessor do nunero é: " + ant);
        System.out.println("O sucessor do numero é: " + suc);
}}
//fim