public abstract class Transacao implements Comparable<Transacao> {
    String descricao;
    double valor;
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Transacao transacao) {
        return Double.compare(this.getValor(), transacao.getValor());
    }

    @Override
    public String toString() {
        return this.getDescricao() + " - " + this.getValor();
    }
}
