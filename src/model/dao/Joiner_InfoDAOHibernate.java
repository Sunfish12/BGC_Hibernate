package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.Joiner_Info;
import model.Joiner_InfoDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class Joiner_InfoDAOHibernate implements Joiner_InfoDAO_Interface {

	@Override
	public Joiner_Info findByPrimeKey(String groupSerialNumber) {
		Joiner_Info joiner_Info = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			joiner_Info = (Joiner_Info) session.get(Joiner_Info.class,
					groupSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return joiner_Info;
	}

	private static final String GET_ALL_STMT = "from Joiner_Info order by groupSerialNumber";

	@Override
	public List<Joiner_Info> getAll() {
		List<Joiner_Info> list = null;
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
	public void insert(Joiner_Info bean) {
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
	public void update(Joiner_Info bean) {
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
	public void delete(Integer joiner_InfoSerialNumber) {
		Joiner_Info joiner_Info = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			joiner_Info = (Joiner_Info) session.get(Joiner_Info.class,
					joiner_InfoSerialNumber);
			session.delete(joiner_Info);
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
