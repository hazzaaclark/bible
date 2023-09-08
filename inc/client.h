/* Copyright (C) Harry Clark 2023 */

/* YouVersion Bible API */

/* THIS FILE PERTAINS TO THE HTTP CLIENT THAT WILL */
/* TAKE IN AN ARBITARY SOCKET AND PORT ID TO BE ABLE TO */
/* COMMUNICATE WITH THE APP */

#ifndef HTTP_CLIENT
#define HTTP_CLIENT

/* SYSTEM INCLUDES */

#include <stdio.h>
#include <stdlib.h>

#if defined(USE_HTTP)
#define USE_HTTP

#define HTTP_BUFFER_SIZE     (512 << 1024)
#define DEFAULT_PORT         8080

#define HTTP_ALLOC(ARG) if(ARG) {malloc(ARG);}
#define HTTP_FREE(ARG)  if(ARG) {free(ARG);}

typedef struct HTTP_SERVER
{
    static void INIT_CONNECTION(char PORT, char BUFFER);

} HTTP_SERVER;





#endif

#endif