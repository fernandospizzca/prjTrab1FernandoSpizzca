package fatec.poo.model;

import java.text.DecimalFormat;

/**
 *
 * @author fernandohs
 */
public class Vendedor extends Pessoa{
    private String dataAdmissao;
    private double taxaComissao;
    private double totalVendas;
    private Pedido pedidos[];
    private int numPed;
    DecimalFormat Formato = new DecimalFormat("#,##0.00");
    
    public Vendedor(int codigo, String nome, double taxaComissao) {
        super(codigo, nome);
        this.taxaComissao = taxaComissao;
        this.pedidos = new Pedido[50];
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addPedido(Pedido pedido){
        this.pedidos[numPed] = pedido;
        this.totalVendas = totalVendas + pedidos[numPed].getTotal();
        numPed++;    
    }
    
    public void listarPedidos(){
        int x;
        
        System.out.printf("%36s\n\n","Relação de Pedidos Emitidos");
        System.out.println("Nome: " + getNome() + "\t"
        + "Taxa de Comissão(%): " + getTaxaComissao() + "\n");
        
        System.out.printf("%-10s%18s%20s\n","No.Pedido","Valor do Pedido", "Total Comissão");
        for(x = 0; x < numPed; x++){
        System.out.printf("%-10d%15s%20s\n",pedidos[x].getNumero(), Formato.format(pedidos[x].getTotal()), 
                Formato.format(pedidos[x].getTotal() * getTaxaComissao()/100));
        
        }
        System.out.println();
        System.out.printf("%15s%10s%20s\n\n","Total Geral",Formato.format(totalVendas),
                Formato.format(taxaComissao/100*totalVendas));   
        
    }
    
}
