package interfaces;

public class DBManager {

	public static MyConnection getDB(String dbtype) {
		if (dbtype.equals("mysql")) {
			return new MySQLDB2();
		} else if (dbtype.equals("oracle")) {
			return new OracleDB2();
		} else {
			throw new RuntimeException("db not supported");
		}
	}
}
