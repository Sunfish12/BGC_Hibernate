package model.dao;

import hibernate.util.HibernateUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import model.GroupRoom;
import model.GroupRoomDAO_Interface;
import model.Member;
import model.MemberDAO_interface;
import model.StoreInformation;
import model.StoreInformationDAO_Interface;
import model.StoreMember;
import model.StoreMemberDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class GroupRoomDAOHibernate implements GroupRoomDAO_Interface {

	@Override
	public GroupRoom findByPrimeKey(Integer groupSerialNumber) {
		GroupRoom groupRoom = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoom = (GroupRoom) session.get(GroupRoom.class,
					groupSerialNumber);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return groupRoom;
	}

	private static final String GET_ALL_STMT = "from GroupRoom order by groupSerialNumber";

	@Override
	public List<GroupRoom> getAll() {
		List<GroupRoom> list = null;
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
	public void insert(GroupRoom bean) {
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
	public void update(GroupRoom bean) {
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
		GroupRoom groupRoom = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			groupRoom = (GroupRoom) session.get(GroupRoom.class,
					groupSerialNumber);
			session.delete(groupRoom);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		GroupRoomDAO_Interface dao = new GroupRoomDAOHibernate();
		// 新增
		GroupRoom bean1 = new GroupRoom();
		StoreMemberDAO_Interface smdao = new StoreMemberDAOHibernate();
		StoreMember smbean1 = smdao.findByPrimeKey(1);
		bean1.setStoreMember(smbean1);
		MemberDAO_interface mdao = new MemberDAOHibernate();
		Member mbean1 = mdao.findByPrimeKey(1);
		bean1.setMember(mbean1);
		StoreInformationDAO_Interface sidao = new StoreInformationDAOHibernate();
		StoreInformation sibean = sidao.findByPrimeKey(1);
		bean1.setStoreName(sibean.getStoreName());
		bean1.setGroupStartTime(java.sql.Date.valueOf("2014-12-24"));
		bean1.setGroupEndTime(java.sql.Date.valueOf("2014-12-31"));
		bean1.setGroupRoomName("一起打桌遊八!");
		bean1.setGroupSuggestNumber("6-15");
		bean1.setGroupLowerLimit(6);
		bean1.setGroupUpperLimit(15);
		bean1.setGroupGameTime(java.sql.Time.valueOf("03:00:00"));
		bean1.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2015-1-1 13:00:00"));
		bean1.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2015-1-1 16:00:00"));
		bean1.setRoomState(0);
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
			bean1.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(bean1);
		// 修改
		// 刪除
		// 查詢單筆
		// 查詢多筆
		List<GroupRoom> beans = dao.getAll();
		for (GroupRoom vo : beans) {
			System.out.println(new java.sql.Time(vo.getGroupGameTime()
					.getTime()));
			System.out.println(vo.getReserveGroupStartTime());
			System.out.println(vo.getReserveGroupEndTime());
		}
	}
}
