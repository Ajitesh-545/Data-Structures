package LAB04;

import java.util.Scanner;



public class Air_reservation {

	 node head;
	    static class node
	    {
	        String unique_or_name;
	        node next;
	        node bottom;
	        node()
	        {
	            next = null;
	            bottom = null;
	        }
	    }
	    public static Air_reservation add_flights(Air_reservation link,String unique)
	    {
	        node new_node = new node();
	        new_node.unique_or_name = unique;
	        if(link.head == null)
	        {
	            link.head = new_node;
	        }
	        else
	        {
	            node point = link.head;
	            while (point.next !=null)
	            {
	                point = point.next;
	            }
	            point.next = new_node;
	        }
	        return link;
	    }


	    public static Air_reservation add_booking(Air_reservation link,String unique,String name)
	    {
	        node new_node = new node();
	        new_node.unique_or_name = name;
	       
	        node point = link.head;
	        int flag =0;
	        while (point !=null)
	        {
	            if(point.unique_or_name.equals(unique))
	            {
	                flag = 1;
	            }
	            point = point.next;
	        }
	        if(flag != 1)
	        {
	            System.out.println("No Such Flights Are Available");
	            System.exit(-1);
	        }

	       
	        node point_1 = link.head;
	        while (!(point_1.unique_or_name.equals(unique)))
	        {
	            point_1 = point_1.next;
	        }

	        
	        if(point_1.bottom == null)
	        {
	            point_1.bottom = new_node;
	            System.out.println("BOOKING SUCCESSFUL .... ");
	        }
	        else
	        {
	            while (point_1.bottom !=null)
	            {
	                point_1 = point_1.bottom;
	            }
	            point_1.bottom = new_node;
	            System.out.println("BOOKING SUCCESSFUL .... ");
	        }


	        return link;
	    }

	    public static Air_reservation delete_record(Air_reservation link,String unique,String name)
	    {
	        
	        node point = link.head;
	        int flag =0;
	        while (point !=null)
	        {
	            if(point.unique_or_name.equals(unique))
	            {
	                flag = 1;
	            }
	            point = point.next;
	        }
	        if(flag != 1)
	        {
	            System.out.println("No Such Flights Are Available");
	            System.exit(-1);
	        }
	     
	        node point_1 = link.head;
	        while (!(point_1.unique_or_name.equals(unique)))
	        {
	            point_1 = point_1.next;
	        }
	       
	        node prev = null;
	        while (point_1 !=null && !(point_1.unique_or_name.equals(name)))
	        {
	            prev = point_1;
	            point_1 = point_1.bottom;
	        }

	        if(point_1 == null)
	        {
	            return link;
	        }
	        prev.bottom = point_1.bottom;
	        System.out.println("RECORD DELETED ");

	        return link;
	    }
	    public static void print_names(Air_reservation link,String unique)
	    {
	      
	        node point = link.head;
	        int flag =0;
	        while (point !=null)
	        {
	            if(point.unique_or_name.equals(unique))
	            {
	                flag = 1;
	            }
	            point = point.next;
	        }
	        if(flag != 1)
	        {
	            System.out.println("No Such Flights Are Available");
	            System.exit(-1);
	        }
	    
	        node point_1 = link.head;
	        while (!(point_1.unique_or_name.equals(unique)))
	        {
	            point_1 = point_1.next;
	        }
	     
	        System.out.println("All available passengers are = ");
	        while (point_1 !=null)
	        {
	            System.out.print(point_1.unique_or_name+"  ");
	            point_1 = point_1.bottom;
	        }
	        System.out.println();

	    }
	    public static void print_count(Air_reservation link,String unique)
	    {
	        
	        node point = link.head;
	        int flag =0;
	        while (point !=null)
	        {
	            if(point.unique_or_name.equals(unique))
	            {
	                flag = 1;
	            }
	            point = point.next;
	        }
	        if(flag != 1)
	        {
	            System.out.println("No Such Flights Are Available");
	            System.exit(-1);
	        }
	        node point_1 = link.head;
	        while (!(point_1.unique_or_name.equals(unique)))
	        {
	            point_1 = point_1.next;
	        }
	    
	        int count = -1;
	        System.out.println("Number of  passengers are = ");
	        while (point_1 !=null)
	        {
	            count ++;
	            
	            point_1 = point_1.bottom;
	        }
	        System.out.println(count);
	        System.out.println();
	    }


	    public static void print_flights(Air_reservation link)
	    {
	        node point = link.head;
	        System.out.println("All available flights are = ");
	        while (point !=null)
	        {
	            System.out.print(point.unique_or_name+"  ");
	            point = point.next;
	        }
	    }


	    public static void main(String[] args) {
	    	Air_reservation a = new Air_reservation();
	        System.out.println("Enter the database to enter all the flights available ......  ");
	        Scanner sc = new Scanner(System.in);
	        int flag = 1;
	        while (flag == 1)
	        {
	            System.out.println("Enter flight unique name = ");
	            String unique = sc.nextLine();
	            a = add_flights(a,unique);
	            System.out.println("Are there more flights avavilable ? (1/0)");
	            flag = sc.nextInt();
	            sc.nextLine();
	        }
	        
	        System.out.println("Welcome to the Reservation Database ..... ");
	        System.out.println("1:Book a reservation");
	        System.out.println("2:Cancel a reservation");
	        System.out.println("3:Print name of passengers on a particular flight");
	        System.out.println("4:Print number of passengers on a particular flight");
	        System.out.println("5:EXIT");
	        

	        int flag_1 = 0;
	        while (flag_1 !=1) {
	            System.out.println("Enter your choice = ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            switch (choice) {
	                case 1:
	                    System.out.println("Available flights are : ");
	                    print_flights(a);
	                    System.out.println();
	                    System.out.println("Enter flight for which you want to book a reservation :");
	                    String unique = sc.nextLine();
	                    System.out.println("Enter your name :");
	                    String name = sc.nextLine();
	                    add_booking(a, unique, name);
	                    break;
	                case 2:
	                    System.out.println("Enter flight for which you want to cancel reservation :");
	                    String unique_1 = sc.nextLine();
	                    System.out.println("Enter passenger name :");
	                    String name_1 = sc.nextLine();
	                    a = delete_record(a,unique_1,name_1);
	                    break;
	                case 3:
	                    System.out.println("Enter name of flight :");
	                    String unique_2 = sc.nextLine();
	                    System.out.println("Printing All Names of Passengers .....");
	                    print_names(a,unique_2);
	                    break;
	                case 4:
	                    System.out.println("Enter name of flight :");
	                    String unique_3 = sc.nextLine();
	                    System.out.println("Printing the count of numbers of passengers ......");
	                    print_count(a,unique_3);
	                    break;
	                case 5:
	                    System.out.println("EXITING FROM RESERVATION DATABSE......");
	                    flag_1 = 1;

	            }
	        }
	    }
	}





