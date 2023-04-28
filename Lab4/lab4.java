package comp101_lb4;

import java.util.Scanner;

public class lab4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sh=sc.nextInt();
		int ln=sc.nextInt();
		double area= sh*ln;
		if(area> 70) {
			System.out.println("area is greater than 70");
			
		}else if(area<70 && area>50) {
			System.out.println("area is between 50 and 70");
		}else {
			System.out.println("area is less than 50");
		}
		
		
	}

}
