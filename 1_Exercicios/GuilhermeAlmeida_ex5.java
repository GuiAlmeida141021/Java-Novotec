//Guilherme 9/05/2023
//Algoritmo que recebe a idade 


//import do scanner oara receber a resposta do usuario
import java.util.Scanner;

public class GuilhermeAlmeida_ex5 {
    
    //inicio
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        //variaveis
        int idade;
        
        //pede ao usuario a idade 
        System.out.println("Digite sua idade: ");
        idade = leitor.nextInt();
        
        
        //Analisa a idade do usuario e da a resposta
        if(idade >= 65){
            System.out.println("idoso");
        }else if(idade >=19 && idade <= 65 ){
            System.out.print("Adulto");
        }else if (idade >=12 && idade <= 19){
            System.out.println("jovem");
        }else{
            System.out.println("crianca");
            
        }
    }
    
}
//Fim
