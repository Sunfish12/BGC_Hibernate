package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.TabuUsernameTable;
import model.TabuUsernameTableDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class TabuUsernameTableDAOHibernate implements
		TabuUsernameTableDAO_Interface {

	@Override
	public TabuUsernameTable findByPrimeKey(Integer tabuId) {
		TabuUsernameTable tabuUsernameTable = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			tabuUsernameTable = (TabuUsernameTable) session.get(
					TabuUsernameTable.class, tabuId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return tabuUsernameTable;
	}

	private static final String GET_ALL_STMT = "from TabuUsernameTable order by tabuId";

	@Override
	public List<TabuUsernameTable> getAll() {
		List<TabuUsernameTable> list = null;
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
	public void insert(TabuUsernameTable bean) {
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
	public void update(TabuUsernameTable bean) {
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
	public void delete(Integer tabuId) {
		TabuUsernameTable tabuUsernameTable = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			tabuUsernameTable = (TabuUsernameTable) session.get(
					TabuUsernameTable.class, tabuId);
			session.delete(tabuUsernameTable);
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
