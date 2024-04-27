/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE VERSE FUNCTIONALITY SURROUNDING */
/* THE API LEXER */

/* BY USING JSOUP, THIS WILL HOUSE THE DEFINTIONS FOR INTERACTING WITH */
/* THE API TO BE ABLE TO SCRAP INFORMATION PERTAINING TOWARDS THE BIBLE */

package api;

import java.util.Optional;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Verse implements Constants 
{    
    private static int VERSE_NO;
    private static String VERSE_TEXT;
    public final Optional<String> VERSE_LITERAL = SCRAPE_VERSE();
    private static Document DOC;
    private static String URL = "https://www.bible.com/verse-of-the-day";
    private static Elements VERSE_ELEMENTS;

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

    /* CREATE A GLOBAL METHOD FOR RETURNING THE SCRAPED CONTENTS OF THE VERSE */

    public String GET_VOTD()
    {
        SCRAPE_VERSE();
        return VERSE_LITERAL.orElse("Failed to parse contents of the Verse");
    }

    /* USING THE OPTIONAL METHOD TO BE ABLE TO DISCERN A PLAUSIBLE RETURN CLAUSE */
    /* IN RELATION TO RELATIVE STRING DATA */

    private Optional<String> SCRAPE_VERSE()
    {
        try
        {
            
            DOC = Jsoup.connect(URL).get();
            VERSE_ELEMENTS = DOC.select("div.mbs-3.border.border-l-large.border-black.pli-1.plb-1.pis-2");
            VERSE_TEXT = VERSE_ELEMENTS.text().trim();
            return Optional.of(VERSE_TEXT);
        }

        catch (Exception EXEC)
        {
            System.err.println("Failed to scrape the Verse: " + EXEC.getMessage());
            return Optional.empty();
        }
    }
}
