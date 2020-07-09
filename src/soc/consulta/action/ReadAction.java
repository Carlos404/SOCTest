package soc.consulta.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import soc.consulta.bean.Consulta;
import soc.consulta.dao.ConsultaDAO;

public class ReadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	ResultSet rs = null;
	Consulta consulta = null;
	List<Consulta> consultas = null;
	
	ConsultaDAO dao = new ConsultaDAO();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			consultas = new ArrayList<Consulta>();
			rs = dao.getConsulta();
			int id;
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					id = rs.getInt("id");
					i = 1;
					consulta = new Consulta();
					consulta.setId(id);
					consulta.setNome(rs.getString("nm_nome"));
					consulta.setCpf(rs.getString("cd_cpf"));
					consulta.setEmail(rs.getString("ds_email"));
					consulta.setCelular(rs.getString("cd_celular"));
					consulta.setResultado(rs.getString("ds_analise"));
					consultas.add(consulta);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "READ";
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public Consulta getExame() {
		return consulta;
	}

	public void setExame(Consulta consulta) {
		this.consulta = consulta;
	}

	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}