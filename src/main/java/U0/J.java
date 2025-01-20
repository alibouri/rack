package U0;

import A3.e;
import Lc.b;
import O0.N;
import O0.f;
import O0.n;

public final class j {
    public final b a;
    public int b;
    public int c;
    public int d;
    public int e;

    public j(f f0, long v) {
        b b0 = new b(2, 0);
        b0.d = f0.X;
        b0.b = -1;
        b0.c = -1;
        this.a = b0;
        this.b = N.e(v);
        this.c = N.d(v);
        this.d = -1;
        this.e = -1;
        int v1 = N.e(v);
        int v2 = N.d(v);
        String s = f0.X;
        if(v1 >= 0 && v1 <= s.length()) {
            if(v2 >= 0 && v2 <= s.length()) {
                if(v1 > v2) {
                    throw new IllegalArgumentException(e.t(v1, v2, "Do not set reversed range: ", " > "));
                }
                return;
            }
            StringBuilder stringBuilder0 = m5.b.A(v2, "end (", ") offset is outside of text region ");
            stringBuilder0.append(s.length());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = m5.b.A(v1, "start (", ") offset is outside of text region ");
        stringBuilder1.append(s.length());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void a(int v, int v1) {
        long v2 = n.b(v, v1);
        this.a.D(v, v1, "");
        long v3 = W5.f.d0(n.b(this.b, this.c), v2);
        this.h(N.e(v3));
        this.g(N.d(v3));
        int v4 = this.d;
        if(v4 != -1) {
            long v5 = W5.f.d0(n.b(v4, this.e), v2);
            if(N.b(v5)) {
                this.d = -1;
                this.e = -1;
                return;
            }
            this.d = N.e(v5);
            this.e = N.d(v5);
        }
    }

    public final char b(int v) {
        b b0 = this.a;
        l l0 = (l)b0.e;
        if(l0 == null) {
            return ((String)b0.d).charAt(v);
        }
        if(v < b0.b) {
            return ((String)b0.d).charAt(v);
        }
        int v1 = l0.b - l0.b();
        int v2 = b0.b;
        if(v < v1 + v2) {
            int v3 = v - v2;
            return v3 >= l0.c ? ((char[])l0.e)[v3 - l0.c + l0.d] : ((char[])l0.e)[v3];
        }
        return ((String)b0.d).charAt(v - (v1 - b0.c + v2));
    }

    public final N c() {
        return this.d == -1 ? null : new N(n.b(this.d, this.e));
    }

    public final void d(int v, int v1, String s) {
        b b0 = this.a;
        if(v >= 0 && v <= b0.p()) {
            if(v1 >= 0 && v1 <= b0.p()) {
                if(v > v1) {
                    throw new IllegalArgumentException(e.t(v, v1, "Do not set reversed range: ", " > "));
                }
                b0.D(v, v1, s);
                this.h(s.length() + v);
                this.g(s.length() + v);
                this.d = -1;
                this.e = -1;
                return;
            }
            StringBuilder stringBuilder0 = m5.b.A(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(b0.p());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = m5.b.A(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(b0.p());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void e(int v, int v1) {
        b b0 = this.a;
        if(v >= 0 && v <= b0.p()) {
            if(v1 >= 0 && v1 <= b0.p()) {
                if(v >= v1) {
                    throw new IllegalArgumentException(e.t(v, v1, "Do not set reversed or empty range: ", " > "));
                }
                this.d = v;
                this.e = v1;
                return;
            }
            StringBuilder stringBuilder0 = m5.b.A(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(b0.p());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = m5.b.A(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(b0.p());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void f(int v, int v1) {
        b b0 = this.a;
        if(v >= 0 && v <= b0.p()) {
            if(v1 >= 0 && v1 <= b0.p()) {
                if(v > v1) {
                    throw new IllegalArgumentException(e.t(v, v1, "Do not set reversed range: ", " > "));
                }
                this.h(v);
                this.g(v1);
                return;
            }
            StringBuilder stringBuilder0 = m5.b.A(v1, "end (", ") offset is outside of text region ");
            stringBuilder0.append(b0.p());
            throw new IndexOutOfBoundsException(stringBuilder0.toString());
        }
        StringBuilder stringBuilder1 = m5.b.A(v, "start (", ") offset is outside of text region ");
        stringBuilder1.append(b0.p());
        throw new IndexOutOfBoundsException(stringBuilder1.toString());
    }

    public final void g(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + v).toString());
        }
        this.c = v;
    }

    public final void h(int v) {
        if(v < 0) {
            throw new IllegalArgumentException(m5.b.s(v, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.b = v;
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

