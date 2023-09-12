/* Copyright (C) Harry Clark 2023 */

/* YouVersion Bible API */

/* THIS FILE PERTAINS TO THE FUNCTIONALITY OF COMMUNICATNG */
/* WITH THE APP IN RELATION TO THE HTTP CLIENT */
/* WHICH ACTS AS THE BACKEND TOWARDS SCRAPING INFO FROM THE APP */

#ifndef BIBLE
#define BIBLE

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

#define ENDPOINT       "https://my.bible.com"
#define SIGN_IN        "/sign-in"
#define VERSES         "https://nodejs.bible.com/api/moments/votd/3.1"

#define USERNAME       ""
#define PASSWORD       ""
#define VOTD           ""
#define REF            ""

typedef struct BIBLE
{
	static U32 DAY;
	static char VERSE;
};

#endif

#endif 
