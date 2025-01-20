package com.google.protobuf;

public final class e0 {
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    public static final e0 f;

    static {
        e0.f = new e0(0, new int[0], new Object[0], false);
    }

    public e0(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    public final int a() {
        int v = this.d;
        if(v != -1) {
            return v;
        }
        int v2 = 0;
        for(int v1 = 0; v1 < this.a; ++v1) {
            int v3 = this.b[v1];
            int v4 = v3 >>> 3;
            int v5 = v3 & 7;
            switch(v5) {
                case 0: {
                    v2 = f.y(v4, ((long)(((Long)this.c[v1])))) + v2;
                    break;
                }
                case 1: {
                    ((Long)this.c[v1]).getClass();
                    v2 = f.j(v4) + v2;
                    break;
                }
                case 2: {
                    v2 = f.e(v4, ((e)this.c[v1])) + v2;
                    break;
                }
                case 3: {
                    v2 = ((e0)this.c[v1]).a() + f.v(v4) * 2 + v2;
                    break;
                }
                default: {
                    if(v5 != 5) {
                        throw new IllegalStateException(new v("Protocol message tag had invalid wire type."));  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
                    }
                    ((Integer)this.c[v1]).getClass();
                    v2 = f.i(v4) + v2;
                    break;
                }
            }
        }
        this.d = v2;
        return v2;
    }

    public final void b(F f0) {
        if(this.a == 0) {
            return;
        }
        f0.getClass();
        for(int v = 0; v < this.a; ++v) {
            int v1 = this.b[v];
            Object object0 = this.c[v];
            int v2 = v1 >>> 3;
            int v3 = v1 & 7;
            switch(v3) {
                case 0: {
                    f0.j(v2, ((long)(((Long)object0))));
                    break;
                }
                case 1: {
                    f0.f(v2, ((long)(((Long)object0))));
                    break;
                }
                case 2: {
                    f0.b(v2, ((e)object0));
                    break;
                }
                case 3: {
                    ((f)f0.a).J(v2, 3);
                    ((e0)object0).b(f0);
                    ((f)f0.a).J(v2, 4);
                    break;
                }
                default: {
                    if(v3 != 5) {
                        throw new RuntimeException(new v("Protocol message tag had invalid wire type."));  // initializer: Ljava/io/IOException;-><init>(Ljava/lang/String;)V
                    }
                    f0.e(v2, ((int)(((Integer)object0))));
                    break;
                }
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null) {
            return false;
        }
        if(!(object0 instanceof e0)) {
            return false;
        }
        int v = this.a;
        if(v == ((e0)object0).a) {
            int[] arr_v = this.b;
            int[] arr_v1 = ((e0)object0).b;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.c;
            Object[] arr_object1 = ((e0)object0).c;
            int v2 = this.a;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!arr_object[v3].equals(arr_object1[v3])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        int[] arr_v = this.b;
        int v2 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.c;
        int v5 = this.a;
        for(int v1 = 0; v1 < v5; ++v1) {
            v2 = v2 * 0x1F + arr_object[v1].hashCode();
        }
        return ((0x20F + v) * 0x1F + v4) * 0x1F + v2;
    }
}

