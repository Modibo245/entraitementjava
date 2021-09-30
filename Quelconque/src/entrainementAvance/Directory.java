package entrainementAvance;

import java.io.File;

public class Directory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Modibo";
		File f= new File("C:\\Users\\Modibo\\Desktop\\"+s);
		f.mkdir();
		System.out.println("Dossier créé avec succès sur le bureau");
		System.out.println("Nom du dossier : "+s);
		System.out.println("Chemin d'accès : "+f.getAbsolutePath());
	}

}
