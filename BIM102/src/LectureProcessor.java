public class LectureProcessor {

    public static void doIt(Lecturable l){
        if (l.isQualified())
            System.out.println(l.getClass().getSimpleName() + " can lecture");
        else
            System.out.println(l.getClass().getSimpleName() + " cannot lecture");

    }

}
