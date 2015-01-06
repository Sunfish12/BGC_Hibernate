package model.dao;

import hibernate.util.HibernateUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import model.Member;
import model.MemberDAO_interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class MemberDAOHibernate implements MemberDAO_interface {

	@Override
	public Member findByPrimeKey(Integer memberId) {
		Member member = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			member = (Member) session.get(Member.class, memberId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return member;
	}

	private static final String GET_ALL_STMT = "from Member order by memberId";

	@Override
	public List<Member> getAll() {
		List<Member> list = null;
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
	public void insert(Member bean) {
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
	public void update(Member bean) {
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
	public void delete(Integer memberId) {
		Member member = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			member = (Member) session.get(Member.class, memberId);
			session.delete(member);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		MemberDAO_interface dao = new MemberDAOHibernate();
		// 新增
		Member bean1 = new Member();
		bean1.setUsername("pewdiepie");
		bean1.setPswd("Aa@pdp".getBytes());
		bean1.setEmail("pewdiepie@gmail.com");
		bean1.setLastname("皮");
		bean1.setFirstname("弟派");
		bean1.setGender("男");
		bean1.setNickname("PewDiePie");
		bean1.setBirthday(java.sql.Date.valueOf("1990-10-24"));
		bean1.setIdCard("A154730489");
		bean1.setJoinDate(java.sql.Date.valueOf("2007-2-28"));
		bean1.setPhone("0986731905");
		bean1.setMemberAddress("106台北市大安區復興南路一段390號");
		String filename1 = "boardgames.jpg";
		bean1.setImgFileName(filename1);
		File f = new File("WebContent/res/" + bean1.getImgFileName());
		try {
			InputStream is = new FileInputStream(f);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			bean1.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(bean1);

		Member bean2 = new Member();
		bean2.setUsername("opchannel");
		bean2.setPswd("Bb@op".getBytes());
		bean2.setEmail("opchannel@gmail.com");
		bean2.setLastname("皮");
		bean2.setFirstname("老");
		bean2.setGender("男");
		bean2.setNickname("老皮");
		bean2.setBirthday(java.sql.Date.valueOf("1992-5-6"));
		bean2.setIdCard("H189519637");
		bean2.setJoinDate(java.sql.Date.valueOf("2007-5-12"));
		bean2.setPhone("0924496029");
		bean2.setMemberAddress("337桃園縣大園鄉華中街46號");
		String filename2 = "boardgames.jpg";
		bean2.setImgFileName(filename2);
		File f1 = new File("WebContent/res/" + bean2.getImgFileName());
		try {
			InputStream is1 = new FileInputStream(f1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is1.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is1.close();
			bean2.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(bean2);
		// 修改
		// MemberVO bean3 = new MemberVO();
		// bean3.setMemberId(1);
		// bean3.setUsername("qksniper");
		// bean3.setPswd("Cc@qksniper".getBytes());
		// bean3.setEmail("qksniper@gmail.com");
		// bean3.setLastname("Q");
		// bean3.setFirstname("K");
		// bean3.setGender("男");
		// bean3.setNickname("QK");
		// bean3.setBirthday(java.sql.Date.valueOf("1993-8-13"));
		// bean3.setIdCard("A191154952");
		// bean3.setJoinDate(java.sql.Date.valueOf("2009-1-18"));
		// bean3.setPhone("0960636461");
		// bean3.setMemberAddress("106台北市大安區敦化南路一段305號");
		// bean3.setIsGroupBan(true);
		// bean3.setIsCommentBan(true);
		// dao.update(bean3);
		// 刪除
		// dao.delete(1);
		// 查詢單筆
		// MemberVO b1 = dao.findByPrimeKey(1);
		// System.out.println(b1.getUsername());
		// 查詢多筆
		List<Member> beans = dao.getAll();
		for (Member vo : beans) {
			System.out.println(vo.getMemberId());
			System.out.println(vo.getUsername());
			System.out.println(vo.getNickname());
		}
	}
}
