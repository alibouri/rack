package com.drew.metadata;

public final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public a(int v, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    public static void a(StringBuilder stringBuilder0, int v, String s) {
        if(v == 0) {
            return;
        }
        if(stringBuilder0.length() != 0) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(v);
        stringBuilder0.append(' ');
        stringBuilder0.append(s);
        if(v != 1) {
            stringBuilder0.append('s');
        }
    }

    public static a b(String s) {
        if(s.length() == 19 && !s.startsWith("9999:99:99")) {
            try {
                return new a(Integer.parseInt(s.substring(0, 4)), Integer.parseInt(s.substring(5, 7)), Integer.parseInt(s.substring(8, 10)), Integer.parseInt(s.substring(11, 13)), Integer.parseInt(s.substring(14, 16)), Integer.parseInt(s.substring(17, 19)));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    public final String c() {
        StringBuilder stringBuilder0 = new StringBuilder();
        a.a(stringBuilder0, this.a, "year");
        a.a(stringBuilder0, this.b, "month");
        a.a(stringBuilder0, this.c, "day");
        a.a(stringBuilder0, this.d, "hour");
        a.a(stringBuilder0, this.e, "minute");
        a.a(stringBuilder0, this.f, "second");
        return stringBuilder0.toString();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(a.class != class0 || this.c != ((a)object0).c) {
                return false;
            }
            if(this.d != ((a)object0).d) {
                return false;
            }
            if(this.e != ((a)object0).e) {
                return false;
            }
            if(this.b != ((a)object0).b) {
                return false;
            }
            return this.f == ((a)object0).f ? this.a == ((a)object0).a : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f;
    }

    @Override
    public final String toString() {
        return String.format("%04d:%02d:%02d %02d:%02d:%02d", ((int)this.a), ((int)this.b), ((int)this.c), ((int)this.d), ((int)this.e), ((int)this.f));
    }
}

