package com.google.android.gms.internal.measurement;

import R2.e;
import R2.h;
import com.apollographql.apollo.api.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q implements o, Iterable {
    public final String X;

    public q(String s) {
        if(s == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.X = s;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Boolean a() {
        return Boolean.valueOf(!this.X.isEmpty());
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Iterator e() {
        return new s(this, 1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q ? this.X.equals(((q)object0).X) : false;
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final Double g() {
        String s = this.X;
        if(s.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(s);
        }
        catch(NumberFormatException unused_ex) {
            return NaN;
        }
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final String i() {
        return this.X;
    }

    @Override
    public final Iterator iterator() {
        return new s(this, 0);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o l() {
        return new q(this.X);
    }

    @Override  // com.google.android.gms.internal.measurement.o
    public final o r(String s, h h0, ArrayList arrayList0) {
        h h1;
        int v6;
        int v5;
        int v4;
        long v2;
        double f5;
        double f2;
        String s3;
        if(!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(s + " is not a String function");
        }
        String s1 = "undefined";
        String s2 = this.X;
        switch(s.hashCode()) {
            case 0x95535C81: {
                if(!s.equals("hasOwnProperty")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("hasOwnProperty", 1, arrayList0);
                o o0 = (o)arrayList0.get(0);
                o o1 = ((e)h0.b).n(h0, o0);
                boolean z = "length".equals(o1.i());
                o o2 = o.j;
                if(z) {
                    return o2;
                }
                double f = (double)o1.g();
                return f == Math.floor(f) && ((int)f) >= 0 && ((int)f) < s2.length() ? o2 : o.k;
            }
            case -1776922004: {
                if(!s.equals("toString")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("toString", 0, arrayList0);
                return this;
            }
            case 0xA8AECC9C: {
                if(!s.equals("toLocaleLowerCase")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("toLocaleLowerCase", 0, arrayList0);
                return new q(s2.toLowerCase());
            }
            case 0xAED71E29: {
                if(!s.equals("charAt")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(1, "charAt", arrayList0);
                if(!arrayList0.isEmpty()) {
                    o o3 = (o)arrayList0.get(0);
                    int v = (int)x1.a(((double)((e)h0.b).n(h0, o3).g()));
                    return v < 0 || v >= s2.length() ? o.l : new q(String.valueOf(s2.charAt(v)));
                }
                return 0 >= s2.length() ? o.l : new q(String.valueOf(s2.charAt(0)));
            }
            case 0xAF3F7714: {
                if(!s.equals("concat")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                if(arrayList0.isEmpty()) {
                    return this;
                }
                StringBuilder stringBuilder0 = new StringBuilder(s2);
                for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                    o o4 = (o)arrayList0.get(v1);
                    stringBuilder0.append(((e)h0.b).n(h0, o4).i());
                }
                return new q(stringBuilder0.toString());
            }
            case 0xBC31DD96: {
                if(!s.equals("toLowerCase")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("toLowerCase", 0, arrayList0);
                return new q(s2.toLowerCase(Locale.ENGLISH));
            }
            case 0xC9FA65A8: {
                if(!s.equals("search")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(1, "search", arrayList0);
                if(!arrayList0.isEmpty()) {
                    o o5 = (o)arrayList0.get(0);
                    s1 = ((e)h0.b).n(h0, o5).i();
                }
                Matcher matcher0 = Pattern.compile(s1).matcher(s2);
                return matcher0.find() ? new com.google.android.gms.internal.measurement.h(((double)matcher0.start())) : new com.google.android.gms.internal.measurement.h(-1.0);
            }
            case -726908483: {
                if(!s.equals("toLocaleUpperCase")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("toLocaleUpperCase", 0, arrayList0);
                return new q(s2.toUpperCase());
            }
            case 0xE42256D3: {
                if(!s.equals("lastIndexOf")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(2, "lastIndexOf", arrayList0);
                if(arrayList0.size() > 0) {
                    o o6 = (o)arrayList0.get(0);
                    s1 = ((e)h0.b).n(h0, o6).i();
                }
                if(arrayList0.size() < 2) {
                    return Double.isNaN(NaN) ? new com.google.android.gms.internal.measurement.h(((double)s2.lastIndexOf(s1, 0x7FFFFFFF))) : new com.google.android.gms.internal.measurement.h(((double)s2.lastIndexOf(s1, ((int)x1.a(NaN)))));
                }
                o o7 = (o)arrayList0.get(1);
                double f1 = (double)((e)h0.b).n(h0, o7).g();
                return Double.isNaN(f1) ? new com.google.android.gms.internal.measurement.h(((double)s2.lastIndexOf(s1, 0x7FFFFFFF))) : new com.google.android.gms.internal.measurement.h(((double)s2.lastIndexOf(s1, ((int)x1.a(f1)))));
            }
            case 0xE82F52B7: {
                if(!s.equals("toUpperCase")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("toUpperCase", 0, arrayList0);
                return new q(s2.toUpperCase(Locale.ENGLISH));
            }
            case 0x367422: {
                if(!s.equals("trim")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.k("toUpperCase", 0, arrayList0);
                return new q(s2.trim());
            }
            case 103668165: {
                if(!s.equals("match")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(1, "match", arrayList0);
                if(arrayList0.size() <= 0) {
                    s3 = "";
                }
                else {
                    o o8 = (o)arrayList0.get(0);
                    s3 = ((e)h0.b).n(h0, o8).i();
                }
                Matcher matcher1 = Pattern.compile(s3).matcher(s2);
                return matcher1.find() ? new com.google.android.gms.internal.measurement.e(new o[]{new q(matcher1.group())}) : o.f;
            }
            case 109526418: {
                if(!s.equals("slice")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(2, "slice", arrayList0);
                if(arrayList0.isEmpty()) {
                    f2 = 0.0;
                }
                else {
                    o o9 = (o)arrayList0.get(0);
                    f2 = (double)((e)h0.b).n(h0, o9).g();
                }
                double f3 = x1.a(f2);
                double f4 = f3 < 0.0 ? Math.max(((double)s2.length()) + f3, 0.0) : Math.min(f3, s2.length());
                if(arrayList0.size() > 1) {
                    o o10 = (o)arrayList0.get(1);
                    f5 = (double)((e)h0.b).n(h0, o10).g();
                }
                else {
                    f5 = (double)s2.length();
                }
                double f6 = x1.a(f5);
                return f6 < 0.0 ? new q(s2.substring(((int)f4), Math.max(0, ((int)Math.max(((double)s2.length()) + f6, 0.0)) - ((int)f4)) + ((int)f4))) : new q(s2.substring(((int)f4), Math.max(0, ((int)Math.min(f6, s2.length())) - ((int)f4)) + ((int)f4)));
            }
            case 109648666: {
                if(!s.equals("split")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(2, "split", arrayList0);
                if(s2.length() == 0) {
                    return new com.google.android.gms.internal.measurement.e(new o[]{this});
                }
                ArrayList arrayList1 = new ArrayList();
                if(arrayList0.isEmpty()) {
                    arrayList1.add(this);
                    return new com.google.android.gms.internal.measurement.e(arrayList1);
                }
                o o11 = (o)arrayList0.get(0);
                String s4 = ((e)h0.b).n(h0, o11).i();
                if(arrayList0.size() > 1) {
                    o o12 = (o)arrayList0.get(1);
                    v2 = ((long)x1.m(((double)((e)h0.b).n(h0, o12).g()))) & 0xFFFFFFFFL;
                }
                else {
                    v2 = 0x7FFFFFFFL;
                }
                if(v2 == 0L) {
                    return new com.google.android.gms.internal.measurement.e();
                }
                String[] arr_s = s2.split(Pattern.quote(s4), ((int)v2) + 1);
                int v3 = arr_s.length;
                if(!s4.isEmpty() || arr_s.length <= 0) {
                    v4 = 0;
                }
                else {
                    v4 = arr_s[0].isEmpty();
                    if(arr_s[arr_s.length - 1].isEmpty()) {
                        v3 = arr_s.length - 1;
                    }
                }
                if(((long)arr_s.length) > v2) {
                    --v3;
                }
                while(v4 < v3) {
                    arrayList1.add(new q(arr_s[v4]));
                    ++v4;
                }
                return new com.google.android.gms.internal.measurement.e(arrayList1);
            }
            case 0x1F9F6E51: {
                if(!s.equals("substring")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(2, "substring", arrayList0);
                if(arrayList0.isEmpty()) {
                    v5 = 0;
                }
                else {
                    o o13 = (o)arrayList0.get(0);
                    v5 = (int)x1.a(((double)((e)h0.b).n(h0, o13).g()));
                }
                if(arrayList0.size() > 1) {
                    o o14 = (o)arrayList0.get(1);
                    v6 = (int)x1.a(((double)((e)h0.b).n(h0, o14).g()));
                }
                else {
                    v6 = s2.length();
                }
                int v7 = Math.min(Math.max(v5, 0), s2.length());
                int v8 = Math.min(Math.max(v6, 0), s2.length());
                return new q(s2.substring(Math.min(v7, v8), Math.max(v7, v8)));
            }
            case 1094496948: {
                if(!s.equals("replace")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(2, "replace", arrayList0);
                o o15 = o.e;
                if(!arrayList0.isEmpty()) {
                    o o16 = (o)arrayList0.get(0);
                    s1 = ((e)h0.b).n(h0, o16).i();
                    if(arrayList0.size() > 1) {
                        o o17 = (o)arrayList0.get(1);
                        o15 = ((e)h0.b).n(h0, o17);
                    }
                }
                int v9 = s2.indexOf(s1);
                if(v9 < 0) {
                    return this;
                }
                if(o15 instanceof k) {
                    o15 = ((k)o15).b(h0, Arrays.asList(new o[]{new q(s1), new com.google.android.gms.internal.measurement.h(((double)v9)), this}));
                }
                return new q(b.q(s2.substring(0, v9), o15.i(), s2.substring(s1.length() + v9)));
            }
            case 0x73D44649: {
                if(!s.equals("indexOf")) {
                    throw new IllegalArgumentException("Command not supported");
                }
                x1.q(2, "indexOf", arrayList0);
                if(arrayList0.size() <= 0) {
                    h1 = h0;
                }
                else {
                    o o18 = (o)arrayList0.get(0);
                    h1 = h0;
                    s1 = ((e)h1.b).n(h1, o18).i();
                }
                if(arrayList0.size() < 2) {
                    return new com.google.android.gms.internal.measurement.h(((double)s2.indexOf(s1, ((int)x1.a(0.0)))));
                }
                o o19 = (o)arrayList0.get(1);
                return new com.google.android.gms.internal.measurement.h(((double)s2.indexOf(s1, ((int)x1.a(((double)((e)h1.b).n(h1, o19).g()))))));
            }
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
        }
    }

    @Override
    public final String toString() {
        return m5.b.y(new StringBuilder("\""), this.X, "\"");
    }
}

