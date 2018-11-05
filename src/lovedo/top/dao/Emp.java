package lovedo.top.dao;

public class Emp {
    private int id;
    private String name;
    private double salary;
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Emp(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Emp() {
        super();
    }
    public Emp(String name, double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }
}
