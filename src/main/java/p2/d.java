package p2;

public final class d implements A {
    public final A a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public d(A a0) {
        this.b = 0;
        this.c = -1;
        this.d = -1;
        this.e = null;
        this.a = a0;
    }

    @Override  // p2.A
    public final void a(int v, int v1) {
        if(this.b == 2 && (this.c >= v && this.c <= v + v1)) {
            this.d += v1;
            this.c = v;
            return;
        }
        this.e();
        this.c = v;
        this.d = v1;
        this.b = 2;
    }

    @Override  // p2.A
    public final void b(int v, int v1) {
        this.e();
        this.a.b(v, v1);
    }

    @Override  // p2.A
    public final void c(int v, int v1) {
        if(this.b == 1) {
            int v2 = this.c;
            if(v >= v2) {
                int v3 = this.d;
                if(v <= v2 + v3) {
                    this.d = v3 + v1;
                    this.c = Math.min(v, v2);
                    return;
                }
            }
        }
        this.e();
        this.c = v;
        this.d = v1;
        this.b = 1;
    }

    @Override  // p2.A
    public final void d(int v, int v1, Object object0) {
        if(this.b == 3) {
            int v2 = this.c;
            int v3 = this.d + v2;
            if(v <= v3) {
                int v4 = v + v1;
                if(v4 >= v2 && this.e == object0) {
                    this.c = Math.min(v, v2);
                    this.d = Math.max(v3, v4) - this.c;
                    return;
                }
            }
        }
        this.e();
        this.c = v;
        this.d = v1;
        this.e = object0;
        this.b = 3;
    }

    public final void e() {
        int v = this.b;
        if(v == 0) {
            return;
        }
        A a0 = this.a;
        switch(v) {
            case 1: {
                a0.c(this.c, this.d);
                break;
            }
            case 2: {
                a0.a(this.c, this.d);
                break;
            }
            case 3: {
                a0.d(this.c, this.d, this.e);
            }
        }
        this.e = null;
        this.b = 0;
    }
}

