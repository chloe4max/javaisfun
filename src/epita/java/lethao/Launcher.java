package epita.java.lethao;

import epita.java.lethao.datamodel.test.TestBLI1;
import epita.java.lethao.datamodel.test.TestDMO2;
import epita.java.lethao.datamodel.test.TestJDB1;
import epita.java.lethao.datamodel.test.TestSER2;
import epita.java.lethao.datamodel.test.TestSER3;

public class Launcher {

	public static void main(String[] args) {
		TestDMO2.test();
		TestSER2.test();
		TestSER3.test();
		TestBLI1.test();
		TestJDB1.test();

	}

}
