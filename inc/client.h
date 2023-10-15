/* Copyright (C) Harry Clark 2023 */

/* NETBible API */

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

#ifdef _WIN32
#include <winsock2.h>
#include <WS2tcpip.h>
#endif

#ifndef USE_HTTP
#define USE_HTTP

#define HTTP_BUFFER_SIZE     (512 * 1024)
#define DEFAULT_PORT         8080

#define HTTP_ALLOC(ARG) if(ARG) {malloc(ARG);}
#define HTTP_FREE(ARG)  if(ARG) {free(ARG);}

#define HTTP_ERROR(ARG, MESSAGE, ...) if (!(ARG)) { fprintf(stderr, MESSAGE "\n", ##__VA_ARGS__); goto error; }

typedef struct HTTP_RESPONSE
{
	HTTP_URL URL_REQUEST;
	char* STATUS_FLAG;
	char* URL_REQ_HEADERS;
	char* URL_RES_HEADERS;
	U32 STATUS_COUNT;

};

typedef struct HTTP_URL
{
	char* INDEX;
	char* HOST;
	char* PORT;
	char* IP;
	char* QUERY;
	U32 ADDRESS_INFO(char* HOST, char PORT, ADDRESS* ADDRESS);
};

typedef struct ADDRESS
{
	U32 SOCKTYPE;
	U32 PROTOCOL;
	U32 LENGTH;
};

U32 HTTP_GET(const char* URL, HTTP_RESPONSE* RESPONSE);
U32 HTTP_POST(const char* URL, const char* DATA, HTTP_RESPONSE* RESPONSE);

#endif
#endif
