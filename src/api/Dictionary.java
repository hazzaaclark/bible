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
import java.util.ArrayList;
import java.util.List;

/* JSOUP INCLUDES */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Dictionary extends Bible
{
    private static final int BOOKS_OT = 39;
    private static final int BOOKS_NT = 27;
    private static final int BOOKS_ALL = 66;
    private static List<Book> BIBLE_BOOKS;
    protected static String FILE_NAME = "KJV.xml";

    public Dictionary()
    {
        super(BIBLE_BOOKS);
    }

    /* ALL OF THE PRECEEDING ARE GENERAL PURPOSE METHODS FOR */
    /* PARSING INFORMATION PERTAINING TOWARDS THE CONTENTS OF THE FILE */

    /* READ THROUGH THE HEADER TO DETERMINE THE LENGTH BASED ON THE USER INPUT */

    public Bible INDEX_BOOKS()
    {
        return new Bible(BIBLE_BOOKS);
    }
}
