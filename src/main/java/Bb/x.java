package Bb;

import D.u;
import Nb.k;
import Y8.o;
import kotlin.jvm.functions.Function1;
import l0.d;
import l0.q;

public final class x extends k implements Function1 {
    public final int X;
    public final int Y;

    public x(int v, int v1) {
        this.X = v1;
        this.Y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                ((Number)object0).intValue();
                throw new IndexOutOfBoundsException(o.z(new StringBuilder("Collection doesn\'t contain element at index "), this.Y, '.'));
            }
            case 1: {
                return (int)(((u)object0).a - this.Y);
            }
            case 2: {
                Boolean boolean1 = d.B(((q)object0), this.Y);
                return boolean1 == null ? Boolean.valueOf(false) : Boolean.valueOf(boolean1.booleanValue());
            }
            default: {
                Boolean boolean0 = d.B(((q)object0), this.Y);
                return boolean0 == null ? Boolean.valueOf(false) : Boolean.valueOf(boolean0.booleanValue());
            }
        }
    }
}

