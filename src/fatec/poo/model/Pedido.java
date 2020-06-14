package fatec.poo.model;

import java.text.DecimalFormat;


/**
 *
 * @author fernandohs
 */
public class Pedido {
    private int numero;
    private double total;
    private Cliente cliente;
    private Vendedor vendedor;
    private ItemPedido itensPedido[];
    private int numItemPed;
    DecimalFormat Formato = new DecimalFormat("#,##0.00");

    public Pedido(int numero) {
        this.numero = numero;
        this.itensPedido = new ItemPedido[50];
    }

    public int getNumero() {
        return numero;
    }

    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void addItemPedido(ItemPedido item){
        this.itensPedido[numItemPed] = item;
        this.total= total + itensPedido[numItemPed].getSubTotal();
        this.cliente.atualizarLimite(itensPedido[numItemPed].getSubTotal());
        numItemPed++;
    }
    
    public void listar(){
        int x;
        
        System.out.printf("%10s%d\n\n","Número do pedido: ", numero);
        System.out.printf("%-10s%s\n\n","Nome do Cliente: ", cliente.getNome());
       
        
        System.out.printf("%-10s%-20s%-20s%-10s\n","Código","Descrição", "Qtde. Vendida", "SubTotal");
        for(x = 0; x < numItemPed; x++){
        System.out.printf("%-10d%-25s%-10d%13s\n",itensPedido[x].getProduto().getCodigo(), 
                itensPedido[x].getProduto().getDescricao(), itensPedido[x].getQtdeVend(), 
                Formato.format(itensPedido[x].getSubTotal()));
        }
        System.out.println();
        System.out.printf("%50s%s\n\n","Total Geral ", Formato.format(total));  
        
    }
    
    
}
