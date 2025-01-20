package x3;

import A3.e;
import java.util.ArrayList;

public final class d {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public d(ArrayList arrayList0, char c, double f, String s, String s1) {
        this.a = arrayList0;
        this.b = c;
        this.c = f;
        this.d = s;
        this.e = s1;
    }

    public static int a(char c, String s, String s1) {
        return s1.hashCode() + e.s(c * 0x1F, 0x1F, s);
    }

    @Override
    public final int hashCode() {
        return d.a(this.b, this.e, this.d);
    }
}

