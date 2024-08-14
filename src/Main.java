//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        boolean finished = false;
        ArrayList<Goals> goals = new ArrayList<>();
        //Goals [] goals = {};

        String g1 = "Do Homework";
        String g2 = "Work out";

        Scanner input = new Scanner (System.in);

        if (!finished) {
            System.out.println("Add Goal: ");
            String goal = input.nextLine();

            if (goal.equals("x")) {
                finished = true;
            } else
                goals.add(new Goals(goal));
        }

        to_string(goals);

        goals[1].setState(true);
        to_string(goals);



        }





    }
    public static void to_string(ArrayList<Goals> goals) {

        String str1 = String.format ("|%-20s|%-8s|", "TO DO: ","STATE");
        System.out.println (str1);

        for (int i = 0; i < goals.size(); i++) {
            String str2 = String.format ("|%-20s|%-8s|", goals.get(i).getString(), goals.get(i).getState());
            System.out.println(str2);
        }
        System.out.println(" ");

    }
}

