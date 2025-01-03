import java.util.Scanner;

public class Licao1 {
    public static void main (String[] args){

//IMPLEMENTAR WHILE
        Scanner leitura = new Scanner(System.in);
        int numeroDigitado = 0;

        System.out.println("Digite um número aleatório: ");

        numeroDigitado = leitura.nextInt();

        if (numeroDigitado > 0){
            System.out.println(String.format("O número %d é positivo!",numeroDigitado));
        }else if (numeroDigitado == 0){
            System.out.println(String.format("O número %d é um número neutro!",numeroDigitado));
        }else{
            System.out.println(String.format("O número %df é negativo!",numeroDigitado));
        }
    }
}
