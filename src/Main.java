
public class Main {

	public static void main(String[] args) {
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		

		//mere.miage(); //la fonction Miage existe dans fille, pas dans Mere
		fille.miage();
		//mereFille.miage();
		((Fille)mereFille).miage();

	}

}
