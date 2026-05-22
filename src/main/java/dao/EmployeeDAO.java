package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Employee;


public class EmployeeDAO extends DAO {
	public List<Employee> findAll() throws Exception {
		List <Employee> list = new ArrayList<>();
		
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
				"select * from product where name like ?");
		st.setString(1, "%");
		ResultSet rs = st.executeQuery();
		
		while (rs.next()) {
			Employee e = new Employee();
			
			e.setName(rs.getString("name"));
			e.setAge(rs.getInt("age"));
			list.add(e);
		}
		
		st.close();
		con.close();
		                 
		return list;
	}
	
	public Employee findById(int id) throws Exception {
		Employee employee = null;
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"SELECT * FROM employee WHERE id = ?");
		 st.setInt(1, id);
		 
		 ResultSet rs = st.executeQuery();
		 
		 if (rs.next()) {

	            Employee e = new Employee();

	            e.setId(rs.getInt("id"));
	            e.setName(rs.getString("name"));
	            e.setAge(rs.getInt("age"));

	        }
		                                  
		st.close();
		con.close();
		
		return employee;
		
	}
	
	public boolean insert(Employee employee) throws Exception {
		
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
				"insert into employee(name, age) values(?, ?)");
		
		st.setString(1, employee.getName());
		st.setInt(2, employee.getAge());
		
		int count = st.executeUpdate();
		
		st.close();
		con.close();
		
		return count > 0;
		
	}
	
	public boolean update(Employee employee) throws Exception {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"UPDATE employee SET name = ?, age = ? WHERE id = ?");
		st.setInt(1, employee.getId());
		st.setString(2, employee.getName());
		st.setInt(3, employee.getAge());
		
		int count = st.executeUpdate();
		
		st.close();
		con.close();
		
		return count > 0;
		
	}
	
	public boolean delete(int id) throws Exception {
		Connection con = getConnection();
		PreparedStatement st = con.prepareStatement(
				"DELETE FROM employee WHERE id = ?");
		
		st.setInt(1, id);
		int count = st.executeUpdate();
		
		st.close();
		con.close();
		
		return count > 0;
		
	}
	
	

}
