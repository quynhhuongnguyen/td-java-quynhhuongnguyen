import java.io.IOException;

public class Fille extends Mere { 
	void miage() {System.out.println("Miage");}
	public void a() {System.out.println("Fille_a"); }
	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");} 
	public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
	void c(Fille b) {System.out.println("Fille_c(Fille)"); }
	static void d() {System.out.println("static Fille_d");}
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}
	protected void e() {System.out.println("Fille_e");} // fonction e dans la classe Mere est protected
	protected void f() {System.out.println("Fille_f");}
	String g() {System.out.println("Fille_g"); return "c";}
	//String h() {System.out.println("Fille_h"); return "c";} // a redefinir pcq fonction h dans la classe Mere retourne un int
	//int i() {System.out.println("Fille_i"); return 3; } // a redefinir pcq fonction i dans la classe Mere est 1 void
	void j() throws IOException {System.out.println("Fille_j"); }
	//void k() throws Exception {System.out.println("Fille_k"); } // a redefinir pcq fonction k dans la classe Mere n'a pas Exception
	void l() {System.out.println("Fille_l");}
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
}
