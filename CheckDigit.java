package programs2;
public class CheckDigit {


		public static void main(String args[]) 
		{ 
			String str = "1W6234"; 
		
			for (int i = 0; i < str.length(); i++) { 
				if (str.charAt(i) < '0'
					|| str.charAt(i) > '9') {
					System.out.println("contains both string and digit ");
				}
			}
				System.out.println("contains digits");
				
			
		
			 
		}
}
				 

