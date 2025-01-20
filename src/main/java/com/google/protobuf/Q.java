package com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

public final class q extends b implements T, r, RandomAccess {
    public int[] Y;
    public int Z;
    public static final q b0;

    static {
        q.b0 = new q(new int[0], 0, false);
    }

    public q(int[] arr_v, int v, boolean z) {
        super(z);
        this.Y = arr_v;
        this.Z = v;
    }

    @Override
    public final void add(int v, Object object0) {
        int v1 = (int)(((Integer)object0));
        this.a();
        if(v >= 0) {
            int v2 = this.Z;
            if(v <= v2) {
                int[] arr_v = this.Y;
                if(v2 < arr_v.length) {
                    System.arraycopy(arr_v, v, arr_v, v + 1, v2 - v);
                }
                else {
                    int[] arr_v1 = new int[v2 * 3 / 2 + 1];
                    System.arraycopy(arr_v, 0, arr_v1, 0, v);
                    System.arraycopy(this.Y, v, arr_v1, v + 1, this.Z - v);
                    this.Y = arr_v1;
                }
                this.Y[v] = v1;
                ++this.Z;
                ++this.modCount;
                return;
            }
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Index:", ", Size:");
        stringBuilder0.append(this.Z);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override  // com.google.protobuf.b
    public final boolean add(Object object0) {
        this.c(((int)(((Integer)object0))));
        return true;
    }

    @Override  // com.google.protobuf.b
    public final boolean addAll(Collection collection0) {
        this.a();
        collection0.getClass();
        if(!(collection0 instanceof q)) {
            return super.addAll(collection0);
        }
        int v = ((q)collection0).Z;
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
        System.arraycopy(((q)collection0).Y, 0, this.Y, this.Z, ((q)collection0).Z);
        this.Z = v2;
        ++this.modCount;
        return true;
    }

    public final void c(int v) {
        this.a();
        int v1 = this.Z;
        int[] arr_v = this.Y;
        if(v1 == arr_v.length) {
            int[] arr_v1 = new int[v1 * 3 / 2 + 1];
            System.arraycopy(arr_v, 0, arr_v1, 0, v1);
            this.Y = arr_v1;
        }
        int v2 = this.Z;
        this.Z = v2 + 1;
        this.Y[v2] = v;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    public final void d(int v) {
        if(v >= 0 && v < this.Z) {
            return;
        }
        StringBuilder stringBuilder0 = m5.b.A(v, "Index:", ", Size:");
        stringBuilder0.append(this.Z);
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    public final int e(int v) {
        this.d(v);
        return this.Y[v];
    }

    @Override  // com.google.protobuf.b
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return super.equals(object0);
        }
        if(this.Z != ((q)object0).Z) {
            return false;
        }
        int[] arr_v = ((q)object0).Y;
        for(int v = 0; v < this.Z; ++v) {
            if(this.Y[v] != arr_v[v]) {
                return false;
            }
        }
        return true;
    }

    @Override  // com.google.protobuf.t
    public final t f(int v) {
        if(v < this.Z) {
            throw new IllegalArgumentException();
        }
        return new q(Arrays.copyOf(this.Y, v), this.Z, true);
    }

    @Override
    public final Object get(int v) {
        return this.e(v);
    }

    @Override  // com.google.protobuf.b
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; v1 < this.Z; ++v1) {
            v = v * 0x1F + this.Y[v1];
        }
        return v;
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

    @Override  // com.google.protobuf.b
    public final Object remove(int v) {
        this.a();
        this.d(v);
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
        this.a();
        if(v1 < v) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        System.arraycopy(this.Y, v1, this.Y, v, this.Z - v1);
        this.Z -= v1 - v;
        ++this.modCount;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.a();
        this.d(v);
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

