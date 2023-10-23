package task4;
import java.util.*;
import java.time.LocalDate;
public class CSmain{
	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023, 10, 8);
		CourseDB c1 = new CourseDB("PG-DASSD", 1263, 1, "Diploma in Advanced Secured Software Development", date);
		CourseDB c2 = new CourseDB("PG-DAC", 1015, 100, "Diploma in Advanced Computing", date);
		CourseDB c3 = new CourseDB("PG-DESD", 1101, 50, "Diploma in Embbeded Systems Development ", date);
		CourseDB c4 = new CourseDB("PG-DIOT", 1962, 60, "Diploma in Internet Of Things", date);

		List<StudentDB> studentList = new ArrayList<>(); // Create a list to store students

        Scanner sc = new Scanner(System.in);
        int choice;
		do 
		{
		System.out.println("---------LIST OF AVAILABLE COURSES----------");

		if(c1.getcapacity() == 0)
			System.out.println("1. *******PG-DASSD Course is not Available!********");
		else 
		    System.out.println("1. "+c1);

		if(c2.getcapacity() == 0)
			System.out.println("2. *******PG-DAC Course is not Available!********");
		else 
		    System.out.println("2. "+c2);

		if(c3.getcapacity() == 0)
			System.out.println("3. ********PG-DESD Course is not Available!***********");
		else 
		    System.out.println("3. "+c3);

		if(c4.getcapacity() == 0)
			System.out.println("4. **********PG-DIOT Course is not Available!**********");
		else 
		    System.out.println("4. "+c4);
		
		System.out.println("-------------------------------------------------");
		
	
	
		System.out.println("Would you like to register for a course?\n1.Yes\n2.No\n3.Drop a Course");
		choice = sc.nextInt();
	
		switch(choice)
		{
		 case 1:	
           System.out.println("Enter Student Name: ");
           sc.nextLine();
           String name = sc.nextLine();
           System.out.println("Enter Student ID: ");
           int id = sc.nextInt();
           System.out.println("Enter any Course: ");
           sc.nextLine();
           String scourse = sc.nextLine();
           StudentDB s = new StudentDB(name, id, scourse);
           boolean courseAvailable = false; // Track if the selected course is available

                    if (scourse.equalsIgnoreCase(c1.getcourse_name())) {
                        if (c1.getcapacity() > 0) {
                            c1.setcapacity();
                            courseAvailable = true;
                        }
                    } else if (scourse.equalsIgnoreCase(c2.getcourse_name())) {
                        if (c2.getcapacity() > 0) {
                            c2.setcapacity();
                            courseAvailable = true;
                        }
                    } else if (scourse.equalsIgnoreCase(c3.getcourse_name())) {
                        if (c3.getcapacity() > 0) {
                            c3.setcapacity();
                            courseAvailable = true;
                        }
                    } else if (scourse.equalsIgnoreCase(c4.getcourse_name())) {
                        if (c4.getcapacity() > 0) {
                            c4.setcapacity();
                            courseAvailable = true;
                        }
                    }

                     if (courseAvailable) {
                        studentList.add(s); // Add student to the list
                        System.out.println("Registration Successful!");
                    } else {
                        System.out.println("Selected course is not available.");
                    }
                    break;
		
		case 2:
			System.exit(0);
			break;

        case 3:
        	 System.out.println("Enter Student ID to drop a course: ");
             int studentIDToRemove = sc.nextInt();
             boolean found = false;
                    for (StudentDB student : studentList) {

                        if (student.gets_id() == studentIDToRemove) {
                            String courseToRemove = student.gets_course();
                            if (courseToRemove.equalsIgnoreCase(c1.getcourse_name())) 
                                c1.increaseCapacity();
                            else if (courseToRemove.equalsIgnoreCase(c2.getcourse_name())) 
                                c2.increaseCapacity();
                            else if (courseToRemove.equalsIgnoreCase(c3.getcourse_name())) 
                                c3.increaseCapacity();
                            else if (courseToRemove.equalsIgnoreCase(c4.getcourse_name())) 
                                c4.increaseCapacity();
                            
                            studentList.remove(student);
                            System.out.println("COURSE DROPPED SUCCESSFULLY!");
                            System.out.println("--------------------------------------------------");
                            found = true;
                            break;
                        }

                    }//for each close
                    if (!found) {
                        System.out.println("Student with ID " + studentIDToRemove + " not found.");
                    }
                    break;
		default:
            System.out.println("Enter valid choice!");
            break;
     }
     
     }while(choice!=2);

		sc.close();

	}
}