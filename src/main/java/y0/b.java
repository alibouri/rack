package y0;

import Fb.c;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;

public final class b extends c {
    public Object b0;
    public final NestedScrollDispatcher c0;
    public int d0;

    public b(NestedScrollDispatcher nestedScrollDispatcher0, c c0) {
        this.c0 = nestedScrollDispatcher0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.a(0L, 0L, this);
    }
}

