import java.util.Scanner;

public class Licao3 {
    public static void main (String[] args){

        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3){

            String menuOpcoes = """
                    -------------MENU--------------
                    Escolha umas das opções abaixo:
                    
                    1 - Calcular área de um circulo
                    2 - Calcular área de um quadrado
                    3 - Sair do aplicativo                                                
                    """;
            System.out.println(menuOpcoes);
            escolha = leitura.nextInt();

            if (escolha == 1){

                String opcao1 = """
                        OPÇÃO 1:
                        
                        Para calcular a área de um circulo, digite o raio do mesmo:                                             
                        """;
                System.out.println(opcao1);

                double raioCirculo = leitura.nextDouble();
                double areaCirculo = 3.14 * raioCirculo * raioCirculo;

                System.out.println(String.format("Área do circulo: %.2f", areaCirculo));

            }else if (escolha == 2){

                String opcao2 = """
                        OPÇÃO 2:
                        
                        Para calcular a área de um quadrado, digite o lado do quadrado:                                             
                        """;
                System.out.println(opcao2);

                double ladoQuadrado = leitura.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;

                System.out.println(String.format("Área do quadrado: %.2f", areaQuadrado));

            }else if (escolha == 3){

                System.out.println("Aplicativo encerrado!");

            }else{

                System.out.println("Opção inválida, volte ao menu e tente novamente!");

            }
        }
    }
}
