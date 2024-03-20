/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE VERSE FUNCTIONALITY SURROUNDING */
/* THE API LEXER */

/* BY USING JSOUP, THIS WILL HOUSE THE DEFINTIONS FOR INTERACTING WITH */
/* THE API TO BE ABLE TO SCRAP INFORMATION PERTAINING TOWARDS THE BIBLE */

package api;

import api.Book;

import java.util.ArrayList;
import java.util.List;

public class Verse implements Constants 
{    
    private static int VERSE_NO;
    private static String VERSE_TEXT;

    public Verse(int VERSE_NO, String VERSE_TEXT)
    {
        this.VERSE_NO = VERSE_NO;
        this.VERSE_TEXT = VERSE_TEXT;
    }

    public static final int GET_VERSE_NUMBER()
    {
        return VERSE_NO;
    }

    public static final String GET_TEXT()
    {
        return VERSE_TEXT;
    }
}
