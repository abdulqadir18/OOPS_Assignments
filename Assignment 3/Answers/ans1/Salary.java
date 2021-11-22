class Employee{
    String name;
    String department;
    double salary;
    int allowance = 0;
    double HRA;
    Employee(String nam,int dep, double sal){ 
        name = nam;
        salary = sal;
        department = "N.A.";
        if(dep ==1){
            department = "Staff";
            allowance = 1500;
        }
        else if(dep == 2){
            department = "Accounts";
            allowance = 2500;
        }
        else{
            department = "Admin";
            allowance = 3500;
        }
        HRA = 0.4 *salary;
    }
    
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+ salary);
        System.out.println("Allowance: "+ allowance);
        System.out.println("HRA: "+ HRA);
        System.out.println("Total salary: "+(HRA+allowance+salary));
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abdul", 1, 50000);
        Employee e2 = new Employee("Qadir", 2, 75000);
        Employee e3 = new Employee("Boxwala", 3, 100000);
        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
    }
}
