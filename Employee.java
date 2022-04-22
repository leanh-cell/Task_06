public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;
    public Employee(){
        id=01;
        firstName="Nguyen Van";
        lastName=" A";
        salary=12;
    }
    public Employee(int id, String firstName,String lastName,int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary  ;
    }
    public float raiseSalary(){
     int newSalary = 50/100 * salary;
     return salary+newSalary;
    }
    public String toString(){
        return "Employe[id = " + id +","+ "Name = " + getName() +","+ "slary = " + getAnnualSalary() + "]";
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        System.out.println(E1.toString());
        System.out.println(E1.getId());
        System.out.println(E1.getName());
        System.out.println(E1.raiseSalary());

    }
}
