public abstract class Personal implements Lecturable{

    Personal(String name,int birthYear,String department){
        this.name=name;
        this.birthYear=birthYear;
        this.department=department;
    }

    String name;
    int birthYear;
    String department;

    public boolean isQualified() {
        if (calculateAchievement()<= 1)
            return true;
        else
            return false;
    }

}
