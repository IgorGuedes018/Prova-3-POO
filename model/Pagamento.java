package po.model;

import java.util.Date;

public class Pagamento {

	private Pedido pedido;
	private Date dataPagamento;
	
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	
	public void criarPagamento() {
		
	}
	
}
