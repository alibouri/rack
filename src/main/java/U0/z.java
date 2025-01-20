package U0;

import I2.J;
import O0.f;
import Y8.o;

public final class z implements i {
    public final f a;
    public final int b;

    public z(String s, int v) {
        f f0 = new f(6, s, null);
        super();
        this.a = f0;
        this.b = v;
    }

    @Override  // U0.i
    public final void a(j j0) {
        int v = j0.d;
        int v1 = -1;
        f f0 = this.a;
        if(v == -1) {
            int v2 = j0.b;
            j0.d(v2, j0.c, f0.X);
            String s1 = f0.X;
            if(s1.length() > 0) {
                j0.e(v2, s1.length() + v2);
            }
        }
        else {
            j0.d(v, j0.e, f0.X);
            String s = f0.X;
            if(s.length() > 0) {
                j0.e(v, s.length() + v);
            }
        }
        int v3 = j0.c;
        if(j0.b == v3) {
            v1 = v3;
        }
        int v4 = J.r((this.b <= 0 ? v1 + this.b - f0.X.length() : v1 + this.b - 1), 0, j0.a.p());
        j0.f(v4, v4);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z)) {
            return false;
        }
        return Nb.j.a(this.a.X, ((z)object0).a.X) ? this.b == ((z)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.X.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SetComposingTextCommand(text=\'");
        stringBuilder0.append(this.a.X);
        stringBuilder0.append("\', newCursorPosition=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

