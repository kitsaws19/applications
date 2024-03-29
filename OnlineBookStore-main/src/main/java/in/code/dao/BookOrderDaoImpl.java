package in.code.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.code.db.JdbcUtil;
import in.code.entity.Book_Order;
import in.code.entity.User;

public class BookOrderDaoImpl implements IBookOrderDao {

	private Connection con;
	private PreparedStatement ps;

	public boolean saveOrder(List<Book_Order> list) {
		boolean f = false;
		try {
			con = JdbcUtil.getJdbcConnection();
			String sql = "insert into book_order(id,order_id,user_name,email,address,phone,book_name,author,price,payment) values (?,?,?,?,?,?,?,?,?,?)";

			con.setAutoCommit(false);
			ps = con.prepareStatement(sql);
			for (Book_Order b : list) {
				ps.setInt(1, b.getId());
				ps.setString(2, b.getOrderId());
				ps.setString(3, b.getUserName());
				ps.setString(4, b.getEmail());
				ps.setString(5, b.getFulladd());
				ps.setString(6, b.getPhno());
				ps.setString(7, b.getBookName());
				ps.setString(8, b.getAuthor());
				ps.setString(9, b.getPrice());
				ps.setString(10, b.getPaymentType());
				ps.addBatch();
			}
			int[] count = ps.executeBatch();
			con.commit();
			f = true;
			con.setAutoCommit(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public List<Book_Order> getBook(String email) {
		ArrayList<Book_Order> list = new ArrayList<Book_Order>();
		Book_Order o = null;
		try {
			con = JdbcUtil.getJdbcConnection();
			String sql = "select * from book_order where email = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				o = new Book_Order();
				o.setId(rs.getInt(1));
				o.setOrderId(rs.getString(2));
				o.setUserName(rs.getString(3));
				o.setEmail(rs.getString(4));
				o.setFulladd(rs.getString(5));
				o.setPhno(rs.getString(6));
				o.setBookName(rs.getString(7));
				o.setAuthor(rs.getString(8));
				o.setPrice(rs.getString(9));
				o.setPaymentType(rs.getString(10));
				list.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Book_Order> getAllOrderedBook() {
		ArrayList<Book_Order> list = new ArrayList<Book_Order>();
		Book_Order o = null;
		try {
			con = JdbcUtil.getJdbcConnection();
			String sql = "select * from book_order";
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				o = new Book_Order();
				o.setId(rs.getInt(1));
				o.setOrderId(rs.getString(2));
				o.setUserName(rs.getString(3));
				o.setEmail(rs.getString(4));
				o.setFulladd(rs.getString(5));
				o.setPhno(rs.getString(6));
				o.setBookName(rs.getString(7));
				o.setAuthor(rs.getString(8));
				o.setPrice(rs.getString(9));
				o.setPaymentType(rs.getString(10));
				list.add(o);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}