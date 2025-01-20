package q3;

import n3.a;

public abstract class b {
    public int a;

    public b() {
        this.a = 0;
    }

    public b(int v) {
        this.a = 0;
        this.b(v);
        this.b(v);
        this.a = v;
    }

    public void a(int v) {
    }

    public final void b(int v) {
        int v1 = ~this.d() & v;
        if(v1 != 0) {
            throw new a("The option bit(s) 0x" + Integer.toHexString(v1) + " are invalid!", 103);
        }
        this.a(v);
    }

    public final boolean c(int v) {
        return (v & this.a) != 0;
    }

    public abstract int d();

    public final void e(int v, boolean z) {
        this.a = z ? v | this.a : ~v & this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        return this.a == ((b)object0).a;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "0x" + Integer.toHexString(this.a);
    }
}

