/* Copyright (C) Harry Clark 2023 */

/* YouVersion Bible API */

/* THIS FILE PERTAINS TO THE MAIN FUNCTIONALITY OF THE PROGRAM */

/* NESTED INCLUDES */

#include "bible.h"
#include "client.h"

static void INIT_BUFFER_ALLOC()
{
	HTTP_RESPONSE* HTTP;

	if (HTTP != NULL)
	{
		calloc(1, sizeof(HTTP_BUFFER_SIZE));
	}
}

static U32 INIT_CONNECTION()
{
	URL* URL; 
	ADDRESS* ADDRESS_INFO;

	return URL->ADDRESS_INFO(URL->HOST, DEFAULT_PORT, ADDRESS_INFO);
}

int main(int argc, char* argv[])
{
	INIT_BUFFER_ALLOC();
	INIT_CONNECTION();
}
