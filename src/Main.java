import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sair = false;
        ArrayList<Transacao> carrinho = new ArrayList<>();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o limite do seu cartão: ");
        Cartao cartao = new Cartao(leitura.nextDouble());

        while (!sair) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = leitura.next();
            System.out.println("Digite o valor da compra: ");
            double valorCompra = leitura.nextDouble();
            Produto produto = new Produto(descricao, valorCompra);

            if (produto.getValor() <= cartao.getLimite()) {
                System.out.println("Compra realizada!");
                carrinho.add(produto);
                cartao.updateLimite(produto.getValor());
                System.out.println("Digite 0 para sair ou 1 para continuar.");
                if (leitura.nextInt() == 0) {
                    cartao.setTransacoes(carrinho);
                    cartao.exibeExtrato();
                    sair = true;
                }
            } else {
                System.out.println("Saldo insuficiente!");
                cartao.setTransacoes(carrinho);
                cartao.exibeExtrato();
                sair = true;
            }
        }
    }
}