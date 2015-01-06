package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.GroupRoom_Info;
import model.GroupRoom_InfoDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupRoom_InfoDAOHibernate implements GroupRoom_InfoDAO_Interface {

	@Override
	public GroupRoom_Info findByPrimeKey(String groupSerialNumber) {
		GroupRoom_Info groupRoomInfo = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoomInfo = (GroupRoom_Info) session.get(
					GroupRoom_Info.class, groupSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return groupRoomInfo;
	}

	private static final String GET_ALL_STMT = "from GroupRoomInfo order by groupSerialNumber";

	@Override
	public List<GroupRoom_Info> getAll() {
		List<GroupRoom_Info> list = null;
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
	public void insert(GroupRoom_Info bean) {
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
	public void update(GroupRoom_Info bean) {
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
	public void delete(Integer groupSerialNumber) {
		GroupRoom_Info groupRoomInfo = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoomInfo = (GroupRoom_Info) session.get(
					GroupRoom_Info.class, groupSerialNumber);
			session.delete(groupRoomInfo);
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
