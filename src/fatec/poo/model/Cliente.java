package fatec.poo.model;

/**
 *
 * @author fernandohs
 */
public class Cliente extends Pessoa{
    
    private double limite;
    private Pedido pedidos[];
    private int numPed;

    public Cliente(int codigo, String nome, double limite) {
        super(codigo, nome);
        this.limite = limite;
        this.pedidos = new Pedido[50];
    }

    public double getLimite() {
        return limite;
    }
    
    public void addPedido(Pedido pedido){
        this.pedidos[numPed] = pedido;
        numPed++;    
    }
    
    public void atualizarLimite(double subTotalItem){
        this.limite = limite - subTotalItem;
        
    }
    
}
