import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main (String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(10);
        int tentativa = 0;
        int numeroTentativas = 0;

        String fraseInício = """
                JOGO DO ADIVINHA!
                
                Você terá 5 chances para acertar o número sortido.
                
                Digite a seguir os seus palpites.
                """;
        System.out.println(fraseInício + numeroSorteado);

        for (int i = 1; i < 6; i++) {
            System.out.println("Tentativa número " + i + ":");
            tentativa = leitura.nextInt();
            numeroTentativas++;

            if (tentativa == numeroSorteado) {
                System.out.println("PARABÉNS! Você acertou o número sorteado (" + numeroSorteado + ") na "+numeroTentativas+"ª tentativa!");
                break;
            }else if (tentativa > numeroSorteado){
                System.out.println("O número digitado é maior...");
            }else{
                System.out.println("O número digitado é menor...");
            }
        }

        if (numeroTentativas == 5 && tentativa != numeroSorteado){
            System.out.println("Você esgotou as tentativas! O número certo era: "+numeroSorteado);
        }
    }
}
