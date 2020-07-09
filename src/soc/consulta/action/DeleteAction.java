package soc.consulta.action;


import com.opensymphony.xwork2.ActionSupport;

import soc.consulta.dao.ConsultaDAO;

public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	int id; 
	String msg;
	ConsultaDAO consultadao = new ConsultaDAO();

	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = consultadao.deleteConsulta(id);
			if (isDeleted > 0) {
				msg = "Consulta excluida!";
			} else {
				msg = "Ops! Ocorreu um erro";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

