package e0;

import Bb.n;
import Bb.p;
import Bb.r;
import I2.J;
import Ob.a;
import Ub.h;
import java.util.ArrayList;
import java.util.Iterator;

public final class k implements a, Iterable {
    public final long X;
    public final long Y;
    public final int Z;
    public final int[] b0;
    public static final k c0;

    static {
        k.c0 = new k(0L, 0L, 0, null);
    }

    public k(long v, long v1, int v2, int[] arr_v) {
        this.X = v;
        this.Y = v1;
        this.Z = v2;
        this.b0 = arr_v;
    }

    public final k a(k k0) {
        k k2;
        k k1 = k.c0;
        if(k0 == k1) {
            return this;
        }
        if(this == k1) {
            return k1;
        }
        int[] arr_v = k0.b0;
        long v = k0.Y;
        long v1 = k0.X;
        int v2 = this.Z;
        if(k0.Z == v2) {
            int[] arr_v1 = this.b0;
            if(arr_v == arr_v1) {
                return new k(this.X & ~v1, this.Y & ~v, v2, arr_v1);
            }
        }
        if(arr_v == null) {
            k2 = this;
        }
        else {
            k2 = this;
            for(int v4 = 0; v4 < arr_v.length; ++v4) {
                k2 = k2.c(arr_v[v4]);
            }
        }
        int v5 = k0.Z;
        if(Long.compare(v, 0L) != 0) {
            for(int v6 = 0; v6 < 0x40; ++v6) {
                if((1L << v6 & v) != 0L) {
                    k2 = k2.c(v6 + v5);
                }
            }
        }
        if(v1 != 0L) {
            for(int v3 = 0; v3 < 0x40; ++v3) {
                if((1L << v3 & v1) != 0L) {
                    k2 = k2.c(v3 + 0x40 + v5);
                }
            }
        }
        return k2;
    }

    public final k c(int v) {
        int v1 = this.Z;
        int v2 = v - v1;
        if(v2 >= 0 && v2 < 0x40) {
            return (this.Y & 1L << v2) == 0L ? this : new k(this.X, this.Y & ~(1L << v2), v1, this.b0);
        }
        if(v2 >= 0x40 && v2 < 0x80) {
            long v3 = 1L << v2 - 0x40;
            return (this.X & v3) == 0L ? this : new k(this.X & ~v3, this.Y, v1, this.b0);
        }
        if(v2 < 0) {
            int[] arr_v = this.b0;
            if(arr_v != null) {
                int v4 = q.b(arr_v, v);
                if(v4 >= 0) {
                    int v5 = arr_v.length - 1;
                    if(v5 == 0) {
                        return new k(this.X, this.Y, this.Z, null);
                    }
                    int[] arr_v1 = new int[v5];
                    if(v4 > 0) {
                        n.h0(0, 0, v4, arr_v, arr_v1);
                    }
                    if(v4 < v5) {
                        n.h0(v4, v4 + 1, arr_v.length, arr_v, arr_v1);
                    }
                    return new k(this.X, this.Y, this.Z, arr_v1);
                }
            }
        }
        return this;
    }

    public final boolean d(int v) {
        int v1 = v - this.Z;
        if(v1 >= 0 && v1 < 0x40) {
            return (1L << v1 & this.Y) != 0L;
        }
        if(v1 >= 0x40 && v1 < 0x80) {
            return (1L << v1 - 0x40 & this.X) != 0L;
        }
        return v1 <= 0 ? this.b0 != null && q.b(this.b0, v) >= 0 : false;
    }

    public final k e(k k0) {
        k k3;
        k k1 = k0;
        k k2 = k.c0;
        if(k1 == k2) {
            return this;
        }
        if(this == k2) {
            return k1;
        }
        long v = this.Y;
        long v1 = this.X;
        int[] arr_v = k1.b0;
        long v2 = k1.Y;
        long v3 = k1.X;
        int v4 = this.Z;
        if(k1.Z == v4) {
            int[] arr_v1 = this.b0;
            if(arr_v == arr_v1) {
                return new k(v1 | v3, v | v2, v4, arr_v1);
            }
        }
        if(this.b0 == null) {
            int v5 = this.Z;
            if(Long.compare(v, 0L) != 0) {
                for(int v6 = 0; v6 < 0x40; ++v6) {
                    if((1L << v6 & v) != 0L) {
                        k1 = k1.g(v6 + v5);
                    }
                }
            }
            if(v1 != 0L) {
                for(int v7 = 0; v7 < 0x40; ++v7) {
                    if((1L << v7 & v1) != 0L) {
                        k1 = k1.g(v7 + 0x40 + v5);
                    }
                }
            }
            return k1;
        }
        if(arr_v == null) {
            k3 = this;
        }
        else {
            k3 = this;
            for(int v8 = 0; v8 < arr_v.length; ++v8) {
                k3 = k3.g(arr_v[v8]);
            }
        }
        int v9 = k1.Z;
        if(Long.compare(v2, 0L) != 0) {
            for(int v10 = 0; v10 < 0x40; ++v10) {
                if((1L << v10 & v2) != 0L) {
                    k3 = k3.g(v10 + v9);
                }
            }
        }
        if(v3 != 0L) {
            for(int v11 = 0; v11 < 0x40; ++v11) {
                if((1L << v11 & v3) != 0L) {
                    k3 = k3.g(v11 + 0x40 + v9);
                }
            }
        }
        return k3;
    }

    public final k g(int v) {
        long v12;
        int v11;
        int v1 = this.Z;
        int v2 = v - v1;
        long v3 = this.Y;
        if(v2 >= 0 && v2 < 0x40) {
            return (v3 & 1L << v2) == 0L ? new k(this.X, v3 | 1L << v2, v1, this.b0) : this;
        }
        long v4 = this.X;
        if(v2 >= 0x40 && v2 < 0x80) {
            long v5 = 1L << v2 - 0x40;
            return (v4 & v5) == 0L ? new k(v4 | v5, v3, v1, this.b0) : this;
        }
        int[] arr_v = this.b0;
        if(v2 < 0x80) {
            if(arr_v == null) {
                return new k(v4, v3, v1, new int[]{v});
            }
            int v13 = q.b(arr_v, v);
            if(v13 < 0) {
                int[] arr_v1 = new int[arr_v.length + 1];
                n.h0(0, 0, -(v13 + 1), arr_v, arr_v1);
                n.h0(-(v13 + 1) + 1, -(v13 + 1), arr_v.length, arr_v, arr_v1);
                arr_v1[-(v13 + 1)] = v;
                return new k(this.X, this.Y, this.Z, arr_v1);
            }
        }
        else if(!this.d(v)) {
            int v6 = (v + 1) / 0x40 * 0x40;
            int v7 = this.Z;
            ArrayList arrayList0 = null;
            long v8;
            for(v8 = v4; true; v8 = 0L) {
                if(v7 >= v6) {
                    v12 = v3;
                    v11 = v7;
                    break;
                }
                if(v3 != 0L) {
                    if(arrayList0 == null) {
                        arrayList0 = new ArrayList();
                        if(arr_v != null) {
                            for(int v9 = 0; v9 < arr_v.length; ++v9) {
                                arrayList0.add(((int)arr_v[v9]));
                            }
                        }
                    }
                    for(int v10 = 0; v10 < 0x40; ++v10) {
                        if((1L << v10 & v3) != 0L) {
                            arrayList0.add(((int)(v10 + v7)));
                        }
                    }
                }
                if(v8 == 0L) {
                    v11 = v6;
                    v12 = 0L;
                    break;
                }
                v7 += 0x40;
                v3 = v8;
            }
            if(arrayList0 != null) {
                arr_v = p.P0(arrayList0);
            }
            return new k(v8, v12, v11, arr_v).g(v);
        }
        return this;
    }

    @Override
    public final Iterator iterator() {
        return J.G(new j(this, null));
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(" [");
        ArrayList arrayList0 = new ArrayList(r.b0(this));
        Iterator iterator0 = this.iterator();
        while(((h)iterator0).hasNext()) {
            arrayList0.add(String.valueOf(((Number)((h)iterator0).next()).intValue()));
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("");
        int v = arrayList0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arrayList0.get(v1);
            boolean z = true;
            ++v2;
            if(v2 > 1) {
                stringBuilder1.append(", ");
            }
            if(object0 != null) {
                z = object0 instanceof CharSequence;
            }
            if(z) {
                stringBuilder1.append(((CharSequence)object0));
            }
            else if(object0 instanceof Character) {
                stringBuilder1.append(((Character)object0).charValue());
            }
            else {
                stringBuilder1.append(String.valueOf(object0));
            }
        }
        stringBuilder1.append("");
        stringBuilder0.append(stringBuilder1.toString());
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

