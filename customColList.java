package Collections;

import java.lang.*;
import java.util.*;

public class customColList {
    public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   while(true)
	   {
	 System.out.println("Enter your choice:\n1.Fetching\n 2.Adding\n 3.Removing\n 4.Printing\n5.Exit\n");
	   int choice=sc.nextInt();
	 listOperations obj = new listOperations();
	 switch(choice) {
	 case 1:
		 System.out.println("enter the position to be fetched:");
		 int pos=sc.nextInt();
		 int result=obj.fetchElements(pos);
		 System.out.println(result);
		 break;
	 case 2:
		 System.out.println("Enter the element to be added: ");
		 int element=sc.nextInt();
		 obj.addElement(element);
		 break;
	 case 3:
		 System.out.println("Enter the element to be removed: ");
		 int ele=sc.nextInt();
		 obj.removeElement(ele);
		 break;
	 case 4:
		 obj.printElements();
		 break;
	 case 5:
		 System.exit(0);
	 
		 
	 } 
	 }
		
	}
}