package Week3.school;

public class Student extends  Person {

    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void work() {
        System.out.println("Student`s work");
    }

    @Override
    public String toString() {
        return "Student - name" + getName() +
                "Student - age" + getAge()+
                "Student - grade" + getGrade();
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
