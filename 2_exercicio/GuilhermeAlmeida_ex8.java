//Guilherme 17/05/2023
// Algoritmo que calcula o imc (Tema livre)

//Aqui importamos o Scanner para receber a resposta do usuario
import java.util.Scanner;
import java.text.DecimalFormat;
//import do DecimalFormat para deixar a resposta assim(0.00)

public class GuilhermeAlmeida_ex8{
    
    //inicio
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner leitor= new Scanner(System.in);
        
        //variaveis
        Double altura, peso, imc;
        String nome;
        
        //Aqui pede ao usuario o nome
        System.out.println("Digite seu nome");
        nome = leitor.nextLine();
        
        //Aqui pede o peso ao usuario
        System.out.println("Digite seu peso");
        peso = leitor.nextDouble();
        
        //Aqui pede ao usuario digitar sua altura
        System.out.println("Digite sua altura");
        altura = leitor.nextDouble();
        
        //Aqui pede ao usuario Digitar seu Genero
        System.out.println("Digite o seu gênero (M/F): ");
        char genero = leitor.next().charAt(0);
        //Char é uma variavel de caracteres
        
        //comeco do if para ver se o usuario e menino ou menina
        if(genero == 'M'){
            imc = peso / (altura * altura);
            System.out.println("ola senhor " + nome + " seu imc é: " + df.format(imc));
        }else if(genero == 'F'){
            imc = 0.765 * peso / (altura * altura);
        										System.out.println("ola senhora " + nome + " seu imc é: " + df.format(imc));
        }else{
            imc = 0.00;
            System.out.println("Genero invalido");
         //Comeco do if para calcular o imc    
        }if(imc <= 18.5){
            System.out.println("Abaixo do peso ");
        }else if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade nivel 1");
        }else if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade nivel 2");
        }else{
            System.out.println("Obesidade nivel 3");
        }
    }
}
//fim