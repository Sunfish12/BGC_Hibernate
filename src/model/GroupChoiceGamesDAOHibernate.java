package model;

import hibernate.util.HibernateUtil;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupChoiceGamesDAOHibernate implements
		GroupChoiceGamesDAO_Interface {

	@Override
	public GroupChoiceGamesVO findByPrimeKey(Integer choiceGamesSerialNumber) {
		GroupChoiceGamesVO groupChoiceGamesVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupChoiceGamesVO = (GroupChoiceGamesVO) session.get(
					GroupChoiceGamesVO.class, choiceGamesSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return groupChoiceGamesVO;
	}

	private static final String GET_ALL_STMT = "from GroupChoiceGamesVO order by choiceGamesSerialNumber";

	@Override
	public List<GroupChoiceGamesVO> getAll() {
		List<GroupChoiceGamesVO> list = null;
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
	public void insert(GroupChoiceGamesVO bean) {
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
	public void update(GroupChoiceGamesVO bean) {
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
		GroupChoiceGamesVO groupChoiceGamesVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupChoiceGamesVO = (GroupChoiceGamesVO) session.get(
					GroupChoiceGamesVO.class, choiceGamesSerialNumber);
			session.delete(groupChoiceGamesVO);
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
