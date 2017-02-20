/**
 * main.java for my fighting game, made in my spare time in programming III
 */
//package game;
import java.util.Scanner;


public class main {

    public static void main(String args[]){

        String curr_opp;
        String curr_wep;

        //scanner for menu input
        Scanner sc=new Scanner(System.in);

        //print openeing texts
        System.out.println("Welcome to Ultimate Fighter:Programming III edition");
        io.print("What is your name?");
        String player_name = sc.next();

        //get gamemode and execute correct file
        boolean selected_mode = false;

        while(selected_mode == false)
        {
            io.print("Please select a gamemode, or type options for the menu");
            io.print("Arcade | Career");

            //get gamemode
            String currgame = sc.next();

            if(currgame.equals("Arcade"))
            {
                io.print("Arcade mode selected");
                curr_opp = fight_select.opp_sel();
                curr_wep = fight_select.weapon_sel();
                io.print("Are you " + player_name + ", ready to take on " + curr_opp + ", with your " + curr_wep + "?");


                selected_mode = true;
            }
            else if(currgame.equals("Career"))
            {
                io.print("Not yet implemented.");
                selected_mode = true;
            }
            else if(currgame.equals("options"))
            {
                io.print("No");
                selected_mode = true;
            }
            else
            {
                io.print("not a valid option, please try again");
            }
        }

    }


}
