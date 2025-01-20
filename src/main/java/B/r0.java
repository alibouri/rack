package B;

import a1.d;
import androidx.compose.ui.unit.LayoutDirection;
import m5.b;

public final class r0 implements q0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public r0(float f, float f1, float f2, float f3) {
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        if(f < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if(f1 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if(f2 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if(f3 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override  // B.q0
    public final float a() {
        return this.d;
    }

    @Override  // B.q0
    public final float b(LayoutDirection layoutDirection0) {
        return layoutDirection0 == LayoutDirection.X ? this.a : this.c;
    }

    @Override  // B.q0
    public final float c() {
        return this.b;
    }

    @Override  // B.q0
    public final float d(LayoutDirection layoutDirection0) {
        return layoutDirection0 == LayoutDirection.X ? this.c : this.a;
    }

    // Deobfuscation rating: MEDIUM(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof r0 ? d.a(this.a, ((r0)object0).a) && d.a(this.b, ((r0)object0).b) && d.a(this.c, ((r0)object0).c) && d.a(this.d, ((r0)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.d) + b.p(b.p(Float.floatToIntBits(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F);
    }

    @Override
    public final String toString() {
        return "PaddingValues(start=" + d.b(this.a) + ", top=" + d.b(this.b) + ", end=" + d.b(this.c) + ", bottom=" + d.b(this.d) + ')';
    }
}

