package epita.java.lethao.datamodel.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDB1 {
	public static final String DATABASE ="jdbc:postgresql://localhost:5432/person-database";
	public static final String CREATE_TABLE = "CREATE TABLE public.\"PERSON3\"\r\n" + 
			"    (name character varying(500) NOT NULL,\r\n" + 
			"    sex character varying(100) NOT NULL,\r\n" + 
			"    age integer NOT NULL,\r\n" + 
			"    height integer NOT NULL,\r\n" + 
			"    weight integer NOT NULL,\r\n" + 
			"    id bigint NOT NULL GENERATED ALWAYS AS IDENTITY(INCREMENT 1 START 1 MINVALUE 1),\r\n" + 
			"    CONSTRAINT \"PERSON3_pkey\" PRIMARY KEY (id)\r\n" + 
			")";
	public static void test() {
		try {
			Connection connection = DriverManager.getConnection(DATABASE, "postgres", "");
			PreparedStatement createStatement = connection.prepareStatement(CREATE_TABLE);
			createStatement.execute();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
