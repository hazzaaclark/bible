/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE ATTEMPT AT MODULARISATION */
/* SUCH THAT FILES DON'T BECOME OVERCROWDED WITH VERBOSE LOGIC */

import java.util.Scanner;

public interface Constants  
{
    public final Scanner SCANNER = new Scanner(System.in);
    public final static StringBuilder MENU = new StringBuilder();
    public final static StringBuilder BIBLE_PARSER = new StringBuilder();
    public static boolean PRINT_ARG = false;

    /* ARBRITARY STRING LITERAL FOR BEING ABLE  */
    /* TO PARSE LENGTHS OF A VERSE, BOOK AND OR CHAPTER */

    public static String BIBLE_START_OFFSET = "";
    public static String BIBLE_END_OFFSET = ""; 

    /* THE FOLLOWING FUNCTIONS PERTAIN TOWARDS */
    /* GENERAL PURPOSE METHODS FOR ACCESSING INFORMATION */
    /* PERTAINING TOWARDS BOOKS, CHAPTER AND VERSES ALIKE */

    private static String GET_WORD_INFO(Scanner SCANNER, String QUESTION)
    {
        System.out.println(QUESTION + ":");
        return SCANNER.next();
    }

    private static int GET_NUMBER_INPUT(Scanner SCANNER, String QUESTION)
    {
        System.out.println(QUESTION + ":");
        return SCANNER.nextInt();
    }

    private static String GET_VERSE_INFO(Scanner SCANNER)
    {
        return GET_WORD_INFO(SCANNER, "Enter the range of the verses you want to search for!\n");
    }

    private static int GET_CHAPTER_INFO(Scanner SCANNER)
    {
        return GET_NUMBER_INPUT(SCANNER, "Enter the Chapter Number\n");
    }
}
