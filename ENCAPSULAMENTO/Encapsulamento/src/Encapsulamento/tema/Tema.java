package Encapsulamento.tema;


public class Tema {
	private long id;
	private String nome;
	private String corToalha;
	private double valorAluguel;
	
	public Tema(long id, String nome, String corToalha, double valorAluguel) {
		super();
		this.id = id;
		this.nome = nome;
		this.corToalha = corToalha;
		this.valorAluguel = valorAluguel;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorToalha() {
		return corToalha;
	}
	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	
	
	
	


}
