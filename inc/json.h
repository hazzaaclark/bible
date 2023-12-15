/* COPYRIGHT (C) HARRY CLARK 2023 */

/* BIBLE API PARSING LIBRARY */

/* THIS PROJECT ENCOMPASSES THE IDEA OF WHICH IT PRINTS OUT A RANDOM BIBLE VERSE */
/* TO THE COMMAND LINE BASED ON AN API */

/* THIS FILE PERTAINS TOWARDS THE FUNCTIONALITY OF THE JSON PARSING LIBRARY */
/* WHEREBY, IT WILL COMMUNICATE WITH THE API TO PROVIDE A COMPREHENSIVE LIST */
/* OF THE API'S PARAMETERS */

#ifndef JSON_LIB
#define JSON_LIB

/* NESTED INCLUDES */

#include "common.h"

/* SYSTEM INCLUDES */

#include <stdarg.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* VERSATILE MACRO FOR FORMATTING THE JSON FILE */

#if defined(__GNUC__) || defined(__clang__)
#define GNU_CLANG_FORMAT
#endif

typedef struct JSON
{
    JSON_TYPE* TYPE;
    UNK* LENGTH;
    
} JSON;

typedef enum JSON_TYPE
{
    ARRAY,
    OBJECT,
    STRING,
    CHAR,
    INT,
    TRUE,
    FALSE,
    NULL_TERM

} JSON_TYPE;

#endif