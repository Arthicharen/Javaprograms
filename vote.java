package programs2;

public class vote {
	public static void main(String[]args) {
		int age=2;
		int voteage=18;
		boolean isvoteage=false;
		if(age>=voteage) {
			isvoteage=false;
			System.out.println("you are eligible");
		}
		else {
			System.out.println("sorry");
		}
	}

}
