package kr.brains064.same;



public class Same {

	private int privateField =1;
	int defaultField = 2;
	protected int protectedField = 3;
	public int publicField = 4;	
	boolean b = true;
	
	void printPrivateField() {
		System.out.println(privateField);
	}
	void setB(boolean bv) {
		b= bv;
	}

	
}


