/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MAIN FUNCTIONALITY OF THE PROGRAM */

public class Main implements Constants
{
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
    }
}
