/* COPYRIGHT (C) HARRY CLARK 2023 */

/* BIBLE API PARSING LIBRARY */

/* THIS PROJECT ENCOMPASSES THE IDEA OF WHICH IT PRINTS OUT A RANDOM BIBLE VERSE */
/* TO THE COMMAND LINE BASED ON AN API */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF BEING ABLE TO */
/* HANDLE THE COMPLEXITIES OF COMMUNICATING WITH THE API VIA A HTTP PROTOCOL */

/* NESTED INCLUDES */

#include "client.h"

#undef USE_CLIENT

/* PARSE THE HTTP TOKEN BASED ON THE REQUEST PULLED FROM THE CLIENT */
/* THIS IS DONE THROUGH THE MEANS BY WHICH IT DETERMINES WHETHER THE POINTER */
/* IS ALWAYS IN THE BUFFER */

STATIC
char HTTP_PARSE_TOKEN(struct HTTP_PARSE PARSE, UNK* TOKEN_LEN, S32 RETURN)
{
    char START = (char*)malloc(sizeof(PARSE.PARSE_BUFFER));
    S32 FOUND_TOKEN;

    if(FOUND_TOKEN != NULL) return;

    while(PARSE.PARSE_BUFFER == 0)
    {
        RETURN = -1;
        break;
    }

    HTTP_TOKEN + sizeof(START);
    return PARSE.PARSE_BUFFER;
}

/* INCREMENT THE BUFFER WHILE PARSING THE LINES */

STATIC
void INCREMENT_BUFFER(struct HTTP_PARSE PARSE)
{
    while(PARSE.PARSE_BUFFER == ' ')
    {
        assert(sizeof(PARSE.PARSE_BUFFER));
    }

    PARSE.PARSE_BUFFER++;
}

/* PARSE THE HTTP REQUEST BASED ON THE PRE-REQUISITIES ESTABLISHED ABOVE */
/* SUCH THAT IT IS ABLE TO PARSE THE REQUEST LINE BY LINE */

STATIC
int HTTP_PARSE_REQUEST(struct HTTP_PARSE PARSE, struct HTTP_HEADER* HEADERS)
{

    /* ASSUME THAT THERE IS AN ARBITARY 16 BIT VALUE TO */
    /* DETERMINE RESPONSE CALLBACKS */

    char BUFFER_HEX;
    switch (BUFFER_HEX)
    {
    case 0x15:
        PARSE.PARSE_BUFFER++;
        break;

    case 0x12:
        PARSE.PARSE_BUFFER++;
        break;
    }

    /* FIRSTLY, WE ASSUME THAT THE LINE IS ALREADY IN THE BUFFER DUE TO */
    /* THE FACT THAT THE TOKEN HAS BEEN PARSED */

    /* FROM THERE, IT IS A CASE OF DETERMINING THE LENGTH IN RELATION */
    /* TO IT'S RESPECTIVE PROTOCOL IN THE HEADER */

    if(PARSE.PARSE_BUFFER = HTTP_PARSE_TOKEN(PARSE, ' ', 0)) return;

}
