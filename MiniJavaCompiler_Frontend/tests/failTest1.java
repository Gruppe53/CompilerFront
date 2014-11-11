class testmain {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		return;
	}
}

class Whatever {
	public void A() {
		int int_a;
		int int_b;
		boolean bool_c;
		String string_a;

		int_a = 1;
		int_b = 4;
		bool_c = true;
		string_a = "Done";

		if ((string_a == "Done") && (int_a == bool_c)) {
			int_a = int_a + 1;

			while (int_a < int_b) {
				int_a = int_a * 2;
			}
		}
		
		System.out.println(string_a + "\n" + "int_a: " + int_a + "\nint_b: " + int_b + "\nint_c: " + int_c);
		
		return;
	}
}