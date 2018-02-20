#ifndef LINUX_EXT_COMPAT
#define LINUX_EXT_COMPAT

#include <stdio.h>
#include <string.h>
#include "PrtEnclave_t.h"

#define prints(str) ocall_print(str)

#define strcpy_s(d, n, s) strncpy(d, s, n)

#define sprintf_s(buffer, size, format, args...) snprintf(buffer, size, format, ##args )

#endif
