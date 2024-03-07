/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE ATTEMPT AT MODULARISATION */
/* SUCH THAT FILES DON'T BECOME OVERCROWDED WITH VERBOSE LOGIC */

import java.util.Scanner;

public interface Constants  
{
    public final Scanner SCANNER = new Scanner(System.in);
    public final static StringBuilder MENU = new StringBuilder();
    public static boolean PRINT_ARG = false;

    /* THE FOLLOWING FUNCTIONS PERTAIN TOWARDS */
    /* GENERAL PURPOSE METHODS FOR ACCESSING INFORMATION */
    /* PERTAINING TOWARDS BOOKS, CHAPTER AND VERSES ALIKE */

    private static String GET_WORD_INFO(Scanner SCANNER, String QUESTION)
    {
        System.out.println(QUESTION + ":");
        return SCANNER.next();
    }
}
