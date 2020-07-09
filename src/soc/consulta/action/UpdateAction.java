package soc.consulta.action;

import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;

import soc.consulta.bean.Consulta;
import soc.consulta.dao.ConsultaDAO;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620917L;
	private int id = 0;
	private String nome = "";
	private String cpf = "";
	private String celular = "";
	private String email = "";
	private String analise = "";
	private String msg = "";
	ResultSet rs = null;
	ConsultaDAO consultadao = new ConsultaDAO();
	String submitType;
	Consulta consulta = new Consulta();

	@Override
	public String execute() throws Exception {
		try {
			if (submitType.equals("updatedata")) {
				rs = consultadao.fetchConsulta(consulta.getId());
				if (rs != null) {
					while (rs.next()) {
						nome = rs.getString("nm_nome");
						cpf = rs.getString("cd_cpf");
						celular = rs.getString("cd_celular");
						email = rs.getString("ds_email");
						analise = rs.getString("ds_analise");
					}
				}
			} else {
				int i = consultadao.putConsulta(nome, cpf, celular, email, analise);
				if (i > 0) {
					msg = "Dados atualizados com sucesso!";
				} else {
					msg = "Ops! Ocorreu um erro!";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
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

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
