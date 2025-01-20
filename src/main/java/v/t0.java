package v;

public final class t0 implements q0 {
    public final r0 X;
    public final int Y;
    public final long Z;
    public final long b0;

    public t0(r0 r00, int v, long v1) {
        this.X = r00;
        this.Y = v;
        int v2 = r00.j();
        this.Z = ((long)(r00.o() + v2)) * 1000000L;
        this.b0 = v1 * 1000000L;
    }

    public final long a(long v) {
        long v1 = v + this.b0;
        if(v1 <= 0L) {
            return 0L;
        }
        long v2 = v1 / this.Z;
        return this.Y == 1 || v2 % 2L == 0L ? v1 - v2 * this.Z : (v2 + 1L) * this.Z - v1;
    }

    @Override  // v.q0
    public final boolean b() {
        return true;
    }

    public final q c(long v, q q0, q q1, q q2) {
        return v + this.b0 <= this.Z ? q1 : this.X.s(this.Z - this.b0, q0, q2, q1);
    }

    @Override  // v.q0
    public final q i(long v, q q0, q q1, q q2) {
        long v1 = this.a(v);
        q q3 = this.c(v, q0, q2, q1);
        return this.X.i(v1, q0, q1, q3);
    }

    @Override  // v.q0
    public final long n(q q0, q q1, q q2) {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // v.q0
    public final q q(q q0, q q1, q q2) {
        return this.s(0x7FFFFFFFFFFFFFFFL, q0, q1, q2);
    }

    @Override  // v.q0
    public final q s(long v, q q0, q q1, q q2) {
        long v1 = this.a(v);
        q q3 = this.c(v, q0, q2, q1);
        return this.X.s(v1, q0, q1, q3);
    }
}

