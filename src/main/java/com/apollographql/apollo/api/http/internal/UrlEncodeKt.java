package com.apollographql.apollo.api.http.internal;

import Nb.j;
import Vb.a;
import W5.f;
import java.util.Locale;

public final class UrlEncodeKt {
    // Deobfuscation rating: LOW(30)
    private static final boolean isUnreserved(int v) {
        return 97 <= v && v < 0x7B || 65 <= v && v < 91 || 0x30 <= v && v < 58 || (v == 45 || v == 46 || v == 0x5F || v == 0x7E);
    }

    private static final String percentEncode(int v) {
        f.o(16);
        String s = Integer.toString(v, 16);
        j.e(s, "toString(...)");
        String s1 = s.toUpperCase(Locale.ROOT);
        j.e(s1, "toUpperCase(...)");
        if(s1.length() == 1) {
            s1 = "0" + s1;
        }
        return "%" + s1;
    }

    public static final String urlDecode(String s) {
        j.f(s, "<this>");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        int v = 0;
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(v1 == 37) {
                if(v + 3 > s.length()) {
                    throw new IllegalStateException("Check failed.");
                }
                String s1 = s.substring(v + 1, v + 3);
                j.e(s1, "substring(...)");
                f.o(16);
                j0.h0(Integer.parseInt(s1, 16));
                v += 3;
            }
            else {
                j0.n0(v1);
                ++v;
            }
        }
        return j0.B();
    }

    public static final String urlEncode(String s) {
        j.f(s, "<this>");
        StringBuilder stringBuilder0 = new StringBuilder();
        byte[] arr_b = s.getBytes(a.a);
        j.e(arr_b, "getBytes(...)");
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v] & 0xFF;
            if(UrlEncodeKt.isUnreserved(v1)) {
                stringBuilder0.append(((char)v1));
            }
            else {
                stringBuilder0.append(UrlEncodeKt.percentEncode(v1));
            }
        }
        String s1 = stringBuilder0.toString();
        j.e(s1, "toString(...)");
        return s1;
    }
}

