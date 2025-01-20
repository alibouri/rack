package p1;

import M.J;
import h1.c;
import j6.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import o1.d;
import o1.e;
import o1.j;

public final class n {
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;
    public static int f;

    public final void a(ArrayList arrayList0) {
        int v = this.a.size();
        if(this.e != -1 && v > 0) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                n n0 = (n)arrayList0.get(v1);
                if(this.e == n0.b) {
                    this.c(this.c, n0);
                }
            }
        }
        if(v == 0) {
            arrayList0.remove(this);
        }
    }

    public final int b(c c0, int v) {
        int v4;
        int v3;
        ArrayList arrayList0 = this.a;
        if(arrayList0.size() == 0) {
            return 0;
        }
        e e0 = ((d)arrayList0.get(0)).U;
        c0.t();
        e0.c(c0, false);
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            ((d)arrayList0.get(v2)).c(c0, false);
        }
        if(v == 0 && e0.A0 > 0) {
            j.a(e0, c0, arrayList0, 0);
        }
        if(v == 1 && e0.B0 > 0) {
            j.a(e0, c0, arrayList0, 1);
        }
        try {
            c0.p();
        }
        catch(Exception exception0) {
            System.err.println(exception0.toString() + "\n" + Arrays.toString(exception0.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            d d0 = (d)arrayList0.get(v1);
            x x0 = new x(29);
            new WeakReference(d0);
            this.d.add(x0);
        }
        if(v == 0) {
            v3 = c.n(e0.J);
            v4 = c.n(e0.L);
            c0.t();
            return v4 - v3;
        }
        v3 = c.n(e0.K);
        v4 = c.n(e0.M);
        c0.t();
        return v4 - v3;
    }

    public final void c(int v, n n0) {
        for(Object object0: this.a) {
            d d0 = (d)object0;
            ArrayList arrayList0 = n0.a;
            if(!arrayList0.contains(d0)) {
                arrayList0.add(d0);
            }
            int v1 = n0.b;
            if(v == 0) {
                d0.o0 = v1;
            }
            else {
                d0.p0 = v1;
            }
        }
        this.e = n0.b;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.c;
        if(v == 0) {
            s = "Horizontal";
        }
        else {
            switch(v) {
                case 1: {
                    s = "Vertical";
                    break;
                }
                case 2: {
                    s = "Both";
                    break;
                }
                default: {
                    s = "Unknown";
                }
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" [");
        String s1 = J.f(stringBuilder0, this.b, "] <");
        for(Object object0: this.a) {
            StringBuilder stringBuilder1 = A3.e.w(s1, " ");
            stringBuilder1.append(((d)object0).i0);
            s1 = stringBuilder1.toString();
        }
        return s1 + " >";
    }
}

