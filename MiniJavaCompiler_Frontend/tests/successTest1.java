class testmain {
	public static void main(String[] args) {
		int int_a;
		int int_b;
		int int_c;
		String string_a;
		
		int_a = 1;
		int_b = 16;
		int_c = 1;
		string_a = "Done";
		
		if (string_a == "Done" && int_a == int_c) {

			int_a = int_a + 1;

			while (int_a < int_b) {
				int_a = int_a * 2;
			}
			
		System.out.print(string_a + "\n" + "int_a: " + int_a + "\nint_b: " + int_b + "\nint_c: " + int_c);
		}
	}
}