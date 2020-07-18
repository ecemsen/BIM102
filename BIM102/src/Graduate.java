public class Graduate extends Student{

    int numberOfPaper;

    Graduate(String name,double GPA,int numberOfPaper){
        super(name,GPA);
        this.numberOfPaper=numberOfPaper;
    }

    public double calculateAchievement (){
        double a;
        a=this.numberOfPaper * 30 + super.GPA * 20;
        return a;
    }
}
