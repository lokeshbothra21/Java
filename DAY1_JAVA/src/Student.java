
public class Student {

	private int rollno,sum;
	private double per;
	private int marks1,marks2,marks3;
	
	public void acceptinfo(int rollno,int marks1,int marks2,int marks3) {
		this.rollno=rollno;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		}
	public void display() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Marks1:"+marks1);
		System.out.println("Marks2:"+marks2);
		System.out.println("Marks3:"+marks3);
	}
		public void total() {
			sum =marks1+marks2+marks3;
			System.out.println("Total:"+sum);
		}
		public void Percentage() {
			 per =((marks1+marks2+marks3)*100)/300;
			 System.out.println("Percentage:"+per);
		}
		public void grade() {
			if(per>80)
				System.out.println("Grade:"+"A");
			else if(per>65)
				System.out.println("Grade:"+"B");
			else if(per>40)
				System.out.println("Grade:"+"C");
		}
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.acceptinfo(1001, 50, 50, 50);
		obj.display();
		obj.total();
		obj.Percentage();
		obj.grade();
	}

}
