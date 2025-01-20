package b4;

public final class r {
    public final q a;
    public final int b;
    public static final r c;
    public static final r d;

    static {
        r.c = new r(q.X, 0);
        r.d = new r(q.d0, 1);
    }

    public r(q q0, int v) {
        this.a = q0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        Class class0 = object0.getClass();
        return r.class == class0 ? this.a == ((r)object0).a && this.b == ((r)object0).b : false;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append(" ");
        switch(this.b) {
            case 1: {
                s = "meet";
                break;
            }
            case 2: {
                s = "slice";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

