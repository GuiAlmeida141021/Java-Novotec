//Guilherme 29/05/2023
//Algoritmo que some todos os números cujo quadrado é divisível por 4.

public class GuiAlmeida_ex1 {
    public static void main(String[] args){
        
        //Variaveis
        int Nlimite = 100, soma = 0;
        
        for(int i = 0; i <= Nlimite; i++){
            int Nqua = i * i;
            
            //Comeco do if 
            if( Nqua % 4 ==0){
                System.out.println(Nqua);
                soma += i;
            }
        }
           //mostra a soma 
        								System.out.println(+ soma);
    }
}
//Fim
