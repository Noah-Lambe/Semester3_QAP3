package Problem1;

public class Demo {
    public static void main(String[] args) {
        Person Person1 = new Person("Nick Holden", 29, "M");
        Teacher Teacher1 = new Teacher("Emily Badland", 35, "F", "English", 45000.0);
        Student Student1 = new Student("John Moose", 20, "M", "123456789", 3.8);
        CollegeStudent CollegeStudent1 = new CollegeStudent("Jane Coish", 22, "F", "987654321", 3.5, "Computer Science", 3);

        System.out.println(Person1);
        System.out.println(Teacher1);
        System.out.println(Student1);
        System.out.println(CollegeStudent1);
    }
}
