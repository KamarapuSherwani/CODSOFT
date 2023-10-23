package task4;
import java.util.*;
import java.time.LocalDate;
public class CourseDB{
	String course_name;
	int course_code;
    int capacity;
    String description;
    LocalDate course_date;

    public CourseDB(String course_name, int course_code, int capacity, String description, LocalDate course_date)
    {
    	this.course_name = course_name;
    	this.course_code = course_code;
    	this.capacity = capacity;
    	this.description = description;
    	this.course_date = course_date;
    }

    public String getcourse_name(){
    	return course_name;
    }

    public void setcapacity(){
        this.capacity-=1;
    }

    public int getcapacity(){
        return capacity;
    }

    public void increaseCapacity(){
        this.capacity+=1;
    }

    public String toString(){
    	return "COURSE TITLE: "+course_name+" ||COURSE CODE: "+course_code+" ||TOTAL CAPACITY: "+capacity+" ||COURSE DESCRIPTION: "+description+" ||COURSE DATE: "+course_date; 
    }


}