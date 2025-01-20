package N4;

import java.io.Serializable;

public final class a implements Serializable {
    public final String X;
    public final String Y;

    public a(String s, String s1) {
        this.X = s;
        this.Y = s1;
    }

    private final Object readResolve() {
        return new b(this.X, this.Y);
    }
}

