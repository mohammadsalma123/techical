class Employee {
    String name;
    int id;
    float salary;
    String email;
    String role;
    public  Employee(String name,int id,float salary,String email,String role) {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.email=email;
        this.role=role;
        
        


    }
    public  void displayDetails(){
        System.out.println("name is"+this.name);
        System.out.println("id is"+this.id);
        System.out.println("salary is"+this.salary);
    }
}
    public class EmpData {
        public static void main(String[] args) {
            Employee e1=new Employee("salma", 121, 100000, "12@gmail", "dev");
            e1.displayDetails();
        }
    
}