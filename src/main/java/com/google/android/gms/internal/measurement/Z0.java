package com.google.android.gms.internal.measurement;

import com.apollographql.apollo.api.b;

public final class z0 implements g2 {
    public final int a;
    public static final z0 b;
    public static final z0 c;
    public static final z0 d;
    public static final z0 e;
    public static final z0 f;
    public static final z0 g;
    public static final z0 h;
    public static final z0 i;

    static {
        z0.b = new z0(0);
        z0.c = new z0(1);
        z0.d = new z0(2);
        z0.e = new z0(3);
        z0.f = new z0(4);
        z0.g = new z0(5);
        z0.h = new z0(6);
        z0.i = new z0(7);
    }

    public z0(int v) {
        this.a = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.g2
    public final boolean b(int v) {
        switch(this.a) {
            case 0: {
                return b.f(v) != 0;
            }
            case 1: {
                switch(v) {
                    case 0: 
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: 
                    case 5: 
                    case 6: {
                        return true;
                    }
                    default: {
                        return false;
                    }
                }
            }
            case 2: {
                return v == 0 || v == 1 || v == 2;
            }
            case 3: {
                return b.g(v) != 0;
            }
            case 4: {
                return v == 0 || v == 1 || (v == 2 || v == 3 || v == 4 || v == 5);
            }
            case 5: {
                return v == 0 || v == 1;
            }
            case 6: {
                return v == 1 || v == 2;
            }
            default: {
                return b.h(v) != 0;
            }
        }
    }
}

