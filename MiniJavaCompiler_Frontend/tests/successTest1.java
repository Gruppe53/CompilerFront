class testmain {  
	/*successTest1
	 * Testing: 
	 * instantiating int and String.
	 * == and &&
	 * this.variable 
	 * < less than
	 * * multiply
	 * + sum
	 * if argument
	 */	
	public static void main (String[] args) {
		int int_a = 1;
		int int_b = 16;
		int int_c = 1;
		String string_a = "Done";

		if(string_a == "Done" && this.int_a == this.int_c){

			this.int_a = int_a + 1;

			while(this.int_a < this.int_b){
				int_a = int_a * 2;

			}
			//int_a skal være 16,
			//int_b skal være 16,
			//int_c skal være 1.
			System.out.print(string_a + "\n" + "int_a: " + int_a + "\nint_b: " + int_b + "\nint_c: " + int_c);

		}
	}

}