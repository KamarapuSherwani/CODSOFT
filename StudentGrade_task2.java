package task2;
import java.util.*;

public class StudentGrade_task2{
	String name;
	int maths;
	int biology;
	int english;

public StudentGrade_task2(String name, int maths, int biology, int english){
	this.name = name;
	this.maths = maths;
	this.biology = biology;
	this.english = english;
}

public int sum_of_total_marks(){
	    int sum = maths+biology+english;
	    return sum;
        
}

public int percentage(){
        int per = sum_of_total_marks()/3;
        return per;
}

public String grade(){
	   if(percentage()>=60 && percentage()<75)
	   	  return "B";
	   else if(percentage()>=75 && percentage()<=100)
	   	  return "A";
	   else if(percentage()>=45 && percentage()<60)
	   	  return "C";
	   	else 
	   	  return "FAIL";	
	}

public void display(){
	System.out.println("--------------------------------------------");
	System.out.println("Results for "+name+":");
	System.out.println("Total marks: "+sum_of_total_marks());
	System.out.println("Average percentage: "+percentage());
	System.out.println("Overall Grade: "+grade());
	System.out.println("--------------------------------------------");
}

  public static void main(String[] args) {

    int choice;
    
  	Scanner sc = new Scanner(System.in);
   
   do{
   System.out.println("1.Enter Student details\n2.Exit");  
   System.out.println("Enter your choice: ");
   choice = sc.nextInt();

   switch(choice){

   case 1:
  	System.out.println("Enter student name:");
  	sc.nextLine();
  	String s_name = sc.nextLine();

  	System.out.println("Enter math marks:");
  	int s_maths = sc.nextInt();

  	System.out.println("Enter biology marks:");
  	int s_bio = sc.nextInt();

  	System.out.println("Enter english marks:");
  	int s_eng = sc.nextInt();
 	
 	StudentGrade_task2 s1 = new StudentGrade_task2(s_name, s_maths, s_bio, s_eng);
 	s1.display();
    break;

   case 2:
     System.exit(0);
     break;

   default:
      System.out.println("Enter valid choice!");
      break; 

  }//switch close

 }while(choice!=2);
 	
 
 	sc.close();
 	
 }//main close
}
