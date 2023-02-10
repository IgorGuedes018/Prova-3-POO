package po.model;

import java.util.ArrayList;

public class CarrinhoCompras {
	
	private Pedido pedido;
	private ArrayList<ItensCompra> itemCompra;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public ArrayList<ItensCompra> getItemCompra() {
		return itemCompra;
	}
	public void setItemCompra(ArrayList<ItensCompra> itemCompra) {
		this.itemCompra = itemCompra;
	}
	
	
	public void incluirItens() {
		
	}
	public ArrayList<Produto>  buscarProduto(){
		ArrayList<Produto> p = new ArrayList<>();
		return p;
	}
	

}
