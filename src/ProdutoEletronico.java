import br.com.alura.comex.modelos.Produto;


public class ProdutoEletronico extends Produto {
    private int voltagem;
    private double potencia;

    public ProdutoEletronico(String nome, String descricao, int voltagem, double potencia) {
        super(nome, descricao);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }


    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
