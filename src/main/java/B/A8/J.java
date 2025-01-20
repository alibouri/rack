package a8;

public final class j {
    public final i a;
    public final i b;
    public final double c;

    public j(i i0, i i1, double f) {
        this.a = i0;
        this.b = i1;
        this.c = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j)) {
            return false;
        }
        if(this.a != ((j)object0).a) {
            return false;
        }
        return this.b == ((j)object0).b ? Double.compare(this.c, ((j)object0).c) == 0 : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.c);
        return (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + ((int)(v ^ v >>> 0x20));
    }

    @Override
    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}

