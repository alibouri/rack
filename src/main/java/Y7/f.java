package y7;

import z7.a;

public final class f implements i {
    public final j a;
    public final o6.i b;

    public f(j j0, o6.i i0) {
        this.a = j0;
        this.b = i0;
    }

    @Override  // y7.i
    public final boolean a(a a0) {
        if(a0.b == 4 && !this.a.a(a0)) {
            String s = a0.c;
            if(s == null) {
                throw new NullPointerException("Null token");
            }
            y7.a a1 = new y7.a(s, a0.e, a0.f);
            this.b.b(a1);
            return true;
        }
        return false;
    }

    @Override  // y7.i
    public final boolean b(Exception exception0) {
        this.b.c(exception0);
        return true;
    }
}

