package com.drew.metadata.photoshop;

import L4.a;
import java.util.HashSet;
import l4.i;
import l4.l;
import n0.h;

public final class c extends h {
    @Override  // n0.h
    public final boolean c(int v, HashSet hashSet0, int v1, i i0, int v2, int v3) {
        U7.c c0 = (U7.c)this.f;
        switch(v2) {
            case 700: {
                byte[] arr_b = i0.d(v, v3);
                a.c(arr_b, 0, arr_b.length, c0, null);
                return true;
            }
            case 0x8649: {
                b.c(new l(0, i0.d(v, v3)), v3, c0, null);
                return true;
            }
            case 0x8773: {
                com.drew.metadata.jpeg.b.d(new l4.b(0, i0.d(v, v3)), c0, null);
                return true;
            }
            default: {
                return super.c(v, hashSet0, v1, i0, v2, v3);
            }
        }
    }
}

