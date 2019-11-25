import java.util.*;
import java.io.*;

class Link
{
  public String table;
  public int data1;
  public String data2;
  public String data3;
  public int data4;

  public Link next;

  public Link(int w, String x, String y, int z)
  {
    //table = t_name;
    data1 = w;
    data2 = x;
    data3 = y;
    data4 = z;
  }

  public void display()
  {
     System.out.print(data1+"\t"+data2+"\t"+data3+"\t"+data4);
  }
}

class LinkedList
{
  private Link first;
  public LinkedList()
  {
    first = null;
    last = null;
  }

  public void insertFirst(int w, String x, String y, int z)
  {
    Link newLink = new Link(w, x, y, z);
    newLink.next = first;
    first = newLink;
  }

  public void displayList()
  {
    System.out.print("List: { ");

    Link currLink = first;

    System.out.println("\t\t"+currLink.table+"\t");
    while(currLink != null)
    {
      currLink.display();
      currLink = currLink.next;
      System.out.print(", ");
    }
    System.out.print(" } \n");
  }

  /*public Link find(int r)
	{
		Link current = first;
		while(current.next != null)
		{
			if(current.next == null)
				current.display();
				current = current.next;
		}
	}*/
  public Link deleteKey(int key)
	{
		Link current=first;
		while(current.dData!=key)
		{
			current=current.next;
			if(current==null)
				return null;
		}
		Link temp=current;
		
		if(current==first)
		{
			first.next.previous=null;
			first=first.next;
		}
		else
		{
			current.next.previous=current.previous;
			current=current.next;
		}
		if(current==last)
		{
			last.previous.next=null;
			last=last.previous;
		}
		else
		{
			current.previous.next=current.next;
			current=current.next;
		}
 }
}
class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
	  
    
    do
    {
      System.out.println("\n\n*****SIMPLE DATABASE MANAGEMENT SYSTEM*****\n\n");
      System.out.println("Choices: \n 1 for Display table\n 2 for Create table \n 3 for Inserting record \n 4 for Deleting record \n 5 for Exit the Menu \n");

      System.out.print("Enter your choice: ");
      int ch = sc.nextInt;

      switch(ch)
      {
        case 1:
              list.displayList();
              break;
        case 2:
              System.out.print("Enter the name of the table: ");
              String t_name = sc.next();

              break;
        case 3:      
              System.out.print("Enter value for var1: ");
              int w = sc.nextInt();
              System.out.print("Enter value for var2: ");
              String x = sc.next();
              System.out.print("Enter value for var3: ");
              String y = sc.next();
              System.out.print("Enter value for var4: ");
              int z = sc.nextint();
              list.insertFirst(w, x, y, z);
              break;
        case 4:
              System.out.print("Enter the no. to delete : ");
              int r = sc.nextInt();
              list.deleteKey(r);
              System.out.println("Item Deleted.");
              break;
        default:
              System.out.println("Do you want to continue? (Y/N)");
              char ch1 = sc.next.charAt(0);
      }
    }while(ch1 == 'Y' || ch1 == 'y');
  }
}