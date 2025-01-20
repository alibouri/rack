package N4;

import a5.w;
import java.io.Serializable;

public final class b implements Serializable {
    public final String X;
    public final String Y;

    public b(String s, String s1) {
        this.X = s1;
        if(w.P(s)) {
            s = null;
        }
        this.Y = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof b)) {
            return false;
        }
        String s = ((b)object0).Y;
        String s1 = this.Y;
        if(s == null) {
            return s1 == null ? ((b)object0).X.equals(this.X) : false;
        }
        return s.equals(s1) && ((b)object0).X.equals(this.X);
    }

    @Override
    public final int hashCode() {
        return this.Y == null ? this.X.hashCode() : this.Y.hashCode() ^ this.X.hashCode();
    }

    private final Object writeReplace() {
        return new a(this.Y, this.X);
    }
}

