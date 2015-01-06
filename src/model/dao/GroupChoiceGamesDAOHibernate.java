package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.GroupChoiceGames;
import model.GroupChoiceGamesDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupChoiceGamesDAOHibernate implements
		GroupChoiceGamesDAO_Interface {

	@Override
	public GroupChoiceGames findByPrimeKey(Integer choiceGamesSerialNumber) {
		GroupChoiceGames groupChoiceGames = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupChoiceGames = (GroupChoiceGames) session.get(
					GroupChoiceGames.class, choiceGamesSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return groupChoiceGames;
	}

	private static final String GET_ALL_STMT = "from GroupChoiceGames order by choiceGamesSerialNumber";

	@Override
	public List<GroupChoiceGames> getAll() {
		List<GroupChoiceGames> list = null;
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
	public void insert(GroupChoiceGames bean) {
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
	public void update(GroupChoiceGames bean) {
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
	public void delete(String choiceGamesSerialNumber) {
		GroupChoiceGames groupChoiceGames = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupChoiceGames = (GroupChoiceGames) session.get(
					GroupChoiceGames.class, choiceGamesSerialNumber);
			session.delete(groupChoiceGames);
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
