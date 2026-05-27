package dao;

import java.sql.Connection;
import java.util.List;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import beans.Employee;


public class DAO {
	static DataSource ds;
	
	public Connection getConnection() throws Exception {
		if (ds == null) {
			InitialContext ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:/comp/env/jdbc/book");
		}
		return ds.getConnection();
	}
	
	public List<Employee> findAll() throws Exception {
		return null;
	}

}
