package E6;

import T0.B;
import Xb.k;
import android.graphics.Typeface;
import com.google.android.material.resources.TextAppearance;
import yc.d;

public final class b extends y1.b {
    public final int h;
    public final Object i;
    public final Object j;

    public b(k k0, B b0) {
        this.h = 1;
        super();
        this.i = k0;
        this.j = b0;
    }

    public b(TextAppearance textAppearance0, d d0) {
        this.h = 0;
        super();
        this.j = textAppearance0;
        this.i = d0;
    }

    @Override  // y1.b
    public final void j(int v) {
        if(this.h != 0) {
            ((k)this.i).o(new IllegalStateException("Unable to load font " + ((B)this.j) + " (reason=" + v + ')'));
            return;
        }
        ((TextAppearance)this.j).m = true;
        ((d)this.i).u(v);
    }

    @Override  // y1.b
    public final void k(Typeface typeface0) {
        if(this.h != 0) {
            ((k)this.i).i(typeface0);
            return;
        }
        ((TextAppearance)this.j).n = Typeface.create(typeface0, ((TextAppearance)this.j).d);
        ((TextAppearance)this.j).m = true;
        ((d)this.i).v(((TextAppearance)this.j).n, false);
    }
}

