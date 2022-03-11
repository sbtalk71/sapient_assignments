package interfaces;

public class DbClient {

	public static void main(String[] args) throws Exception{
		/*
		 * OracleDB db = new OracleDB(); System.out.println(db.getOracleConnection());
		 * System.out.println(db.getOracleConnection());
		 */
		
		/*
		 * MySQLDB db = new MySQLDB(); System.out.println(db.getMySqlConnection());
		 * System.out.println(db.mySqlDBInfo());
		 */
		
		//MyConnection db= new MySQLDB2();
		//MyConnection db=(MyConnection)Class.forName("interfaces.OracleDB2").newInstance();
		
		MyConnection db=DBManager.getDB("oracle");
		
		System.out.println(db.getConnectionInfo());
		System.out.println(db.getDBInfo());
		
	}

}
