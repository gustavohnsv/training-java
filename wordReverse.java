import java.util.Scanner; // Classe Scanner dentro do pacote java.util responsável por ler entrada de dados (como o scanf em C)
import java.lang.StringBuilder; // Classe StringBuilder dentro do pacote java.lang responsável pela manipulação de Strings

public class wordReverse {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in); // Definindo a variável responsável pela coleta de dados
        System.out.print("Insira um texto: "); // println pula uma linha e print não
        String word = input.nextLine(); // Digo para o programa que a proxíma linha do terminal é uma entrada e não só
                                        // um texto
        System.out.println("Saida: " + new StringBuilder(word).reverse().toString()); // Uso da função "reverse" para
                                                                                      // inverter e "toString" para
                                                                                      // converter StringBuilder para
                                                                                      // String
        input.close(); // Digo ao programa que ele não receberá mais dados
    }

}
