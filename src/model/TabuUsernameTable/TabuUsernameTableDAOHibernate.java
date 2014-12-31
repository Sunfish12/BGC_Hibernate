package model.TabuUsernameTable;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.StoreScore.StoreScoreVO;

import org.hibernate.Query;
import org.hibernate.Session;

public class TabuUsernameTableDAOHibernate implements
		TabuUsernameTableDAO_Interface {

	@Override
	public TabuUsernameTableVO findByPrimeKey(String tabuId) {
		TabuUsernameTableVO tabuUsernameTableVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			tabuUsernameTableVO = (TabuUsernameTableVO) session.get(
					TabuUsernameTableVO.class, tabuId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return tabuUsernameTableVO;
	}
	
	private static final String GET_ALL_STMT = "from TabuUsernameTableVO order by tabuId";
	
	@Override
	public List<TabuUsernameTableVO> getAll() {
		List<TabuUsernameTableVO> list = null;
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
	public void insert(TabuUsernameTableVO bean) {
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
	public void update(TabuUsernameTableVO bean) {
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
	public void delete(String tabuId) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(tabuId);
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
