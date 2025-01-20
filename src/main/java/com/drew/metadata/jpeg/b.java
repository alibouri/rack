package com.drew.metadata.jpeg;

import com.drew.metadata.ErrorDirectory;
import com.drew.metadata.adobe.AdobeJpegDirectory;
import com.drew.metadata.e;
import com.drew.metadata.icc.IccDirectory;
import com.drew.metadata.iptc.IptcDirectory;
import com.drew.metadata.jfif.JfifDirectory;
import com.drew.metadata.jfxx.JfxxDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import e4.c;
import e4.d;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l4.f;
import l4.i;
import l4.l;
import n0.h;

public final class b implements c {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // e4.c
    public final void a(List list0, U7.c c0, d d0) {
        int v;
        switch(this.a) {
            case 0: {
                for(Object object1: list0) {
                    JpegCommentDirectory jpegCommentDirectory0 = new JpegCommentDirectory();
                    c0.i(jpegCommentDirectory0);
                    jpegCommentDirectory0.setStringValue(0, new e(((byte[])object1), null));
                }
                return;
            }
            case 1: {
                for(Object object2: list0) {
                    l l0 = new l(0, ((byte[])object2));
                    HuffmanTablesDirectory huffmanTablesDirectory0 = (HuffmanTablesDirectory)c0.o(HuffmanTablesDirectory.class);
                    if(huffmanTablesDirectory0 == null) {
                        huffmanTablesDirectory0 = new HuffmanTablesDirectory();
                        c0.i(huffmanTablesDirectory0);
                    }
                    while(l0.b.length - l0.c > 0) {
                        try {
                            switch((l0.a() & 0xF0) >> 4) {
                                case 0: {
                                    v = 1;
                                    break;
                                }
                                case 1: {
                                    v = 2;
                                    break;
                                }
                                default: {
                                    v = 3;
                                }
                            }
                            byte[] arr_b1 = b.f(16, l0);
                            int v1 = arr_b1.length;
                            int v3 = 0;
                            for(int v2 = 0; v2 < v1; ++v2) {
                                v3 += arr_b1[v2] & 0xFF;
                            }
                            huffmanTablesDirectory0.getTables().add(new a(v, arr_b1, b.f(v3, l0)));
                            continue;
                        }
                        catch(IOException iOException1) {
                        }
                        huffmanTablesDirectory0.addError(iOException1.getMessage());
                        if(true) {
                            break;
                        }
                    }
                    huffmanTablesDirectory0.setInt(1, huffmanTablesDirectory0.getTables().size());
                }
                return;
            }
            case 2: {
                for(Object object3: list0) {
                    byte[] arr_b2 = (byte[])object3;
                    JpegDirectory jpegDirectory0 = (JpegDirectory)c0.o(JpegDirectory.class);
                    if(jpegDirectory0 == null) {
                        ErrorDirectory errorDirectory0 = new ErrorDirectory();
                        c0.i(errorDirectory0);
                        errorDirectory0.addError("DNL segment found without SOFx - illegal JPEG format");
                    }
                    else {
                        l l1 = new l(0, arr_b2);
                        try {
                            Integer integer0 = jpegDirectory0.getInteger(1);
                            if(integer0 != null && ((int)integer0) != 0) {
                                continue;
                            }
                            jpegDirectory0.setInt(1, l1.x());
                            continue;
                        }
                        catch(IOException iOException2) {
                        }
                        jpegDirectory0.addError(iOException2.getMessage());
                    }
                }
                return;
            }
            case 3: {
                for(Object object4: list0) {
                    JpegDirectory jpegDirectory1 = new JpegDirectory();
                    c0.i(jpegDirectory1);
                    jpegDirectory1.setInt(-3, d0.X + 0x40);
                    l l2 = new l(0, ((byte[])object4));
                    try {
                        jpegDirectory1.setInt(0, l2.B());
                        jpegDirectory1.setInt(1, l2.x());
                        jpegDirectory1.setInt(3, l2.x());
                        int v4 = l2.B();
                        jpegDirectory1.setInt(5, v4);
                        for(int v5 = 0; v5 < v4; ++v5) {
                            jpegDirectory1.setObject(v5 + 6, new com.drew.metadata.jpeg.c(l2.B(), l2.B(), l2.B()));
                        }
                    }
                    catch(IOException iOException3) {
                        jpegDirectory1.addError(iOException3.getMessage());
                    }
                }
                return;
            }
            case 4: {
                for(Object object5: list0) {
                    byte[] arr_b3 = (byte[])object5;
                    if(arr_b3.length == 12 && "Adobe".equalsIgnoreCase(new String(arr_b3, 0, 5))) {
                        l l3 = new l(0, arr_b3);
                        AdobeJpegDirectory adobeJpegDirectory0 = new AdobeJpegDirectory();
                        c0.i(adobeJpegDirectory0);
                        try {
                            l3.a = false;
                            if(!l3.s(5).equals("Adobe")) {
                                adobeJpegDirectory0.addError("Invalid Adobe JPEG data header.");
                                continue;
                            }
                            adobeJpegDirectory0.setInt(0, l3.x());
                            adobeJpegDirectory0.setInt(1, l3.x());
                            adobeJpegDirectory0.setInt(2, l3.x());
                            adobeJpegDirectory0.setInt(3, l3.a());
                            continue;
                        }
                        catch(IOException iOException4) {
                        }
                        adobeJpegDirectory0.addError("IO exception processing data: " + iOException4.getMessage());
                    }
                }
                return;
            }
            case 5: {
                for(Object object6: list0) {
                    byte[] arr_b4 = (byte[])object6;
                    if(arr_b4.length >= 6 && new String(arr_b4, 0, 6).equals("Exif\u0000\u0000")) {
                        b.c(new l4.b(0, arr_b4), c0, 6, null);
                    }
                }
                return;
            }
            case 6: {
                byte[] arr_b5 = null;
                for(Object object7: list0) {
                    byte[] arr_b6 = (byte[])object7;
                    if(arr_b6.length < 11 || !"ICC_PROFILE".equalsIgnoreCase(new String(arr_b6, 0, 11))) {
                    }
                    else if(arr_b5 == null) {
                        arr_b5 = new byte[arr_b6.length - 14];
                        System.arraycopy(arr_b6, 14, arr_b5, 0, arr_b6.length - 14);
                    }
                    else {
                        byte[] arr_b7 = new byte[arr_b5.length + arr_b6.length - 14];
                        System.arraycopy(arr_b5, 0, arr_b7, 0, arr_b5.length);
                        System.arraycopy(arr_b6, 14, arr_b7, arr_b5.length, arr_b6.length - 14);
                        arr_b5 = arr_b7;
                    }
                }
                if(arr_b5 != null) {
                    b.d(new l4.b(0, arr_b5), c0, null);
                }
                return;
            }
            case 7: {
                for(Object object8: list0) {
                    byte[] arr_b8 = (byte[])object8;
                    if(arr_b8.length != 0 && arr_b8[0] == 28) {
                        b.e(new l(0, arr_b8), c0, ((long)arr_b8.length), null);
                    }
                }
                return;
            }
            case 8: {
                for(Object object9: list0) {
                    byte[] arr_b9 = (byte[])object9;
                    if(arr_b9.length >= 4 && "JFIF".equals(new String(arr_b9, 0, 4))) {
                        l4.b b1 = new l4.b(0, arr_b9);
                        JfifDirectory jfifDirectory0 = new JfifDirectory();
                        c0.i(jfifDirectory0);
                        try {
                            jfifDirectory0.setInt(5, b1.y(5));
                            jfifDirectory0.setInt(7, b1.C(7));
                            jfifDirectory0.setInt(8, b1.y(8));
                            jfifDirectory0.setInt(10, b1.y(10));
                            jfifDirectory0.setInt(12, b1.C(12));
                            jfifDirectory0.setInt(13, b1.C(13));
                        }
                        catch(IOException iOException5) {
                            jfifDirectory0.addError(iOException5.getMessage());
                        }
                    }
                }
                return;
            }
            default: {
                for(Object object0: list0) {
                    byte[] arr_b = (byte[])object0;
                    if(arr_b.length >= 4 && "JFXX".equals(new String(arr_b, 0, 4))) {
                        l4.b b0 = new l4.b(0, arr_b);
                        JfxxDirectory jfxxDirectory0 = new JfxxDirectory();
                        c0.i(jfxxDirectory0);
                        try {
                            jfxxDirectory0.setInt(5, b0.C(5));
                        }
                        catch(IOException iOException0) {
                            jfxxDirectory0.addError(iOException0.getMessage());
                        }
                    }
                }
            }
        }
    }

    @Override  // e4.c
    public final List b() {
        switch(this.a) {
            case 0: {
                return Collections.singletonList(d.v0);
            }
            case 1: {
                return Collections.singletonList(d.h0);
            }
            case 2: {
                return Collections.singletonList(d.g0);
            }
            case 3: {
                return Arrays.asList(new d[]{d.i0, d.j0, d.k0, d.l0, d.m0, d.n0, d.o0, d.p0, d.q0, d.r0, d.s0, d.t0, d.u0});
            }
            case 4: {
                return Collections.singletonList(d.f0);
            }
            case 5: {
                return Collections.singletonList(d.b0);
            }
            case 6: {
                return Collections.singletonList(d.c0);
            }
            case 7: {
                return Collections.singletonList(d.e0);
            }
            case 8: {
                return Collections.singletonList(d.Z);
            }
            default: {
                return Collections.singletonList(d.Z);
            }
        }
    }

    public static void c(i i0, U7.c c0, int v, PhotoshopDirectory photoshopDirectory0) {
        h h0 = new h(c0, photoshopDirectory0, v);
        try {
            Q4.i.J(i0, h0, v);
        }
        catch(k4.b b0) {
            h0.f("Exception processing TIFF data: " + b0.getMessage());
        }
        catch(IOException iOException0) {
            h0.f("Exception processing TIFF data: " + iOException0.getMessage());
        }
    }

    public static void d(i i0, U7.c c0, com.drew.metadata.b b0) {
        int v = 0;
        IccDirectory iccDirectory0 = new IccDirectory();
        if(b0 != null) {
            iccDirectory0.setParent(b0);
        }
        try {
            iccDirectory0.setInt(0, i0.j(0));
            b.i(iccDirectory0, 4, i0);
            int v1 = i0.j(8);
            if(v1 != 0) {
                iccDirectory0.setInt(8, v1);
            }
            b.i(iccDirectory0, 12, i0);
            b.i(iccDirectory0, 16, i0);
            b.i(iccDirectory0, 20, i0);
            b.j(iccDirectory0, i0);
            b.i(iccDirectory0, 36, i0);
            b.i(iccDirectory0, 40, i0);
            int v2 = i0.j(44);
            if(v2 != 0) {
                iccDirectory0.setInt(44, v2);
            }
            b.i(iccDirectory0, 0x30, i0);
            int v3 = i0.j(52);
            if(v3 != 0) {
                if(v3 <= 0x20202020) {
                    iccDirectory0.setInt(52, v3);
                }
                else {
                    iccDirectory0.setString(52, b.g(v3));
                }
            }
            int v4 = i0.j(0x40);
            if(v4 != 0) {
                iccDirectory0.setInt(0x40, v4);
            }
            long v5 = i0.l(56);
            if(v5 != 0L) {
                iccDirectory0.setLong(56, v5);
            }
            iccDirectory0.setObject(68, new float[]{i0.r(68), i0.r(72), i0.r(76)});
            int v6 = i0.j(0x80);
            iccDirectory0.setInt(0x80, v6);
            while(true) {
                if(v >= v6) {
                    goto label_41;
                }
                iccDirectory0.setByteArray(i0.j(v * 12 + 0x84), i0.d(i0.j(v * 12 + 0x88), i0.j(v * 12 + 140)));
                ++v;
            }
        }
        catch(IOException iOException0) {
        }
        iccDirectory0.addError("Exception reading ICC profile: " + iOException0.getMessage());
    label_41:
        c0.i(iccDirectory0);
    }

    public static void e(l l0, U7.c c0, long v, com.drew.metadata.b b0) {
        int v6;
        int v5;
        int v4;
        int v3;
        int v2;
        IptcDirectory iptcDirectory0 = new IptcDirectory();
        c0.i(iptcDirectory0);
        if(b0 != null) {
            iptcDirectory0.setParent(b0);
        }
        int v1 = 0;
        while(((long)v1) < v) {
            try {
                v2 = l0.B();
                v3 = v1 + 1;
            }
            catch(IOException unused_ex) {
                iptcDirectory0.addError("Unable to read starting byte of IPTC tag");
                return;
            }
            if(v2 != 28) {
                if(((long)v3) != v) {
                    StringBuilder stringBuilder0 = m5.b.A(v1, "Invalid IPTC tag marker at offset ", ". Expected \'0x");
                    stringBuilder0.append(Integer.toHexString(28));
                    stringBuilder0.append("\' but got \'0x");
                    stringBuilder0.append(Integer.toHexString(v2));
                    stringBuilder0.append("\'.");
                    iptcDirectory0.addError(stringBuilder0.toString());
                }
                return;
            }
            if(((long)(v1 + 5)) > v) {
                iptcDirectory0.addError("Too few bytes remain for a valid IPTC tag");
                return;
            }
            try {
                v4 = l0.B();
                v5 = l0.B();
                v6 = l0.x();
                if(v6 > 0x7FFF) {
                    v6 = l0.x() | (v6 & 0x7FFF) << 16;
                    v3 = v1 + 3;
                }
            }
            catch(IOException unused_ex) {
                iptcDirectory0.addError("IPTC data segment ended mid-way through tag descriptor");
                return;
            }
            v1 = v3 + 4 + v6;
            if(((long)v1) > v) {
                iptcDirectory0.addError("Data for tag extends beyond end of IPTC segment");
                return;
            }
            try {
                b.h(l0, iptcDirectory0, v4, v5, v6);
            }
            catch(IOException unused_ex) {
                iptcDirectory0.addError("Error processing IPTC tag");
                return;
            }
        }
    }

    public static byte[] f(int v, l l0) {
        d d0;
        byte[] arr_b = new byte[v];
        for(int v2 = 0; v2 < v; ++v2) {
            byte b = l0.a();
            if((b & 0xFF) == 0xFF) {
                int v3 = l0.a();
                if(v3 != 0) {
                    StringBuilder stringBuilder0 = new StringBuilder("Marker ");
                    d[] arr_d = (d[])d.class.getEnumConstants();
                    for(int v1 = 0; true; ++v1) {
                        d0 = null;
                        if(v1 >= arr_d.length) {
                            break;
                        }
                        d d1 = arr_d[v1];
                        if(d1.X == v3) {
                            d0 = d1;
                            break;
                        }
                    }
                    stringBuilder0.append(d0);
                    stringBuilder0.append(" found inside DHT segment");
                    throw new IOException(stringBuilder0.toString());
                }
            }
            arr_b[v2] = b;
        }
        return arr_b;
    }

    public static String g(int v) {
        return new String(new byte[]{((byte)((0xFF000000 & v) >> 24)), ((byte)((0xFF0000 & v) >> 16)), ((byte)((0xFF00 & v) >> 8)), ((byte)(v & 0xFF))});
    }

    public static void h(l l0, IptcDirectory iptcDirectory0, int v, int v1, int v2) {
        e[] arr_e1;
        e e0;
        Charset charset1;
        String s = "ISO-8859-1";
        int v3 = v << 8 | v1;
        if(v2 == 0) {
            iptcDirectory0.setString(v3, "");
            return;
        }
        if(v3 == 0x100) {
        label_21:
            if(v2 >= 2) {
                int v4 = l0.x();
                l0.D(((long)(v2 - 2)));
                iptcDirectory0.setInt(v3, v4);
                return;
            }
        }
        else {
            switch(v3) {
                case 346: {
                    byte[] arr_b = l0.c(v2);
                    if(arr_b.length > 2 && arr_b[0] == 27 && arr_b[1] == 37 && arr_b[2] == 71) {
                        s = "UTF-8";
                    }
                    else if((arr_b.length <= 2 || arr_b[0] != 27 || arr_b[1] != 46 || arr_b[2] != 65) && (arr_b.length <= 3 || arr_b[0] != 27 || (arr_b[3] & 0xFF | (arr_b[2] & 0xFF) << 8 | (arr_b[1] & 0xFF) << 16) != 0xE280A2 || arr_b[4] != 65) && (arr_b.length <= 2 || arr_b[0] != 27 || arr_b[1] != 45 || arr_b[2] != 65)) {
                        s = null;
                    }
                    if(s == null) {
                        s = new String(arr_b);
                    }
                    iptcDirectory0.setString(346, s);
                    return;
                }
                case 0x20A: {
                    iptcDirectory0.setInt(0x20A, l0.B());
                    l0.D(((long)(v2 - 1)));
                    return;
                }
                case 278: 
                case 378: 
                case 0x200: 
                case 582: {
                    goto label_21;
                }
            }
        }
        String s1 = iptcDirectory0.getString(346);
        Charset charset0 = null;
        if(s1 != null) {
            try {
                charset0 = Charset.forName(s1);
            }
            catch(Throwable unused_ex) {
            }
        }
        if(s1 == null) {
            byte[] arr_b1 = l0.c(v2);
            String[] arr_s = {"UTF-8", System.getProperty("file.encoding"), "ISO-8859-1"};
            int v5 = 0;
            while(true) {
                charset1 = Charset.forName(arr_s[v5]);
                CharsetDecoder charsetDecoder0 = charset1.newDecoder();
                try {
                    charsetDecoder0.decode(ByteBuffer.wrap(arr_b1));
                    break;
                }
                catch(CharacterCodingException unused_ex) {
                    ++v5;
                }
            }
            e0 = new e(arr_b1, charset1);
        }
        else {
            e0 = l0.w(v2, charset0);
        }
        if(iptcDirectory0.containsTag(v3)) {
            e[] arr_e = iptcDirectory0.getStringValueArray(v3);
            if(arr_e == null) {
                arr_e1 = new e[1];
            }
            else {
                e[] arr_e2 = new e[arr_e.length + 1];
                System.arraycopy(arr_e, 0, arr_e2, 0, arr_e.length);
                arr_e1 = arr_e2;
            }
            arr_e1[arr_e1.length - 1] = e0;
            iptcDirectory0.setStringValueArray(v3, arr_e1);
            return;
        }
        iptcDirectory0.setStringValue(v3, e0);
    }

    public static void i(IccDirectory iccDirectory0, int v, i i0) {
        int v1 = i0.j(v);
        if(v1 != 0) {
            iccDirectory0.setString(v, b.g(v1));
        }
    }

    public static void j(IccDirectory iccDirectory0, i i0) {
        int v = i0.y(24);
        int v1 = i0.y(26);
        int v2 = i0.y(28);
        int v3 = i0.y(30);
        int v4 = i0.y(0x20);
        int v5 = i0.y(34);
        if(f.c(v, v1 - 1, v2) && f.d(v3, v4, v5)) {
            iccDirectory0.setString(24, String.format("%04d:%02d:%02d %02d:%02d:%02d", v, v1, v2, v3, v4, v5));
            return;
        }
        iccDirectory0.addError(String.format("ICC data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", v, v1, v2, v3, v4, v5));
    }
}

