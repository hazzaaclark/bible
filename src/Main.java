/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MAIN FUNCTIONALITY OF THE PROGRAM */

import api.Dictionary;

public class Main extends Bible implements Constants 
{
    private static int INDEX = 0;

    public static void main(String[] args)
    {
        DISPLAY_MENU();
    }

    public static void DISPLAY_MENU()
    {
        Constants.MENU.append("===========================\n");
        Constants.MENU.append("Harry Clark - Bible Parser \n");
        Constants.MENU.append("                           \n");
        Constants.MENU.append("Options:                   \n");    
        Constants.MENU.append("1. Search Chapter          \n");   
        Constants.MENU.append("2. Search Verses           \n");
        Constants.MENU.append("3. Verse Of The Day        \n");
        Constants.MENU.append("===========================\n");

        System.out.println(Constants.MENU.toString());

        USER_CHOICE();
    }

    private static void USER_CHOICE()
    {
        try
        {
            INDEX = Constants.SCANNER.nextInt();
        }
        catch (Exception EXEC)
        {
            System.err.println("Invalid Option in the range" + EXEC);
            DISPLAY_MENU();
        }

        switch (INDEX) {
            case 1:
                
                break;
        
            default:
                break;
        }
    }
}
