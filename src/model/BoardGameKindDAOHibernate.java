package model;

import hibernate.util.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class BoardGameKindDAOHibernate implements BoardGameKindDAO_Interface {

	@Override
	public BoardGameKindVO findByPrimeKey(String boardGameStyle) {
		BoardGameKindVO boardGameKindVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			boardGameKindVO = (BoardGameKindVO) session.get(
					BoardGameKindVO.class, boardGameStyle);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return boardGameKindVO;
	}

	private static final String GET_ALL_STMT = "from BoardGameKindVO order by boardGameNumber";

	@Override
	public List<BoardGameKindVO> getAll() {
		List<BoardGameKindVO> list = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			Query query = session.createQuery(GET_ALL_STMT);
			list = query.list();
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return list;
	}

	@Override
	public void insert(BoardGameKindVO bean) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(bean);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	@Override
	public void update(BoardGameKindVO bean) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(bean);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	@Override
	public void delete(String boardGameStyle) {
		BoardGameKindVO boardGameKindVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			boardGameKindVO = (BoardGameKindVO) session.get(
					BoardGameKindVO.class, boardGameStyle);
			session.delete(boardGameKindVO);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		BoardGameKindDAO_Interface dao = new BoardGameKindDAOHibernate();
		// 新增
		BoardGameKindVO bvo1 = new BoardGameKindVO();
		bvo1.setBoardGameNumber(1);
		bvo1.setBoardGameStyle("");
		// 修改
		// 刪除
		// 查詢單筆
		// 查詢多筆
	}
}
