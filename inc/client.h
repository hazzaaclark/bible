/* COPYRIGHT (C) HARRY CLARK 2023 */

/* BIBLE API PARSING LIBRARY */

/* THIS PROJECT ENCOMPASSES THE IDEA OF WHICH IT PRINTS OUT A RANDOM BIBLE VERSE */
/* TO THE COMMAND LINE BASED ON AN API */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF BEING ABLE TO */
/* HANDLE THE COMPLEXITIES OF COMMUNICATING WITH THE API VIA A HTTP PROTOCOL */

#ifndef HTTP_CLIENT
#define HTTP_CLIENT

/* NESTED INCLUDES */

#include "common.h"

/* SYSTEM INCLUDES */

#include <stdio.h>
#include <stdlib.h>

#ifdef __GNUC__
#include <sys/types.h>
#endif

#if defined(USE_CLIENT)
#define USE_CLIENT
#else
#define USE_CLIENT

#define     HTTP_TOKEN          ""
#define     API_KEY             ""

typedef struct HTTP_HEADER
{
    const char* NAME;
    const char* VALUE;
    UNK* NAME_LEN;
    UNK* VALUE_LEN;

} HTTP_HEADER;

typedef struct HTTP_CHUNK
{
    UNK* BYTES_IN_CHUNK[0];
    char* BYTES_CONSUMED;
    char* BYTES_HEX;
    char* CHUNK_STATE;

} HTTP_CHUNK;

typedef struct HTTP_PARSE
{
    char* PARSE_BUFFER;
    char* BUFFER_END;
    char** PARSE_PATH;
    char** PARSE_METHOD;
    UNK* METHOD_LEN;
    UNK* PATH_LEN;
    UNK* PARSE_HEADERS;

} HTTP_PARSE;

char HTTP_PARSE_TOKEN(struct HTTP_PARSE PARSE, UNK* TOKEN_LEN, S32 RETURN);
int HTTP_PARSE_REQUEST(struct HTTP_PARSE* PARSE, struct HTTP_HEADER* HEADERS);
int HTTP_PARSE_RESPONSE(struct HTTP_PARSE* PARSE, struct HTTP_HEADER* HEADERS);
int HTTP_PARSE_HEADERS(struct HTTP_PARSE* PARSE, struct HTTP_HEADER* HEADERS);
int HTTP_DECODE_CHUNK_DATA(struct HTTP_CHUNK* CHUNK);
UNK HTTP_DECODE_CHUNK(struct HTTP_CHUNK* CHUNK, char* BUFFER, UNK* BUFFER_SIZE);

#endif

#endif
