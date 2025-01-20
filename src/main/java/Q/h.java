package Q;

import m5.b;

public final class h {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public h(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h ? this.a == ((h)object0).a && this.b == ((h)object0).b && this.c == ((h)object0).c && this.d == ((h)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + b.p(b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RippleAlpha(draggedAlpha=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", focusedAlpha=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", hoveredAlpha=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", pressedAlpha=");
        return b.x(stringBuilder0, this.d, ')');
    }
}

