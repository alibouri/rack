package r3;

import java.util.Arrays;

public final class n {
    public final a a;
    public final Throwable b;

    public n(Throwable throwable0) {
        this.b = throwable0;
        this.a = null;
    }

    public n(a a0) {
        this.a = a0;
        this.b = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(this.a != null && this.a.equals(((n)object0).a)) {
            return true;
        }
        return this.b == null || ((n)object0).b == null ? false : this.b.toString().equals(this.b.toString());
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}

