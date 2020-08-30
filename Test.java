public class LinkedNode
{
   private int data; 
   private LinkedNode next; 
  
]
   public LinkedNode(int data)
   {
       this.data = data;
       next = null;
   }
  

   public LinkedNode(int data, LinkedNode next)
   {
       this.data = data;
       this.next = next;
   }
  
   // getters
   public int getData()
   {
       return data;
   }


import java.util.Scanner;

public class Test {

   public static void main(String[] args) {

       
       System.out.println("Programming Fundamentals");
       System.out.println("NAME: [put your name here]");
       System.out.println("PROGRAMMING ASSIGNMENT 4 - SET\n");
       Scanner sc = new Scanner(System.in);
       String command, line;
       int x;
       
       while(true)
       {
          
           System.out.print("Enter command: ");
           line = sc.nextLine();
          
           String data[] = line.split(" ");
           Object set;
		if(data[0].equalsIgnoreCase("add")) // add
           {
               try {
                   if(data.length > 1) 
                   {
                       x = Integer.parseInt(data[1]); 
                       ((Set) set).add(x); 
                       System.out.println(set); 
                   }else 
                       System.out.println("ERROR: Pass the integer to insert.");
               }catch(NumberFormatException e)
               {
                   
                   System.out.println("ERROR: Enter an integer as the data to insert.");
               }
           }
           else if(data[0].equalsIgnoreCase("del")) 
           {
               try {
                   if(data.length > 1) 
                   {
                       x = Integer.parseInt(data[1]); 
                       set.delete(x); 
                       System.out.println(set); 
                   }else 
                       System.out.println("ERROR: Pass the integer to delete.");
               }catch(NumberFormatException e)
               {
                   // data passed was not integer
                   System.out.println("ERROR: Enter an integer as the data to delete.");
               }
           }
           else if(data[0].equalsIgnoreCase("exists")) 
           {
               try {
                   if(data.length > 1) 
                   {
                       x = Integer.parseInt(data[1]); 
                       System.out.println(((Object) set).exists(x)); 
                   }else 
                       System.out.println("ERROR: Pass the integer to test exists.");
               }catch(NumberFormatException e)
               {
                   
                   System.out.println("ERROR: Enter an integer as the data to test exists.");
               }
           }
           else 
               System.out.println("Invalid command");
       }
   }

}