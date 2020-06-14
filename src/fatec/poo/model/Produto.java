package fatec.poo.model;

/**
 *
 * @author fernandohs
 */
public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int qtdeEstoque;

    public Produto(int codigo, String descricao, int qtdeEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }   
    
}
