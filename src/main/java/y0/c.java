package y0;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

public final class c extends Fb.c {
    public Object b0;
    public final NestedScrollDispatcher c0;
    public int d0;

    public c(NestedScrollDispatcher nestedScrollDispatcher0, Fb.c c0) {
        this.c0 = nestedScrollDispatcher0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.b(0L, this);
    }
}

