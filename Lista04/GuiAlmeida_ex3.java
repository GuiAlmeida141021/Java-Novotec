//Guilherme 29/05/2023
//Algoritmo que soma 50 numeros aleatorios de 0 100

//Impirt do random para que os numeros fiquem aleatorios
import java.util.Random;
import java.text.DecimalFormat;
//import do scanner para receber a resposta do usuario

public class GuiAlmeida_ex3 {
    
    public static void main(String[] args){
        
        Random aleatorio = new Random();
        DecimalFormat df = new DecimalFormat("0.0");    
        
        //variaveis
        int nInt,somaInt = 0;
        double nReal, somaReal = 0;
        
        //comeco do for 
        for(int i = 1; i <= 50; i++){
            
            nInt = aleatorio.nextInt(100);
            System.out.println(nInt);
            
            //Soma dos numeros inteiros
            somaInt = nInt + nInt;
            
            nReal = aleatorio.nextDouble() * 100.0;
            System.out.println( df.format(nReal));
            
            //soma os njmeros reais 
            somaReal = nReal + nReal;
            
         //Comeco do if   
        }if(somaInt > somaReal){
            System.out.println("A soma dos inteiros e maior");
        }else{
            System.out.println("A soma dos numeros reais e maior");
        }
        //Mostra ao usuario a soma dos numeros inteiros e reais 
        System.out.println("A soma dos numeros inteiros é: " + somaInt);
        System.out.print("A soma dos numeros reais é: " + df.format(somaReal));
        
    }
    
}
//Fim