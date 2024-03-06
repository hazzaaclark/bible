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
        Constants.MENU.append("==========================");
        Constants.MENU.append("Harry Clark - Bible Parser");
        Constants.MENU.append("==========================");


        System.out.println(Constants.MENU.toString());
    }
}