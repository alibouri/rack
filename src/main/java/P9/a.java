package p9;

import Fb.c;
import com.google.android.material.textfield.TextInputEditText;

public final class a extends c {
    public TextInputEditText b0;
    public Object c0;
    public final d d0;
    public int e0;

    public a(d d0, c c0) {
        this.d0 = d0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.G(this);
    }
}

