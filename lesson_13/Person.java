
package lab2;

public class Person {
    private String id;
    private String fullName;
    private String phone;
    private String yearOfBirth;
    private String Major;

    public Person() {
    }

    public Person(String id, String fullName, String phone, String yearOfBirth, String Major) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.yearOfBirth = yearOfBirth;
        this.Major = Major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    @Override
    public String toString() {
        return id + " | " + fullName + " | " + phone + " | " + yearOfBirth + " | " + Major;
    }
    
    
    
}
