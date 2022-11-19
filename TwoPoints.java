package week2ass;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPoints { 
	public static void main(String[] args) { 
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x,y;
		x=obj.nextInt();
		y=obj.nextInt();
		computePointOfInterception(x, y); 
} 
public static int computePointOfInterception(int x, int y) { 
	while(x!=y) {
		if(y>11) {
			y=12-y;
		}
		if(x>10) {
			x=12-x;
		}
		x+=2;
		y+=1;
	}
	System.out.println("Point of Intersection is: "+x);
return 0; 
} 
}

