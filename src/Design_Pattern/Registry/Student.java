package Design_Pattern.Registry;

public class Student implements Prototype<Student>{

    // Student-specific Attributes
    private String name;
    private String email;
    private String password;

    // Batch-wise Attributes
    private String batchName;
    private String instructor;
    private String module;
    private String batchStartDate;
    private String batchEndDate;
    private String batchSchedule;

    public Student(String batchName, String instructor, String module, String batchStartDate, String batchEndDate, String batchSchedule) {
        this.batchName = batchName;
        this.instructor = instructor;
        this.module = module;
        this.batchStartDate = batchStartDate;
        this.batchEndDate = batchEndDate;
        this.batchSchedule = batchSchedule;
    }

    public Student(Student student){
        this.name = student.name;
        this.email = student.email;
        this.password = student.password;
        this.batchName = student.batchName;
        this.instructor = student.instructor;
        this.module = student.module;
        this.batchStartDate = student.batchStartDate;
        this.batchEndDate = student.batchEndDate;
        this.batchSchedule = student.batchSchedule;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", batchName='" + batchName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", module='" + module + '\'' +
                ", batchStartDate='" + batchStartDate + '\'' +
                ", batchEndDate='" + batchEndDate + '\'' +
                ", batchSchedule='" + batchSchedule + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getBatchStartDate() {
        return batchStartDate;
    }

    public void setBatchStartDate(String batchStartDate) {
        this.batchStartDate = batchStartDate;
    }

    public String getBatchEndDate() {
        return batchEndDate;
    }

    public void setBatchEndDate(String batchEndDate) {
        this.batchEndDate = batchEndDate;
    }

    public String getBatchSchedule() {
        return batchSchedule;
    }

    public void setBatchSchedule(String batchSchedule) {
        this.batchSchedule = batchSchedule;
    }
}
