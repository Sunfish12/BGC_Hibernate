package model.BoardGameKind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardGameKindDAO_JDBC implements BoardGameKindDAO {
	private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=BoardGames";
	private static final String USERNAME = "sa";
	private static final String PASSWORD = "sa123456";

	// private DataSource dataSource;
	//
	// public MemberDAO_JDBC() {
	// try {
	// Context ctx = new InitialContext();
	// dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/xxx");
	// } catch (NamingException e) {
	// e.printStackTrace();
	// }
	// }

	private static final String SELECT_BY_GAMESTYLE = "select * from boardgamekind where boardgamestyle = ?";

	@Override
	public BoardGameKindVO findByPrimeKey(String boardGameStyle) {
		BoardGameKindVO result = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(SELECT_BY_GAMESTYLE);
			pstmt.setString(1, boardGameStyle);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				result = new BoardGameKindVO();
				result.setBoardGameNumber(rs.getInt("boardgamenumber"));
				result.setBoardGameStyle(rs.getString("boardgamestyle"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
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

	private static final String SELECT_ALL = "select * from boardgamekind order by boardgamenumber";

	@Override
	public List<BoardGameKindVO> getAll() {
		List<BoardGameKindVO> result = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(SELECT_ALL);
			rs = pstmt.executeQuery();
			result = new ArrayList<BoardGameKindVO>();
			while (rs.next()) {
				BoardGameKindVO bean = new BoardGameKindVO();
				bean.setBoardGameNumber(rs.getInt("boardgamenumber"));
				bean.setBoardGameStyle(rs.getString("boardgamestyle"));
				result.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
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

	private static final String INSERT = "insert into boardgamekind (boardgamenumber, boardgamestyle) values (?, ?)";

	@Override
	public BoardGameKindVO insert(BoardGameKindVO bean) {
		BoardGameKindVO result = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, bean.getBoardGameNumber());
			pstmt.setString(2, bean.getBoardGameStyle());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				result = bean;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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

	private static final String UPDATE = "update boardgamekind set boardgamenumber=? where boardgamestyle=?";

	@Override
	public BoardGameKindVO update(BoardGameKindVO bean) {
		BoardGameKindVO result = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(UPDATE);
			pstmt.setInt(1, bean.getBoardGameNumber());
			pstmt.setString(2, bean.getBoardGameStyle());
			int i = pstmt.executeUpdate();
			if (i == 1) {
				result = bean;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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

	private static final String DELETE = "delete from boardgamekind where boardgamestyle=?";

	@Override
	public boolean delete(String boardGameStyle) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			// conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setString(1, boardGameStyle);
			int i = pstmt.executeUpdate();
			if (i == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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

		BoardGameKindDAO dao = new BoardGameKindDAO_JDBC();

		// Insert
		BoardGameKindVO bean1 = new BoardGameKindVO();
		bean1.setBoardGameNumber(1);
		bean1.setBoardGameStyle("策略遊戲");
		dao.insert(bean1);

		BoardGameKindVO bean2 = new BoardGameKindVO();
		bean2.setBoardGameNumber(2);
		bean2.setBoardGameStyle("益智遊戲");
		dao.insert(bean2);

		BoardGameKindVO bean3 = new BoardGameKindVO();
		bean3.setBoardGameNumber(3);
		bean3.setBoardGameStyle("推理遊戲");
		dao.insert(bean3);

		BoardGameKindVO bean4 = new BoardGameKindVO();
		bean4.setBoardGameNumber(4);
		bean4.setBoardGameStyle("角色扮演遊戲");
		dao.insert(bean4);

		BoardGameKindVO bean5 = new BoardGameKindVO();
		bean5.setBoardGameNumber(5);
		bean5.setBoardGameStyle("幼教遊戲");
		dao.insert(bean5);

		BoardGameKindVO bean6 = new BoardGameKindVO();
		bean6.setBoardGameNumber(6);
		bean6.setBoardGameStyle("小品遊戲");
		dao.insert(bean6);

		// Update
		// BoardGameKindBean bean7 = new BoardGameKindBean();
		// bean7.setBoardGameNumber(7);
		// bean7.setBoardGameStyle("小品遊戲");
		// dao.update(bean7);

		// Delete By BoardGameStyle
		// boolean b = dao.delete("幼教遊戲");
		// System.out.println(b);

		// Select By BoardGameStyle
		// BoardGameKindBean bean8 = dao.findByPrimeKey("小品遊戲");
		// System.out.println(bean8);

		// Select All
		List<BoardGameKindVO> beans = dao.getAll();
		System.out.println(beans);
	}
}
