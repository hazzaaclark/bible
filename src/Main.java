/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MAIN FUNCTIONALITY OF THE PROGRAM */

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import api.Bible;
import api.Book;
import api.Constants;
import api.Dictionary;

public class Main extends Bible implements Constants 
{
    private static int INDEX = 0;
    private static String CHOICE;
    private static Scanner CHOICE_SCAN = new Scanner(System.in);
    private static String CHAPTER_NUMBER = new String();

    public Main(List<Book> BOOKS) 
    {
        super(BOOKS);
    }

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
            Constants.SCANNER.nextLine(); 
            
            switch (INDEX) 
            {
                case 1:
                    System.out.print("Enter the chapter number: ");
                    CHAPTER_NUMBER = Constants.SCANNER.nextLine();
                    Bible.PRINT_SEARCH(Constants.GET_WORD_INFO(CHOICE_SCAN, "Chapter " + CHAPTER_NUMBER));
                    break;
                
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } 
        catch (Exception EXEC) 
        {
            System.err.println("Invalid Option in the range" + EXEC);
            DISPLAY_MENU();
        }
    }   
}
