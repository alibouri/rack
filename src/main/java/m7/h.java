package m7;

public final class h {
    public final r a;
    public final boolean b;

    public h(r r0, boolean z) {
        this.a = r0;
        this.b = z;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof h && ((h)object0).a.equals(this.a) && ((h)object0).b == this.b;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf(this.b).hashCode();
    }
}

