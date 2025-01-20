package O2;

import N2.h;
import Nb.j;
import P2.a;
import P2.f;
import R2.p;
import android.os.Build.VERSION;

public final class d extends c {
    public final int b;
    public final int c;

    public d(a a0) {
        this.b = 1;
        j.f(a0, "tracker");
        super(a0);
        this.c = 5;
    }

    public d(f f0, int v) {
        this.b = v;
        switch(v) {
            case 2: {
                j.f(f0, "tracker");
                super(f0);
                this.c = 7;
                return;
            }
            case 3: {
                j.f(f0, "tracker");
                super(f0);
                this.c = 7;
                return;
            }
            case 4: {
                j.f(f0, "tracker");
                super(f0);
                this.c = 9;
                return;
            }
            default: {
                j.f(f0, "tracker");
                super(f0);
                this.c = 6;
            }
        }
    }

    @Override  // O2.e
    public final boolean c(p p0) {
        switch(this.b) {
            case 0: {
                j.f(p0, "workSpec");
                return p0.j.c;
            }
            case 1: {
                j.f(p0, "workSpec");
                return p0.j.e;
            }
            case 2: {
                j.f(p0, "workSpec");
                return p0.j.a == 2;
            }
            case 3: {
                j.f(p0, "workSpec");
                int v = p0.j.a;
                return v == 3 || Build.VERSION.SDK_INT >= 30 && v == 6;
            }
            default: {
                j.f(p0, "workSpec");
                return p0.j.f;
            }
        }
    }

    @Override  // O2.c
    public final int d() {
        switch(this.b) {
            case 0: {
                return this.c;
            }
            case 1: {
                return this.c;
            }
            case 2: {
                return this.c;
            }
            case 3: {
                return this.c;
            }
            default: {
                return this.c;
            }
        }
    }

    @Override  // O2.c
    public final boolean e(Object object0) {
        switch(this.b) {
            case 0: {
                return !((Boolean)object0).booleanValue();
            }
            case 1: {
                return !((Boolean)object0).booleanValue();
            }
            case 2: {
                j.f(((h)object0), "value");
                int v = Build.VERSION.SDK_INT;
                boolean z = ((h)object0).a;
                return v < 26 ? !z : !z || !((h)object0).b;
            }
            case 3: {
                j.f(((h)object0), "value");
                return !((h)object0).a || ((h)object0).c;
            }
            default: {
                return !((Boolean)object0).booleanValue();
            }
        }
    }
}

