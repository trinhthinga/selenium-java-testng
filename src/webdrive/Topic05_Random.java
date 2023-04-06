package webdrive;

import java.util.Random;

public class Topic05_Random {

	public static void main(String[] args) {
		// utilities = tiện ích
		Random rand = new Random();
		
		// Tạo 1 email random dùng để test 
		System.out.println(rand.nextInt());		
		System.out.println("automation" + rand.nextInt(9999) + "@gmail.com");
		

	}

}
