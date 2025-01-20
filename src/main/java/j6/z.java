package j6;

import v.h;

public abstract class Z {
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;

    static {
        int[] arr_v = new int[h.e(3).length];
        Z.c = arr_v;
        try {
            arr_v[2] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.c[1] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[h.e(5).length];
        Z.b = arr_v1;
        try {
            arr_v1[1] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.b[2] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.b[3] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.b[4] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v2 = new int[h.e(5).length];
        Z.a = arr_v2;
        try {
            arr_v2[0] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.a[1] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.a[4] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            Z.a[3] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

