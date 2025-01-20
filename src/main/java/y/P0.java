package y;

import Nb.j;
import s.x;

public final class p0 {
    public final x a;

    public p0(x x0) {
        this.a = x0;
    }

    public final Object a(float f) {
        Object[] arr_object = this.a.b;
        float[] arr_f = this.a.c;
        long[] arr_v = this.a.a;
        int v = arr_v.length - 2;
        Object object0 = null;
        if(v >= 0) {
            float f1 = Infinityf;
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = arr_object[v5];
                            float f2 = Math.abs(f - arr_f[v5]);
                            if(f2 <= f1) {
                                f1 = f2;
                                object0 = object1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_24;
                    }
                    break;
                }
            label_24:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return object0;
    }

    public final Object b(float f, boolean z) {
        Object[] arr_object = this.a.b;
        float[] arr_f = this.a.c;
        long[] arr_v = this.a.a;
        int v = arr_v.length - 2;
        Object object0 = null;
        if(v >= 0) {
            float f1 = Infinityf;
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            int v5 = (v1 << 3) + v4;
                            Object object1 = arr_object[v5];
                            float f2 = arr_f[v5];
                            float f3 = z ? f2 - f : f - f2;
                            if(f3 < 0.0f) {
                                f3 = Infinityf;
                            }
                            if(f3 <= f1) {
                                f1 = f3;
                                object0 = object1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_27;
                    }
                    break;
                }
            label_27:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return object0;
    }

    public final float c() {
        x x0 = this.a;
        if(x0.e == 1) {
            return NaNf;
        }
        float[] arr_f = x0.c;
        long[] arr_v = x0.a;
        int v = arr_v.length - 2;
        float f = -Infinityf;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            float f1 = arr_f[(v1 << 3) + v4];
                            if(f1 >= f) {
                                f = f1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return f;
    }

    public final float d() {
        x x0 = this.a;
        if(x0.e == 1) {
            return NaNf;
        }
        float[] arr_f = x0.c;
        long[] arr_v = x0.a;
        int v = arr_v.length - 2;
        float f = Infinityf;
        if(v >= 0) {
            int v1 = 0;
            while(true) {
                long v2 = arr_v[v1];
                if((~v2 << 7 & v2 & 0x8080808080808080L) != 0x8080808080808080L) {
                    int v3 = 8 - (~(v1 - v) >>> 0x1F);
                    for(int v4 = 0; v4 < v3; ++v4) {
                        if((0xFFL & v2) < 0x80L) {
                            float f1 = arr_f[(v1 << 3) + v4];
                            if(f1 <= f) {
                                f = f1;
                            }
                        }
                        v2 >>= 8;
                    }
                    if(v3 == 8) {
                        goto label_22;
                    }
                    break;
                }
            label_22:
                if(v1 == v) {
                    break;
                }
                ++v1;
            }
        }
        return f;
    }

    public final float e(Object object0) {
        int v = this.a.c(object0);
        return v < 0 ? NaNf : this.a.c[v];
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p0 ? j.a(this.a, ((p0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}

