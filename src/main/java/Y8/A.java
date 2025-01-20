package y8;

import r8.i;
import r8.o;
import x8.b;
import yc.d;

public final class a {
    public final b a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public a(b b0) {
        this(b0, 10, b0.X / 2, b0.Y / 2);
    }

    public a(b b0, int v, int v1, int v2) {
        this.a = b0;
        this.b = b0.Y;
        this.c = b0.X;
        int v3 = v1 - v / 2;
        this.d = v3;
        int v4 = v1 + v / 2;
        this.e = v4;
        int v5 = v2 - v / 2;
        this.g = v5;
        int v6 = v2 + v / 2;
        this.f = v6;
        if(v5 < 0 || v3 < 0 || v6 >= b0.Y || v4 >= b0.X) {
            throw i.Z;
        }
    }

    public final boolean a(int v, int v1, int v2, boolean z) {
        b b0 = this.a;
        if(z) {
            while(v <= v1) {
                if(b0.c(v, v2)) {
                    return true;
                }
                ++v;
            }
            return false;
        }
        while(v <= v1) {
            if(b0.c(v2, v)) {
                return true;
            }
            ++v;
        }
        return false;
    }

    public final o[] b() {
        int v5;
        boolean z = false;
        int v = this.d;
        int v1 = this.e;
        int v2 = this.g;
        int v3 = this.f;
        boolean z1 = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int v4 = 1;
        while(true) {
            v5 = this.c;
            if(v4 == 0) {
                goto label_74;
            }
            int v6 = 0;
            boolean z6 = true;
            while((z6 || !z1) && v1 < v5) {
                z6 = this.a(v2, v3, v1, false);
                if(z6) {
                    ++v1;
                    z1 = true;
                    v6 = 1;
                }
                else if(!z1) {
                    ++v1;
                }
            }
            if(v1 < v5) {
                boolean z7 = true;
                while(true) {
                    int v7 = this.b;
                    if(!z7 && z2 || v3 >= v7) {
                        break;
                    }
                    z7 = this.a(v, v1, v3, true);
                    if(z7) {
                        ++v3;
                        z2 = true;
                        v6 = 1;
                    }
                    else if(!z2) {
                        ++v3;
                    }
                }
                if(v3 < v7) {
                    boolean z8 = true;
                    while((z8 || !z3) && v >= 0) {
                        z8 = this.a(v2, v3, v, false);
                        if(z8) {
                            --v;
                            z3 = true;
                            v6 = 1;
                        }
                        else if(!z3) {
                            --v;
                        }
                    }
                    if(v >= 0) {
                        boolean z9 = true;
                        v4 = v6;
                        while((z9 || !z5) && v2 >= 0) {
                            z9 = this.a(v, v1, v2, true);
                            if(z9) {
                                --v2;
                                v4 = 1;
                                z5 = true;
                            }
                            else if(!z5) {
                                --v2;
                            }
                        }
                        if(v2 >= 0) {
                            if(v4 == 0) {
                                continue;
                            }
                            z4 = true;
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        z = true;
                    }
                }
                else {
                    z = true;
                }
            }
            else {
                goto label_73;
            }
            goto label_74;
        }
        z = true;
        goto label_74;
    label_73:
        z = true;
    label_74:
        if(z || !z4) {
            throw i.Z;
        }
        int v8 = v1 - v;
        o o0 = null;
        for(int v9 = 1; o0 == null && v9 < v8; ++v9) {
            o0 = this.c(((float)v), ((float)(v3 - v9)), ((float)(v + v9)), ((float)v3));
        }
        if(o0 == null) {
            throw i.Z;
        }
        o o1 = null;
        for(int v10 = 1; o1 == null && v10 < v8; ++v10) {
            o1 = this.c(((float)v), ((float)(v2 + v10)), ((float)(v + v10)), ((float)v2));
        }
        if(o1 == null) {
            throw i.Z;
        }
        o o2 = null;
        for(int v11 = 1; o2 == null && v11 < v8; ++v11) {
            o2 = this.c(((float)v1), ((float)(v2 + v11)), ((float)(v1 - v11)), ((float)v2));
        }
        if(o2 == null) {
            throw i.Z;
        }
        o o3 = null;
        for(int v12 = 1; o3 == null && v12 < v8; ++v12) {
            o3 = this.c(((float)v1), ((float)(v3 - v12)), ((float)(v1 - v12)), ((float)v3));
        }
        if(o3 == null) {
            throw i.Z;
        }
        return Float.compare(o3.a, ((float)v5) / 2.0f) >= 0 ? new o[]{new o(o1.a + 1.0f, o1.b + 1.0f), new o(o0.a + 1.0f, o0.b - 1.0f), new o(o2.a - 1.0f, o2.b + 1.0f), new o(o3.a - 1.0f, o3.b - 1.0f)} : new o[]{new o(o1.a - 1.0f, o1.b + 1.0f), new o(o0.a + 1.0f, o0.b + 1.0f), new o(o2.a - 1.0f, o2.b - 1.0f), new o(o3.a + 1.0f, o3.b - 1.0f)};
    }

    public final o c(float f, float f1, float f2, float f3) {
        int v = d.B(((float)Math.sqrt((f1 - f3) * (f1 - f3) + (f - f2) * (f - f2))));
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = d.B(((float)v1) * ((f2 - f) / ((float)v)) + f);
            int v3 = d.B(((float)v1) * ((f3 - f1) / ((float)v)) + f1);
            if(this.a.c(v2, v3)) {
                return new o(((float)v2), ((float)v3));
            }
        }
        return null;
    }
}

