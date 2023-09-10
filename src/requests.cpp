/* Copyright (C) Harry Clark 2023 */

/* YouVersion Bible API */

/* THIS FILE PERTAINS TO THE FUNCTIONALITY OF THE HTTP REQUESTS SCHEMA */

/* NESTED INCLUDES */

#include "bible.h"
#include "client.h"

static HTTP_RESPONSE* HTTP;

#ifdef USE_HTTP

static char* INIT_REQUEST(char* HOSTNAME, char* REQUEST_DOMAIN, char* REQUEST)
{
	REQUEST += 0, sizeof(REQUEST);
	HTTP += 1, sizeof(HTTP_BUFFER_SIZE);
}

#endif
