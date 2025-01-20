package h4;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;

public final class d {
    public final byte[] a;
    public final boolean b;
    public static final HashSet c;
    public static final d d;
    public static final d e;
    public static final d f;
    public static final d g;
    public static final d h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final d l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    public static final d s;

    static {
        d.c = new HashSet(Arrays.asList(new String[]{"IDAT", "sPLT", "iTXt", "tEXt", "zTXt"}));
        try {
            d.d = new d("IHDR", false);
            d.e = new d("PLTE", false);
            new d("IDAT", true);
            d.f = new d("IEND", false);
            d.g = new d("cHRM", false);
            d.h = new d("gAMA", false);
            d.i = new d("iCCP", false);
            d.j = new d("sBIT", false);
            d.k = new d("sRGB", false);
            d.l = new d("bKGD", false);
            new d("hIST", false);
            d.m = new d("tRNS", false);
            d.n = new d("pHYs", false);
            new d("sPLT", true);
            d.o = new d("tIME", false);
            d.p = new d("iTXt", true);
            d.r = new d("tEXt", true);
            d.s = new d("zTXt", true);
            d.q = new d("eXIf", false);
        }
        catch(h h0) {
            throw new IllegalArgumentException(h0);
        }
    }

    public d(String s, boolean z) {
        this.b = z;
        try {
            byte[] arr_b = s.getBytes("ASCII");
            d.b(arr_b);
            this.a = arr_b;
        }
        catch(UnsupportedEncodingException unused_ex) {
            throw new IllegalArgumentException("Unable to convert string code to bytes.");
        }
    }

    public d(byte[] arr_b) {
        d.b(arr_b);
        this.a = arr_b;
        String s = this.a();
        this.b = d.c.contains(s);
    }

    public final String a() {
        try {
            return new String(this.a, "ASCII");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return "Invalid object instance";
        }
    }

    public static void b(byte[] arr_b) {
        if(arr_b.length != 4) {
            throw new h("PNG chunk type identifier must be four bytes in length", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
        }
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            if((v1 < 65 || v1 > 90) && (v1 < 97 || v1 > 0x7A)) {
                throw new h("PNG chunk type identifier may only contain alphabet characters", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return d.class == class0 ? Arrays.equals(this.a, ((d)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override
    public final String toString() {
        return this.a();
    }
}

