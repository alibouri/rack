package n2;

import M.J;
import R9.x1;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build.VERSION;
import android.util.Log;
import j6.v;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import jeb.synthetic.TWR;
import m5.b;

public abstract class d {
    public static final v a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;

    static {
        d.a = new v(28);
        d.b = new byte[]{0x70, 0x72, 0x6F, 0};
        d.c = new byte[]{0x70, 0x72, 109, 0};
        d.d = new byte[]{0x30, 49, 53, 0};
        d.e = new byte[]{0x30, 49, 0x30, 0};
        d.f = new byte[]{0x30, 0x30, 57, 0};
        d.g = new byte[]{0x30, 0x30, 53, 0};
        d.h = new byte[]{0x30, 0x30, 49, 0};
        d.i = new byte[]{0x30, 0x30, 49, 0};
        d.j = new byte[]{0x30, 0x30, 50, 0};
    }

    public static byte[] a(byte[] arr_b) {
        Deflater deflater0 = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        try(DeflaterOutputStream deflaterOutputStream0 = new DeflaterOutputStream(byteArrayOutputStream0, deflater0)) {
            deflaterOutputStream0.write(arr_b);
        }
        finally {
            deflater0.end();
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static byte[] b(a[] arr_a, byte[] arr_b) {
        int v = 0;
        int v2 = 0;
        for(int v1 = 0; v1 < arr_a.length; ++v1) {
            a a0 = arr_a[v1];
            byte[] arr_b1 = d.d(a0.a, a0.b, arr_b).getBytes(StandardCharsets.UTF_8);
            v2 += (a0.g * 2 + 7 & -8) / 8 + (a0.e * 2 + (arr_b1.length + 16) + a0.f);
        }
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(v2);
        if(Arrays.equals(arr_b, d.f)) {
            while(v < arr_a.length) {
                a a1 = arr_a[v];
                d.q(byteArrayOutputStream0, a1, d.d(a1.a, a1.b, arr_b));
                d.p(byteArrayOutputStream0, a1);
                ++v;
            }
        }
        else {
            for(int v3 = 0; v3 < arr_a.length; ++v3) {
                a a2 = arr_a[v3];
                d.q(byteArrayOutputStream0, a2, d.d(a2.a, a2.b, arr_b));
            }
            while(v < arr_a.length) {
                d.p(byteArrayOutputStream0, arr_a[v]);
                ++v;
            }
        }
        if(byteArrayOutputStream0.size() != v2) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream0.size() + " expected=" + v2);
        }
        return byteArrayOutputStream0.toByteArray();
    }

    public static boolean c(File file0) {
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                return false;
            }
            boolean z = true;
            for(int v = 0; v < arr_file.length; ++v) {
                z = d.c(arr_file[v]) && z;
            }
            return z;
        }
        file0.delete();
        return true;
    }

    public static String d(String s, String s1, byte[] arr_b) {
        String s2;
        byte[] arr_b1 = d.h;
        boolean z = Arrays.equals(arr_b, arr_b1);
        byte[] arr_b2 = d.g;
        if(z) {
            s2 = ":";
        }
        else if(!Arrays.equals(arr_b, arr_b2)) {
            s2 = "!";
        }
        else {
            s2 = ":";
        }
        if(s.length() <= 0) {
            if("!".equals(s2)) {
                return s1.replace(":", "!");
            }
            return ":".equals(s2) ? s1.replace("!", ":") : s1;
        }
        if(s1.equals("classes.dex")) {
            return s;
        }
        if(!s1.contains("!") && !s1.contains(":")) {
            if(s1.endsWith(".apk")) {
                return s1;
            }
            StringBuilder stringBuilder0 = J.i(s);
            if(Arrays.equals(arr_b, arr_b1)) {
                return b.y(stringBuilder0, ":", s1);
            }
            return Arrays.equals(arr_b, arr_b2) ? b.y(stringBuilder0, ":", s1) : b.y(stringBuilder0, "!", s1);
        }
        if("!".equals(s2)) {
            return s1.replace(":", "!");
        }
        return ":".equals(s2) ? s1.replace("!", ":") : s1;
    }

    public static void e(PackageInfo packageInfo0, File file0) {
        File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try(DataOutputStream dataOutputStream0 = new DataOutputStream(new FileOutputStream(file1))) {
            dataOutputStream0.writeLong(packageInfo0.lastUpdateTime);
        }
        catch(IOException unused_ex) {
        }
    }

    public static byte[] f(InputStream inputStream0, int v) {
        byte[] arr_b = new byte[v];
        for(int v1 = 0; v1 < v; v1 += v2) {
            int v2 = inputStream0.read(arr_b, v1, v - v1);
            if(v2 < 0) {
                throw new IllegalStateException("Not enough bytes to read: " + v);
            }
        }
        return arr_b;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream0, int v) {
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += (int)d.m(byteArrayInputStream0, 2);
            arr_v[v1] = v2;
        }
        return arr_v;
    }

    public static byte[] h(FileInputStream fileInputStream0, int v, int v1) {
        int v3;
        Inflater inflater0 = new Inflater();
        try {
            byte[] arr_b = new byte[v1];
            byte[] arr_b1 = new byte[0x800];
            v3 = 0;
            int v4 = 0;
            while(!inflater0.finished() && !inflater0.needsDictionary() && v3 < v) {
                int v5 = fileInputStream0.read(arr_b1);
                if(v5 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + v + " bytes");
                }
                inflater0.setInput(arr_b1, 0, v5);
                try {
                    v4 += inflater0.inflate(arr_b, v4, v1 - v4);
                    v3 += v5;
                }
                catch(DataFormatException dataFormatException0) {
                    throw new IllegalStateException(dataFormatException0.getMessage());
                }
            }
            if(v3 == v) {
                if(!inflater0.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                return arr_b;
            }
        }
        finally {
            inflater0.end();
        }
        throw new IllegalStateException("Didn\'t read enough bytes during decompression. expected=" + v + " actual=" + v3);
    }

    public static a[] i(FileInputStream fileInputStream0, byte[] arr_b, byte[] arr_b1, a[] arr_a) {
        byte[] arr_b2 = d.i;
        if(Arrays.equals(arr_b, arr_b2)) {
            if(Arrays.equals(d.d, arr_b1)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            if(!Arrays.equals(arr_b, arr_b2)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int v = (int)d.m(fileInputStream0, 1);
            long v1 = d.m(fileInputStream0, 4);
            byte[] arr_b3 = d.h(fileInputStream0, ((int)d.m(fileInputStream0, 4)), ((int)v1));
            if(fileInputStream0.read() <= 0) {
                try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b3)) {
                    return d.j(byteArrayInputStream0, v, arr_a);
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        if(!Arrays.equals(arr_b, d.j)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int v2 = (int)d.m(fileInputStream0, 2);
        long v3 = d.m(fileInputStream0, 4);
        byte[] arr_b4 = d.h(fileInputStream0, ((int)d.m(fileInputStream0, 4)), ((int)v3));
        if(fileInputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr_b4)) {
                return d.k(byteArrayInputStream1, arr_b1, v2, arr_a);
            }
        }
        throw new IllegalStateException("Content found after the end of file");
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream0, int v, a[] arr_a) {
        if(byteArrayInputStream0.available() == 0) {
            return new a[0];
        }
        if(v != arr_a.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] arr_s = new String[v];
        int[] arr_v = new int[v];
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = (int)d.m(byteArrayInputStream0, 2);
            arr_v[v2] = (int)d.m(byteArrayInputStream0, 2);
            arr_s[v2] = new String(d.f(byteArrayInputStream0, v3), StandardCharsets.UTF_8);
        }
        for(int v1 = 0; v1 < v; ++v1) {
            a a0 = arr_a[v1];
            if(!a0.b.equals(arr_s[v1])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int v4 = arr_v[v1];
            a0.e = v4;
            a0.h = d.g(byteArrayInputStream0, v4);
        }
        return arr_a;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream0, byte[] arr_b, int v, a[] arr_a) {
        if(byteArrayInputStream0.available() == 0) {
            return new a[0];
        }
        if(v != arr_a.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for(int v1 = 0; v1 < v; ++v1) {
            d.m(byteArrayInputStream0, 2);
            String s = new String(d.f(byteArrayInputStream0, ((int)d.m(byteArrayInputStream0, 2))), StandardCharsets.UTF_8);
            long v2 = d.m(byteArrayInputStream0, 4);
            int v3 = (int)d.m(byteArrayInputStream0, 2);
            a a0 = null;
            if(arr_a.length > 0) {
                int v4 = s.indexOf("!") >= 0 ? s.indexOf("!") : s.indexOf(":");
                String s1 = v4 <= 0 ? s : s.substring(v4 + 1);
                for(int v5 = 0; v5 < arr_a.length; ++v5) {
                    if(arr_a[v5].b.equals(s1)) {
                        a0 = arr_a[v5];
                        break;
                    }
                }
            }
            if(a0 == null) {
                throw new IllegalStateException("Missing profile key: " + s);
            }
            a0.d = v2;
            int[] arr_v = d.g(byteArrayInputStream0, v3);
            if(Arrays.equals(arr_b, d.h)) {
                a0.e = v3;
                a0.h = arr_v;
            }
        }
        return arr_a;
    }

    public static a[] l(FileInputStream fileInputStream0, byte[] arr_b, String s) {
        if(!Arrays.equals(arr_b, d.e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int v = (int)d.m(fileInputStream0, 1);
        long v1 = d.m(fileInputStream0, 4);
        byte[] arr_b1 = d.h(fileInputStream0, ((int)d.m(fileInputStream0, 4)), ((int)v1));
        if(fileInputStream0.read() <= 0) {
            try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b1)) {
                return d.n(byteArrayInputStream0, s, v);
            }
        }
        throw new IllegalStateException("Content found after the end of file");
    }

    public static long m(InputStream inputStream0, int v) {
        byte[] arr_b = d.f(inputStream0, v);
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += ((long)(arr_b[v2] & 0xFF)) << v2 * 8;
        }
        return v1;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream0, String s, int v) {
        TreeMap treeMap1;
        if(byteArrayInputStream0.available() == 0) {
            return new a[0];
        }
        a[] arr_a = new a[v];
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = (int)d.m(byteArrayInputStream0, 2);
            int v3 = (int)d.m(byteArrayInputStream0, 2);
            long v4 = d.m(byteArrayInputStream0, 4);
            long v5 = d.m(byteArrayInputStream0, 4);
            long v6 = d.m(byteArrayInputStream0, 4);
            String s1 = new String(d.f(byteArrayInputStream0, v2), StandardCharsets.UTF_8);
            TreeMap treeMap0 = new TreeMap();
            arr_a[v1] = new a(s, s1, v5, v3, ((int)v4), ((int)v6), new int[v3], treeMap0);
        }
        for(int v7 = 0; v7 < v; ++v7) {
            a a0 = arr_a[v7];
            int v8 = byteArrayInputStream0.available() - a0.f;
            int v9 = 0;
            while(true) {
                int v10 = byteArrayInputStream0.available();
                treeMap1 = a0.i;
                if(v10 <= v8) {
                    break;
                }
                v9 += (int)d.m(byteArrayInputStream0, 2);
                treeMap1.put(v9, 1);
                for(int v11 = (int)d.m(byteArrayInputStream0, 2); v11 > 0; --v11) {
                    d.m(byteArrayInputStream0, 2);
                    int v12 = (int)d.m(byteArrayInputStream0, 1);
                    if(v12 != 6 && v12 != 7) {
                        while(v12 > 0) {
                            d.m(byteArrayInputStream0, 1);
                            for(int v13 = (int)d.m(byteArrayInputStream0, 1); v13 > 0; --v13) {
                                d.m(byteArrayInputStream0, 2);
                            }
                            --v12;
                        }
                    }
                }
            }
            if(byteArrayInputStream0.available() != v8) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            a0.h = d.g(byteArrayInputStream0, a0.e);
            int v14 = a0.g;
            BitSet bitSet0 = BitSet.valueOf(d.f(byteArrayInputStream0, (v14 * 2 + 7 & -8) / 8));
            for(int v15 = 0; v15 < v14; ++v15) {
                int v16 = bitSet0.get(v15) ? 2 : 0;
                if(bitSet0.get(v15 + v14)) {
                    v16 |= 4;
                }
                if(v16 != 0) {
                    Integer integer0 = (Integer)treeMap1.get(v15);
                    if(integer0 == null) {
                        integer0 = 0;
                    }
                    treeMap1.put(v15, ((int)(v16 | ((int)integer0))));
                }
            }
        }
        return arr_a;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream0, byte[] arr_b, a[] arr_a) {
        int v14;
        ArrayList arrayList3;
        long v13;
        i i2;
        ArrayList arrayList2;
        byte[] arr_b6;
        byte[] arr_b5;
        i i1;
        i i0;
        ArrayList arrayList1;
        ArrayList arrayList0;
        byte[] arr_b1 = d.d;
        if(Arrays.equals(arr_b, arr_b1)) {
            arrayList0 = new ArrayList(3);
            arrayList1 = new ArrayList(3);
            try(ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream()) {
                d.v(byteArrayOutputStream1, arr_a.length);
                int v2 = 2;
                for(int v1 = 0; true; ++v1) {
                    if(v1 >= arr_a.length) {
                        break;
                    }
                    a a0 = arr_a[v1];
                    d.u(byteArrayOutputStream1, a0.c, 4);
                    d.u(byteArrayOutputStream1, a0.d, 4);
                    d.u(byteArrayOutputStream1, ((long)a0.g), 4);
                    String s = d.d(a0.a, a0.b, arr_b1);
                    Charset charset0 = StandardCharsets.UTF_8;
                    byte[] arr_b2 = s.getBytes(charset0);
                    d.v(byteArrayOutputStream1, arr_b2.length);
                    v2 = v2 + 14 + arr_b2.length;
                    byteArrayOutputStream1.write(s.getBytes(charset0));
                }
                byte[] arr_b3 = byteArrayOutputStream1.toByteArray();
                if(v2 != arr_b3.length) {
                    throw new IllegalStateException("Expected size " + v2 + ", does not match actual size " + arr_b3.length);
                }
                i0 = new i(1, arr_b3, false);
            }
            arrayList0.add(i0);
            try(ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream()) {
                int v3 = 0;
                int v4 = 0;
                for(int v = 0; true; v = 0) {
                    if(v3 >= arr_a.length) {
                        break;
                    }
                    a a1 = arr_a[v3];
                    d.v(byteArrayOutputStream2, v3);
                    d.v(byteArrayOutputStream2, a1.e);
                    v4 = v4 + 4 + a1.e * 2;
                    int[] arr_v = a1.h;
                    for(int v5 = 0; true; v5 = v6) {
                        if(v >= arr_v.length) {
                            break;
                        }
                        int v6 = arr_v[v];
                        d.v(byteArrayOutputStream2, v6 - v5);
                        ++v;
                    }
                    ++v3;
                }
                byte[] arr_b4 = byteArrayOutputStream2.toByteArray();
                if(v4 != arr_b4.length) {
                    throw new IllegalStateException("Expected size " + v4 + ", does not match actual size " + arr_b4.length);
                }
                i1 = new i(3, arr_b4, true);
            }
            arrayList0.add(i1);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int v7 = 0;
            int v8 = 0;
            try {
                while(v7 < arr_a.length) {
                    a a2 = arr_a[v7];
                    int v9 = 0;
                    for(Object object0: a2.i.entrySet()) {
                        v9 |= (int)(((Integer)((Map.Entry)object0).getValue()));
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        d.r(byteArrayOutputStream4, v9, a2);
                        arr_b5 = byteArrayOutputStream4.toByteArray();
                    }
                    catch(Throwable throwable3) {
                        TWR.safeClose$NT(byteArrayOutputStream4, throwable3);
                        throw throwable3;
                    }
                    byteArrayOutputStream4.close();
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        d.s(byteArrayOutputStream5, a2);
                        arr_b6 = byteArrayOutputStream5.toByteArray();
                    }
                    catch(Throwable throwable4) {
                        TWR.safeClose$NT(byteArrayOutputStream5, throwable4);
                        throw throwable4;
                    }
                    byteArrayOutputStream5.close();
                    d.v(byteArrayOutputStream3, v7);
                    int v10 = arr_b5.length + 2 + arr_b6.length;
                    d.u(byteArrayOutputStream3, ((long)v10), 4);
                    d.v(byteArrayOutputStream3, v9);
                    byteArrayOutputStream3.write(arr_b5);
                    byteArrayOutputStream3.write(arr_b6);
                    v8 = v8 + 6 + v10;
                    ++v7;
                    arrayList1 = arrayList1;
                }
                arrayList2 = arrayList1;
                byte[] arr_b7 = byteArrayOutputStream3.toByteArray();
                if(v8 != arr_b7.length) {
                    throw new IllegalStateException("Expected size " + v8 + ", does not match actual size " + arr_b7.length);
                }
                i2 = new i(4, arr_b7, true);
            }
            catch(Throwable throwable2) {
                TWR.safeClose$NT(byteArrayOutputStream3, throwable2);
                throw throwable2;
            }
            byteArrayOutputStream3.close();
            arrayList0.add(i2);
            long v11 = 12L + ((long)(arrayList0.size() * 16));
            d.u(byteArrayOutputStream0, ((long)arrayList0.size()), 4);
            int v12 = 0;
            while(v12 < arrayList0.size()) {
                i i3 = (i)arrayList0.get(v12);
                switch(i3.a) {
                    case 1: {
                        v13 = 0L;
                        break;
                    }
                    case 2: {
                        v13 = 1L;
                        break;
                    }
                    case 3: {
                        v13 = 2L;
                        break;
                    }
                    case 4: {
                        v13 = 3L;
                        break;
                    }
                    case 5: {
                        v13 = 4L;
                        break;
                    }
                    default: {
                        throw null;
                    }
                }
                d.u(byteArrayOutputStream0, v13, 4);
                d.u(byteArrayOutputStream0, v11, 4);
                byte[] arr_b8 = i3.b;
                if(i3.c) {
                    byte[] arr_b9 = d.a(arr_b8);
                    arrayList3 = arrayList2;
                    arrayList3.add(arr_b9);
                    d.u(byteArrayOutputStream0, ((long)arr_b9.length), 4);
                    d.u(byteArrayOutputStream0, ((long)arr_b8.length), 4);
                    v14 = arr_b9.length;
                }
                else {
                    arrayList3 = arrayList2;
                    arrayList3.add(arr_b8);
                    d.u(byteArrayOutputStream0, ((long)arr_b8.length), 4);
                    d.u(byteArrayOutputStream0, 0L, 4);
                    v14 = arr_b8.length;
                }
                v11 += (long)v14;
                ++v12;
                arrayList2 = arrayList3;
            }
            for(int v15 = 0; v15 < arrayList2.size(); ++v15) {
                byteArrayOutputStream0.write(((byte[])arrayList2.get(v15)));
            }
            return true;
        }
        byte[] arr_b10 = d.e;
        if(Arrays.equals(arr_b, arr_b10)) {
            byte[] arr_b11 = d.b(arr_a, arr_b10);
            d.u(byteArrayOutputStream0, ((long)arr_a.length), 1);
            d.u(byteArrayOutputStream0, ((long)arr_b11.length), 4);
            byte[] arr_b12 = d.a(arr_b11);
            d.u(byteArrayOutputStream0, ((long)arr_b12.length), 4);
            byteArrayOutputStream0.write(arr_b12);
            return true;
        }
        byte[] arr_b13 = d.g;
        if(Arrays.equals(arr_b, arr_b13)) {
            d.u(byteArrayOutputStream0, ((long)arr_a.length), 1);
            for(int v16 = 0; v16 < arr_a.length; ++v16) {
                a a3 = arr_a[v16];
                String s1 = d.d(a3.a, a3.b, arr_b13);
                Charset charset1 = StandardCharsets.UTF_8;
                d.v(byteArrayOutputStream0, s1.getBytes(charset1).length);
                d.v(byteArrayOutputStream0, a3.h.length);
                d.u(byteArrayOutputStream0, ((long)(a3.i.size() * 4)), 4);
                d.u(byteArrayOutputStream0, a3.c, 4);
                byteArrayOutputStream0.write(s1.getBytes(charset1));
                for(Object object1: a3.i.keySet()) {
                    d.v(byteArrayOutputStream0, ((int)(((Integer)object1))));
                    d.v(byteArrayOutputStream0, 0);
                }
                int[] arr_v1 = a3.h;
                for(int v17 = 0; v17 < arr_v1.length; ++v17) {
                    d.v(byteArrayOutputStream0, arr_v1[v17]);
                }
            }
            return true;
        }
        byte[] arr_b14 = d.f;
        if(Arrays.equals(arr_b, arr_b14)) {
            byte[] arr_b15 = d.b(arr_a, arr_b14);
            d.u(byteArrayOutputStream0, ((long)arr_a.length), 1);
            d.u(byteArrayOutputStream0, ((long)arr_b15.length), 4);
            byte[] arr_b16 = d.a(arr_b15);
            d.u(byteArrayOutputStream0, ((long)arr_b16.length), 4);
            byteArrayOutputStream0.write(arr_b16);
            return true;
        }
        byte[] arr_b17 = d.h;
        if(Arrays.equals(arr_b, arr_b17)) {
            d.v(byteArrayOutputStream0, arr_a.length);
            for(int v18 = 0; v18 < arr_a.length; ++v18) {
                a a4 = arr_a[v18];
                String s2 = d.d(a4.a, a4.b, arr_b17);
                Charset charset2 = StandardCharsets.UTF_8;
                d.v(byteArrayOutputStream0, s2.getBytes(charset2).length);
                d.v(byteArrayOutputStream0, a4.i.size());
                d.v(byteArrayOutputStream0, a4.h.length);
                d.u(byteArrayOutputStream0, a4.c, 4);
                byteArrayOutputStream0.write(s2.getBytes(charset2));
                for(Object object2: a4.i.keySet()) {
                    d.v(byteArrayOutputStream0, ((int)(((Integer)object2))));
                }
                int[] arr_v2 = a4.h;
                for(int v19 = 0; v19 < arr_v2.length; ++v19) {
                    d.v(byteArrayOutputStream0, arr_v2[v19]);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream0, a a0) {
        d.s(byteArrayOutputStream0, a0);
        int[] arr_v = a0.h;
        int v = 0;
        for(int v1 = 0; v < arr_v.length; v1 = v2) {
            int v2 = arr_v[v];
            d.v(byteArrayOutputStream0, v2 - v1);
            ++v;
        }
        int v3 = a0.g;
        byte[] arr_b = new byte[(v3 * 2 + 7 & -8) / 8];
        for(Object object0: a0.i.entrySet()) {
            int v4 = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v5 = (int)(((Integer)((Map.Entry)object0).getValue()));
            if((v5 & 2) != 0) {
                arr_b[v4 / 8] = (byte)(arr_b[v4 / 8] | 1 << v4 % 8);
            }
            if((v5 & 4) != 0) {
                int v6 = v4 + v3;
                arr_b[v6 / 8] = (byte)(1 << v6 % 8 | arr_b[v6 / 8]);
            }
        }
        byteArrayOutputStream0.write(arr_b);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream0, a a0, String s) {
        Charset charset0 = StandardCharsets.UTF_8;
        d.v(byteArrayOutputStream0, s.getBytes(charset0).length);
        d.v(byteArrayOutputStream0, a0.e);
        d.u(byteArrayOutputStream0, ((long)a0.f), 4);
        d.u(byteArrayOutputStream0, a0.c, 4);
        d.u(byteArrayOutputStream0, ((long)a0.g), 4);
        byteArrayOutputStream0.write(s.getBytes(charset0));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream0, int v, a a0) {
        int v1 = a0.g;
        byte[] arr_b = new byte[(Integer.bitCount(v & -2) * v1 + 7 & -8) / 8];
        for(Object object0: a0.i.entrySet()) {
            int v2 = (int)(((Integer)((Map.Entry)object0).getKey()));
            int v3 = (int)(((Integer)((Map.Entry)object0).getValue()));
            int v4 = 0;
            for(int v5 = 1; v5 <= 4; v5 <<= 1) {
                if(v5 != 1 && (v5 & v) != 0) {
                    if((v5 & v3) == v5) {
                        int v6 = v4 * v1 + v2;
                        arr_b[v6 / 8] = (byte)(1 << v6 % 8 | arr_b[v6 / 8]);
                    }
                    ++v4;
                }
            }
        }
        byteArrayOutputStream0.write(arr_b);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream0, a a0) {
        int v = 0;
        for(Object object0: a0.i.entrySet()) {
            int v1 = (int)(((Integer)((Map.Entry)object0).getKey()));
            if((((int)(((Integer)((Map.Entry)object0).getValue()))) & 1) != 0) {
                d.v(byteArrayOutputStream0, v1 - v);
                d.v(byteArrayOutputStream0, 0);
                v = v1;
            }
        }
    }

    public static void t(Context context0, Executor executor0, c c0, boolean z) {
        x1 x11;
        IOException iOException3;
        a[] arr_a;
        FileInputStream fileInputStream0;
        byte[] arr_b1;
        boolean z2;
        PackageInfo packageInfo0;
        Context context1 = context0.getApplicationContext();
        ApplicationInfo applicationInfo0 = context1.getApplicationInfo();
        AssetManager assetManager0 = context1.getAssets();
        String s = new File(applicationInfo0.sourceDir).getName();
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            packageInfo0 = packageManager0.getPackageInfo("com.wave.personal", 0);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            c0.c(7, packageManager$NameNotFoundException0);
            h.c(context0, false);
            return;
        }
        File file0 = context0.getFilesDir();
        if(!z) {
            File file1 = new File(file0, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
            boolean z1 = false;
            if(file1.exists()) {
                try(DataInputStream dataInputStream0 = new DataInputStream(new FileInputStream(file1))) {
                    if(dataInputStream0.readLong() == packageInfo0.lastUpdateTime) {
                        goto label_20;
                    }
                    goto label_21;
                }
                catch(IOException unused_ex) {
                    goto label_23;
                }
            label_20:
                z1 = true;
            label_21:
                if(z1) {
                    c0.c(2, null);
                }
            }
        label_23:
            if(z1) {
                Log.d("ProfileInstaller", "Skipping profile installation for com.wave.personal");
                h.c(context0, false);
                return;
            }
        }
        Log.d("ProfileInstaller", "Installing profile for com.wave.personal");
        File file2 = new File(new File("/data/misc/profiles/cur/0", "com.wave.personal"), "primary.prof");
        x1 x10 = new x1(assetManager0, executor0, c0, s, file2);
        byte[] arr_b = (byte[])x10.e;
        if(arr_b == null) {
            x10.e(3, ((int)Build.VERSION.SDK_INT));
            z2 = false;
        }
        else if(!file2.exists()) {
            try {
                if(file2.createNewFile()) {
                    x10.b = true;
                    arr_b1 = d.b;
                    fileInputStream0 = x10.d(assetManager0, "dexopt/baseline.prof");
                    goto label_54;
                }
                else {
                    x10.e(4, null);
                    z2 = false;
                }
                goto label_218;
            }
            catch(IOException unused_ex) {
                x10.e(4, null);
            }
            z2 = false;
            goto label_218;
            try {
                x10.b = true;
                arr_b1 = d.b;
                fileInputStream0 = x10.d(assetManager0, "dexopt/baseline.prof");
                goto label_54;
            }
            catch(FileNotFoundException fileNotFoundException0) {
                c0.c(6, fileNotFoundException0);
            }
            catch(IOException iOException0) {
                c0.c(7, iOException0);
            }
            fileInputStream0 = null;
        label_54:
            if(fileInputStream0 != null) {
                try {
                    try {
                        if(!Arrays.equals(arr_b1, d.f(fileInputStream0, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        arr_a = d.l(fileInputStream0, d.f(fileInputStream0, 4), x10.a);
                        goto label_81;
                    }
                    catch(IOException iOException1) {
                    }
                    catch(IllegalStateException illegalStateException0) {
                        goto label_67;
                    }
                    c0.c(7, iOException1);
                }
                catch(Throwable throwable0) {
                    goto label_76;
                }
                try {
                    fileInputStream0.close();
                }
                catch(IOException iOException2) {
                    iOException3 = iOException2;
                    c0.c(7, iOException3);
                }
                arr_a = null;
                goto label_85;
                try {
                label_67:
                    c0.c(8, illegalStateException0);
                }
                catch(Throwable throwable0) {
                    goto label_76;
                }
                try {
                    fileInputStream0.close();
                    arr_a = null;
                    goto label_85;
                }
                catch(IOException iOException4) {
                    iOException3 = iOException4;
                }
                c0.c(7, iOException3);
                arr_a = null;
                goto label_85;
                try {
                label_76:
                    fileInputStream0.close();
                }
                catch(IOException iOException5) {
                    c0.c(7, iOException5);
                }
                throw throwable0;
                try {
                label_81:
                    fileInputStream0.close();
                }
                catch(IOException iOException6) {
                    c0.c(7, iOException6);
                }
            label_85:
                x10.g = arr_a;
            }
            a[] arr_a1 = (a[])x10.g;
            if(arr_a1 == null || (Build.VERSION.SDK_INT < 24 || Build.VERSION.SDK_INT < 0x1F && (Build.VERSION.SDK_INT != 24 && Build.VERSION.SDK_INT != 25))) {
                x11 = x10;
            }
            else {
                try(FileInputStream fileInputStream1 = x10.d(assetManager0, "dexopt/baseline.profm")) {
                    if(fileInputStream1 == null) {
                        goto label_109;
                    }
                    else {
                        byte[] arr_b2 = d.f(fileInputStream1, 4);
                        if(!Arrays.equals(d.c, arr_b2)) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        x10.g = d.i(fileInputStream1, d.f(fileInputStream1, 4), arr_b, arr_a1);
                        x11 = x10;
                    }
                    goto label_110;
                }
                catch(FileNotFoundException fileNotFoundException1) {
                    c0.c(9, fileNotFoundException1);
                }
                catch(IOException iOException7) {
                    c0.c(7, iOException7);
                }
                catch(IllegalStateException illegalStateException1) {
                    x10.g = null;
                    c0.c(8, illegalStateException1);
                }
            label_109:
                x11 = null;
            label_110:
                if(x11 == null) {
                    x11 = x10;
                }
            }
            c c1 = (c)x11.d;
            a[] arr_a2 = (a[])x11.g;
            if(arr_a2 != null) {
                byte[] arr_b3 = (byte[])x11.e;
                if(arr_b3 != null) {
                    if(!x11.b) {
                        throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    try(ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream()) {
                        byteArrayOutputStream0.write(arr_b1);
                        byteArrayOutputStream0.write(arr_b3);
                        if(d.o(byteArrayOutputStream0, arr_b3, arr_a2)) {
                            x11.h = byteArrayOutputStream0.toByteArray();
                            goto label_138;
                        }
                        else {
                            c1.c(5, null);
                            x11.g = null;
                        }
                        goto label_141;
                    }
                    catch(IOException iOException8) {
                        c1.c(7, iOException8);
                    }
                    catch(IllegalStateException illegalStateException2) {
                        c1.c(8, illegalStateException2);
                    }
                label_138:
                    x11.g = null;
                }
            }
        label_141:
            byte[] arr_b4 = (byte[])x11.h;
            if(arr_b4 == null) {
                z2 = false;
            }
            else {
                if(x11.b) {
                    try {
                        try(ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b4); FileOutputStream fileOutputStream0 = new FileOutputStream(((File)x11.f)); FileChannel fileChannel0 = fileOutputStream0.getChannel(); FileLock fileLock0 = fileChannel0.tryLock()) {
                            if(fileLock0 == null) {
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            if(!fileLock0.isValid()) {
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            byte[] arr_b5 = new byte[0x200];
                            int v;
                            while((v = byteArrayInputStream0.read(arr_b5)) > 0) {
                                fileOutputStream0.write(arr_b5, 0, v);
                            }
                            x11.e(1, null);
                            x11.h = null;
                            x11.g = null;
                            z2 = true;
                            goto label_216;
                        }
                        catch(FileNotFoundException fileNotFoundException2) {
                            x11.e(6, fileNotFoundException2);
                        }
                        catch(IOException iOException9) {
                            x11.e(7, iOException9);
                        }
                        x11.h = null;
                        x11.g = null;
                        z2 = false;
                        goto label_216;
                    }
                    catch(Throwable throwable1) {
                        x11.h = null;
                        x11.g = null;
                        throw throwable1;
                    }
                }
                throw new IllegalStateException("This device doesn\'t support aot. Did you call deviceSupportsAotProfile()?");
            }
        label_216:
            if(z2) {
                d.e(packageInfo0, file0);
            }
        }
        else if(!file2.canWrite()) {
            x10.e(4, null);
            z2 = false;
        }
        else {
            x10.b = true;
            arr_b1 = d.b;
            fileInputStream0 = x10.d(assetManager0, "dexopt/baseline.prof");
            goto label_54;
        }
    label_218:
        h.c(context0, z2 && z);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream0, long v, int v1) {
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < v1; ++v2) {
            arr_b[v2] = (byte)(((int)(v >> v2 * 8 & 0xFFL)));
        }
        byteArrayOutputStream0.write(arr_b);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream0, int v) {
        d.u(byteArrayOutputStream0, ((long)v), 2);
    }
}

