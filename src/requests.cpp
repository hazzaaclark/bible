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

	free(HTTP);
	return REQUEST;
}

static U32* MAKE_REQUEST(U32 SOCKET, char* HOSTNAME, char* REQUEST, char* REQUEST_PATH)
{
	UNK BYTES_SENT = 0;
	UNK TOTAL_BYTES_SENT = 0;
	UNK BYTES_LENGTH = strlen(REQUEST);

	REQUEST += 1, sizeof(INIT_REQUEST(HOSTNAME, REQUEST_PATH, REQUEST));

	while (1)
	{
		BYTES_SENT += send(SOCKET, REQUEST, strlen(REQUEST), NULL);
		TOTAL_BYTES_SENT += sizeof(BYTES_SENT);
	}

	free(REQUEST);
	return;

}

#endif
