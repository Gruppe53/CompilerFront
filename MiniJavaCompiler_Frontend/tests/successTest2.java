class testmain {
	public static void main(String[] args) {
		successTest2 sT2;
		sT2 = new sucessTest2();
		sT2.test();
		
		return;
	}
}
class successTest2{
	boolean A;
	boolean B;
	
	public void test() {
		A();
		B();
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
	public void A() {
		A = true;
		return;
	}
	public void B() {
		B = false;
		return;
	}
}
