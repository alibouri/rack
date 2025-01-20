package com.google.android.gms.internal.measurement;

import A3.e;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class f2 extends O1 implements j2, y2, RandomAccess {
    public int[] Y;
    public int Z;
    public static final int[] b0;
    public static final f2 c0;

    static {
        int[] arr_v = new int[0];
        f2.b0 = arr_v;
        f2.c0 = new f2(arr_v, 0, false);
    }

    public f2(int[] arr_v, int v, boolean z) {
        super(z);
        this.Y = arr_v;
        this.Z = v;
    }

    @Override
    public final void add(int v, Object object0) {
        int v1 = (int)(((Integer)object0));
        this.zza();
        if(v >= 0) {
            int v2 = this.Z;
            if(v <= v2) {
                int[] arr_v = this.Y;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[Math.max(arr_v.length * 3 / 2 + 1, 10)];
                    System.arraycopy(this.Y, 0, arr_v1, 0, v);
                    System.arraycopy(this.Y, v, arr_v1, v + 1, this.Z - v);
                    this.Y = arr_v1;
                }
                this.Y[v] = v1;
                ++this.Z;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(e.t(v, this.Z, "Index:", ", Size:"));
    }

    @Override
    public final boolean add(Object object0) {
        this.e(((int)(((Integer)object0))));
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.O1
    public final boolean addAll(Collection collection0) {
        this.zza();
        collection0.getClass();
        if(!(collection0 instanceof f2)) {
            return super.addAll(collection0);
        }
        int v = ((f2)collection0).Z;
        if(v == 0) {
            return false;
        }
        int v1 = this.Z;
        if(0x7FFFFFFF - v1 < v) {
            throw new OutOfMemoryError();
        }
        int v2 = v1 + v;
        int[] arr_v = this.Y;
        if(v2 > arr_v.length) {
            this.Y = Arrays.copyOf(arr_v, v2);
        }
        System.arraycopy(((f2)collection0).Y, 0, this.Y, this.Z, ((f2)collection0).Z);
        this.Z = v2;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.l2
    public final l2 b(int v) {
        return this.d(v);
    }

    public final int c(int v) {
        this.i(v);
        return this.Y[v];
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    public final f2 d(int v) {
        if(v < this.Z) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new f2(f2.b0, this.Z, true) : new f2(Arrays.copyOf(this.Y, v), this.Z, true);
    }

    public final void e(int v) {
        this.zza();
        int[] arr_v = this.Y;
        if(this.Z == arr_v.length) {
            int[] arr_v1 = new int[Math.max(arr_v.length * 3 / 2 + 1, 10)];
            System.arraycopy(this.Y, 0, arr_v1, 0, this.Z);
            this.Y = arr_v1;
        }
        int v1 = this.Z;
        this.Z = v1 + 1;
        this.Y[v1] = v;
    }

    @Override  // com.google.android.gms.internal.measurement.O1
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f2)) {
            return super.equals(object0);
        }
        if(this.Z != ((f2)object0).Z) {
            return false;
        }
        int[] arr_v = ((f2)object0).Y;
        for(int v = 0; v < this.Z; ++v) {
            if(this.Y[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int v) {
        int[] arr_v = this.Y;
        if(v <= arr_v.length) {
            return;
        }
        if(arr_v.length == 0) {
            this.Y = new int[Math.max(v, 10)];
            return;
        }
        int v1;
        for(v1 = arr_v.length; v1 < v; v1 = Math.max(v1 * 3 / 2 + 1, 10)) {
        }
        this.Y = Arrays.copyOf(this.Y, v1);
    }

    @Override
    public final Object get(int v) {
        return this.c(v);
    }

    @Override  // com.google.android.gms.internal.measurement.O1
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.Z; ++v1) {
            v = v * 0x1F + this.Y[v1];
        }
        return v;
    }

    public final void i(int v) {
        if(v < 0 || v >= this.Z) {
            throw new IndexOutOfBoundsException(e.t(v, this.Z, "Index:", ", Size:"));
        }
    }

    @Override
    public final int indexOf(Object object0) {
        if(!(object0 instanceof Integer)) {
            return -1;
        }
        int v = (int)(((Integer)object0));
        int v1 = this.Z;
        for(int v2 = 0; v2 < v1; ++v2) {
            if(this.Y[v2] == v) {
                return v2;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.measurement.O1
    public final Object remove(int v) {
        this.zza();
        this.i(v);
        int[] arr_v = this.Y;
        int v1 = arr_v[v];
        int v2 = this.Z;
        if(v < v2 - 1) {
            System.arraycopy(arr_v, v + 1, arr_v, v, v2 - v - 1);
        }
        --this.Z;
        ++this.modCount;
        return v1;
    }

    @Override
    public final void removeRange(int v, int v1) {
        this.zza();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.Y, v1, this.Y, v, this.Z - v1);
        this.Z -= v1 - v;
        ++this.modCount;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.zza();
        this.i(v);
        int[] arr_v = this.Y;
        int v1 = arr_v[v];
        arr_v[v] = (int)(((Integer)object0));
        return v1;
    }

    @Override
    public final int size() {
        return this.Z;
    }
}

