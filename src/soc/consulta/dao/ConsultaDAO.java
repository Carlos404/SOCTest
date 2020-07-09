package soc.consulta.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import soc.consulta.config.DBConfig;

public class ConsultaDAO {
	
	
	public int postConsulta(String nm_nome, String cd_cpf, String cd_celular, String ds_email, String ds_analise) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO consulta (nm_nome, cd_cpf, cd_celular, ds_email, ds_analise) VALUES (?,?,?,?,?)";
			PreparedStatement ps = DBConfig.getConnection().prepareStatement(sql);
			ps.setString(1, nm_nome);
			ps.setString(2, cd_cpf);
			ps.setString(3, cd_celular);
			ps.setString(4, ds_email);
			ps.setString(5, ds_analise);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (DBConfig.getConnection() != null) {
				DBConfig.getConnection().close();
			}
		}
	}


	public ResultSet getConsulta() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM consulta";
			PreparedStatement ps = DBConfig.getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (DBConfig.getConnection() != null) {
				DBConfig.getConnection().close();
			}
		}
	}

	
	public ResultSet fetchConsulta(int id) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT * FROM consulta WHERE id=?";
			PreparedStatement ps = DBConfig.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (DBConfig.getConnection() != null) {
				DBConfig.getConnection().close();
			}
		}
	}

	
	public int putConsulta(String nm_nome, String cd_cpf, String cd_celular, String ds_email, String ds_consulta)
			throws SQLException, Exception {
		int i = 0;
		try {
			String sql = "UPDATE consulta SET nm_nome=?, cd_cpf=?, cd_celular=?, ds_email=?, ds_analise=? WHERE id= :id";
			PreparedStatement ps = DBConfig.getConnection().prepareStatement(sql);
			ps.setString(2, nm_nome);
			ps.setString(3, cd_cpf);
			ps.setString(4, cd_celular);
			ps.setString(5, ds_email);
			ps.setString(6, ds_consulta);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			DBConfig.getConnection().rollback();
			return 0;
		} finally {
			if (DBConfig.getConnection() != null) {
				DBConfig.getConnection().close();
			}
		}
	}


	public int deleteConsulta(int id) throws SQLException, Exception {
		
		  try {
		   String sql="DELETE FROM consulta WHERE id=?";
		   PreparedStatement ps= DBConfig.getConnection().prepareStatement(sql);
		   ps.setInt(1, id);   
		   ps.executeUpdate();
		        } catch (SQLException e) {
		                System.err.println(e.getMessage());
		        }
		return id;
		
		}
	}

