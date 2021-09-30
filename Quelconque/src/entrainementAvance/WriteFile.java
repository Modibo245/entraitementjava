package entrainementAvance;

import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="Modibo Diarra.txt";
		File f= new File("C:\\Users\\Modibo\\Desktop\\"+s);
		FileWriter fw= new FileWriter(f);
		
		String texte= "L'informatique est la science \ndu traitement automatique et rationnel "
				+ "de l'information.";
		fw.write(texte);
		fw.flush();
		fw.close();
		
	}

}
