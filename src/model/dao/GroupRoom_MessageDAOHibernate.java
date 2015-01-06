package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.GroupRoom_Message;
import model.GroupRoom_MessageDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupRoom_MessageDAOHibernate implements
		GroupRoom_MessageDAO_Interface {

	@Override
	public GroupRoom_Message findByPrimeKey(Integer groupRoomMessageSerialNumber) {
		GroupRoom_Message groupRoomMessage = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoomMessage = (GroupRoom_Message) session.get(
					GroupRoom_Message.class, groupRoomMessageSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return groupRoomMessage;
	}

	private static final String GET_ALL_STMT = "from GroupRoomMessage order by groupSerialNumber";

	@Override
	public List<GroupRoom_Message> getAll() {
		List<GroupRoom_Message> list = null;
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
	public void insert(GroupRoom_Message bean) {
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
	public void update(GroupRoom_Message bean) {
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
	public void delete(Integer groupRoomMessageSerialNumber) {
		GroupRoom_Message groupRoomMessage = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoomMessage = (GroupRoom_Message) session.get(
					GroupRoom_Message.class, groupRoomMessageSerialNumber);
			session.delete(groupRoomMessage);
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
