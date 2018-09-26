
public class Multiplication extends Expr {
	private Expr val1;
	private Expr val2;
	public Multiplication(Expr val1, Expr val2) {
		this.val1 = val1;
		this.val2 = val2;
		
	}
	@Override
	public double eval() {
		return val1.eval() * val2.eval();
	}

}

