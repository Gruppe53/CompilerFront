class testmain {
	public static void main(String[] args) {
		String string_A = null;

		if (A() == B()) {
			System.out.print("test went wrong");
		} else {
			System.out.print("test went right, but does negation work?: ");
			if (A() == !B()) {
				string_A = "yes it does!";
				System.out.print(string_A);
			} else {
				System.out.print("nope go home");
			}
		}

	}

	public boolean A() {
		return true;
	}

	public boolean B() {
		return false;
	}

}
