import java.io.*;
class Hotel_Management_System
{
    String name;
    String cin;
    String cout;
    int rno;
    void details(String name,String cin,String cout,int rno)
    {
        this.name=name;
        this.cin=cin;
        this.cout=cout;
        this.rno=rno;
    }
    public void display()
    {
        System.out.println("Your Name: "+name);
        System.out.println("Check-in date: "+cin);
        System.out.println("Check-out date: "+cout);
        System.out.println("Number of rooms occupied: "+rno);
        System.out.println();
        System.out.print("=======================");
        System.out.println();
        System.out.println("Thank you "+name+" for using our service, please visit soon");
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Hotel_Management_System obj=new Hotel_Management_System();
        System.out.println("WELCOME TO HOTEL MRV");
        System.out.println();
        System.out.println("=================================");
        System.out.println();
        System.out.println("What do you want to do?");
        System.out.println("1. Check-in");
        System.out.println("2. Check-out");
        System.out.println("3. Food ordering");
        int choice=Integer.parseInt(br.readLine());
        switch(choice)
        {
             case 1:
             System.out.println("We have the following rooms for you:-");
             System.out.println("1.  Class A ----> 4000");
             System.out.println("2.  Class B ----> 3000");
             System.out.println("3.  Class C ----> 2000");
             System.out.println("4.  Class D ----> 1000");
             System.out.println("======================");
             System.out.println("Enter Your choice");
             int room_choice=Integer.parseInt(br.readLine());
             switch(room_choice)
             {
                 case 1:
                 System.out.println("You have chosen Class A category of rooms");
                 System.out.print("For how many nights do you want to stay: ");
                 int night1=Integer.parseInt(br.readLine());
                 System.out.print("How many rooms do you want to occupy: ");
                 int number1=Integer.parseInt(br.readLine());
                 System.out.println("Your total room rent will be "+(night1*number1*4000));
                 System.out.println("Do you want to go ahead with booking?: Yes or No");
                 String book1=br.readLine();
                 switch(book1)
                 {
                     case "Yes":
                     System.out.println("Your rooms have been booked, enjoy your stay : )");
                     break;
                     case "No":
                     System.out.println("We are sorry to let you go");
                     default:
                     System.out.println("Wrong choice");
                 }
                 break;
                 case 2:
                 System.out.println("You have chosen Class B category of rooms");
                 System.out.print("For how many nights do you want to stay: ");
                 int night2=Integer.parseInt(br.readLine());
                 System.out.print("How many rooms do you want to occupy: ");
                 int number2=Integer.parseInt(br.readLine());
                 System.out.println("Your total room rent will be "+(night2*number2*3000));
                 System.out.println("Do you want to go ahead with booking?: Yes or No");
                 String book2=br.readLine();
                 switch(book2)
                 {
                     case "Yes":
                     System.out.println("Your rooms have been booked, enjoy your stay : )");
                     break;
                     case "No":
                     System.out.println("We are sorry to let you go");
                     default:
                     System.out.println("Wrong choice");
                 }
                 break;
                 case 3:
                 System.out.println("You have chosen Class A category of rooms");
                 System.out.print("For how many nights do you want to stay: ");
                 int night3=Integer.parseInt(br.readLine());
                 System.out.print("How many rooms do you want to occupy: ");
                 int number3=Integer.parseInt(br.readLine());
                 System.out.println("Your total room rent will be "+(night3*number3*2000));
                 System.out.println("Do you want to go ahead with booking?: Yes or No");
                 String book3=br.readLine();
                 switch(book3)
                 {
                     case "Yes":
                     System.out.println("Your rooms have been booked, enjoy your stay : )");
                     break;
                     case "No":
                     System.out.println("We are sorry to let you go");
                     default:
                     System.out.println("Wrong choice");
                 }
                 break;
                 case 4:
                 System.out.println("You have chosen Class A category of rooms");
                 System.out.print("For how many nights do you want to stay: ");
                 int night4=Integer.parseInt(br.readLine());
                 System.out.print("How many rooms do you want to occupy: ");
                 int number4=Integer.parseInt(br.readLine());
                 System.out.println("Your total room rent will be "+(night4*number4*1000));
                 System.out.println("Do you want to go ahead with booking?: Yes or No");
                 String book4=br.readLine();
                 switch(book4)
                 {
                     case "Yes":
                     System.out.println("Your rooms have been booked, enjoy your stay : )");
                     break;
                     case "No":
                     System.out.println("We are sorry to let you go");
                     default:
                     System.out.println("Wrong choice");
                 }
                 break;
                 default:
                 System.out.println("Wrong choice");
             }
             case 2:
             System.out.print("Enter Your Name: ");
             String n=br.readLine();
             System.out.print("Enter Your Check-in Date: ");
             String cind=br.readLine();
             System.out.print("Enter Your Check-out Date: ");
             String coutd=br.readLine();
             System.out.print("Enter total number of rooms occupied: ");
             int room=Integer.parseInt(br.readLine());
             obj.details(n,cind,coutd,room);
             obj.display();
             break;
             case 3:
             System.out.println("*****RESTAURANT MENU*****");
             System.out.println("1.Dessert----->100");
             System.out.println("2.Drinks----->50");
             System.out.println("3.Breakfast--->90");
             System.out.println("4.Lunch---->110");
             System.out.println("5.Dinner--->150");
             System.out.println("6.Exit");
             System.out.println("Enter the number of your choice: ");  
             int ch=Integer.parseInt(br.readLine());
             switch(ch)
             {
                 case 1:
                 System.out.print("Enter the quantity: ");
                 int d1=Integer.parseInt(br.readLine());
                 int rate1=100*d1;
                 break;
                 case 2:
                 System.out.print("Enter the quantity: ");
                 int d2=Integer.parseInt(br.readLine());
                 int rate2=50*d2;
                 break;
                 case 3:
                 System.out.print("Enter the quantity: ");
                 int d3=Integer.parseInt(br.readLine());
                 int rate3=90*d3;
                 break;
                 case 4:
                 System.out.print("Enter the quantity: ");
                 int d4=Integer.parseInt(br.readLine());
                 int rate4=110*d4;
                 break;
                 case 5:
                 System.out.print("Enter the quantity: ");
                 int d5=Integer.parseInt(br.readLine());
                 int rate5=150*d5;
                 break;
                 case 6:
                 System.exit(0);
                 break;
                 default:
                 System.out.println("Wrong choice");
             }
             break;
             default:
             System.out.println("Wrong choice");
        }
    }
}