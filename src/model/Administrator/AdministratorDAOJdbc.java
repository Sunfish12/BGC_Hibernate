package model.Administrator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdministratorDAOJdbc implements AdministratorDAO {
	private static final String URL = "jdbc:sqlserver://localhost:1433;database=boardgames";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "123456";

	private static final String SELECT_BY_ID = "select * from Administrator where adminUsername=?";

	@Override
	public AdministratorVO select(String adminUsername) {
		AdministratorVO result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(SELECT_BY_ID);
			stmt.setString(1, adminUsername);
			rset = stmt.executeQuery();

			if (rset.next()) {
				result = new AdministratorVO();
				result.setAdminUsername(rset.getString("adminUsername"));
				result.setAdminPswd(rset.getBytes("adminPswd"));
				result.setImgFileName(rset.getString("imgFileName"));
				result.setAdminMemberImage(rset.getBytes("adminMemberImage"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	private static final String SELECT_ALL = "select * from Administrator";

	@Override
	public List<AdministratorVO> select() {
		List<AdministratorVO> result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(SELECT_ALL);
			rset = stmt.executeQuery();

			result = new ArrayList<AdministratorVO>();
			while (rset.next()) {
				AdministratorVO bean = new AdministratorVO();
				bean.setAdminUsername(rset.getString("adminUsername"));
				bean.setAdminPswd(rset.getBytes("adminPswd"));
				bean.setImgFileName(rset.getString("imgFileName"));
				bean.setAdminMemberImage(rset.getBytes("adminMemberImage"));

				result.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

		return result;
	}

	private static final String INSERT = "insert into Administrator (adminUsername, adminPswd, imgFileName, adminMemberImage) values (?, ?, ?, ?)";

	@Override
	public AdministratorVO insert(AdministratorVO bean, InputStream is,
			long size) {
		Connection conn = null;
		PreparedStatement stmt = null;
		AdministratorVO result = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(INSERT);

			result = new AdministratorVO();
			stmt.setString(1, bean.getAdminUsername());
			stmt.setBytes(2, bean.getAdminPswd());
			stmt.setString(3, bean.getImgFileName());
			stmt.setBinaryStream(4, is, size);

			int i = stmt.executeUpdate();
			if (i == 1) {
				System.out.println("Insert Successful!");
				return bean;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	private static final String UPDATE = "update Administrator set adminPswd=?, imgFileName=?, adminMemberImage=?";

	@Override
	public AdministratorVO update(AdministratorVO bean, InputStream is,
			long size) {
		Connection conn = null;
		PreparedStatement stmt = null;
		AdministratorVO result = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(UPDATE);
			stmt.setBytes(1, bean.getAdminPswd());
			stmt.setString(2, bean.getImgFileName());
			stmt.setBinaryStream(3, is, size);

			int i = stmt.executeUpdate();
			if (i == 1) {
				System.out.println("Update Successful!");
				return bean;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}

	private static final String DELETE = "delete from Administrator where adminUsername=?";

	@Override
	public boolean delete(String adminUsername) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(DELETE);
			stmt.setString(1, adminUsername);
			int i = stmt.executeUpdate();

			if (i == 1) {
				System.out.println("Delete Successful!");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		AdministratorDAOJdbc dao = new AdministratorDAOJdbc();

		// select單筆
		// System.out.println(dao.select("Akaitsuki"));

		// select全部
		List<AdministratorVO> beans = dao.select();
		System.out.println(beans);

		// insert一筆
		// AdministratorBean bean = new AdministratorBean();
		// File f = null;
		// FileInputStream fis = null;
		//
		// try {
		// f = new File("res/nekodack.gif");
		// fis = new FileInputStream(f);
		// long length = f.length();
		// bean.setAdminUsername("Aitsuki");
		// bean.setAdminPswd("Aitsuki".getBytes());
		// bean.setImgFileName("nekodack.gif");
		// dao.insert(bean, fis, length);
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// update單筆
		// AdministratorBean bean = new AdministratorBean();
		// File f = null;
		// FileInputStream fis = null;
		//
		// try {
		// f = new File("res/nekodack.gif");
		// fis = new FileInputStream(f);
		// long length = f.length();
		//
		// bean.setAdminUsername("Aitsuki");
		// bean.setAdminPswd("Aitsuki".getBytes());
		// bean.setImgFileName("nekodack.gif");
		//
		// bean = dao.select("Aitsuki");
		// System.out.println(bean);
		// // System.out.println(dao.update(bean,fis,length));
		//
		// } catch (FileNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// delete單筆
		// dao.delete("Aitsuki");

	}

}
