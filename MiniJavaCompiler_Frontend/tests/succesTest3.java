class testmain {

	public static void main(String[] args) {
		int[] int_Array = new int[1, 4, 0];
		
		A_sum();
		System.out.print("should be 5: " int_Array[2] + ". \n");
		
		C_minus();
		System.out.print("should be 4: " int_Array[2] + ". \n");
		
		B_negation();
		System.out.print("should be -4: " int_Array[2] + ". \n");
		
	}

	public void A_sum(){
		int_Array[2] = int_Array[1] + int_Array[0];
	}
	
	public void B_negation(){
		int_Array[2] = -(int_Array[2]);
	
	}
	
	public void C_minus(){
		int_Array[2] = int_Array[1] - int_Array[0];
	}
}
