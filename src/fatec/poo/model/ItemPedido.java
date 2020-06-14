package fatec.poo.model;

/**
 *
 * @author fernandohs
 */
public class ItemPedido {
    private int qtdeVend;
    private double subTotal;
    private Pedido pedido;
    private Produto produto;

    public ItemPedido(Produto produto, int qtdeVend ) {
        this.produto = produto;
        this.qtdeVend = qtdeVend;
        this.subTotal = produto.getPreco() * qtdeVend;
        this.produto.setQtdeEstoque(produto.getQtdeEstoque() - qtdeVend);
    }

    public int getQtdeVend() {
        return qtdeVend;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
   

    public Pedido getPedido() {
        return pedido;
    }

    public Produto getProduto() {
        return produto;
    }
      
}
