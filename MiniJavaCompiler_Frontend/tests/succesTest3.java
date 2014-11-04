class testmain {

	public static void main(String[] args) {
		int[] int_Array = new int[1, 4, 0];
		String[] String_Array = new String["Succes", "Fail", "Test is finished."];
		
		A_sum();
		System.out.print("should be 5: " int_Array[2] + ". \n");
		
		C_minus();
		System.out.print("should be 4: " int_Array[2] + ". \n");
		
		B_negation();
		System.out.print("should be -4: " int_Array[2] + ". \n");
		
		System.out.print("If all above is right then it is: " + String_Array[0] + ". \n");
		System.out.print("else it is: " + String_Array[1] + ". \n");
		System.out.print(String_Array[2]);
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
