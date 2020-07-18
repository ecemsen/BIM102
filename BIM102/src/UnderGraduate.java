public class UnderGraduate extends Student{

    double credit;

    UnderGraduate(String name,double GPA,double credit){
        super(name,GPA);
        this.credit=credit;
    }

    public double calculateAchievement (){
        double a;
        a=50 * this.credit * super.GPA;
        return a;
    }


}
