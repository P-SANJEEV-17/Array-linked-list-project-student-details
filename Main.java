import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<College> list=new ArrayList<>();
	    ArrayList<College> list1=new ArrayList<>();
	    
	    Scanner sc = new Scanner(System.in);
	  int bb =0;
	  
	while(bb!=4) {
	
		 System.out.println("1.Create student details\n2.Display the details in array\n3.Display the details\n4.Exit");
		 bb= sc.nextInt();
		 
		 if(bb==1){
			 System.out.print("Enter the number of students: ");
			 int num = sc.nextInt();
			 sc.nextLine();
			 
			 for (int h=0;h<num;h++){
				 
				 System.out.print("Enter the name: ");
				 String a = sc.nextLine();
				 
				 System.out.print("Enter the Roll number: ");
				 int b = sc.nextInt();
				 sc.nextLine();
				 
				 System.out.print("Enter the dept: ");
				 String c = sc.nextLine();
				 
				 list.add(new College(a,b,c));
				 }
			 }
	    else if (bb==2) {
	    	if(list.isEmpty()) {
	    		System.out.println("--Array is empty--");
	    	}
	    	else {
	    	System.out.println(list);
	    }
	    	}
	    else if (bb==3) {

	    	if(list.isEmpty()) {
	    		System.out.println("--List is empty--");
	    	}
	    else{
	        sc.nextLine();
	        System.out.println("Enter the student name:");
	        String search = sc.nextLine();
	        int count = 0;
	        for(College p:list){
	            if(p.name.equals(search)){
	               count++;
	               list1.add(p);
	               }
	            }
            if(count==1){
                System.out.println(list1.get(0));
            } else if(count>1){
                System.out.println(list1);
            }
             else{
	                System.out.println("no");
	            }
            }
	    	}
	    else if(bb==4) {
	    	System.out.println("--Thank you!--");    
	    	}
	    	else{
	    	    System.out.println("--Invalid choice--");
	    	}
		 }
	}
}
	    
 class College{
     public String name;
     public int roll_no;
     public String dept;
     
     College(String name,int roll_no,String dept){
         this.name= name;
         this.roll_no= roll_no;                                           
         this.dept= dept;
         
     }
         public String toString(){
          return String.format ("Name : %s\t Roll No : %d\t dept : %s\n",name,roll_no,dept);
          }
    }