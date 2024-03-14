/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE BOOK FUNCTIONALITY SURROUNDING */
/* THE API LEXER */

/* BY USING JSOUP, THIS WILL HOUSE THE DEFINTIONS FOR INTERACTING WITH */
/* THE API TO BE ABLE TO SCRAP INFORMATION PERTAINING TOWARDS THE BIBLE */

package api;

/* JAVA INCLUDES */

import java.util.ArrayList;
import java.util.List;

import api.Constants;

public class Book implements Constants
{
    private static String BOOK_TITLE = new String();
    private static List<Chapter> CHAPTERS = new ArrayList<>();

    private static DESCRIPTOR DESCRIPTOR;

    private static String BOOKS;
    private static int CHAPTER;
    private static int VERSE;

    public Book(String TITLE, int CHATPER, int VERSE)
    {
        this.BOOK_TITLE = TITLE;
        this.CHAPTER = CHATPER;
        this.VERSE = VERSE;
    }

    public final static String GET_TITLE()
    {
        return BOOK_TITLE;
    }

    public final static String GET_BOOK()
    {
        return BOOKS;
    }

    public final static int GET_CHAPTER()
    {
        return CHAPTER;
    }

    public final static int GET_VERSE()
    {
        return VERSE;
    }

    public final static void ADD_CHAPTER(Chapter CHAPTER_NO)
    {
        if(CHAPTER_NO == null)
        {
            try
            {
                CHAPTERS.add(CHAPTER_NO);
            }

            catch (Exception EXEC)
            {
                throw new IllegalArgumentException("Chapter Number field is Null\n");
            }
        }
    }
    

    private static DESCRIPTOR GET_TYPE()
    {
        return DESCRIPTOR;
    }

    /* GENERAL PURPOSE OVERRIDE METHOD FOR DECLARING THE CONCATENATION */
    /* OF STRING LITERALS */

    /* THIS WILL MOSTLY BE USED TO PRINT OUT STRINGS IN RELATION TO BOOKS */
    /* CHAPTERS, VERSES AND THE SUCH */

    @Override
    public String toString()
    {
        String EVALUATE_TYPE;

        /* THIS WORKS ON THE BASIS FOR BEING ABLE TO */
        /* ACCESS THE GETTER METHOD TO RETURN LIKEWISE TERMS FROM THE ENUM  */

        switch (GET_TYPE()) 
        {
            case NONE:
                EVALUATE_TYPE = GET_BOOK() + GET_CHAPTER();
                break;

            case BOOK:
                EVALUATE_TYPE = GET_BOOK() + ": BOOK\n";
                break;

            case CHAPTER:
                EVALUATE_TYPE = GET_BOOK() + GET_CHAPTER() + ": CHATPER\n";
                break;

            case VERSE:
                EVALUATE_TYPE = GET_CHAPTER() + GET_VERSE() + ": VERSE\n";
                break;
        
            default:
                break;
        }

        return Constants.PARSE_STRING;
    }
}
