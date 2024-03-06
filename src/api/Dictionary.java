/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE DICTONARY FUNCTIONALITY SURROUNDING */
/* THE API LEXER */

/* BY USING JSOUP, THIS WILL HOUSE THE DEFINTIONS FOR INTERACTING WITH */
/* THE API TO BE ABLE TO SCRAP INFORMATION PERTAINING TOWARDS THE BIBLE */

package api;

/* JAVA INCLUDES */

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

/* JSOUP INCLUDES */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public final class Dictionary 
{
    private static final int BOOKS_OT = 39;
    private static final int BOOKS_NT = 27;
    private static final int BOOKS_ALL = 66;
    private static List<Book> BIBLE_BOOKS;

    public Dictionary(String BOOK)
    {

    }
}
