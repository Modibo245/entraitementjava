package entrainementAvance;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFile {

	public static void main(String[] args) {
		
		Desktop d= Desktop.getDesktop();
		
		File f= new File("E:\\AutoPlus\\Projet Java#3_Partie 1_ Créer "
				+ "& Design Jframe Login avec photoshop, netbeans.mp4");
		
		try {
			d.open(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
