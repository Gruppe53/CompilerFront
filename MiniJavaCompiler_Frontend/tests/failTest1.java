class testmain {  

	public static void main (String[] args) {
		int int_a = 1;
		int int_b = 4;
		boolean bool_c = true;
		String string_a = "Done";

		if(string_a == "Done" && this.int_a == this.bool_c){ //sammenlignings fail her
			
			this.int_a = int_a + 1;
					
			while(this.int_a < this.int_b){
				int_a = int_a * 2;
				
			}
			//int_a skal være 4,
			//int_b skal være 4,
			//int_c skal være 1.
			System.out.println(string_a + "\n" + "int_a: " + int_a + "\nint_b: " + int_b + "\nint_c: " + int_c);

		}
	}

}