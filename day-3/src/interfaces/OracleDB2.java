package interfaces;

public class OracleDB2 implements MyConnection{

	@Override
	public String getDBInfo() {
		return "OracleDB 11g Database";
	}


	@Override
	public String getConnectionInfo() {
		return "OracleDB Connected";
	}
}
