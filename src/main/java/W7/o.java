package W7;

import M.J;
import V7.g;

public final class o implements g {
    public final String a;
    public final int b;

    public o(String s, int v) {
        this.a = s;
        this.b = v;
    }

    public final boolean a() {
        if(this.b == 0) {
            return false;
        }
        String s = this.d().trim();
        if(i.e.matcher(s).matches()) {
            return true;
        }
        if(!i.f.matcher(s).matches()) {
            throw new IllegalArgumentException(J.e("[Value: ", s, "] cannot be converted to a boolean."));
        }
        return false;
    }

    public final double b() {
        String s;
        if(this.b == 0) {
            return 0.0;
        }
        try {
            s = this.d().trim();
            return (double)Double.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException(J.e("[Value: ", s, "] cannot be converted to a double."), numberFormatException0);
        }
    }

    public final long c() {
        String s;
        if(this.b == 0) {
            return 0L;
        }
        try {
            s = this.d().trim();
            return (long)Long.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException(J.e("[Value: ", s, "] cannot be converted to a long."), numberFormatException0);
        }
    }

    public final String d() {
        return this.b == 0 ? "" : this.a;
    }
}

