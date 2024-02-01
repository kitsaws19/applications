package in.code.dao;
import java.util.Random;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.code.db.JdbcUtil;
import in.code.entity.User;

public class UserDaoImpl implements IUserDao {
	private Connection con;

	public boolean userRegister(User us) {
        Random r1=new Random();
		boolean flag = false;
		try {
			con = JdbcUtil.getJdbcConnection();
			PreparedStatement ps = con.prepareStatement("insert into user(name,email,phno,password,id) values(?,?,?,?,?)");
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhno());
			ps.setString(4, us.getPassword());
			ps.setInt(5, r1.nextInt(100));
			int rowUpdated = ps.executeUpdate();
			if (rowUpdated == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public User login(String email, String password) {
		User us = null;
		try {
			con = JdbcUtil.getJdbcConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where email = ? and password = ?");
			ps.setString(1, email);
			ps.setString(2, password);
			System.out.println("Login issue");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Login issue1");
				us = new User();
				System.out.println("Login issue2");
				System.out.println("Login issue2"+rs.getString(1));
				us.setName(rs.getString(1));
				us.setEmail(rs.getString(2));
				us.setPhno(rs.getString(3));
				us.setPassword(rs.getString(4));
				//us.setPassword(rs.getString(5));
				//us.setId(rs.getInt(5));
				//us.setName(rs.getString(2));
				//us.setEmail(rs.getString(3));
				//us.setPhno(rs.getString(4));
				//us.setPassword(rs.getString(5));
				//us.setAddress(rs.getString(6));
				//us.setLandmark(rs.getString(7));
				//us.setCity(rs.getString(8));
				//us.setState(rs.getString(9));
				//us.setPincode(rs.getString(10));
			}
		} catch (SQLException e) {
			System.out.println("Login issue sql");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Login issue io");
			e.printStackTrace();
		}

		return us;
	}

	public boolean checkpassword(int id, String password) {
		boolean f = false;
		try {
			con = JdbcUtil.getJdbcConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where email = ? and password = ?");
			ps.setInt(1, id);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				f = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return f;
	}

	public boolean updateProfile(User us) {
		boolean f = false;
		try {
			con = JdbcUtil.getJdbcConnection();
			String sql="update user set name = ? ,email = ? ,phno= ?";
			sql+= "where id= ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, us.getName());
			ps.setString(2, us.getEmail());
			ps.setString(3, us.getPhno());
			ps.setString(4, us.getPassword());
			ps.setInt(5, us.getId());
			
			int rowAffected = ps.executeUpdate();
			if (rowAffected >= 1) {
				f = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
	public boolean checkUser(String email) {
		boolean f = false;
		try {
			con = JdbcUtil.getJdbcConnection();
			PreparedStatement ps = con.prepareStatement("select * from user where email = ?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				f = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
}