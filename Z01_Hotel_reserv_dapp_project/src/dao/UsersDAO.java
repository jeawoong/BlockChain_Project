package dao;

import java.sql.Connection;

import dto.UsersVO;

public class UsersDAO {
	private static UsersDAO uDao = new UsersDAO();
	private static Connection conn = DBConn2.getInstance();

	public static UsersDAO getInstance() {
		return uDao;
	}

}
