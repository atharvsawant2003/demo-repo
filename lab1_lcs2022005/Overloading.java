class PolymDemo {
	public void print(String s){
		System.out.println("First Method with only String- "+ s);
	}
	public void print (int i){
		System.out.println("Second Method with only int- "+ i);
	}
	public void print (String s, int i){
		System.out.println("Third Method with both- "+ s + "--" + i);
	}
}

 class Overloading {
	public static void main(String[] args) {
		PolymDemo obj = new PolymDemo();
		obj.print(10);
		obj.print("AKS");
		obj.print("LCS",2022005);
		System.out.println(10+20+"hi"+ 10 +20);
	}
}