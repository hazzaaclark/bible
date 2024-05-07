# HARRY CLARK - BIBLE PARSER LIBRARY

## BIBLE UML GRAPH:

### KEY:

- = private

_____ = static

(0.. *) = multiplicity for Lists

### VARIABLES:

- VERSE_NO : int
________________

- VERSE_TEXT : String
_____________________

+ VERSE_LITERAL : Optional<String> = SCRAPE_VERSE()

- DOC : Document
___________________

- VERSE_ELEMENTS : Elements
___________________________-