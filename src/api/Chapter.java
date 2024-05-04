/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE CHAPTER FUNCTIONALITY SURROUNDING */
/* THE API LEXER */

/* BY USING JSOUP, THIS WILL HOUSE THE DEFINTIONS FOR INTERACTING WITH */
/* THE API TO BE ABLE TO SCRAP INFORMATION PERTAINING TOWARDS THE BIBLE */

package api;

import java.util.List;

public class Chapter implements Constants
{
    private int CHAPTER_NUMBER;
    private String CHAPTER_DESCRIPTION; 
    private List<Verse> VERSES;

    public Chapter(int CHAPTER_NO)
    {
        this.CHAPTER_NUMBER = CHAPTER_NO;
    }

    /* 04/05/24 - USES A TERNARY OPERATOR TO REDUCE TYPE COMPLEXITTY */
    /* THIS STILL EVALUATES THE INDEXXING OF THE VERSE ARRAY */

    public Verse GET_VERSE(int VERSE) 
    {
        return (VERSE >= 1 && VERSE <= VERSES.size()) ? VERSES.get(VERSE - 1) : null;
    }

    public int GET_CHAPTER_NUMBER()
    {
        return CHAPTER_NUMBER;
    }

    public void SET_CHAPTER_DESC(String DESCRIPTION)
    {
        this.CHAPTER_DESCRIPTION = DESCRIPTION;
    }

    public String GET_CHAPTER_DESC()
    {
        return CHAPTER_DESCRIPTION;
    }

    @Override
    public String toString()
    {
        BIBLE_PARSER.append("Chapter: ").append(GET_CHAPTER_NUMBER()).append(": ").append(Verse.GET_TEXT()).append("\n");

        for(Verse V : VERSES)
        {
            BIBLE_PARSER.append("Verse: ").append(Verse.GET_VERSE_NUMBER()).append(": ").append(Verse.GET_TEXT()).append("\n");
        }

        return BIBLE_PARSER.toString();
    }
}

