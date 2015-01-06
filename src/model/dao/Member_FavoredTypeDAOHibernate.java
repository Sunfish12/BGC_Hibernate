package model.dao;

import hibernate.util.HibernateUtil;

import java.util.List;

import model.Member;
import model.MemberDAO_interface;
import model.Member_FavoredType;
import model.Member_FavoredTypeDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class Member_FavoredTypeDAOHibernate implements
		Member_FavoredTypeDAO_Interface {

	@Override
	public Member_FavoredType findByPrimeKey(Integer memberFavoredId) {
		Member_FavoredType memberFavoredType = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			memberFavoredType = (Member_FavoredType) session.get(
					Member_FavoredType.class, memberFavoredId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return memberFavoredType;
	}

	private static final String GET_ALL_STMT = "from Member_FavoredType order by memberFavoredId";

	@Override
	public List<Member_FavoredType> getAll() {
		List<Member_FavoredType> list = null;
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
	public void insert(Member_FavoredType bean) {
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
	public void update(Member_FavoredType bean) {
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
	public void delete(Integer memberFavoredId) {
		Member_FavoredType memberFavoredType = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			memberFavoredType = (Member_FavoredType) session.get(
					Member_FavoredType.class, memberFavoredId);
			session.delete(memberFavoredType);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		Member_FavoredTypeDAO_Interface dao = new Member_FavoredTypeDAOHibernate();
		// 新增
		Member_FavoredType bean1 = new Member_FavoredType();
		MemberDAO_interface mdao = new MemberDAOHibernate();
		Member mbean1 = mdao.findByPrimeKey(1);
		bean1.setMember(mbean1);
		bean1.setFavoredType("策略遊戲");
		dao.insert(bean1);

		Member_FavoredType bean2 = new Member_FavoredType();
		Member mbean2 = mdao.findByPrimeKey(1);
		bean2.setMember(mbean2);
		bean2.setFavoredType("益智遊戲");
		dao.insert(bean2);

		Member_FavoredType bean3 = new Member_FavoredType();
		Member mbean3 = mdao.findByPrimeKey(1);
		bean3.setMember(mbean3);
		bean3.setFavoredType("角色扮演遊戲");
		dao.insert(bean3);
		// 修改
		// 刪除
		// 查詢單筆
		// 查詢多筆
		List<Member_FavoredType> beans = dao.getAll();
		for (Member_FavoredType vo : beans) {
			System.out.println(vo.getMemberFavoredId());
			System.out.println(vo.getMember().getMemberId());
			System.out.println(vo.getFavoredType());
		}
	}
}
