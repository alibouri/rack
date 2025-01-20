package h4;

import Q4.i;
import U7.c;
import com.drew.metadata.e;
import com.drew.metadata.png.PngChromaticitiesDirectory;
import com.drew.metadata.png.PngDirectory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;
import l4.d;
import l4.h;
import l4.j;
import l4.l;

public abstract class g {
    public static final Set a;
    public static final Charset b;
    public static final Charset c;

    static {
        g.b = d.b;
        g.c = d.a;
        HashSet hashSet0 = new HashSet();
        hashSet0.add(h4.d.d);
        hashSet0.add(h4.d.e);
        hashSet0.add(h4.d.m);
        hashSet0.add(h4.d.g);
        hashSet0.add(h4.d.k);
        hashSet0.add(h4.d.h);
        hashSet0.add(h4.d.i);
        hashSet0.add(h4.d.l);
        hashSet0.add(h4.d.r);
        hashSet0.add(h4.d.s);
        hashSet0.add(h4.d.p);
        hashSet0.add(h4.d.o);
        hashSet0.add(h4.d.n);
        hashSet0.add(h4.d.j);
        hashSet0.add(h4.d.q);
        g.a = Collections.unmodifiableSet(hashSet0);
    }

    public static void a(c c0, b b0) {
        byte[] arr_b10;
        String s2;
        byte[] arr_b6;
        String s1;
        String s;
        h4.d d0 = b0.a;
        h4.d d1 = h4.d.d;
        boolean z = d0.equals(d1);
        byte[] arr_b = b0.b;
        if(z) {
            f f0 = new f(arr_b);
            PngDirectory pngDirectory0 = new PngDirectory(d1);
            pngDirectory0.setInt(1, f0.a);
            pngDirectory0.setInt(2, f0.b);
            pngDirectory0.setInt(3, ((int)f0.c));
            pngDirectory0.setInt(4, f0.d.a);
            pngDirectory0.setInt(5, f0.e & 0xFF);
            pngDirectory0.setInt(6, ((int)f0.f));
            pngDirectory0.setInt(7, ((int)f0.g));
            c0.i(pngDirectory0);
            return;
        }
        h4.d d2 = h4.d.e;
        if(d0.equals(d2)) {
            PngDirectory pngDirectory1 = new PngDirectory(d2);
            pngDirectory1.setInt(8, arr_b.length / 3);
            c0.i(pngDirectory1);
            return;
        }
        h4.d d3 = h4.d.m;
        if(d0.equals(d3)) {
            PngDirectory pngDirectory2 = new PngDirectory(d3);
            pngDirectory2.setInt(9, 1);
            c0.i(pngDirectory2);
            return;
        }
        h4.d d4 = h4.d.k;
        if(d0.equals(d4)) {
            int v = arr_b[0];
            PngDirectory pngDirectory3 = new PngDirectory(d4);
            pngDirectory3.setInt(10, v);
            c0.i(pngDirectory3);
            return;
        }
        if(d0.equals(h4.d.g)) {
            a a0 = new a(arr_b);
            PngChromaticitiesDirectory pngChromaticitiesDirectory0 = new PngChromaticitiesDirectory();
            pngChromaticitiesDirectory0.setInt(1, a0.a);
            pngChromaticitiesDirectory0.setInt(2, a0.b);
            pngChromaticitiesDirectory0.setInt(3, a0.c);
            pngChromaticitiesDirectory0.setInt(4, a0.d);
            pngChromaticitiesDirectory0.setInt(5, a0.e);
            pngChromaticitiesDirectory0.setInt(6, a0.f);
            pngChromaticitiesDirectory0.setInt(7, a0.g);
            pngChromaticitiesDirectory0.setInt(8, a0.h);
            c0.i(pngChromaticitiesDirectory0);
            return;
        }
        h4.d d5 = h4.d.h;
        if(d0.equals(d5)) {
            int v1 = arr_b[2] << 8 & 0xFF00 | (arr_b[0] << 24 & 0xFF000000 | arr_b[1] << 16 & 0xFF0000) | arr_b[3] & 0xFF;
            new l(0, arr_b).i();
            PngDirectory pngDirectory4 = new PngDirectory(d5);
            pngDirectory4.setDouble(11, ((double)v1) / 100000.0);
            c0.i(pngDirectory4);
            return;
        }
        h4.d d6 = h4.d.i;
        boolean z1 = d0.equals(d6);
        Charset charset0 = g.b;
        if(z1) {
            l l0 = new l(0, arr_b);
            byte[] arr_b1 = l0.o(80);
            PngDirectory pngDirectory5 = new PngDirectory(d6);
            pngDirectory5.setStringValue(12, new e(arr_b1, charset0));
            if(l0.a() == 0) {
                byte[] arr_b2 = l0.c(arr_b.length - (arr_b1.length + 2));
                try {
                    InflaterInputStream inflaterInputStream0 = new InflaterInputStream(new ByteArrayInputStream(arr_b2));
                    com.drew.metadata.jpeg.b.d(new j(inflaterInputStream0, 0), c0, pngDirectory5);
                    inflaterInputStream0.close();
                }
                catch(ZipException zipException0) {
                    pngDirectory5.addError("Exception decompressing PNG iCCP chunk : " + zipException0.getMessage());
                    c0.i(pngDirectory5);
                }
            }
            else {
                pngDirectory5.addError("Invalid compression method value");
            }
            c0.i(pngDirectory5);
            return;
        }
        h4.d d7 = h4.d.l;
        if(d0.equals(d7)) {
            PngDirectory pngDirectory6 = new PngDirectory(d7);
            pngDirectory6.setByteArray(15, arr_b);
            c0.i(pngDirectory6);
            return;
        }
        h4.d d8 = h4.d.r;
        if(d0.equals(d8)) {
            l l1 = new l(0, arr_b);
            byte[] arr_b3 = l1.o(80);
            if(charset0 == null) {
            label_90:
                s = new String(arr_b3);
            }
            else {
                try {
                    s = new String(arr_b3, charset0.name());
                    goto label_91;
                }
                catch(UnsupportedEncodingException unused_ex) {
                }
                goto label_90;
            }
        label_91:
            e e0 = new e(l1.o(arr_b.length - (arr_b3.length + 1)), charset0);
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(new h(s, e0));
            PngDirectory pngDirectory7 = new PngDirectory(d8);
            pngDirectory7.setObject(13, arrayList0);
            c0.i(pngDirectory7);
            return;
        }
        h4.d d9 = h4.d.s;
        if(d0.equals(d9)) {
            l l2 = new l(0, arr_b);
            byte[] arr_b4 = l2.o(80);
            if(charset0 == null) {
            label_105:
                s1 = new String(arr_b4);
            }
            else {
                try {
                    s1 = new String(arr_b4, charset0.name());
                    goto label_106;
                }
                catch(UnsupportedEncodingException unused_ex) {
                }
                goto label_105;
            }
        label_106:
            int v2 = l2.a();
            int v3 = arr_b.length - (arr_b4.length + 2);
            if(v2 == 0) {
                try {
                    InflaterInputStream inflaterInputStream1 = new InflaterInputStream(new ByteArrayInputStream(arr_b, arr_b.length - v3, v3));
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    byte[] arr_b5 = new byte[0x400];
                    int v4;
                    while((v4 = inflaterInputStream1.read(arr_b5)) != -1) {
                        byteArrayOutputStream0.write(arr_b5, 0, v4);
                    }
                    arr_b6 = byteArrayOutputStream0.toByteArray();
                }
                catch(ZipException zipException1) {
                    PngDirectory pngDirectory8 = new PngDirectory(h4.d.s);
                    pngDirectory8.addError("Exception decompressing PNG zTXt chunk with keyword \"" + s1 + "\": " + zipException1.getMessage());
                    c0.i(pngDirectory8);
                    arr_b6 = null;
                }
            }
            else {
                PngDirectory pngDirectory9 = new PngDirectory(d9);
                pngDirectory9.addError("Invalid compression method value");
                c0.i(pngDirectory9);
                arr_b6 = null;
            }
            if(arr_b6 != null) {
                if(s1.equals("XML:com.adobe.xmp")) {
                    L4.a.c(arr_b6, 0, arr_b6.length, c0, null);
                    return;
                }
                ArrayList arrayList1 = new ArrayList();
                arrayList1.add(new h(s1, new e(arr_b6, charset0)));
                PngDirectory pngDirectory10 = new PngDirectory(h4.d.s);
                pngDirectory10.setObject(13, arrayList1);
                c0.i(pngDirectory10);
            }
        }
        else {
            h4.d d10 = h4.d.p;
            if(d0.equals(d10)) {
                l l3 = new l(0, arr_b);
                Charset charset1 = g.c;
                byte[] arr_b7 = l3.o(80);
                if(charset1 == null) {
                label_146:
                    s2 = new String(arr_b7);
                }
                else {
                    try {
                        s2 = new String(arr_b7, charset1.name());
                        goto label_147;
                    }
                    catch(UnsupportedEncodingException unused_ex) {
                    }
                    goto label_146;
                }
            label_147:
                int v5 = l3.a();
                int v6 = l3.a();
                byte[] arr_b8 = l3.o(arr_b.length);
                byte[] arr_b9 = l3.o(arr_b.length);
                int v7 = arr_b.length - (arr_b7.length + 3 + arr_b8.length + 1 + arr_b9.length + 1);
                if(v5 == 0) {
                    arr_b10 = l3.o(v7);
                }
                else if(v5 != 1) {
                    PngDirectory pngDirectory13 = new PngDirectory(d10);
                    pngDirectory13.addError("Invalid compression flag value");
                    c0.i(pngDirectory13);
                    arr_b10 = null;
                }
                else if(v6 == 0) {
                    try {
                        InflaterInputStream inflaterInputStream2 = new InflaterInputStream(new ByteArrayInputStream(arr_b, arr_b.length - v7, v7));
                        ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
                        byte[] arr_b11 = new byte[0x400];
                        int v8;
                        while((v8 = inflaterInputStream2.read(arr_b11)) != -1) {
                            byteArrayOutputStream1.write(arr_b11, 0, v8);
                        }
                        arr_b10 = byteArrayOutputStream1.toByteArray();
                    }
                    catch(ZipException zipException2) {
                        PngDirectory pngDirectory11 = new PngDirectory(h4.d.p);
                        pngDirectory11.addError("Exception decompressing PNG iTXt chunk with keyword \"" + s2 + "\": " + zipException2.getMessage());
                        c0.i(pngDirectory11);
                        arr_b10 = null;
                    }
                }
                else {
                    PngDirectory pngDirectory12 = new PngDirectory(d10);
                    pngDirectory12.addError("Invalid compression method value");
                    c0.i(pngDirectory12);
                    arr_b10 = null;
                }
                if(arr_b10 != null) {
                    if(s2.equals("XML:com.adobe.xmp")) {
                        L4.a.c(arr_b10, 0, arr_b10.length, c0, null);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new h(s2, new e(arr_b10, charset1)));
                    PngDirectory pngDirectory14 = new PngDirectory(h4.d.p);
                    pngDirectory14.setObject(13, arrayList2);
                    c0.i(pngDirectory14);
                }
            }
            else {
                h4.d d11 = h4.d.o;
                if(d0.equals(d11)) {
                    l l4 = new l(0, arr_b);
                    int v9 = l4.x();
                    int v10 = l4.B();
                    int v11 = l4.B();
                    int v12 = l4.B();
                    int v13 = l4.B();
                    int v14 = l4.B();
                    PngDirectory pngDirectory15 = new PngDirectory(d11);
                    if(!l4.f.c(v9, v10 - 1, v11) || !l4.f.d(v12, v13, v14)) {
                        pngDirectory15.addError(String.format("PNG tIME data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", v9, v10, v11, v12, v13, v14));
                    }
                    else {
                        pngDirectory15.setString(14, String.format("%04d:%02d:%02d %02d:%02d:%02d", v9, v10, v11, v12, v13, v14));
                    }
                    c0.i(pngDirectory15);
                    return;
                }
                h4.d d12 = h4.d.n;
                if(d0.equals(d12)) {
                    l l5 = new l(0, arr_b);
                    int v15 = l5.i();
                    int v16 = l5.i();
                    int v17 = l5.a();
                    PngDirectory pngDirectory16 = new PngDirectory(d12);
                    pngDirectory16.setInt(16, v15);
                    pngDirectory16.setInt(17, v16);
                    pngDirectory16.setInt(18, v17);
                    c0.i(pngDirectory16);
                    return;
                }
                h4.d d13 = h4.d.j;
                if(d0.equals(d13)) {
                    PngDirectory pngDirectory17 = new PngDirectory(d13);
                    pngDirectory17.setByteArray(19, arr_b);
                    c0.i(pngDirectory17);
                    return;
                }
                if(d0.equals(h4.d.q)) {
                    try {
                        n0.h h0 = new n0.h(c0, null, 0);
                        i.J(new l4.b(0, arr_b), h0, 0);
                    }
                    catch(k4.b b1) {
                        PngDirectory pngDirectory18 = new PngDirectory(h4.d.q);
                        pngDirectory18.addError(b1.getMessage());
                        c0.i(pngDirectory18);
                    }
                    catch(IOException iOException0) {
                        PngDirectory pngDirectory19 = new PngDirectory(h4.d.q);
                        pngDirectory19.addError(iOException0.getMessage());
                        c0.i(pngDirectory19);
                    }
                }
            }
        }
    }
}

