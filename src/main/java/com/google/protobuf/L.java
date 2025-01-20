package com.google.protobuf;

import v.h;

// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class l extends Enum {
    public final int X;
    public static final enum l Y;
    public static final enum l Z;
    public static final l[] b0;
    public static final l[] c0;

    static {
        l l0 = new l("DOUBLE", 0, 0, 1, x.c0);
        l l1 = new l("FLOAT", 1, 1, 1, x.b0);
        l l2 = new l("INT64", 2, 2, 1, x.Z);
        l l3 = new l("UINT64", 3, 3, 1, x.Z);
        l l4 = new l("INT32", 4, 4, 1, x.Y);
        l l5 = new l("FIXED64", 5, 5, 1, x.Z);
        l l6 = new l("FIXED32", 6, 6, 1, x.Y);
        l l7 = new l("BOOL", 7, 7, 1, x.d0);
        l l8 = new l("STRING", 8, 8, 1, x.e0);
        l l9 = new l("MESSAGE", 9, 9, 1, x.h0);
        l l10 = new l("BYTES", 10, 10, 1, x.f0);
        l l11 = new l("UINT32", 11, 11, 1, x.Y);
        l l12 = new l("ENUM", 12, 12, 1, x.g0);
        l l13 = new l("SFIXED32", 13, 13, 1, x.Y);
        l l14 = new l("SFIXED64", 14, 14, 1, x.Z);
        l l15 = new l("SINT32", 15, 15, 1, x.Y);
        l l16 = new l("SINT64", 16, 16, 1, x.Z);
        l l17 = new l("GROUP", 17, 17, 1, x.h0);
        l l18 = new l("DOUBLE_LIST", 18, 18, 2, x.c0);
        l l19 = new l("FLOAT_LIST", 19, 19, 2, x.b0);
        l l20 = new l("INT64_LIST", 20, 20, 2, x.Z);
        l l21 = new l("UINT64_LIST", 21, 21, 2, x.Z);
        l l22 = new l("INT32_LIST", 22, 22, 2, x.Y);
        l l23 = new l("FIXED64_LIST", 23, 23, 2, x.Z);
        l l24 = new l("FIXED32_LIST", 24, 24, 2, x.Y);
        l l25 = new l("BOOL_LIST", 25, 25, 2, x.d0);
        l l26 = new l("STRING_LIST", 26, 26, 2, x.e0);
        l l27 = new l("MESSAGE_LIST", 27, 27, 2, x.h0);
        l l28 = new l("BYTES_LIST", 28, 28, 2, x.f0);
        l l29 = new l("UINT32_LIST", 29, 29, 2, x.Y);
        l l30 = new l("ENUM_LIST", 30, 30, 2, x.g0);
        l l31 = new l("SFIXED32_LIST", 0x1F, 0x1F, 2, x.Y);
        l l32 = new l("SFIXED64_LIST", 0x20, 0x20, 2, x.Z);
        l l33 = new l("SINT32_LIST", 33, 33, 2, x.Y);
        l l34 = new l("SINT64_LIST", 34, 34, 2, x.Z);
        l.Y = new l("DOUBLE_LIST_PACKED", 35, 35, 3, x.c0);
        l l35 = new l("FLOAT_LIST_PACKED", 36, 36, 3, x.b0);
        l l36 = new l("INT64_LIST_PACKED", 37, 37, 3, x.Z);
        l l37 = new l("UINT64_LIST_PACKED", 38, 38, 3, x.Z);
        l l38 = new l("INT32_LIST_PACKED", 39, 39, 3, x.Y);
        l l39 = new l("FIXED64_LIST_PACKED", 40, 40, 3, x.Z);
        l l40 = new l("FIXED32_LIST_PACKED", 41, 41, 3, x.Y);
        l l41 = new l("BOOL_LIST_PACKED", 42, 42, 3, x.d0);
        l l42 = new l("UINT32_LIST_PACKED", 43, 43, 3, x.Y);
        l l43 = new l("ENUM_LIST_PACKED", 44, 44, 3, x.g0);
        l l44 = new l("SFIXED32_LIST_PACKED", 45, 45, 3, x.Y);
        l l45 = new l("SFIXED64_LIST_PACKED", 46, 46, 3, x.Z);
        l l46 = new l("SINT32_LIST_PACKED", 0x2F, 0x2F, 3, x.Y);
        l.Z = new l("SINT64_LIST_PACKED", 0x30, 0x30, 3, x.Z);
        l l47 = new l("GROUP_LIST", 49, 49, 2, x.h0);
        l l48 = new l("MAP", 50, 50, 4, x.X);
        l[] arr_l = new l[51];
        arr_l[0] = l0;
        arr_l[1] = l1;
        arr_l[2] = l2;
        arr_l[3] = l3;
        arr_l[4] = l4;
        arr_l[5] = l5;
        arr_l[6] = l6;
        arr_l[7] = l7;
        arr_l[8] = l8;
        arr_l[9] = l9;
        arr_l[10] = l10;
        arr_l[11] = l11;
        arr_l[12] = l12;
        arr_l[13] = l13;
        arr_l[14] = l14;
        arr_l[15] = l15;
        arr_l[16] = l16;
        arr_l[17] = l17;
        arr_l[18] = l18;
        arr_l[19] = l19;
        arr_l[20] = l20;
        arr_l[21] = l21;
        arr_l[22] = l22;
        arr_l[23] = l23;
        arr_l[24] = l24;
        arr_l[25] = l25;
        arr_l[26] = l26;
        arr_l[27] = l27;
        arr_l[28] = l28;
        arr_l[29] = l29;
        arr_l[30] = l30;
        arr_l[0x1F] = l31;
        arr_l[0x20] = l32;
        arr_l[33] = l33;
        arr_l[34] = l34;
        arr_l[35] = l.Y;
        arr_l[36] = l35;
        arr_l[37] = l36;
        arr_l[38] = l37;
        arr_l[39] = l38;
        arr_l[40] = l39;
        arr_l[41] = l40;
        arr_l[42] = l41;
        arr_l[43] = l42;
        arr_l[44] = l43;
        arr_l[45] = l44;
        arr_l[46] = l45;
        arr_l[0x2F] = l46;
        arr_l[0x30] = l.Z;
        arr_l[49] = l47;
        arr_l[50] = l48;
        l.c0 = arr_l;
        l[] arr_l1 = (l[])l.c0.clone();
        l.b0 = new l[arr_l1.length];
        for(int v = 0; v < arr_l1.length; ++v) {
            l l49 = arr_l1[v];
            l.b0[l49.X] = l49;
        }
    }

    public l(String s, int v, int v1, int v2, x x0) {
        super(s, v);
        this.X = v1;
        switch(h.d(v2)) {
            case 1: {
                x0.getClass();
                return;
            }
            case 3: {
                x0.getClass();
            }
        }
    }

    public final int a() {
        return this.X;
    }

    public static l valueOf(String s) {
        return (l)Enum.valueOf(l.class, s);
    }

    public static l[] values() [...] // Inlined contents
}

