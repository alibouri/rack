package k1;

public final class h extends c {
    @Override  // k1.c
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return !(object0 instanceof h) || !this.d().equals(((h)object0).d()) ? super.equals(object0) : true;
    }

    public static h o(String s) {
        h h0 = new h(s.toCharArray());  // initializer: Lk1/c;-><init>([C)V
        h0.Y = 0L;
        int v = s.length();
        if(h0.Z == 0x7FFFFFFFFFFFFFFFL) {
            h0.Z = (long)(v - 1);
            b b0 = h0.b0;
            if(b0 != null) {
                b0.o(h0);
            }
        }
        return h0;
    }
}

