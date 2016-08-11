package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc_zhuche.DBUtil;
import model.student;

public class studentdao {

	public void addStudent(student s) throws Exception{
		Connection conn = DBUtil.getConnection();
		String sql = "insert into student" + "(sid,age,sname)"+
		"values("+"?,?,?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1,s.getSid());
		ptmt.setInt(2,s.getAge());
		ptmt.setString(3,s.getSname());
		ptmt.execute();
	}
	
	public void updateStudent(student s) throws SQLException  {
		Connection conn = DBUtil.getConnection();
		String sql = " update student" + 
				" set age =?,sname =?" +
				" where sid = ?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		
		ptmt.setInt(1,s.getAge());
		ptmt.setString(2,s.getSname());
		ptmt.setString(3,s.getSid());
		ptmt.execute();
	}
	
	public void delStudent(String id) throws SQLException{
		Connection conn = DBUtil.getConnection();
		String sql = " delete from student" + 
				" where sid = ?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1,id);
		ptmt.execute();
	}
	
	public List<student> query() throws Exception{
		List<student> st = new ArrayList<student>();
		
		Connection conn = DBUtil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select sid,age,sname from student");
		
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		//Statement stmt = conn.createStatement();
		ResultSet rs = ptmt.executeQuery();
		
		student s = null;
		
		while(rs.next()){
			s = new student();
			s.setSid(rs.getString("sid"));
			s.setAge(rs.getInt("age"));
			s.setSname(rs.getString("sname"));
			
			st.add(s);
		}
		return st;
	}
	
	public student get(String id) throws SQLException{
		student s = null;
		Connection conn = DBUtil.getConnection();
		String sql = " select * from student" + 
				" where sid = ?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		
		ptmt.setString(1,id);
		ResultSet rs = ptmt.executeQuery();
		while(rs.next()){
			s = new student();
			s.setSid(rs.getString("sid"));
			s.setAge(rs.getInt("age"));
			s.setSname(rs.getString("sname"));
		}
		return s;
	}
	
	/*public List<student> query(int age) throws Exception{
		List<student> st = new ArrayList<student>();
		
		Connection conn = DBUtil.getConnection();
		StringBuilder sb = new StringBuilder();
		sb.append("select * from student");
		
		sb.append(" where age = ?");
		
		PreparedStatement ptmt = conn.prepareStatement(sb.toString());
		ptmt.setInt(1,age);
		//Statement stmt = conn.createStatement();
		System.out.println(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		
		student s = null;
		
		while(rs.next()){
			s = new student();
			s.setSid(rs.getString("sid"));
			s.setAge(rs.getInt("age"));
			s.setSname(rs.getString("sname"));
			
			st.add(s);
		}
		return st;
	}*/
	
}

