package s;

import Bb.n;
import Nb.j;
import java.util.Arrays;
import t.a;

public final class o implements Cloneable {
    public boolean X;
    public long[] Y;
    public Object[] Z;
    public int b0;

    public o(int v) {
        if(v == 0) {
            this.Y = a.b;
            this.Z = a.c;
            return;
        }
        int v1 = v * 8;
        for(int v2 = 4; v2 < 0x20; ++v2) {
            int v3 = (1 << v2) - 12;
            if(v1 <= v3) {
                v1 = v3;
                break;
            }
        }
        this.Y = new long[v1 / 8];
        this.Z = new Object[v1 / 8];
    }

    public o(Object object0) {
        this(10);
    }

    public final void b(long v, Long long0) {
        int v1 = this.b0;
        if(v1 != 0 && v <= this.Y[v1 - 1]) {
            this.j(v, long0);
            return;
        }
        if(this.X) {
            long[] arr_v = this.Y;
            if(v1 >= arr_v.length) {
                Object[] arr_object = this.Z;
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 != p.a) {
                        if(v2 != v3) {
                            arr_v[v3] = arr_v[v2];
                            arr_object[v3] = object0;
                            arr_object[v2] = null;
                        }
                        ++v3;
                    }
                }
                this.X = false;
                this.b0 = v3;
            }
        }
        int v4 = this.b0;
        if(v4 >= this.Y.length) {
            int v5 = (v4 + 1) * 8;
            for(int v6 = 4; v6 < 0x20; ++v6) {
                int v7 = (1 << v6) - 12;
                if(v5 <= v7) {
                    v5 = v7;
                    break;
                }
            }
            long[] arr_v1 = Arrays.copyOf(this.Y, v5 / 8);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.Y = arr_v1;
            Object[] arr_object1 = Arrays.copyOf(this.Z, v5 / 8);
            j.e(arr_object1, "copyOf(this, newSize)");
            this.Z = arr_object1;
        }
        this.Y[v4] = v;
        this.Z[v4] = long0;
        this.b0 = v4 + 1;
    }

    public final void c() {
        int v = this.b0;
        Object[] arr_object = this.Z;
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = null;
        }
        this.b0 = 0;
        this.X = false;
    }

    @Override
    public final Object clone() {
        return this.d();
    }

    public final o d() {
        Object object0 = super.clone();
        j.d(object0, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        ((o)object0).Y = (long[])this.Y.clone();
        ((o)object0).Z = (Object[])this.Z.clone();
        return (o)object0;
    }

    public final Object e(long v) {
        int v1 = a.b(this.Y, this.b0, v);
        if(v1 >= 0) {
            Object object0 = this.Z[v1];
            return object0 == p.a ? null : object0;
        }
        return null;
    }

    public final Object f(long v) {
        Object object0 = -1L;
        int v1 = a.b(this.Y, this.b0, v);
        if(v1 >= 0) {
            Object object1 = this.Z[v1];
            return object1 == p.a ? object0 : object1;
        }
        return object0;
    }

    public final int g(long v) {
        if(this.X) {
            int v1 = this.b0;
            long[] arr_v = this.Y;
            Object[] arr_object = this.Z;
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = arr_object[v2];
                if(object0 != p.a) {
                    if(v2 != v3) {
                        arr_v[v3] = arr_v[v2];
                        arr_object[v3] = object0;
                        arr_object[v2] = null;
                    }
                    ++v3;
                }
            }
            this.X = false;
            this.b0 = v3;
        }
        return a.b(this.Y, this.b0, v);
    }

    public final boolean h() {
        return this.m() == 0;
    }

    public final long i(int v) {
        if(v >= 0 && v < this.b0) {
            if(this.X) {
                int v1 = this.b0;
                long[] arr_v = this.Y;
                Object[] arr_object = this.Z;
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 != p.a) {
                        if(v2 != v3) {
                            arr_v[v3] = arr_v[v2];
                            arr_object[v3] = object0;
                            arr_object[v2] = null;
                        }
                        ++v3;
                    }
                }
                this.X = false;
                this.b0 = v3;
            }
            return this.Y[v];
        }
        a.c(("Expected index to be within 0..size()-1, but was " + v));
        throw null;
    }

    public final void j(long v, Object object0) {
        int v1 = a.b(this.Y, this.b0, v);
        if(v1 >= 0) {
            this.Z[v1] = object0;
            return;
        }
        int v2 = ~v1;
        int v3 = this.b0;
        Object object1 = p.a;
        if(v2 < v3) {
            Object[] arr_object = this.Z;
            if(arr_object[v2] == object1) {
                this.Y[v2] = v;
                arr_object[v2] = object0;
                return;
            }
        }
        if(this.X) {
            long[] arr_v = this.Y;
            if(v3 >= arr_v.length) {
                Object[] arr_object1 = this.Z;
                int v5 = 0;
                for(int v4 = 0; v4 < v3; ++v4) {
                    Object object2 = arr_object1[v4];
                    if(object2 != object1) {
                        if(v4 != v5) {
                            arr_v[v5] = arr_v[v4];
                            arr_object1[v5] = object2;
                            arr_object1[v4] = null;
                        }
                        ++v5;
                    }
                }
                this.X = false;
                this.b0 = v5;
                v2 = ~a.b(this.Y, v5, v);
            }
        }
        int v6 = this.b0;
        if(v6 >= this.Y.length) {
            int v7 = (v6 + 1) * 8;
            for(int v8 = 4; v8 < 0x20; ++v8) {
                int v9 = (1 << v8) - 12;
                if(v7 <= v9) {
                    v7 = v9;
                    break;
                }
            }
            long[] arr_v1 = Arrays.copyOf(this.Y, v7 / 8);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.Y = arr_v1;
            Object[] arr_object2 = Arrays.copyOf(this.Z, v7 / 8);
            j.e(arr_object2, "copyOf(this, newSize)");
            this.Z = arr_object2;
        }
        int v10 = this.b0 - v2;
        if(v10 != 0) {
            long[] arr_v2 = this.Y;
            j.f(arr_v2, "<this>");
            System.arraycopy(arr_v2, v2, arr_v2, v2 + 1, v10);
            n.i0(v2 + 1, v2, this.b0, this.Z, this.Z);
        }
        this.Y[v2] = v;
        this.Z[v2] = object0;
        ++this.b0;
    }

    public final void k(long v) {
        int v1 = a.b(this.Y, this.b0, v);
        if(v1 >= 0) {
            Object[] arr_object = this.Z;
            Object object0 = p.a;
            if(arr_object[v1] != object0) {
                arr_object[v1] = object0;
                this.X = true;
            }
        }
    }

    public final int m() {
        if(this.X) {
            int v = this.b0;
            long[] arr_v = this.Y;
            Object[] arr_object = this.Z;
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = arr_object[v1];
                if(object0 != p.a) {
                    if(v1 != v2) {
                        arr_v[v2] = arr_v[v1];
                        arr_object[v2] = object0;
                        arr_object[v1] = null;
                    }
                    ++v2;
                }
            }
            this.X = false;
            this.b0 = v2;
        }
        return this.b0;
    }

    public final Object n(int v) {
        if(v >= 0 && v < this.b0) {
            if(this.X) {
                int v1 = this.b0;
                long[] arr_v = this.Y;
                Object[] arr_object = this.Z;
                int v3 = 0;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Object object0 = arr_object[v2];
                    if(object0 != p.a) {
                        if(v2 != v3) {
                            arr_v[v3] = arr_v[v2];
                            arr_object[v3] = object0;
                            arr_object[v2] = null;
                        }
                        ++v3;
                    }
                }
                this.X = false;
                this.b0 = v3;
            }
            return this.Z[v];
        }
        a.c(("Expected index to be within 0..size()-1, but was " + v));
        throw null;
    }

    @Override
    public final String toString() {
        if(this.m() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(this.b0 * 28);
        stringBuilder0.append('{');
        int v = this.b0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            stringBuilder0.append(this.i(v1));
            stringBuilder0.append('=');
            Object object0 = this.n(v1);
            if(object0 == stringBuilder0) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        String s = stringBuilder0.toString();
        j.e(s, "StringBuilder(capacity).…builderAction).toString()");
        return s;
    }
}

