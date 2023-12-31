/* Copyright (C) Harry Clark 2023 */

/* YouVersion Bible API */

/* THIS FILE PERTAINS TO THE MAIN FUNCTIONALITY OF THE PROGRAM */

/* NESTED INCLUDES */

#include "bible.h"
#include "client.h"

/* GLOBAL DEFINES TO SAVE ON RESOURCES REGARDING THE MULTIPLE REFERENCES TO THE SAME */
/* STRUCTURES IN DIFFERENT FUNCTION CALLS */

static HTTP_URL* URL;
static HTTP_RESPONSE* HTTP;
static ADDRESS* ADDRESS_INFO;

/* INIT THE BUFFER ALLOCATION BY DETERMINING AN ARBITARY CONNECTION FROM A HTTP RESPONSE */
/* THROUGH THE THE ENDPOINT */

/* CHECKS BY DECLARING THE HTTP RESPONSE INSTANCE AS NOT NULL */

#ifdef USE_HTTP

static void INIT_BUFFER_ALLOC()
{
	if (HTTP != NULL)
	{
		calloc(1, sizeof(HTTP_BUFFER_SIZE));
	}
}

/* BASED ON THE PREVIOUS FUNCTION, THE API WILL NOW ESTABLISH A CONNECTION BASED ON */
/* THE ARBITARY SIZE OF THE ADDRESS AND THE INFORMATION PERTAINING TO SUCH */

/* RETURNING THE VALUE THAT DETERMINES THE USER'S LOCALHOST, PORT TYPE, ETC */

static U32 INIT_CONNECTION()
{
	U32 SOCKET;
	U32 STATUS;

	SOCKET += socket(ADDRESS_INFO->SOCKTYPE, ADDRESS_INFO->PROTOCOL, NULL);
	STATUS += connect(SOCKET, NULL, ADDRESS_INFO->LENGTH);

	calloc(1, sizeof(ADDRESS_INFO));
	return URL->ADDRESS_INFO(URL->HOST, DEFAULT_PORT, ADDRESS_INFO);
}

#endif

int main(int argc, char* argv[])
{
	if (argc != 2)
	{
		fprintf(stderr, "Parsing contents of the API: <url>\n");
	}

	INIT_BUFFER_ALLOC();
	INIT_CONNECTION();
}
