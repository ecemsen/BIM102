public class Preparatory extends Student{

    int levelOfEnglish;

    Preparatory(String name,double birthYear,int levelOfEnglish){
        super(name,birthYear);
        this.levelOfEnglish=levelOfEnglish;
    }

    public double calculateAchievement (){

        double a;
        a=this.levelOfEnglish * 10 * super.GPA;
        return a;
    }

}
