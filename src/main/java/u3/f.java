package u3;

import E3.g;
import F3.a;
import java.util.List;
import x3.b;

public final class f extends i {
    public final int h;

    public f(int v, List list0) {
        this.h = v;
        super(list0);
    }

    @Override  // u3.e
    public final Object e(a a0, float f) {
        int v;
        switch(this.h) {
            case 0: {
                return this.k(a0, f);
            }
            case 1: {
                return f.j(a0, f);
            }
            case 2: {
                Object object0 = a0.b;
                if(object0 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object object1 = a0.c;
                if(object1 == null) {
                    if(a0.k == 0x2EC8FB09) {
                        a0.k = (int)(((Integer)object0));
                    }
                    v = a0.k;
                }
                else {
                    if(a0.l == 0x2EC8FB09) {
                        a0.l = (int)(((Integer)object1));
                    }
                    v = a0.l;
                }
                if(a0.k == 0x2EC8FB09) {
                    a0.k = (int)(((Integer)object0));
                }
                return (int)(f * ((float)(v - a0.k)) + ((float)a0.k));
            }
            default: {
                if(f == 1.0f) {
                    return a0.c == null ? ((b)a0.b) : ((b)a0.c);
                }
                return (b)a0.b;
            }
        }
    }

    public float i() {
        return f.j(this.c.d(), this.b());
    }

    public static float j(a a0, float f) {
        Object object0 = a0.b;
        if(object0 == null || a0.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if(a0.i == -3987645.75f) {
            a0.i = (float)(((Float)object0));
        }
        float f1 = a0.i;
        if(a0.j == -3987645.75f) {
            a0.j = (float)(((Float)a0.c));
        }
        return g.e(f1, a0.j, f);
    }

    public int k(a a0, float f) {
        if(a0.b == null || a0.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        return io.sentry.config.a.G(((int)(((Integer)a0.b))), g.b(f, 0.0f, 1.0f), ((int)(((Integer)a0.c))));
    }
}

