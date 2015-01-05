package model;

import hibernate.util.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupRoom_MessageDAOHibernate implements
		GroupRoom_MessageDAO_Interface {

	@Override
	public GroupRoom_MessageVO findByPrimeKey(Integer groupRoomMessageSerialNumber) {
		GroupRoom_MessageVO groupRoomMessageVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoomMessageVO = (GroupRoom_MessageVO) session.get(
					GroupRoom_MessageVO.class, groupRoomMessageSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return groupRoomMessageVO;
	}

	private static final String GET_ALL_STMT = "from GroupRoomMessageVO order by groupSerialNumber";

	@Override
	public List<GroupRoom_MessageVO> getAll() {
		List<GroupRoom_MessageVO> list = null;
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
	public void insert(GroupRoom_MessageVO bean) {
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
	public void update(GroupRoom_MessageVO bean) {
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
		GroupRoom_MessageVO groupRoomMessageVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoomMessageVO = (GroupRoom_MessageVO) session.get(
					GroupRoom_MessageVO.class, groupRoomMessageSerialNumber);
			session.delete(groupRoomMessageVO);
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
