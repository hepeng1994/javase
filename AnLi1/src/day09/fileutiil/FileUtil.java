package day09.fileutiil;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class FileUtil {
	static ComboPooledDataSource c = new ComboPooledDataSource();
  public static QueryRunner getQueryRunner(){
	  QueryRunner q = new QueryRunner(c);
	  return q;
  }
}
