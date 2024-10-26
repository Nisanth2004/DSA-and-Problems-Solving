package org.nisanth.implementation;

import java.util.Scanner;

/*
List Implementation using Arrays
 */



public class ListImplementationByArray {

    public static  void main(String args[])
    {
        int val,pos;
        DynamicArray list=new DynamicArray();

        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("\n -------------List Menu ---------\n");
            System.out.println("1.Insert at End\n");
            System.out.println("2.Display the list\n");
            System.out.println("3.Insert at specified position \n");
            System.out.println("4.Delete from Specified Position \n");
            System.out.println("5.Exit\n");
            System.out.println("\n ----------------------------------------\n");
            System.out.println("Enter your Choice: ");
            int choice=sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the data: ");
                     val=sc.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the position(starts at 0) :");
                    pos=sc.nextInt();
                    if(pos<0)
                    {
                        System.out.println("Invalid Position");
                    }
                    System.out.println("Enter the data you want to insert: ");
                    val= sc.nextInt();;
                   list.addAtSpecifiedPosition(pos,val);
                    break;
                case 4:
                    System.out.println("Enter the position you want to delete: (starts at 0) :");
                    pos=sc.nextInt();
                    if(pos<0)
                    {
                        System.out.println("Invalid Position");
                    }
                    list.deleteAtPosition(pos);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");



            }
        }
    }
}
