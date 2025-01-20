package y3;

import java.util.List;
import u3.m;

public final class c implements e {
    public final b X;
    public final b Y;

    public c(b b0, b b1) {
        this.X = b0;
        this.Y = b1;
    }

    @Override  // y3.e
    public final u3.e e() {
        return new m(this.X.r(), this.Y.r());
    }

    @Override  // y3.e
    public final List g() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    // Deobfuscation rating: LOW(20)
    @Override  // y3.e
    public final boolean h() {
        return this.X.h() && this.Y.h();
    }
}

