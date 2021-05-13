
public class OverloadedMethods {

	public static void main(String args[]) {
		
		OverloadedMethods om = new OverloadedMethods();
		
		om.print();
		
		om.print("This is a string argument passed in");
	
		om.print("first string", "second string");
		
	}
		
		public void print() {
			System.out.println("original print method.");
			
		}
		
		public void print(String str) {
			System.out.println(str);
			
		}
		
		public void print(String strone, String strtwo) {
			System.out.println( strone + " " + strtwo);
			
		}
}

