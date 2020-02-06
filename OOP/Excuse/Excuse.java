package OOP.Excuse;

import java.util.Random;

public class Excuse {
    // generating excuse function

    public static void generateExcuse(String teacher, String day) {

        //excuse is array of strings
        String[] excuses = {
                "my dog ate my homework",
                "aliens kidnapped my baby sister",
                "I was stuck in time paradox",
                "my new calendar didn't come with " + day,
                "I just came out of a cheetos coma"
        };


        // create a random variable to generate the excuse number
        Random random = new Random();
        int excuseNum = random.nextInt(excuses.length);

        System.out.println("Dear" + teacher + ",");
        System.out.println();
        System.out.println("I was unable to hand in my homework, ");
        System.out.println("on " + day + ", as " + excuses[excuseNum] + "," );
        System.out.println();
        System.out.println("Best Regards,");
        System.out.println("Stew Dent");

    }
    public static void main(String[] args) {

        String teacher = "Brian Schewan";
        String day = "Tuesday";
        generateExcuse(teacher ,day);


        //Outputs the following
        //Dear <teacher>
        //
        //I was unable to hand in my homework ,
        // as i was <excuse>.
        //
        //Best Regards,
        //Stew Dent
    }
}
