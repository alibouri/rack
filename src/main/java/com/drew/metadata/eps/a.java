package com.drew.metadata.eps;

import U7.c;
import com.drew.metadata.photoshop.b;
import com.drew.metadata.xmp.XmpDirectory;
import java.io.ByteArrayOutputStream;
import l4.d;
import l4.i;
import l4.l;
import o3.j;

public final class a {
    public int a;

    public static byte[] a(i i0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        boolean z = false;
        while(!z) {
            v1 = i0.a();
            switch(v) {
                case 0: {
                    if(v1 == 10 || v1 == 13 || v1 == 0x20) {
                        continue;
                    }
                    if(v1 != 37) {
                        return null;
                    }
                    v = 1;
                    continue;
                }
                case 1: {
                    if(v1 != 0x20) {
                        z = true;
                        continue;
                    }
                    break;
                }
                case 2: {
                    int v3 = a.c(((byte)v1));
                    if(v3 == -1) {
                        if(v1 != 10 && v1 != 13) {
                            return null;
                        }
                        v = 0;
                    }
                    else {
                        v2 = v3 * 16;
                        v = 3;
                    }
                    continue;
                }
                case 3: {
                    int v4 = a.c(((byte)v1));
                    if(v4 == -1) {
                        return null;
                    }
                    byteArrayOutputStream0.write(v4 + v2);
                    break;
                }
                default: {
                    continue;
                }
            }
            v = 2;
        }
        while(v1 != 10) {
            v1 = i0.a();
        }
        return byteArrayOutputStream0.toByteArray();
    }

    // This method was un-flattened
    public final void b(EpsDirectory epsDirectory0, c c0, i i0) {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
    alab1:
        while(true) {
            stringBuilder0.setLength(0);
            while(true) {
                int v = (char)i0.a();
                if(v == 10 || v == 13) {
                    if(stringBuilder0.length() != 0 && stringBuilder0.charAt(0) != 37) {
                        break alab1;
                    }
                    int v1 = stringBuilder0.indexOf(":");
                    if(v1 == -1) {
                        s = stringBuilder0.toString().trim();
                    }
                    else {
                        s = stringBuilder0.substring(0, v1).trim();
                        String s1 = stringBuilder0.substring(v1 + 1).trim();
                        Integer integer0 = (Integer)EpsDirectory._tagIntegerMap.get(s);
                        if(integer0 != null) {
                            switch(((int)integer0)) {
                                case 8: {
                                    epsDirectory0.setString(8, s1.trim());
                                    String[] arr_s = s1.split(" ");
                                    int v2 = Integer.parseInt(arr_s[0]);
                                    int v3 = Integer.parseInt(arr_s[1]);
                                    int v4 = Integer.parseInt(arr_s[3]);
                                    if(!epsDirectory0.containsTag(28)) {
                                        epsDirectory0.setInt(28, v2);
                                    }
                                    if(!epsDirectory0.containsTag(29)) {
                                        epsDirectory0.setInt(29, v3);
                                    }
                                    if(!epsDirectory0.containsTag(30)) {
                                        epsDirectory0.setInt(30, v4);
                                    }
                                    if(!epsDirectory0.containsTag(0x1F)) {
                                        if(v4 == 1) {
                                            epsDirectory0.setInt(0x1F, v2 * v3);
                                        }
                                        else if(v4 == 2 || v4 == 3 || v4 == 4) {
                                            epsDirectory0.setInt(0x1F, 3 * v2 * v3);
                                        }
                                    }
                                    break;
                                }
                                case 36: {
                                    epsDirectory0.setString(this.a, epsDirectory0.getString(this.a) + " " + s1);
                                    break;
                                }
                                default: {
                                    if(!EpsDirectory._tagNameMap.containsKey(integer0) || epsDirectory0.containsTag(((int)integer0))) {
                                        this.a = 0;
                                    }
                                    else {
                                        epsDirectory0.setString(((int)integer0), s1);
                                        this.a = (int)integer0;
                                    }
                                }
                            }
                            this.a = (int)integer0;
                        }
                    }
                    if(s.equals("%BeginPhotoshop")) {
                        byte[] arr_b = a.a(i0);
                        if(arr_b != null) {
                            b.c(new l(0, arr_b), arr_b.length, c0, null);
                        }
                    }
                    else if(s.equals("%%BeginICCProfile")) {
                        byte[] arr_b1 = a.a(i0);
                        if(arr_b1 != null) {
                            com.drew.metadata.jpeg.b.d(new l4.b(0, arr_b1), c0, null);
                            break;
                        }
                    }
                    else {
                        goto label_54;
                    }
                    stringBuilder0.setLength(0);
                    continue;
                label_54:
                    if(!s.equals("%begin_xml_packet")) {
                        break;
                    }
                    byte[] arr_b2 = "<?xpacket end=\"w\"?>".getBytes();
                    ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                    int v5 = 0;
                    while(v5 != arr_b2.length) {
                        int v6 = i0.a();
                        v5 = v6 == arr_b2[v5] ? v5 + 1 : 0;
                        byteArrayOutputStream0.write(v6);
                    }
                    String s2 = new String(byteArrayOutputStream0.toByteArray(), d.a);
                    XmpDirectory xmpDirectory0 = new XmpDirectory();
                    try {
                        xmpDirectory0.setXMPMeta(j.b(s2, L4.a.a));
                    }
                    catch(n3.a a0) {
                        xmpDirectory0.addError("Error processing XMP data: " + a0.getMessage());
                    }
                    if(xmpDirectory0.isEmpty()) {
                        break;
                    }
                    c0.i(xmpDirectory0);
                    break;
                }
                stringBuilder0.append(((char)v));
            }
        }
    }

    public static int c(byte b) {
        if(b >= 0x30 && b <= 57) {
            return b - 0x30;
        }
        if(b >= 65 && b <= 70) {
            return b - 55;
        }
        return b < 97 || b > 102 ? -1 : b - 87;
    }
}

