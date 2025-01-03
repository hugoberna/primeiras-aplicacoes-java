import java.util.Scanner;

public class Licao2 {
    public static void main (String[] args){

//IMPLEMENTAR WHILE
        Scanner leitura = new Scanner(System.in);
        int numeroUm = 0;
        int numeroDois = 0;

        System.out.println("Digite dois número inteiros: ");
        numeroUm = leitura.nextInt();
        System.out.println("Digite o segundo: ");
        numeroDois = leitura.nextInt();

        if (numeroUm == numeroDois){
            System.out.println("Você digitou dois números iguais!");
        }else if (numeroUm > numeroDois){
            System.out.println(String.format("O número %d é maior que %d", numeroUm, numeroDois));
        }else{
            System.out.println(String.format("O número %d é maior que %d", numeroDois, numeroUm));
        }
    }
}
