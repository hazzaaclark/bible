/* COPYRIGHT (C) HARRY CLARK 2024  */

/* BIBLE PARSING LIBRARY FOR JAVA */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF REPRESENTING THE BIBLE */
/* AS A DATA STRUCTURE, READY TO USE IN OTHER PRE-REQUISITIES */

/* BEING ABLE TO INDEX VERSES, BOOKS, CHAPTERS AND THEIR RELATIVE SIZE */
/* USING BASIC DS&A'S SUCH AS LISTS AND HASHMAP'S */

package api;

/* JAVA INCLUDES */

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

public class Bible implements Constants
{
    private static List<Book> BIBLE_BOOKS;
    private static final List<String> WORD_APPERANCES = new ArrayList<>();
    private static String VERSE_TEXT;
    private static String[] VERSE_TEXT_ELEMENTS;
    private static String VERSE_APPERANCES;
    private static File BIBLE_XML = new File("bible/ESV.xml");
    private static NodeList BOOK_LIST;
    private static NodeList CHAPTER_LIST;
    private static NodeList VERSE_LIST;
    private static Node BOOK_NODE;
    private static int INDEX;
    
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

    public static final void PRINT_VERSE_RANGE(String BOOK, int CHAPTER, int START_VERSE, int END_VERSE) 
    {
        try 
        {
            Document DOC = LOAD_XML_FILE(BIBLE_XML);
            for (int VERSE_NO = START_VERSE; VERSE_NO <= END_VERSE; VERSE_NO++) 
            {
                Element VERSE_ELEMENT = FIND_VERSE(DOC, BOOK, CHAPTER, VERSE_NO);
                if (VERSE_ELEMENT != null) 
                {
                    String VERSE_WHITESPACE = VERSE_ELEMENT.getParentNode().getAttributes().getNamedItem("num").getTextContent();
                    if (VERSE_WHITESPACE.equals(Integer.toString(CHAPTER))) 
                    {
                        String VERSE_TEXT = VERSE_ELEMENT.getTextContent();
                        System.out.println(VERSE_TEXT);
                    }
                } 
                else 
                {
                    System.err.println("No verse found for " + BOOK + " " + CHAPTER + ":" + VERSE_NO);
                }
            }
        } 
        catch (Exception EXEC) 
        {
            EXEC.printStackTrace();
        }
    }

    /* SEARCHES THROUGH BOOKS AND FINDS OCCURRENCES BASED ON RELEVANT SEARCH TERMS */
    /* ONCE AGAIN, THIS WILL USE A STRING BUILDER TO CONCATENATE TYPES */

    public String PRINT_SEARCH()
    {
        /* THIS WILL SHIFT THROUGH THE VARIOUS INSTANCES BY WHICH */
        /* A RELEVANT WORD OCCURS IN THE LIST OF BOOKS */

        for(Book BOOK_OCCURANCE : BIBLE_BOOKS)
        {
              BIBLE_PARSER.append(BOOK_OCCURANCE.toString()).append("\n");
        }

        return BIBLE_PARSER.toString();

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

        System.out.println(Constants.BIBLE_PARSER);
    }

    /* SIMILAR FUCNTION TO THE ONE ABOVE EXCEPT FOCUSSES ON THE RELEVANT BOOK ID AND NUMBERS ASSOCIATED  */
    /* WITH THE VERSE BEING ACCESSED */

    public static void PRINT_VERSE_LOOKUP(int BOOK_ID, int CHATPER_NO, int VERSE_NO)
    {
        Verse VERSE_INDEX = new Verse(VERSE_NO, VERSE_APPERANCES);

        try
        {
            BIBLE_BOOKS.get(BOOK_ID).GET_VERSE(VERSE_NO);
            Constants.BIBLE_PARSER.append("Verse: " + VERSE_INDEX.GET_TEXT() + "\n");
        } 

        catch (Exception EXEC)
        {
            Constants.BIBLE_PARSER.append("Cannot parse Verse. Invalid Input\n");
        }
    }

    public static void SEARCH_VERSE(String BOOK, int CHAPTER, int VERSE)
    {
        try
        {
            Document DOC = LOAD_XML_FILE(BIBLE_XML);
            Element VERSE_ELEMENTS = FIND_VERSE(DOC, BOOK, CHAPTER, VERSE);

            if(VERSE_ELEMENTS != null)
            {
                VERSE_TEXT = VERSE_ELEMENTS.getTextContent();
                System.out.println(VERSE_TEXT);
            }

            else
            {
                System.err.println("No verse found");
            }
        }

        catch (Exception EXEC)
        {
            EXEC.printStackTrace();
        }
    }

    public static final void SEARCH_KEYWORD(String KEYWORD)
    {
        try
        {
            Document DOC = LOAD_XML_FILE(BIBLE_XML);
            BOOK_LIST = DOC.getElementsByTagName("book");
            boolean WORD_FOUND = false;

            for (int BOOK_INDEX = 0; BOOK_INDEX < BOOK_LIST.getLength(); BOOK_INDEX++)
            {
                Element BOOK_ELEMENT = (Element) BOOK_LIST.item(BOOK_INDEX);
                String BOOK_NAME = BOOK_ELEMENT.getAttribute("num");

                CHAPTER_LIST = BOOK_ELEMENT.getElementsByTagName("chapter");

                for (int CHAPTER_INDEX = 0; CHAPTER_INDEX < CHAPTER_LIST.getLength(); CHAPTER_INDEX++)
                {
                    Element CHAPTER_ELEMENT = (Element) CHAPTER_LIST.item(CHAPTER_INDEX);
                    String CHAPTER_NUM = CHAPTER_ELEMENT.getAttribute("num");
                    
                    VERSE_LIST = CHAPTER_ELEMENT.getElementsByTagName("verse");

                    for (int VERSE_INDEX = 0; VERSE_INDEX < VERSE_LIST.getLength(); VERSE_INDEX++)
                    {
                        Element VERSE_ELEMENT = (Element) VERSE_LIST.item(VERSE_INDEX);
                        String VERSE_TEXT = VERSE_ELEMENT.getTextContent();
                        String VERSE_NO = VERSE_ELEMENT.getAttribute("num");

                        if(VERSE_TEXT.toLowerCase().contains(KEYWORD.toLowerCase()))
                        {
                            System.out.println(BOOK_NAME + " " + CHAPTER_NUM + ":" + VERSE_NO + " - " + VERSE_TEXT);
                            WORD_FOUND = true;
                        }
                    }
                }
            }

            if (!WORD_FOUND)
            {
                System.out.println("No occurrences found for keyword: " + KEYWORD);
            }

            System.exit(0);
        }

        catch (Exception EXCE)
        {
            EXCE.printStackTrace();
            System.exit(1);
        }
    }

    public static final void PRINT_BOOK_LENGTH(String BOOK_NAME)
    {
        try 
        {
            Document DOC = LOAD_XML_FILE(BIBLE_XML);
            BOOK_LIST = DOC.getElementsByTagName("book");

            for (INDEX = 0; INDEX < BOOK_LIST.getLength(); INDEX++) 
            {
                Element BOOK_ELEMENT = (Element) BOOK_LIST.item(INDEX);
                String NAME = BOOK_ELEMENT.getAttribute("num");

                if (NAME.equalsIgnoreCase(BOOK_NAME)) 
                {
                    NodeList CHAPTERS = BOOK_ELEMENT.getElementsByTagName("chapter");
                    int NUMBER_OF_CHAPTERS = CHAPTERS.getLength();
                    System.out.println("The length of " + BOOK_NAME + " is: " + NUMBER_OF_CHAPTERS + " chapters.");
                    return;
                }
            }

            System.out.println("Book " + BOOK_NAME + " not found.");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    private static Document LOAD_XML_FILE(File FILENAME) throws Exception
    {
        DocumentBuilderFactory XML_FACTORY = DocumentBuilderFactory.newInstance(); 
        DocumentBuilder XML_BUILDER = XML_FACTORY.newDocumentBuilder();
        return XML_BUILDER.parse(BIBLE_XML);
    }

    private static Element FIND_VERSE(Document DOC, String BOOK, int CHAPTER, int VERSE) 
    {
        BOOK_LIST = DOC.getElementsByTagName("book");
        for (INDEX = 0; INDEX < BOOK_LIST.getLength(); INDEX++) 
        {
            Element BOOK_ELEMENT = (Element) BOOK_LIST.item(INDEX);
            String ATTRIBUTE = BOOK_ELEMENT.getAttribute("num");
    
            if (!ATTRIBUTE.equals(BOOK)) continue;
    
            CHAPTER_LIST = BOOK_ELEMENT.getElementsByTagName("chapter");
    
            if (CHAPTER_LIST.getLength() < CHAPTER) return null;
    
            Element CHAPTER_ELEMENT = (Element) CHAPTER_LIST.item(CHAPTER - 1);
    
            VERSE_LIST = CHAPTER_ELEMENT.getElementsByTagName("verse");
    
            if (VERSE_LIST.getLength() < VERSE) return null;
    
            Element VERSE_ELEMENT = (Element) VERSE_LIST.item(VERSE - 1);
            return VERSE_ELEMENT;
        }
    
        return null;
    }
}
