/* Copyright (C) Harry Clark 2023 */

/* YouVersion Bible API */

/* THIS FILE PERTAINS TO THE HTTP CLIENT THAT WILL */
/* TAKE IN AN ARBITARY SOCKET AND PORT ID TO BE ABLE TO */
/* COMMUNICATE WITH THE APP */

#ifndef HTTP_CLIENT
#define HTTP_CLIENT

/* NESTED INCLUDES */

#include "common.h"

/* SYSTEM INCLUDES */

#include <stdio.h>
#include <stdlib.h>

#include <winsock2.h>
#include <WS2tcpip.h>

#ifndef USE_HTTP
#define USE_HTTP

#define HTTP_BUFFER_SIZE     (512 << 1024)
#define DEFAULT_PORT         8080

#define HTTP_ALLOC(ARG) if(ARG) {malloc(ARG);}
#define HTTP_FREE(ARG)  if(ARG) {free(ARG);}

typedef struct HTTP_RESPONSE
{
	static URL* URL_REQUEST;
	static char* STATUS_FLAG;
	static char* URL_REQ_HEADERS;
	static char* URL_RES_HEADERS;
};

typedef struct URL
{
	typedef struct PARSE_URL;
	static char* INDEX;
	static char* HOST;
	static char* IP;
	static char* QUERY;
};


#endif
#endif
