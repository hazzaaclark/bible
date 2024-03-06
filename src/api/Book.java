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

public class Book
{
    private static String BOOK_TITLE = new String();
    private static List<Chapter> CHAPTERS = new ArrayList<>();

    public Book(String TITLE)
    {
        this.BOOK_TITLE = TITLE;
    }


}
