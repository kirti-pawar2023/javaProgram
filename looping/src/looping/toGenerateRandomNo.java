package looping;

import java.util.Random;

public class toGenerateRandomNo {

	public static void main(String[] args) {
		int number;
		Random random=new Random();
		number=random.nextInt(9000);
		System.out.println("Generated Number is :"+(999+number));

	}

}
