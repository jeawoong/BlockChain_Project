package dao;

import java.sql.Connection;

import dto.ReservVO;

public class ReservDAO {
	private static ReservDAO rDao = new ReservDAO();
	private static Connection conn = DBConn2.getInstance();

	public static ReservDAO getInstance() {
		return rDao;
	}
}
