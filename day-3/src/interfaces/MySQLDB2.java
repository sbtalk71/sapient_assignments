package interfaces;

public class MySQLDB2 implements MyConnection {

	
	@Override
	public String getDBInfo() {
		return "MySQL 5.7 Database";
	}


	@Override
	public String getConnectionInfo() {
		return "MySQL DB Connected";
	}
}
