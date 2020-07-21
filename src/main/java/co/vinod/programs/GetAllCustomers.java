package co.vinod.programs;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import co.vinod.dao.CustomerDao;
import co.vinod.entity.Customer;
import co.vinod.utils.MybatisUtil;

public class GetAllCustomers {

	public static void main(String[] args) throws Exception {
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();

		try (SqlSession session = sqlSessionFactory.openSession()) {
			CustomerDao dao = session.getMapper(CustomerDao.class);
			List<Customer> list = dao.getAllCustomers();
			list.stream().forEach(System.out::println);
		}
	}
}
