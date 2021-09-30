package entrainementAvance;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStreamReader;


public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Modibo Diarra.txt";
		File f= new File("C:\\Users\\Modibo\\Desktop\\"+s);
		
		FileInputStream fis= new FileInputStream(f);
		InputStreamReader isr= new InputStreamReader(fis, "UTF-8");
		int c=isr.read();
		
		while(c!= -1) {
			System.out.print((char) c);
			c=isr.read();
		}
		isr.close();
	}

}
