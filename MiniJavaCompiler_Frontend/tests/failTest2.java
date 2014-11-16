class testmain {
	public static void main(String[] args) {
		failTest2 fT2;
		fT2 = new failTest2();
		fT2.initialize();
		fT2.test();
		
		return;
	}
}
class failTest2 {
	int int_a;
	int int_b;
	int int_c;
	String int_a;
	String string_a;
	
	public void initialize(){
		int_a = 1;
		int_b = 4;
		int_c = 1;
		int_a = "";
		string_a = "Done";
		return;
	}
	
	public void test(){

		
		if((string_a == "Done") && (int_a == int_c)) {
			int_a = int_a + 1;
			
			while (int_a < int_b) {
				a = a * 2;
			}
			
			System.out.println(string_a + "\n" + "int_a: " + int_a + "\nint_b: " + int_b + "\nint_c: " + int_c);
		}
		return;
	}
}