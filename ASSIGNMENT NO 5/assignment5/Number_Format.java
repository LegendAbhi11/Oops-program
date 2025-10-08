class Number_Format{
	public static void main(String args[]){
		try{
		int num = Integer.parseInt("Yuvraj");
		System.out.println(num);
		}catch(NumberFormatException e){
			System.out.println("The Error Is :		" + e);
		}
}
}