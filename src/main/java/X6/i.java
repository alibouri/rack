package X6;

import io.sentry.config.a;
import java.util.Objects;

public final class i extends e {
    public final transient Object[] Z;
    public final transient int b0;
    public static final i c0;

    static {
        i.c0 = new i(0, new Object[0]);
    }

    public i(int v, Object[] arr_object) {
        this.Z = arr_object;
        this.b0 = v;
    }

    @Override  // X6.e
    public final int a(Object[] arr_object) {
        System.arraycopy(this.Z, 0, arr_object, 0, this.b0);
        return this.b0;
    }

    @Override  // X6.a
    public final Object[] c() {
        return this.Z;
    }

    @Override  // X6.a
    public final int d() {
        return this.b0;
    }

    @Override  // X6.a
    public final int e() {
        return 0;
    }

    @Override
    public final Object get(int v) {
        a.v(v, this.b0);
        Object object0 = this.Z[v];
        Objects.requireNonNull(object0);
        return object0;
    }

    @Override
    public final int size() {
        return this.b0;
    }
}

