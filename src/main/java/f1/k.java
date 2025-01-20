package f1;

public final class k extends h {
    public final l f0;

    public k(l l0) {
        this.f0 = l0;
    }

    @Override  // f1.h
    public final String h() {
        i i0 = (i)this.f0.X.get();
        return i0 == null ? "Completer object has been garbage collected, future will fail soon" : "tag=[" + i0.a + "]";
    }
}

