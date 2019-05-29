package dao;

import java.sql.Connection;

import dto.CavinVO;

public class CavinDAO {
	private static CavinDAO cDao = new CavinDAO();
	private static Connection conn = DBConn2.getInstance();

	public static CavinDAO getInstance() {
		return cDao;
	}

}
