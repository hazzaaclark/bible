/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF REPRESENTING THE BIBLE */
/* AS A DATA STRUCTURE, READY TO USE IN OTHER PRE-REQUISITIES */

/* BEING ABLE TO INDEX VERSES, BOOKS, CHAPTERS AND THEIR RELATIVE SIZE */
/* USING BASIC DS&A'S SUCH AS LISTS AND HASHMAP'S */

/* JAVA INCLUDES */

import java.util.ArrayList;
import java.util.List;

import api.Book;
import api.Chapter;
import api.Constants;

public class Bible
{
    private static List<Book> BIBLE_BOOKS;
    private static final List<Book> WORD_APPERANCES = new ArrayList<>();
    
    public Bible(List<Book> BOOKS)
    {
        this.BIBLE_BOOKS = BOOKS;
    }

    public static List<Book> GET_BOOK_AMOUNT()
    {
        return BIBLE_BOOKS;
    }

    /* PARSE THE LENGTH OF THE USER DEFINED RANGE BY WHICH */
    /* THEY SEARCH FOR VERSES */

    /* USES THE STRING BUILDER AS A SURROGATE MEANS OF BEING ABLE */
    /* TO CONCATENATE TYPES  */
    
    public static final void PRINT_VERSE_RANGE(String VERSES)
    {
        int INDEX = 0;
        int START, END;
        char VERSE_WHITESPACE = VERSES.charAt(INDEX);
        boolean VERSE_MIDDLE;

        /* INDEX THROUGH ALL RESPECTIVE ELEMENTS OF THE LENGTH */
        /* OF THE PROPOSED VERSE */

        /* THIS IS A MINIMAL CHECK TO DISCERN FOR WHITESPACE IN BETWEEN */
        /* VERSES SUCH IS THE CASE WITH READING A TEXT FILE */

        /* MAKING SURE THAT THE PARSER TAKES INTO ACCOUNT THE LENGTH OF EACH SENTENCE */
        
        for(INDEX = 0; INDEX < VERSES.length(); INDEX++)
        {
            switch (VERSE_WHITESPACE) 
            {
                case '-':
                    VERSE_MIDDLE = true;
                    break;
            
                default:
                    break;
            }
        }

        try
        {
            START = Integer.parseInt(Constants.BIBLE_START_OFFSET);
            END = Integer.parseInt(Constants.BIBLE_END_OFFSET);
        }

        catch (NumberFormatException EXEC)
        {
            Constants.BIBLE_PARSER.append("Invalid range or range is out of the buffer\n");
        }

        System.out.println(Constants.BIBLE_PARSER);
    }

    /* SEARCHES THROUGH BOOKS AND FINDS OCCURRENCES BASED ON RELEVANT SEARCH TERMS */
    /* ONCE AGAIN, THIS WILL USE A STRING BUILDER TO CONCATENATE TYPES */

    public static final void PRINT_SEARCH(String SEARCH)
    {

        /* THIS WILL SHIFT THROUGH THE VARIOUS INSTANCES BY WHICH */
        /* A RELEVANT WORD OCCURS IN THE LIST OF BOOKS */

        for(Book BOOK_OCCURANCE : WORD_APPERANCES)
        {
            Constants.BIBLE_PARSER.append(BOOK_OCCURANCE);
            Constants.BIBLE_PARSER.append("Occurances: " + WORD_APPERANCES.size());
        }

        if(WORD_APPERANCES == null)
        {
            Constants.BIBLE_PARSER.append("No search results found.\n");
        }

    }

    /* SEARCH THROUGH CHAPTERS WITHIN SAID BOOKS AND FINDS OCCURRENCES */
    /* BASED ON RELEVANT SEARCH TERMS */

    /* THIS FUNCTION ASSUMES THE ROLE THAT GIVEN AN ARBITRARY INT ARG */
    /* EVOKING THE STATE THAT THERE IS A CHAPTER TO BE PARSED, IT WILL LOOK FOR RELEVANT ARGS */

    /* OTHERWISE, NOTHING WILL BE PRINTED */

    public static void PRINT_CHAPTER(int BOOK, int CHATPER_NO)
    {
        Chapter CHAPTER = new Chapter(CHATPER_NO);

        if(BOOK != 0)
        {
            try
            {
                BIBLE_BOOKS.get(BOOK).GET_CHAPTER(CHATPER_NO);
                Constants.BIBLE_PARSER.append("Chapter " + CHAPTER.GET_CHAPTER_NUMBER() + "\n");
            }

            catch (NumberFormatException EXEC)
            {
                Constants.BIBLE_PARSER.append("Invalid Numerical Expression, no Chapter or Book found\n");
            }
        }
    }
}
