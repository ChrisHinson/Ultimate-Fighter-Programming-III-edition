import java.util.Scanner;

/**
 * this class is for selecting your opponent in the main.java file
 */
public class fight_select {

    static String opp_sel()
    {
        Scanner sc=new Scanner(System.in);
        String opponent;

        io.print("Select your opponent");

        io.print("Jake");
        io.print("Chris");
        io.print("Catherine");
        io.print("Cindy");
        io.print("Sarah");
        io.print("Collin");

        opponent = sc.next();
        Boolean opp_selected = Boolean.FALSE;

        while (opp_selected == Boolean.FALSE)
        {

            if (    (opponent.equals("Jake")) ||
                    (opponent.equals("Chris")) ||
                    (opponent.equals("Catherine")) ||
                    (opponent.equals("Cindy"))||
                    (opponent.equals("Sarah")) ||
                    (opponent.equals("Collin")))
            {
                opp_selected = Boolean.TRUE;
            }
            else
            {
                io.print("Not a valid option, please try again");
                io.print("Select your opponent");

                io.print("Jake");
                io.print("Chris");
                io.print("Catherine");
                io.print("Cindy");
                io.print("Sarah");
                io.print("Collin");

                opponent = sc.next();
            }

        }

        return opponent;
    }

    static String weapon_sel()
    {
        Scanner sc=new Scanner(System.in);
        String weapon;

        io.print("Select your weapon");

        io.print("One handed sword");
        io.print("Mace");

        weapon = sc.next();
        Boolean weapon_selected = Boolean.FALSE;

        while (weapon_selected == Boolean.FALSE)
        {

            if (    (weapon.equals("One Handed sword")) ||
                    (weapon.equals("Mace"))
               )
            {
                weapon_selected = Boolean.TRUE;
            }
            else
            {
                io.print("Not a valid option, please try again");
                io.print("Select your weapon");

                io.print("One handed sword");
                io.print("Mace");

                weapon = sc.next();
            }

        }

        return weapon;

    }

}
