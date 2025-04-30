import java.util.ArrayList;
import java.util.Scanner;

class Student{
	   
	String name;
	int id;
	int marks;
	
	Student(int id,String name,int marks){
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	
	public String toString() {
		return "Id: "+id+", Name: "+name+" , Marks: "+marks;
	}
}





public class StudentManagementSystem {

	public static void main(String[] args) {
		
		ArrayList<Student>  s=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
		    System.out.println("\n---- Student Management System ----");
		    System.out.println("1. Add Student");
		    System.out.println("2. View All Students");
		    System.out.println("3. Search Student by ID");
		    System.out.println("4. Delete Student by ID");
		    System.out.println("5. Update Student Marks");
		    System.out.println("6. Exit");
		    System.out.print("Enter your choice: ");
		    
		    int choice = sc.nextInt();
		    
		    switch(choice) {
		         case 1:
		        	 System.out.print("Enter ID: ");
		        	    int id = sc.nextInt();
		        	    sc.nextLine(); // consume newline
		        	    System.out.print("Enter Name: ");
		        	    String name = sc.nextLine();
		        	    System.out.print("Enter Marks: ");
		        	    int marks = sc.nextInt();
		        	    
		        	    s.add(new Student(id, name, marks));
		        	    System.out.println("Student added successfully!");
		        	    break;
		         case 2:
		        	 if(s.isEmpty()) {
		        		 System.out.println("No Students is found");
		        	 }
		        	 else {
		        		 System.out.println("\n----List of Students-----");
		        		 for(Student student:s) {
		        			 System.out.println(student);
		        		 }
		        	 }
		        	 break;
		         
		        	 
		         case 3:
		        	 System.out.println("Enter student ID: ");
		        	 int searchId=sc.nextInt();
		        	 boolean found=false;
		        	 for(Student student:s) {
		        		 if(student.id==searchId) {
		        			 System.out.println("Student found: "+s);
		        			 found=true;
		        			 break;
		        		 }
		        	 }
		        	 
		        	 if(!found) {
		        		 System.out.println("Student with ID "+searchId+" not found");
		        	 }
		        	 break;
		         case 4:
		        	 System.out.println("Enter to Student ID delete");
		        	 int studentId=sc.nextInt();
		        	 boolean isDeleted=false;
		        	 for(int i=0;i<s.size();i++) {
		        		 if(s.get(i).id==studentId) {
		        			 s.remove(i);
		        			 System.out.println("Student with ID "+studentId+" deleted Successfully");
		        			 isDeleted=true;
		        			 break;
		        		 }
		        	 }
		        	 if(!isDeleted) {
		        		 System.out.println("Student with ID "+studentId+" not found");
		        	 }
		        	 break;
		         case 5:
		        	 System.out.println("Enter Student Id: ");
		        	 int sId=sc.nextInt();
		        	 boolean updated=false;
		        	 for(Student student:s) {
		        		 if(student.id==sId) {
		        			 System.out.println("Enter new Marks");
		        			 int newMarks=sc.nextInt();
		        			 student.marks=newMarks;
		        			 System.out.println("Marks updated for student ID " + sId);
		        			 updated=true;
		        			 break;
		        		 }
		        	 }
		        	 if(!updated) {
		        		 System.out.println("Student with ID " + sId + " not found.");
		        	 }
		        	 break;
		         case 6:
		        	 System.out.println("Exiting the program. Goodbye!");
		        	 System.exit(0);
		        	 sc.close();
		        	 break;
		    }
		}
	}

}
