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

#if defined(JSON_TYPES)
#define JSON_TYPES
#else
#define JSON_TYPES

#define         JSON_TYPEOF(VALUE)      __typeof__(VALUE)
#define         JSON_OBJECT(VALUE)      ((VALUE) && JSON_TYPEOF(VALUE) == JSON_OBJECT)
#define         JSON_ARRAY(VALUE)       ((VALUE) && JSON_TYPEOF(VALUE) == JSON_ARRAY)
#define         JSON_STRING(VALUE)      ((VALUE) && JSON_TYPEOF(VALUE) == JSON_STRING)
#define         JSON_CHAR(VALUE)        ((VALUE) && JSON_TYPEOF(VALUE) == JSON_CHAR)
#define         JSON_INT(VALUE)         ((VALUE) && JSON_TYPEOF(VALUE) == JSON_INT)
#define         JSON_TRUE(VALUE)        ((VALUE) && JSON_TYPEOF(VALUE) == JSON_TRUE)
#define         JSON_FALSE(VALUE)       ((VALUE) && JSON_TYPEOF(VALUE) == JSON_FALSE)
#define         JSON_NULL(VALUE)        ((VALUE) && JSON_TYPEOF(VALUE) == JSON_NULL_TERM)

#define         JSON_ERROR              80

#endif

typedef struct JSON
{
    JSON_TYPE* TYPE;
    UNK* LENGTH;

    union ERROR
    {
        S32 LINE;
        S32 COLUMN;
        S32 POSITION;
        char* SOURCE[JSON_ERROR];

    } ERROR;
    
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
