package Week3.school;

public class Teacher extends Person {

    private String subj;
    private int degree;

    public Teacher(String name, int age, String subj, int degree) {
        super(name, age);
        this.subj = subj;
        this.degree = degree;
    }

    @Override
    public void work() {
        System.out.println("Teachers work");
    }

    @Override
    public String toString() {
        return "Teacher - name" + getName() +
                "Teacher - age" + getAge() +
                "Teachers subject -" + getSubj()+
                "Teachers degree -"  + getDegree();

    }

    public String getSubj() {
        return subj;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }


}
