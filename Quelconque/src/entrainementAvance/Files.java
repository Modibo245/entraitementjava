package entrainementAvance;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Modibo Diarra.txt";
		File f= new File("C:\\Users\\Modibo\\Desktop\\"+s);
		try {
			f.createNewFile();
			System.out.println("Fichier créé avec succès sur le bureau");
			System.out.println("Nom du fichier : "+s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
