package ComplexNumbers;
import java.util.Scanner;

public class ComplexUser {

    public static OrdinaryComplex ComplexRoutine(Scanner input, String novoNumero) {
        double r, i;

        System.out.print("Digite a parte real do número " + novoNumero + " : ");
        r = input.nextDouble();
        input.nextLine();
        System.out.print("Digite a parte imaginaria do número " + novoNumero + " : ");
        i = input.nextDouble();
        input.nextLine();
        return new OrdinaryComplex(r, i);
    }

    public static void main(String args[]) { // No momento, está sendo utilizada a "OrdinaryComplex"
        Scanner input = new Scanner(System.in);
        Complex numA = ComplexRoutine(input, "A");
        Complex numB = ComplexRoutine(input, "B");
        System.out.println("Operações disponíveis: Soma, Subtração, Multiplicação, Divisão");
        System.out.print("Digite a operação desejada: ");
        String word = input.nextLine();
        word = word.replaceAll("ç", "c").replaceAll("ã", "a").toLowerCase(); 
        switch (word) {
            case "soma" :
                System.out.printf("Soma dos números complexos: %.1f + %.1fi%n", numA.sum(numB).parteReal(), numA.sum(numB).parteImaginaria());
                break;
            case "subtracao" :
                System.out.printf("Subtracao dos números complexos: %.1f + %.1fi%n", numA.sub(numB).parteReal(), numA.sub(numB).parteImaginaria());
                break;
            case "multiplicacao" :
                System.out.printf("Multiplicacao dos números complexos: %.1f + %.1fi%n", numA.mult(numB).parteReal(), numA.mult(numB).parteImaginaria());
                break;
            case "divisao" :
                System.out.printf("Divisao dos números complexos: %.1f + %.1fi%n", numA.div(numB).parteReal(), numA.div(numB).parteImaginaria());
                break;
            default:
                System.out.println("Nenhuma operacao selecionada.");
                break;
        }
        input.close();
    }
}
