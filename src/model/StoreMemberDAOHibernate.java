package model;

import hibernate.util.HibernateUtil;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class StoreMemberDAOHibernate implements StoreMemberDAO_Interface {

	@Override
	public StoreMemberVO findByPrimeKey(Integer storeMemberId) {
		StoreMemberVO storeMemberVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeMemberVO = (StoreMemberVO) session.get(StoreMemberVO.class,
					storeMemberId);
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
	public void delete(Integer storeMemberId) {
		StoreMemberVO storeMemberVO = null;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			storeMemberVO = (StoreMemberVO) session.get(StoreMemberVO.class,
					storeMemberId);
			session.delete(storeMemberVO);
			session.getTransaction().commit();
		} catch (RuntimeException ex) {
			session.getTransaction().rollback();
			throw ex;
		}
	}

	public static void main(String[] args) {
		StoreMemberDAO_Interface dao = new StoreMemberDAOHibernate();
		// 新增
		StoreMemberVO bean1 = new StoreMemberVO();
		bean1.setStoreUsername("littleworld");
		bean1.setStorePswd("Zz#littleworld".getBytes());
		bean1.setStoreJoinDate(java.sql.Date.valueOf("2007-6-13"));
		bean1.setStorePhone("0920949521");
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
		bean1.setStoreEmail("littleworld@gmail.com");
		bean1.setStoreWebsite("www.littleworld.com");
		dao.insert(bean1);

		StoreMemberVO bean2 = new StoreMemberVO();
		bean2.setStoreUsername("Hinforms");
		bean2.setStorePswd("Hinforms".getBytes());
		bean2.setStoreJoinDate(java.sql.Date.valueOf("2007-5-22"));
		bean2.setStorePhone("0968190017");
		String filename2 = "boardgames.jpg";
		bean2.setImgFileName(filename2);
		File f1 = new File("WebContent/res/" + bean2.getImgFileName());
		try {
			InputStream is = new FileInputStream(f1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			bean2.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		bean2.setStoreEmail("Hinforms@gmail.com");
		bean2.setStoreWebsite("www.Hinforms.com");
		dao.insert(bean2);
		// 修改
		// StoreMemberVO bean3 = new StoreMemberVO();
		// bean3.setStoreMemberId(1);
		// bean3.setStoreUsername("Sairing");
		// bean3.setStorePswd("Sairing".getBytes());
		// bean3.setStoreJoinDate(java.sql.Date.valueOf("2009-6-11"));
		// bean3.setStorePhone("0960596493");
		// bean3.setStoreEmail("Sairing@gmail.com");
		// bean3.setStoreWebsite("www.Sairing.com");
		// dao.update(bean3);
		// 刪除
		// dao.delete(1);
		// 查詢單筆
		// StoreMemberVO b1 = dao.findByPrimeKey(1);
		// System.out.println(b1.getStoreUsername());
		// 查詢多筆
		List<StoreMemberVO> beans = dao.getAll();
		for (StoreMemberVO vo : beans) {
			System.out.println(vo.getStoreUsername());
		}
	}
}
