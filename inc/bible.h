/* Copyright (C) Harry Clark 2023 */

/* NETBible API */

/* THIS FILE PERTAINS TO THE FUNCTIONALITY OF COMMUNICATNG */
/* WITH THE APP IN RELATION TO THE HTTP CLIENT */
/* WHICH ACTS AS THE BACKEND TOWARDS SCRAPING INFO FROM THE APP */

#ifndef BIBLE_H
#define BIBLE_H

/* NESTED INCLUDES */

#include "common.h"
#include "client.h"

/* SYSTEM INCLUDES */

#include <stdio.h>
#include <stdlib.h>

#if defined(USE_BIBILE)
#define USE_BIBLE
#else
#define USE_BIBLE

#define URL "https://labs.bible.org/api/?passage=random"

typedef struct BIBLE
{
	char TEXT[512];
	char BOOK[512];
	U32 CHAPTER;
	U32 VERSE;
	char* VERSE_LEN;
	char VERSE_INFO[256];
	UNK EXTRACT_INFO;
};

U32 FETCH_VERSE();
U32 PARSE_VERSE();

#endif

#endif 
