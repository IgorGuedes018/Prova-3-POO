package po.model;

public class Cliente {

    private String nome;
	private String email;
	private String cpf;
	private String rg;
	private Login login;
	private CarrinhoCompras carrinhoCompras;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public CarrinhoCompras getCarrinhoCompras() {
		return carrinhoCompras;
	}
	public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
		this.carrinhoCompras = carrinhoCompras;
	}
	
	
	
	
	
	private void alterarDados() {
		
	}
	private void excluirConta() {
		
	}
	

	
}
