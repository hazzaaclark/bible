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
    private static List<Chapter> CHAPTER;
    public static int VERSE;

    public Book(String TITLE, int CHATPER, int VERSE)
    {
        this.BOOK_TITLE = TITLE;
        this.CHAPTER = CHAPTER;
        this.VERSE = VERSE;
    }

    public static String GET_TITLE()
    {
        return BOOK_TITLE;
    }

    public static String GET_BOOK()
    {
        return BOOKS;
    }

    public Chapter GET_CHAPTER(int CHAPTER_ID)
    {
        return (CHAPTERS.size() >= CHAPTER_ID) ? CHAPTERS.get(CHAPTER_ID - 1) : null;
    }

    public int GET_VERSE(int VERSE_NO)
    {
        return VERSE;
    }

    public static void ADD_CHAPTER(Chapter CHAPTER_NO)
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
        /* THIS WORKS ON THE BASIS FOR BEING ABLE TO */
        /* ACCESS THE GETTER METHOD TO RETURN LIKEWISE TERMS FROM THE ENUM  */

        BIBLE_PARSER.append("Book: ").append(Book.GET_TITLE());

        for(Chapter C : CHAPTERS)
        {
            Verse V = new Verse(VERSE, BIBLE_END_OFFSET);
            BIBLE_PARSER.append("Chapter: ").append(C.GET_CHAPTER_NUMBER()).append(":\n");
             C.GET_VERSE(VERSE);

            for(;;)
            {
                BIBLE_PARSER.append("Verse: ").append(V.GET_VERSE_NUMBER()).append(": ").append(V.GET_TEXT()).append("\n");
            }
        }

        return BIBLE_PARSER.toString();
        
    }
}
