package model.StoreMember;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.StoreInformationImage.StoreInformationImageVO;

import org.hibernate.Query;
import org.hibernate.Session;

public class StoreMemberDAOHibernate implements StoreMemberDAO_Interface {

	@Override
	public StoreMemberVO findByPrimeKey(String storeUsername) {
		StoreMemberVO storeMemberVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeMemberVO = (StoreMemberVO) session.get(StoreMemberVO.class,
					storeUsername);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return storeMemberVO;
	}

	private static final String GET_ALL_STMT = "from StoreMemberVO order by storeMemberId";

	@Override
	public List<StoreMemberVO> getAll() {
		List<StoreMemberVO> list = null;
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
	public void insert(StoreMemberVO bean) {
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
	public void update(StoreMemberVO bean) {
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
	public void delete(String storeUsername) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(storeUsername);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
