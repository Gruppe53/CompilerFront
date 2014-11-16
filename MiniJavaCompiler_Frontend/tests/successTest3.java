class testmain {
	public static void main(String[] args) {
		successTest3 sT3;
		sT3 = new successTest3();
		sT3.initialize();
		sT3.A_sum();
		sT3.B_unaryMinus();
		sT3.C_minus();
		sT3.test();
		return;
	}
}
		
class successTest3 {
	int A;
	int B;
	int C;
	int val1;
	int val2;
	int val3;
	
	public void initialize() {
		val1 = 1;
		val2 = 4;
		val3 = 5;
		
		return;
	}	
	public void test() {
		System.out.print(A);

		System.out.print(B);

		System.out.print(C);
		
		return;
	}

	public void A_sum() {
		A = val1 + val3;
		return;
	}

	public void B_unaryMinus() {
		B = -(val2);
		return;
	}

	public void C_minus() {
		C = val2 - val1;
		return;
	}
}