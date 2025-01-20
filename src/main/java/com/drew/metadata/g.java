package com.drew.metadata;

import M.J;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import l4.k;

public class g {
    public final b a;

    public g(b b0) {
        this.a = b0;
    }

    public final String a(int v, Object[] arr_object) {
        Integer integer0 = this.a.getInteger(v);
        if(integer0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        int v1 = 0;
        for(int v2 = 0; arr_object.length > v2; ++v2) {
            Object object0 = arr_object[v2];
            if(object0 != null) {
                int v3 = (((int)integer0) & 1) == 1 ? 1 : 0;
                if(object0 instanceof String[]) {
                    arrayList0.add(((String[])object0)[v3]);
                }
                else if(v3 != 0 && object0 instanceof String) {
                    arrayList0.add(((String)object0));
                }
            }
            integer0 = (int)(((int)integer0) >> 1);
        }
        Iterator iterator0 = arrayList0.iterator();
        if(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            v1 = ((CharSequence)object1).length() + 2;
        }
        StringBuilder stringBuilder0 = new StringBuilder(v1);
        Iterator iterator1 = arrayList0.iterator();
        if(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            stringBuilder0.append(((CharSequence)object2));
            while(iterator1.hasNext()) {
                stringBuilder0.append(", ");
                Object object3 = iterator1.next();
                stringBuilder0.append(((CharSequence)object3));
            }
        }
        return stringBuilder0.toString();
    }

    public final String b(int v) {
        byte[] arr_b = this.a.getByteArray(v);
        if(arr_b == null) {
            return null;
        }
        Integer integer0 = (int)arr_b.length;
        return arr_b.length == 1 ? String.format("(%d byte%s)", integer0, "") : String.format("(%d byte%s)", integer0, "s");
    }

    public String c(int v) {
        b b0 = this.a;
        Object object0 = b0.getObject(v);
        if(object0 == null) {
            return null;
        }
        if(object0.getClass().isArray()) {
            int v1 = Array.getLength(object0);
            if(v1 > 16) {
                return String.format("[%d values]", v1);
            }
        }
        return object0 instanceof Date ? new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy").format(((Date)object0)).replaceAll("([0-9]{2} [^ ]+)$", ":$1") : b0.getString(v);
    }

    public final String d(int v) {
        byte[] arr_b = this.a.getByteArray(v);
        if(arr_b == null) {
            return null;
        }
        if(arr_b.length == 0) {
            return "";
        }
        HashMap hashMap0 = new HashMap();
        hashMap0.put("ASCII", System.getProperty("file.encoding"));
        hashMap0.put("UNICODE", "UTF-16LE");
        hashMap0.put("JIS", "Shift-JIS");
        try {
            if(arr_b.length >= 10) {
                String s = new String(arr_b, 0, 10);
                for(Object object0: hashMap0.entrySet()) {
                    String s1 = (String)((Map.Entry)object0).getKey();
                    String s2 = (String)((Map.Entry)object0).getValue();
                    if(s.startsWith(s1)) {
                        int v1 = s1.length();
                        while(v1 < 10) {
                            switch(arr_b[v1]) {
                                case 0: 
                                case 0x20: {
                                    ++v1;
                                    continue;
                                }
                                default: {
                                    return new String(arr_b, v1, arr_b.length - v1, s2).trim();
                                }
                            }
                        }
                        return new String(arr_b, 10, arr_b.length - 10, s2).trim();
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return new String(arr_b, System.getProperty("file.encoding")).trim();
        }
        catch(UnsupportedEncodingException unused_ex) {
            return null;
        }
    }

    public static String e(double f) {
        DecimalFormat decimalFormat0 = new DecimalFormat("0.0");
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        return "f/" + decimalFormat0.format(f);
    }

    public static String f(double f) {
        DecimalFormat decimalFormat0 = new DecimalFormat("0.#");
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat0.format(f) + " mm";
    }

    public final String g(int v, int v1, String[] arr_s) {
        Long long0 = this.a.getLongObject(v);
        if(long0 == null) {
            return null;
        }
        long v2 = ((long)long0) - ((long)v1);
        if(v2 >= 0L && v2 < ((long)arr_s.length)) {
            String s = arr_s[((int)v2)];
            return s == null ? "Unknown (" + long0 + ")" : s;
        }
        return "Unknown (" + long0 + ")";
    }

    public final String h(int v) {
        k[] arr_k = this.a.getRationalArray(v);
        if(arr_k != null && arr_k.length == 4 && (!arr_k[0].c() || !arr_k[2].c())) {
            StringBuilder stringBuilder0 = new StringBuilder();
            k k0 = arr_k[0];
            k k1 = arr_k[1];
            k0.getClass();
            if(k1.doubleValue() == k0.doubleValue()) {
                stringBuilder0.append(arr_k[0].d(true));
            }
            else {
                stringBuilder0.append(arr_k[0].d(true));
                stringBuilder0.append('-');
                stringBuilder0.append(arr_k[1].d(true));
            }
            stringBuilder0.append("mm");
            if(!arr_k[2].c()) {
                stringBuilder0.append(' ');
                DecimalFormat decimalFormat0 = new DecimalFormat("0.0");
                decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
                k k2 = arr_k[2];
                k k3 = arr_k[3];
                k2.getClass();
                if(k3.doubleValue() == k2.doubleValue()) {
                    stringBuilder0.append(g.e(arr_k[2].doubleValue()));
                    return stringBuilder0.toString();
                }
                stringBuilder0.append("f/");
                stringBuilder0.append(decimalFormat0.format(arr_k[2].doubleValue()));
                stringBuilder0.append('-');
                stringBuilder0.append(decimalFormat0.format(arr_k[3].doubleValue()));
            }
            return stringBuilder0.toString();
        }
        return null;
    }

    public final String i(int v) {
        Float float0 = this.a.getFloatObject(v);
        if(float0 == null) {
            return null;
        }
        if(Float.compare(((float)float0), 1.0f) <= 0) {
            DecimalFormat decimalFormat0 = new DecimalFormat("0.##");
            decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
            return decimalFormat0.format(((double)(((float)Math.round(((double)(((float)(1.0 / Math.exp(Math.log(2.0) * ((double)(((float)float0)))))))) * 10.0)) / 10.0f))) + " sec";
        }
        return J.d(((int)Math.exp(Math.log(2.0) * ((double)(((float)float0))))), "1/", " sec");
    }

    public final String j(int v) {
        k k0 = this.a.getRational(v);
        return k0 == null ? null : k0.d(true);
    }

    public final String k(int v, Charset charset0) {
        byte[] arr_b = this.a.getByteArray(v);
        if(arr_b == null) {
            return null;
        }
        try {
            return new String(arr_b, charset0.name()).trim();
        }
        catch(UnsupportedEncodingException unused_ex) {
            return null;
        }
    }

    public final String l(int v, int v1) {
        int[] arr_v = this.a.getIntArray(v);
        if(arr_v == null) {
            return null;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v2 = 0; v2 < 4 && v2 < arr_v.length; ++v2) {
            if(v2 == v1) {
                stringBuilder0.append('.');
            }
            int v3 = (char)arr_v[v2];
            if(v3 < 0x30) {
                v3 = (char)(v3 + 0x30);
            }
            if(v2 != 0 || v3 != 0x30) {
                stringBuilder0.append(((char)v3));
            }
        }
        return stringBuilder0.toString();
    }
}

