package com.drew.metadata.photoshop;

import L4.a;
import e4.c;
import e4.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import l4.i;
import l4.l;

public final class b implements c {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // e4.c
    public final void a(List list0, U7.c c0, d d0) {
        if(this.a != 0) {
            for(Object object0: list0) {
                byte[] arr_b = (byte[])object0;
                if(arr_b.length >= 5 && "Ducky".equals(new String(arr_b, 0, 5))) {
                    l l0 = new l(5, arr_b);
                    DuckyDirectory duckyDirectory0 = new DuckyDirectory();
                    c0.i(duckyDirectory0);
                    try {
                    label_9:
                        int v = l0.x();
                        if(v == 0) {
                            continue;
                        }
                        int v1 = l0.x();
                        switch(v) {
                            case 1: {
                                if(v1 == 4) {
                                    duckyDirectory0.setInt(1, l0.i());
                                    goto label_9;
                                }
                                else {
                                    duckyDirectory0.addError("Unexpected length for the quality tag");
                                    continue;
                                }
                                l0.D(4L);
                                duckyDirectory0.setStringValue(v, l0.w(v1 - 4, l4.d.d));
                                goto label_9;
                            }
                            case 2: 
                            case 3: {
                                l0.D(4L);
                                duckyDirectory0.setStringValue(v, l0.w(v1 - 4, l4.d.d));
                                goto label_9;
                            }
                            default: {
                                duckyDirectory0.setByteArray(v, l0.c(v1));
                                goto label_9;
                            }
                        }
                    }
                    catch(IOException iOException0) {
                    }
                    duckyDirectory0.addError(iOException0.getMessage());
                }
            }
            return;
        }
        for(Object object1: list0) {
            byte[] arr_b1 = (byte[])object1;
            if(arr_b1.length >= 14 && "Photoshop 3.0".equals(new String(arr_b1, 0, 13))) {
                b.c(new l(14, arr_b1), arr_b1.length - 14, c0, null);
            }
        }
    }

    @Override  // e4.c
    public final List b() {
        return this.a == 0 ? Collections.singletonList(d.e0) : Collections.singletonList(d.d0);
    }

    public static void c(i i0, int v, U7.c c0, com.drew.metadata.b b0) {
        PhotoshopDirectory photoshopDirectory0 = new PhotoshopDirectory();
        c0.i(photoshopDirectory0);
        if(b0 != null) {
            photoshopDirectory0.setParent(b0);
        }
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            try {
                String s = i0.s(4);
                int v3 = i0.x();
                int v4 = i0.B();
                int v5 = v1 + 7;
                if(v4 >= 0) {
                    int v6 = v4 + v5;
                    if(v6 > v) {
                        throw new c4.c("Invalid string length", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
                    }
                }
                else {
                    throw new c4.c("Invalid string length", null);  // initializer: Ll4/e;-><init>(Ljava/lang/String;Ljava/io/IOException;)V
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                while(v5 < v6) {
                    stringBuilder0.append(((char)i0.B()));
                    ++v5;
                }
                if(v5 % 2 != 0) {
                    i0.D(1L);
                    ++v5;
                }
                int v7 = i0.i();
                byte[] arr_b = i0.c(v7);
                v1 = v5 + 4 + v7;
                if(v1 % 2 != 0) {
                    i0.D(1L);
                    ++v1;
                }
                if(!s.equals("8BIM")) {
                    continue;
                }
                switch(v3) {
                    case 0x404: {
                        com.drew.metadata.jpeg.b.e(new l(0, arr_b), c0, ((long)arr_b.length), photoshopDirectory0);
                        break;
                    }
                    case 0x40F: {
                        com.drew.metadata.jpeg.b.d(new l4.b(0, arr_b), c0, photoshopDirectory0);
                        break;
                    }
                    case 1058: 
                    case 1059: {
                        com.drew.metadata.jpeg.b.c(new l4.b(0, arr_b), c0, 0, photoshopDirectory0);
                        break;
                    }
                    case 1060: {
                        a.c(arr_b, 0, arr_b.length, c0, photoshopDirectory0);
                        break;
                    }
                    default: {
                        if(v3 < 2000 || v3 > 0xBB6) {
                            photoshopDirectory0.setByteArray(v3, arr_b);
                        }
                        else {
                            byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length + stringBuilder0.length() + 1);
                            for(int v8 = arr_b1.length - stringBuilder0.length() - 1; v8 < arr_b1.length; ++v8) {
                                arr_b1[v8] = v8 % (arr_b1.length - stringBuilder0.length() - 1 + stringBuilder0.length()) == 0 ? ((byte)stringBuilder0.length()) : ((byte)stringBuilder0.charAt(v8 - (arr_b1.length - stringBuilder0.length() - 1)));
                            }
                            PhotoshopDirectory._tagNameMap.put(((int)(v2 + 2000)), "Path Info " + (v2 + 1));
                            photoshopDirectory0.setByteArray(v2 + 2000, arr_b1);
                            ++v2;
                        }
                    }
                }
                if(v3 < 4000 || v3 > 4999) {
                    continue;
                }
                PhotoshopDirectory._tagNameMap.put(v3, String.format("Plug-in %d Data", ((int)(v3 - 0xF9F))));
                continue;
            }
            catch(Exception exception0) {
            }
            photoshopDirectory0.addError(exception0.getMessage());
            if(true) {
                break;
            }
        }
    }
}

