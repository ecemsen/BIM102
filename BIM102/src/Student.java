public abstract class Student implements Lecturable{

    String name;
    double GPA;

    Student(String name,double GPA){
        this.name=name;
        this.GPA=GPA;
    }

    public boolean isQualified() {
        if (calculateAchievement()<=100)
            return true;
        else
            return false;

    }
}
