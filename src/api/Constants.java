/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE ATTEMPT AT MODULARISATION */
/* SUCH THAT FILES DON'T BECOME OVERCROWDED WITH VERBOSE LOGIC */

package api;

import java.util.Scanner;

public interface Constants  
{
    public final Scanner SCANNER = new Scanner(System.in);
    public final static StringBuilder MENU = new StringBuilder();
    public final static StringBuilder BIBLE_PARSER = new StringBuilder();
    public static boolean PRINT_ARG = false;
    public static String PARSE_STRING = new String();
    

    /* ARBRITARY STRING LITERAL FOR BEING ABLE  */
    /* TO PARSE LENGTHS OF A VERSE, BOOK AND OR CHAPTER */

    public static String BIBLE_START_OFFSET = "";
    public static String BIBLE_END_OFFSET = ""; 

    /* THE FOLLOWING FUNCTIONS PERTAIN TOWARDS */
    /* GENERAL PURPOSE METHODS FOR ACCESSING INFORMATION */
    /* PERTAINING TOWARDS BOOKS, CHAPTER AND VERSES ALIKE */

    public static String GET_STRING_INFO(Scanner SCANNER, String VALUE)
    {
        System.out.println(VALUE + ":");
        return SCANNER.next();
    }

    public static String GET_WORD_INFO(Scanner SCANNER)
    {
        return GET_STRING_INFO(SCANNER, "");
    }

    private static int GET_NUMBER_INPUT(Scanner SCANNER, String QUESTION)
    {
        System.out.println(QUESTION + ":");
        return SCANNER.nextInt();
    }

    private static String GET_VERSE_INFO(Scanner SCANNER)
    {
        return GET_STRING_INFO(SCANNER, "Enter the range of the verses you want to search for!\n");
    }

    private static int GET_CHAPTER_INFO(Scanner SCANNER)
    {
        return GET_NUMBER_INPUT(SCANNER, "Enter the Chapter Number\n");
    }

    /* A DESCRIPTOR OBJECT USED FOR LOGGING WHICH */
    /* TYPE IS BEING ACCESSED BY THE STRING CONCATENATION */

    public static enum DESCRIPTOR
    {
        NONE,
        BOOK,
        CHAPTER,
        VERSE,
    };
}
