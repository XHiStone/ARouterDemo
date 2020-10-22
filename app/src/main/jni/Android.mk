LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

APP_ABI := all
APP_PLATFORM := android-16
LOCAL_C_INCLUDES :=bzip2
LOCAL_MODULE    := diffupdate
LOCAL_SRC_FILES := com_xhiston_arouterdemo_DiffUpdateUtil.h\
					com_xhiston_arouterdemo_DiffUpdateUtil.c\
						bspatch.c\
                        bzip2/blocksort.c\
                        bzip2/bzip2.c\
                        bzip2/bzip2recover.c\
                        bzip2/bzlib.c\
                        bzip2/bzlib.h\
                        bzip2/bzlib_private.h\
                        bzip2/compress.c\
                        bzip2/crctable.c\
                        bzip2/decompress.c\
                        bzip2/dlltest.c\
                        bzip2/huffman.c\
                        bzip2/mk251.c\
                        bzip2/randtable.c\
                        bzip2/spewG.c\
                        bzip2/unzcrash.c




include $(BUILD_SHARED_LIBRARY)