import java.util.ArrayList;
import java.util.Collections;

public class Cartao {
    private double limite;

    private ArrayList<Transacao> transacoes;

    public Cartao(double limite) {
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    private void setLimite(double limite) {
        this.limite = limite;
    }

    public void updateLimite(double valor) {
        this.limite -= valor;
    }

    public void setTransacoes(ArrayList<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }

    public void exibeExtrato() {
        System.out.println("*****************");
        System.out.println("Compras realizadas");
        Collections.sort(this.getTransacoes());
        for (Transacao item: this.getTransacoes()) {
            System.out.println(item);
        }

        System.out.println("*****************");

        System.out.println("Saldo do cartão: " + this.getLimite());
    }
}
