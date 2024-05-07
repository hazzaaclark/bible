# HARRY CLARK - BIBLE PARSER LIBRARY

## BIBLE UML GRAPH:

### KEY:

- = private

_____ = static

(0.. *) = multiplicity for Lists

#### VARIABLES:

- BIBLE_BOOKS: List<Book> (0.. *)
____________________________

- WORD_APPERANCES: List<String> (0.. *)
_________________________________

- VERSE_TEXT: String
_________________________

- VERSE_TEXT_ELEMENTS : String()
_________________________________

- VERSE_APPERANCES : String
___________________________

- BIBLE_XML : File
_______________________

- INDEX : int
_____________


# DIAGRAM:

-------------------------------------
|             Bible                 |
-------------------------------------
| - BIBLE_BOOKS: List<Book>         |
| - WORD_APPERANCES: List<String>   |
| - VERSE_TEXT: String              |
| - VERSE_TEXT_ELEMENTS: String[]   |
| - VERSE_APPERANCES: String        |
| - BIBLE_XML: File                 |
| - INDEX: int                      |
-------------------------------------
| + Bible()                         |
-------------------------------------
                  |
-------------------------------------
|         <<interface>>             |
|           Constants               |
-------------------------------------