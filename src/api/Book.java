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

    private static String BOOKS;
    private static int CHAPTER;

    public Book(String TITLE)
    {
        this.BOOK_TITLE = TITLE;
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

    /* GENERAL PURPOSE OVERRIDE METHOD FOR DECLARING THE CONCATENATION */
    /* OF STRING LITERALS */

    /* THIS WILL MOSTLY BE USED TO PRINT OUT STRINGS IN RELATION TO BOOKS */
    /* CHAPTERS, VERSES AND THE SUCH */

    @Override
    public String toString()
    {
        return Constants.PARSE_STRING;
    }
}
