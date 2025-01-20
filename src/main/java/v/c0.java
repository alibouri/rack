package v;

public final class c0 implements g {
    public final q0 a;
    public final o0 b;
    public final Object c;
    public final Object d;
    public final q e;
    public final q f;
    public final q g;
    public long h;
    public q i;

    public c0(k k0, o0 o00, Object object0, Object object1, q q0) {
        q0 q00 = k0.a(o00);
        super();
        this.a = q00;
        this.b = o00;
        this.c = object1;
        this.d = object0;
        this.e = (q)o00.a.n(object0);
        this.f = (q)o00.a.n(object1);
        this.g = q0 == null ? ((q)o00.a.n(object0)).c() : c.f(q0);
        this.h = -1L;
    }

    @Override  // v.g
    public final boolean b() {
        return this.a.b();
    }

    @Override  // v.g
    public final Object c(long v) {
        if(!h.a(this, v)) {
            q q0 = this.a.i(v, this.e, this.f, this.g);
            int v1 = q0.b();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(Float.isNaN(q0.a(v2))) {
                    throw new IllegalStateException("AnimationVector cannot contain a NaN. " + q0 + ". Animation: " + this + ", playTimeNanos: " + v);
                }
            }
            return this.b.b.n(q0);
        }
        return this.c;
    }

    @Override  // v.g
    public final long d() {
        if(this.h < 0L) {
            this.h = this.a.n(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override  // v.g
    public final o0 e() {
        return this.b;
    }

    @Override  // v.g
    public final Object f() {
        return this.c;
    }

    @Override  // v.g
    public final q g(long v) {
        if(!h.a(this, v)) {
            return this.a.s(v, this.e, this.f, this.g);
        }
        q q0 = this.i;
        if(q0 == null) {
            q0 = this.a.q(this.e, this.f, this.g);
            this.i = q0;
        }
        return q0;
    }

    @Override  // v.g
    public final boolean h(long v) {
        return h.a(this, v);
    }

    @Override
    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + this.d() / 1000000L + " ms,animationSpec: " + this.a;
    }
}

