package b4;

import Bb.F;

public final class s {
    public final int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public s() {
        this.a = 1;
        super();
    }

    public s(float f, float f1, float f2, float f3) {
        this.a = 0;
        super();
        this.b = f;
        this.c = f1;
        this.d = f2;
        this.e = f3;
    }

    public s(s s0) {
        this.a = 0;
        super();
        this.b = s0.b;
        this.c = s0.c;
        this.d = s0.d;
        this.e = s0.e;
    }

    public void a(float f, float f1, float f2, float f3) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f1, this.c);
        this.d = Math.min(f2, this.d);
        this.e = Math.min(f3, this.e);
    }

    public boolean b() {
        return this.b >= this.d || this.c >= this.e;
    }

    public float c() {
        return this.b + this.d;
    }

    public float d() {
        return this.c + this.e;
    }

    @Override
    public final String toString() {
        return this.a == 0 ? "[" + this.b + " " + this.c + " " + this.d + " " + this.e + "]" : "MutableRect(" + F.c0(this.b) + ", " + F.c0(this.c) + ", " + F.c0(this.d) + ", " + F.c0(this.e) + ')';
    }
}

