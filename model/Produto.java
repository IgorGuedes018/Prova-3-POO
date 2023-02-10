package po.model;

import java.util.ArrayList;

public class Produto {
	
	
	private EspecificacaoProduto especificacaoProduto;
	private ArrayList<ItensCompra> itensCompra;
	
	
	
	public EspecificacaoProduto getEspecificacaoProduto() {
		return especificacaoProduto;
	}
	public void setEspecificacaoProduto(EspecificacaoProduto especificacaoProduto) {
		this.especificacaoProduto = especificacaoProduto;
	}
	public ArrayList<ItensCompra> getItensCompra() {
		return itensCompra;
	}
	public void setItensCompra(ArrayList<ItensCompra> itensCompra) {
		this.itensCompra = itensCompra;
	}
	
	
	public ArrayList<Produto>  buscarProduto(){
		ArrayList<Produto> p = new ArrayList<>();
		return p;
	}
	


}
