 class Student1 {
    String name;
    int rollno;
    String branch;
    String email;
    float cgpa;
    public Student1(String name,int rollno,String branch,String email,float cgpa){
        this.name=name;
        this.rollno=rollno;
        this.branch=branch;
        this.email=email;
        this.cgpa=cgpa;
    }
    public void displayDetails(){
        System.out.println("name is "+name);
        System.out.println("rollno is "+rollno);
    }
}
public class StuData{
    public static void main(String[] args) {
        Student1 s1=new Student1("salma", 121, "cse", "salma@gmail", 8.7f);
        s1.displayDetails();
    }
}
