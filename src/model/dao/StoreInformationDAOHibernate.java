package model.dao;

import hibernate.util.HibernateUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import model.StoreInformation;
import model.StoreInformationDAO_Interface;
import model.StoreMember;
import model.StoreMemberDAO_Interface;

import org.hibernate.Query;
import org.hibernate.Session;

public class StoreInformationDAOHibernate implements
		StoreInformationDAO_Interface {

	@Override
	public StoreInformation findByPrimeKey(Integer storeId) {
		StoreInformation storeInformation = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeInformation = (StoreInformation) session.get(
					StoreInformation.class, storeId);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
		return storeInformation;
	}

	private static final String GET_ALL_STMT = "from StoreInformation order by storeId";

	@Override
	public List<StoreInformation> getAll() {
		List<StoreInformation> list = null;
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
	public void insert(StoreInformation bean) {
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
	public void update(StoreInformation bean) {
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
	public void delete(Integer storeId) {
		StoreInformation storeInformation = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeInformation = (StoreInformation) session.get(
					StoreInformation.class, storeId);
			session.delete(storeInformation);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		StoreInformationDAO_Interface dao = new StoreInformationDAOHibernate();
		// 新增
		StoreInformation bean1 = new StoreInformation();
		StoreMemberDAO_Interface SMdao = new StoreMemberDAOHibernate();
		StoreMember smbean1 = SMdao.findByPrimeKey(1);
		bean1.setStoreMember(smbean1);
		bean1.setStoreName("瘋桌遊-益智遊戲專賣店(汐止店)");
		bean1.setStoreAddress("新北市汐止區仁愛路160號");
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
			bean1.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		bean1.setStoreTel("(02)2643-8686");
		bean1.setRentAreaCost(120.0);
		bean1.setGroupUpperLimit(50);
		dao.insert(bean1);
		// 修改
		// StoreInformationVO bean3 = new StoreInformationVO();
		// SMdao = new StoreMemberDAOHibernate();
		// smbean1 = SMdao.findByPrimeKey(1);
		// bean3.setStoreMember(smbean1);
		// bean3.setStoreId(1);
		// bean3.setStoreName("卡牌屋-台北店");
		// bean3.setStoreAddress("台北市開封街一段19號2樓");
		// dao.update(bean3);
		// 刪除
		// dao.delete(1);
		// 查詢單筆
		// StoreInformationVO b1 = dao.findByPrimeKey(1);
		// System.out.println(b1.getStoreName());
		// 查詢多筆
		List<StoreInformation> beans = dao.getAll();
		for (StoreInformation vo : beans) {
			System.out.println(vo.getStoreMember().getStoreMemberId());
			System.out.println(vo.getStoreName());
			System.out.println(vo.getStoreAddress());
		}
	}
}
