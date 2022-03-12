package hello;
import java.util.Scanner;

public class Nextdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Day:");
		int Day = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Month:");
		int Month = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Year:");
		int Year = sc2.nextInt();
		
		int Days[] = {-1,31,28/29, 31,30,31,30,31,30,30,31,30,31};
		if(isLeapYear(Year)) {
			Days[2]=29;
			}
		Day = Day+1;
		if(Day>Days[Month]) {
             Day = 1;
             Month++;
              if (Month>12) {
            	  Month = 1;
            	  Year++;
              }
              } System.out.println("Next date :"Da"/"+Month+"/"+Year);
	}
	  public static boolean isLeapYear(int Year) {
		
	
		   if((Year%400=0 || Year%100! = 0) && (Year%4 == 0)) {
			return true;
			
			
		}
		else{
			return false;
		}
	}

}
