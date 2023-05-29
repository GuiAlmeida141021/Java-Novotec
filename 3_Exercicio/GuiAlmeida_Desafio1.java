//Guilherme 26/05/2023
//Desafio: Algiritmo que mostra cada múltiplo de 10

public class GuiAlmeida_Desafio1 {

    public static void main(String[] args) {
        
																				//Variaveis
        int cont1 = 1, cont2 = 0;
        
        //inicio do while
        while (cont1 <= 200) {
            System.out.println(cont1);
            cont2 += 1;
            
																													// Verifica se cont2 é igual a 10
            if (cont2 == 10) {
                System.out.println(cont1 + " é um múltiplo de 10");
                cont2 = 0;
            }

            cont1 += 1;
        }
    }

}
//Fim