package co.vinod.programs;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.vinod.dao.CustomerDao;
import co.vinod.entity.Customer;
import co.vinod.utils.MybatisUtil;

public class GetOneCustomer {

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();

		try (SqlSession session = sqlSessionFactory.openSession()) {
			CustomerDao dao = session.getMapper(CustomerDao.class);
			int id = 234;
			Customer c1 = dao.getOneCustomer(id);
			System.out.println(c1);
		}
	}

}
