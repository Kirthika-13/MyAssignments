package week3.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("This is from connect method");
		
	}

	public void disconnect() {
		System.out.println("This is from disconnect method");
		
	}

	public void executeUpdate() {
		System.out.println("This is from execute update method");
		
	}
	
	public void runTime() {
		System.out.println("This is from runtime method (own method of Javaconnection class)");
	}

	@Override
	public void executeQuery() {
		System.out.println("This is a abstarct method from Abstarct class-MySQLConnection");
		
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.runTime();
		jc.executeQuery();
	}
	
}
