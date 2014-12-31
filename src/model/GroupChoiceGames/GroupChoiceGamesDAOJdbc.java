package model.GroupChoiceGames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GroupChoiceGamesDAOJdbc implements GroupChoiceGamesDAO {
	private static final String URL = "jdbc:sqlserver://localhost:1433;database=boardgames";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "123456";

	private static final String SELECT_BY_ID = "select * from GroupChoiceGames where choiceGamesSerialNumber=?";

	@Override
	public GroupChoiceGamesVO select(Integer choiceGamesSerialNumber) {
		GroupChoiceGamesVO result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(SELECT_BY_ID);
			stmt.setInt(1, choiceGamesSerialNumber);
			rset = stmt.executeQuery();

			if (rset.next()) {
				result = new GroupChoiceGamesVO();
				result.setChoiceGamesSerialNumber(rset
						.getInt("choiceGamesSerialNumber"));
				result.setGroupSerialNumber(rset.getInt("groupSerialNumber"));
				result.setBoardGameStyle(rset.getString("boardGameStyle"));
				result.setBoardGameName(rset.getString("boardGameName"));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	private static final String SELECT_ALL = "select * from GroupChoiceGames";

	@Override
	public List<GroupChoiceGamesVO> select() {
		List<GroupChoiceGamesVO> result = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(SELECT_ALL);
			rset = stmt.executeQuery();

			result = new ArrayList<GroupChoiceGamesVO>();

			while (rset.next()) {
				GroupChoiceGamesVO bean = new GroupChoiceGamesVO();
				bean.setChoiceGamesSerialNumber(rset
						.getInt("choiceGamesSerialNumber"));
				bean.setGroupSerialNumber(rset.getInt("groupSerialNumber"));
				bean.setBoardGameStyle(rset.getString("boardGameStyle"));
				bean.setBoardGameName(rset.getString("boardGameName"));

				result.add(bean);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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

	private static final String INSERT = "insert into GroupChoiceGames(choiceGamesSerialNumber, groupSerialNumber, boardGameStyle, boardGameName) values (?, ?, ?, ?)";

	@Override
	public GroupChoiceGamesVO insert(GroupChoiceGamesVO bean) {
		Connection conn = null;
		PreparedStatement stmt = null;
		GroupChoiceGamesVO result = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(INSERT);

			result = new GroupChoiceGamesVO();
			stmt.setInt(1, bean.getChoiceGamesSerialNumber());
			stmt.setInt(2, bean.getGroupSerialNumber());
			stmt.setString(3, bean.getBoardGameStyle());
			stmt.setString(4, bean.getBoardGameName());
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

	private static final String UPDATE = "update GroupChoiceGames set groupSerialNumber=?, boardGameStyle=?, boardGameName=? where choiceGamesSerialNumber=?";

	@Override
	public GroupChoiceGamesVO update(GroupChoiceGamesVO bean) {
		Connection conn = null;
		PreparedStatement stmt = null;
		GroupChoiceGamesVO result = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(UPDATE);

			stmt.setInt(1, bean.getGroupSerialNumber());
			stmt.setString(2, bean.getBoardGameStyle());
			stmt.setString(3, bean.getBoardGameName());
			stmt.setInt(4, bean.getChoiceGamesSerialNumber());

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

	private static final String DELETE = "delete from GroupChoiceGames where choiceGamesSerialNumber=?";

	@Override
	public boolean delete(String choiceGamesSerialNumber) {
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.prepareStatement(DELETE);
			stmt.setString(1, choiceGamesSerialNumber);

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
		GroupChoiceGamesDAOJdbc dao = new GroupChoiceGamesDAOJdbc();

		// select by id
		// System.out.println(dao.select(1));

		// select all
		// List<GroupChoiceGamesBean> beans = dao.select();
		// System.out.println(beans);

		// insert
		GroupChoiceGamesVO bean = new GroupChoiceGamesVO();
		bean.setChoiceGamesSerialNumber(1);
		bean.setGroupSerialNumber(2);
		bean.setBoardGameStyle("角色扮演遊戲");
		bean.setBoardGameName("大逃殺");
		dao.insert(bean);
		//
		// update
		// GroupChoiceGamesBean bean = new GroupChoiceGamesBean();
		// bean.setGroupSerialNumber(2);
		// bean.setBoardGameStyle("角色扮演遊戲");
		// bean.setBoardGameName("大逃殺");
		// bean.setChoiceGamesSerialNumber(1);
		// dao.update(bean);

		// delete
		// dao.delete("1");

	}

}
