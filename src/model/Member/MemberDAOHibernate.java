package model.Member;

import hibernate.util.HibernateUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class MemberDAOHibernate implements MemberDAO_interface {

	@Override
	public MemberVO findByPrimeKey(String username) {
		MemberVO memberVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			memberVO = (MemberVO) session.get(MemberVO.class, username);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return memberVO;
	}

	private static final String GET_ALL_STMT = "from MemberVO order by username";

	@Override
	public List<MemberVO> getAll() {
		List<MemberVO> list = null;
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
	public void insert(MemberVO bean) {
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
	public void update(MemberVO bean) {
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
	public void delete(String Username) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			session.delete(Username);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		MemberDAO_interface dao = new MemberDAOHibernate();
		// Insert
		MemberVO bean1 = new MemberVO();
		bean1.setUsername("sunfisher");
		bean1.setPswd("Aa@123".getBytes());
		bean1.setEmail("sunfisher@gmail.com");
		bean1.setLastname("Freeman");
		bean1.setFirstname("Gold");
		bean1.setGender("male");
		bean1.setNickname("戰士");
		bean1.setBirthday(MemberVO.convertDate("1990-10-10"));
		bean1.setIdCard("A1234567890");
		bean1.setJoinDate(MemberVO.convertDate("2014-10-10"));
		bean1.setPhone("0911222333");
		bean1.setMemberAddress("新北市三重區集美街219號3樓");
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

		MemberVO bean2 = new MemberVO();
		bean2.setUsername("leemike");
		bean2.setPswd("Bb&456".getBytes());
		bean2.setEmail("superman@yahoo.com");
		bean2.setLastname("李");
		bean2.setFirstname("麥克");
		bean2.setGender("male");
		bean2.setNickname("超人");
		bean2.setBirthday(MemberVO.convertDate("1911-01-01"));
		bean2.setIdCard("Z0987654321");
		bean2.setJoinDate(MemberVO.convertDate("2001-12-12"));
		bean2.setPhone("0988777666");
		bean2.setMemberAddress("臺北市大安區復興南路一段390號3樓");
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

		// Update
		// MemberVO bean3 = new MemberVO();
		// bean3.setUsername("");
		// bean3.setPswd("Cc#789".getBytes());
		// bean3.setEmail("hi@hello.com");
		// bean3.setLastname("鹹蛋");
		// bean3.setFirstname("超人");
		// bean3.setGender("female");
		// bean3.setNickname("完美女超人");
		// bean3.setBirthday(MemberVO.convertDate("1984-01-01"));
		// bean3.setIdCard("Z0987654321");
		// bean3.setJoinDate(MemberVO.convertDate("2011-02-21"));
		// bean3.setPhone("0900455357");
		// bean3.setMemberAddress("高雄市");
		// bean3.setIsGroupBan(true);
		// bean3.setIsCommentBan(true);
		// bean3 = dao.update(bean3);

		// Delete By Username
		// boolean b = dao.delete("sunfisher");
		// System.out.println(b);

		// Select By Username
		// MemberBean bean1 = dao.findByPrimeKey("sunfisher");
		// System.out.println(bean1);

		// MemberBean bean2 = dao.findByPrimeKey("leemike");
		// System.out.println(bean2);

		// Select All
		List<MemberVO> beans = dao.getAll();
		System.out.println(beans);
	}
}
