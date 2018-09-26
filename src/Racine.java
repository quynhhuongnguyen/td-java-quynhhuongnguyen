
public class Racine extends Expr {
	private Expr val1;
	public Racine(Expr val1 ) {
		this.val1 = val1;

	}
	@Override
	public double eval() {
		return Math.sqrt(val1.eval());
	}

}
