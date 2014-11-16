class testmain {
	public static void main(String[] args) {
		boolean A;
		boolean B;
		failTest3 sT2;
		fT3 = new failTest3();
		A = fT3.A(A);
		B = fT3.B(B);
		fT3.test(A, B);

		return;
	}
}

class failTest3 {
	public void test(boolean A, boolean B) {

		if (A == B) {
			System.out.print("test went wrong");
		} else {
			System.out.print("test went right, but does negation work?: ");
			if (A == !B) {
				System.out.print("yes it does!");
			} else {
				System.out.print("nope go home");
			}
		}
		return;
	}

	public boolean A(boolean A) {
		A = true;
		return;
	}

	public boolean B(boolean B) {
		B = false;
		return;
	}
}