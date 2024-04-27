/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE MAIN FUNCTIONALITY OF THE PROGRAM */

import java.util.List;
import java.util.Scanner;

import api.Bible;
import api.Book;
import api.Constants;
import api.Dictionary;
import api.Verse;

public class Main
{
    private static int INDEX = 0;
    private static Scanner CHOICE_SCAN = new Scanner(System.in);
    private static String CHAPTER_NUMBER = new String();
    private static String URL = "https://www.bible.com/verse-of-the-day";
    private static String VERSE;
    public static void main(String[] args)
    {
        DISPLAY_MENU();
        CHOICE_SCAN.close();
    }

    public static void DISPLAY_MENU()
    {
        Constants.MENU.append("===========================\n");
        Constants.MENU.append("Harry Clark - Bible Parser \n");
        Constants.MENU.append("                           \n");
        Constants.MENU.append("Options:                   \n");    
        Constants.MENU.append("1. Search Verses           \n");   
        Constants.MENU.append("2. Verse Of The Day        \n");
        Constants.MENU.append("===========================\n");

        System.out.println(Constants.MENU.toString());

        USER_CHOICE();
    }

    private static void USER_CHOICE() 
    {
        List<Book> BOOKS = null;
        Bible BIBLE = new Bible(BOOKS);
        Verse VERSE_BASE = new Verse(INDEX, VERSE);
        
        try 
        {
            INDEX = Constants.SCANNER.nextInt();
            Constants.SCANNER.nextLine(); 
            
            switch (INDEX) 
            {
                case 1:
                    System.out.println("Enter the Book Name (e.g, Rom, Phil, Tim): ");
                    String BOOK_NAME = Constants.SCANNER.nextLine();
                    System.out.println("Enter the Chapter Number: ");
                    int CHAPTER_NO = Constants.SCANNER.nextInt();
                    System.out.println("Enter the Verse Number: ");
                    int VERSE_NO = Constants.SCANNER.nextInt();

                    BIBLE.SEARCH_VERSE(BOOK_NAME, CHAPTER_NO, VERSE_NO);
                    break;

                case 2:
                    VERSE = VERSE_BASE.GET_VOTD();
                    System.out.println(VERSE);
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
