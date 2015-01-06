package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.Member;
import model.MemberDAO_interface;
import model.StoreInformation;
import model.StoreInformationDAO_Interface;
import model.StoreScore;
import model.StoreScoreDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class StoreScoreDAOHibernate implements StoreScoreDAO_Interface {

	@Override
	public StoreScore findByPrimeKey(Integer storeId) {
		StoreScore storeScore = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeScore = (StoreScore) session.get(StoreScore.class, storeId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return storeScore;
	}

	private static final String GET_ALL_STMT = "from StoreScore order by storeId";

	@Override
	public List<StoreScore> getAll() {
		List<StoreScore> list = null;
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
	public void insert(StoreScore ssbean) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(ssbean);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	@Override
	public void update(StoreScore ssbean) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(ssbean);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	@Override
	public void delete(Integer storeId) {
		StoreScore storeScore = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeScore = (StoreScore) session.get(StoreScore.class, storeId);
			session.delete(storeScore);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		StoreScoreDAO_Interface dao = new StoreScoreDAOHibernate();
		// 新增
		StoreScore bean1 = new StoreScore();
		MemberDAO_interface mdao = new MemberDAOHibernate();
		Member mbean1 = mdao.findByPrimeKey(1);
		StoreInformationDAO_Interface sidao = new StoreInformationDAOHibernate();
		StoreInformation sibean1 = sidao.findByPrimeKey(1);
		bean1.setStoreInformation(sibean1);
		bean1.setMember(mbean1);
		bean1.setStoreScore(8.5);
		bean1.setStoreScoreReason("真不錯!!");
		dao.insert(bean1);
		// 修改
		// StoreScore bean2 = new StoreScore();
		// MemberDAO_interface mdao1 = new MemberDAOHibernate();
		// Member mbean2 = mdao1.findByPrimeKey(1);
		// StoreInformationDAO_Interface sidao1 = new
		// StoreInformationDAOHibernate();
		// StoreInformation sibean2 = sidao1.findByPrimeKey(1);
		// bean2.setStoreScoreId(1);
		// bean2.setStoreInformation(sibean2);
		// bean2.setMember(mbean2);
		// bean2.setStoreScore(0.5);
		// bean2.setStoreScoreReason("真爛!!");
		// dao.insert(bean2);
		// 刪除
		// 查詢單筆
		// 查詢多筆
		List<StoreScore> beans = dao.getAll();
		for (StoreScore vo : beans) {
			System.out.println(vo.getStoreScoreId());
			System.out.println(vo.getStoreInformation().getStoreId());
			System.out.println(vo.getMember().getMemberId());
			System.out.println(vo.getStoreScore());
			System.out.println(vo.getStoreScoreReason());
		}
	}
}
