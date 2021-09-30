package entrainement;

import java.io.IOException;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r= Runtime.getRuntime();
		try {
			r.exec("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
