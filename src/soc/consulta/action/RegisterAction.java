package soc.consulta.action;

import com.opensymphony.xwork2.ActionSupport;

import soc.consulta.dao.ConsultaDAO;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String celular;
	private String email;
	private String analise;
	private String msg = "";
	ConsultaDAO dao = new ConsultaDAO();
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		dao = new ConsultaDAO();

		try {
			ctr = dao.postConsulta(nome, cpf, celular, email, analise);
			if (ctr > 0) {
				msg = "Consulta registrada com sucesso!";
			} else {
				msg = "Ops! Ocorreu um erro";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REGISTER";
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

	public String getAnalise() {
		return analise;
	}

	public void setAnalise(String analise) {
		this.analise = analise;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ConsultaDAO getDao() {
		return dao;
	}

	public void setDao(ConsultaDAO dao) {
		this.dao = dao;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
