public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private int age;
    private String major;


    public Student() {
        studentId = "";
        firstName = "";
        lastName = "";
        major = "";
        age = 0;

    }

    public Student(String studentId, String firstName, String lastName, String major, int age) {// MORE FIELDS ) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO
        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName + ", Age: " + age + ", Major: " + major;
    }
}