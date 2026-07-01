class Employee{
void work(){
    System.out.println("Some Work Of Employee");
}
void getsalary(){
    System.out.println("Get salary Of Parent Employee Class");
}
}
class HRmanager extends Employee{
   void work(){
   System.out.println("Some Work Of Hrmanager");
    }
    void addemployee(){
        System.out.println("To Add Employee Come Here");
    }
}
public class EmployeeMain {
    public static void main(String[] args) {
        Employee e=new Employee();
        HRmanager h=new HRmanager();
        e.work();
        e.getsalary();
        h.work();
        h.addemployee();
    }
}
