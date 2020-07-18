import java.sql.SQLOutput;
import java.util.Calendar;

public class Academic extends Personal{

    int numberOfPaper;
    int numberOfSymposium;

    Academic(String name,int birthYear,String department,int numberOfPaper,int numberOfSymposium){
        super(name,birthYear,department);
        this.numberOfPaper=numberOfPaper;
        this.numberOfSymposium=numberOfSymposium;
    }

    public double calculateAchievement () {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age=year-super.birthYear;
        int a;
        a=((3 * numberOfPaper) + (2 * numberOfSymposium)) / age;
        return a;
    }



}
