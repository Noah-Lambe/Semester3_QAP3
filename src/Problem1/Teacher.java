package Problem1;

public class Teacher extends Person{
    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.mySubject = subject;
        this.mySalary = salary;
    }

    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
    }
}
