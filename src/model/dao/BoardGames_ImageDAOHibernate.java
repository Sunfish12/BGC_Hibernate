package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.BoardGames_Image;
import model.BoardGames_ImageDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class BoardGames_ImageDAOHibernate implements
		BoardGames_ImageDAO_Interface {

	@Override
	public BoardGames_Image findByPrimeKey(Integer storeImageId) {
		BoardGames_Image boardGamesImage = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			boardGamesImage = (BoardGames_Image) session.get(
					BoardGames_Image.class, storeImageId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return boardGamesImage;
	}

	private static final String GET_ALL_STMT = "from BoardGamesImage order by storeImageId";

	@Override
	public List<BoardGames_Image> getAll() {
		List<BoardGames_Image> list = null;
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
	public void insert(BoardGames_Image bean) {
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
	public void update(BoardGames_Image bean) {
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
	public void delete(Integer storeImageId) {
		BoardGames_Image boardGamesImage = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			boardGamesImage = (BoardGames_Image) session.get(
					BoardGames_Image.class, storeImageId);
			session.delete(boardGamesImage);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 新增
		// 修改
		// 刪除
		// 查詢單筆
		// 查詢多筆
	}
}
