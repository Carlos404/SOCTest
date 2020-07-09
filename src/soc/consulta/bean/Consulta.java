package soc.consulta.bean;

public class Consulta {
	
	private int id;
	private String nome;
	private String cpf;
	private String celular;
	private String email;
	private String resultado;
	
	
	public Consulta(String nome, String cpf, String celular, String email, String resultado) {
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.email = email;
		this.resultado = resultado;
	}
	public Consulta() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
