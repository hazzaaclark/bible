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

int main(int argc, char* argv[])
{
	INIT_BUFFER_ALLOC();
}
