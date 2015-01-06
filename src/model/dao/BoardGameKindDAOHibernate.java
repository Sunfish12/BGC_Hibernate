package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.BoardGameKind;
import model.BoardGameKindDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class BoardGameKindDAOHibernate implements BoardGameKindDAO_Interface {

	@Override
	public BoardGameKind findByPrimeKey(Integer boardGameSerialNumber) {
		BoardGameKind boardGameKind = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			boardGameKind = (BoardGameKind) session.get(BoardGameKind.class,
					boardGameSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return boardGameKind;
	}

	private static final String GET_ALL_STMT = "from BoardGameKind order by boardGameSerialNumber";

	@Override
	public List<BoardGameKind> getAll() {
		List<BoardGameKind> list = null;
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
	public void insert(BoardGameKind bean) {
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
	public void update(BoardGameKind bean) {
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
	public void delete(Integer boardGameSerialNumber) {
		BoardGameKind boardGameKind = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			boardGameKind = (BoardGameKind) session.get(BoardGameKind.class,
					boardGameSerialNumber);
			session.delete(boardGameKind);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		BoardGameKindDAO_Interface dao = new BoardGameKindDAOHibernate();
		// 新增
		BoardGameKind bean1 = new BoardGameKind();
		bean1.setBoardGameSerialNumber(1);
		bean1.setBoardGameStyle("策略遊戲");
		dao.insert(bean1);

		BoardGameKind bean2 = new BoardGameKind();
		bean2.setBoardGameSerialNumber(2);
		bean2.setBoardGameStyle("益智遊戲");
		dao.insert(bean2);

		BoardGameKind bean3 = new BoardGameKind();
		bean3.setBoardGameSerialNumber(3);
		bean3.setBoardGameStyle("推理遊戲");
		dao.insert(bean3);

		BoardGameKind bean4 = new BoardGameKind();
		bean4.setBoardGameSerialNumber(4);
		bean4.setBoardGameStyle("角色扮演遊戲");
		dao.insert(bean4);

		BoardGameKind bean5 = new BoardGameKind();
		bean5.setBoardGameSerialNumber(5);
		bean5.setBoardGameStyle("小品遊戲");
		dao.insert(bean5);
		// 修改
		// BoardGameKind bean6 = new BoardGameKind();
		// bean6.setBoardGameNumber(1);
		// bean6.setBoardGameStyle("恐怖遊戲");
		// dao.update(bean6);
		// 刪除
		// dao.delete(1);
		// 查詢單筆
		BoardGameKind b1 = dao.findByPrimeKey(1);
		System.out.println(b1.getBoardGameStyle());
		// 查詢多筆
		List<BoardGameKind> beans = dao.getAll();
		for (BoardGameKind vo : beans) {
			System.out.println(vo.getBoardGameSerialNumber());
			System.out.println(vo.getBoardGameStyle());
		}
	}
}
