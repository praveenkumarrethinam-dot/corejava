abstract class employee{
    double salary;
    abstract void calculatesalary(double salary);
}
class fulltime_employee extends employee{
    void calculatesalary(double salary){
        this.salary=salary;
        System.out.println("the salary for fulltime employee is:"+salary);
    }
}
class parttime_employee extends employee{
    void calculatesalary(double salary){
        this.salary=salary;
        double total_salary=salary-2000;
        System.out.println("the salary for the parttime_employee is:"+total_salary);
    }
}
class contract_employee extends employee{
    void calculatesalary(double salary){
        this.salary=salary;
        double contract_salary= salary-1000;
        System.out.println("the contract salary was:"+contract_salary);

    }
}
public class Emp {
    public static void main(String[] args) {
        double salary=15000;
        employee f=new fulltime_employee();
        employee p=new parttime_employee();
        employee c=new contract_employee();

        f.calculatesalary(salary);
        p.calculatesalary(salary);
        c.calculatesalary(salary);
    }
}
