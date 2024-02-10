public class Produto extends Transacao {

    public Produto(String descricao, double valor) {
        this.setDescricao(descricao);
        this.setValor(valor);
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }
}
