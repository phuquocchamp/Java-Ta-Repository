
package lab2;

public class Teacher extends Person {
    private int yearProfession;
    private String contract;
    private double salaryCoeffcient;

    public Teacher() {
    }

    public Teacher(int yearProfession, String contract, double salaryCoeffcient, String id, String fullName, String phone, String yearOfBirth, String Major) {
        super(id, fullName, phone, yearOfBirth, Major);
        this.yearProfession = yearProfession;
        this.contract = contract;
        this.salaryCoeffcient = salaryCoeffcient;
    }

    

    public int getYearProfession() {
        return yearProfession;
    }

    public void setYearProfession(int yearProfession) {
        this.yearProfession = yearProfession;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public double getSalary() {
        return salaryCoeffcient;
    }

    public void setSalary(double salaryCoefficient) {
        this.salaryCoeffcient = salaryCoefficient;
    }

    @Override
    public String toString() {
        return "Teacher[" + super.toString() + " | " + yearProfession + " | " + contract + " | " + salaryCoeffcient +"]\n";
    }
    
    
}
