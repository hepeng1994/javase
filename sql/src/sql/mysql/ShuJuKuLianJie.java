package sql.mysql;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ShuJuKuLianJie {
	public static void main(String[] args) throws SQLException {
		ComboPooledDataSource a = new ComboPooledDataSource();
		String b ="select * from products";
		QueryRunner q = new QueryRunner(a);
		List<Products> query = q.query(b,new BeanListHandler<Products>(Products.class));
		System.out.println(query);
	}
}
