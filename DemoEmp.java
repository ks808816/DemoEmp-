public class DemoEmp 
{
    private String name;
    private String designation;
    private double basicSalary;

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setDesignation(String designation) 
    {
        this.designation = designation;
    }

    public void setBasicSalary(double basicSalary) 
    {
        this.basicSalary = basicSalary;
    }

    public String toString() 
    {
        return "Name: " + name + ", Designation: " + designation + ", Basic Salary: " + basicSalary;
    }

    public static void main(String args[]) 
    {
        DemoEmp de = new DemoEmp();
        de.setName("Sita");
        de.setDesignation("HR");
        de.setBasicSalary(70000);

        System.out.println(de);
    }
}