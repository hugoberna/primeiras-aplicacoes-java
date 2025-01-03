public class Produto {
    public static void main (String[] args){

        double precoProdutoDolar = 5.50;
        int quantidadeProduto = 20;
        double valorTotalDolar = precoProdutoDolar * quantidadeProduto;
        double conversaoReais = valorTotalDolar * 4.94;
        double percentualDesconto = 10.00;
        double valorDesconto = (conversaoReais - (percentualDesconto / 100.0) * conversaoReais);

        if (conversaoReais >= 500.00){
            String mensagem = """
                Valor unitário: %.2f
                Quantidade: %d
                Valor em Dólares: %.2f
                Valor em Reais: %.2f
                Valor com desconto: %.2f             
                """.formatted(precoProdutoDolar, quantidadeProduto, valorTotalDolar, conversaoReais, valorDesconto);
            System.out.println(mensagem);
        }else{
            String mensagem = """
                Valor unitário: %.2f
                Quantidade: %d
                Valor em Dólares: %.2f
                Valor em Reais: %.2f
                """.formatted(precoProdutoDolar, quantidadeProduto, valorTotalDolar, conversaoReais);
            System.out.println(mensagem);
        }
    }

}
