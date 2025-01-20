package u3;

import F3.a;
import java.util.List;

public final class d implements b {
    public final a a;
    public float b;

    public d(List list0) {
        this.b = -1.0f;
        this.a = (a)list0.get(0);
    }

    @Override  // u3.b
    public final float a() {
        return this.a.a();
    }

    @Override  // u3.b
    public final boolean b(float f) {
        if(this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override  // u3.b
    public final float c() {
        return this.a.b();
    }

    @Override  // u3.b
    public final a d() {
        return this.a;
    }

    @Override  // u3.b
    public final boolean e(float f) {
        return !this.a.c();
    }

    @Override  // u3.b
    public final boolean isEmpty() {
        return false;
    }
}

