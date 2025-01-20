package N4;

import java.io.Serializable;

public final class e implements Serializable {
    public final String X;
    public final boolean Y;
    public final boolean Z;
    public final String b0;

    public e(String s, String s1, boolean z, boolean z1) {
        this.X = s;
        this.Y = z;
        this.Z = z1;
        this.b0 = s1;
    }

    private final Object readResolve() {
        return new f(this.X, this.b0, this.Y, this.Z);
    }
}

