
package lab2;
public class Student extends Person {
    private int yearOfAdmission;
    private int entranceEnglish;

    public Student() {
    }

    public Student( int yearOfAdmission, int entranceEnglish, String id, String fullName, String phone, String yearOfBirth, String Major) {
        super(id, fullName, phone, yearOfBirth, Major);
        this.yearOfAdmission = yearOfAdmission;
        this.entranceEnglish = entranceEnglish;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getEntranceEnglish() {
        return entranceEnglish;
    }

    public void setEntranceEnglish(int entranceEnglish) {
        this.entranceEnglish = entranceEnglish;
    }

    @Override
    public String toString() {
        return "Student[" +super.toString() + " | " + yearOfAdmission + " | " + entranceEnglish + "]\n";
    }
    
    
    
}
