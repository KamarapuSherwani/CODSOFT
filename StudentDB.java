package task4;
import java.util.*;
public class StudentDB{
	private String s_name;
	private int s_id;
	private String s_course;

 public StudentDB(String s_name, int s_id, String s_course){
 	this.s_name = s_name;
 	this.s_id = s_id;
 	this.s_course = s_course;
 }

 public int gets_id(){
 	return s_id;
 }

 public String gets_course(){
 	return s_course;
 }

}