package com.google.android.gms.internal.measurement;

import A3.e;
import java.util.Arrays;
import java.util.RandomAccess;

public final class z2 extends O1 implements RandomAccess {
    public Object[] Y;
    public int Z;
    public static final Object[] b0;
    public static final z2 c0;

    static {
        Object[] arr_object = new Object[0];
        z2.b0 = arr_object;
        z2.c0 = new z2(arr_object, 0, false);
    }

    public z2(Object[] arr_object, int v, boolean z) {
        super(z);
        this.Y = arr_object;
        this.Z = v;
    }

    @Override
    public final void add(int v, Object object0) {
        this.zza();
        if(v >= 0) {
            int v1 = this.Z;
            if(v <= v1) {
                Object[] arr_object = this.Y;
                if(v1 < arr_object.length) {
                    System.arraycopy(arr_object, v, arr_object, v + 1, v1 - v);
                }
                else {
                    Object[] arr_object1 = new Object[Math.max(arr_object.length * 3 / 2 + 1, 10)];
                    System.arraycopy(this.Y, 0, arr_object1, 0, v);
                    System.arraycopy(this.Y, v, arr_object1, v + 1, this.Z - v);
                    this.Y = arr_object1;
                }
                this.Y[v] = object0;
                ++this.Z;
                ++this.modCount;
                return;
            }
        }
        throw new IndexOutOfBoundsException(e.t(v, this.Z, "Index:", ", Size:"));
    }

    @Override
    public final boolean add(Object object0) {
        this.zza();
        Object[] arr_object = this.Y;
        if(this.Z == arr_object.length) {
            this.Y = Arrays.copyOf(this.Y, Math.max(arr_object.length * 3 / 2 + 1, 10));
        }
        int v = this.Z;
        this.Z = v + 1;
        this.Y[v] = object0;
        ++this.modCount;
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.l2
    public final l2 b(int v) {
        if(v < this.Z) {
            throw new IllegalArgumentException();
        }
        return v == 0 ? new z2(z2.b0, this.Z, true) : new z2(Arrays.copyOf(this.Y, v), this.Z, true);
    }

    public final void c(int v) {
        if(v < 0 || v >= this.Z) {
            throw new IndexOutOfBoundsException(e.t(v, this.Z, "Index:", ", Size:"));
        }
    }

    @Override
    public final Object get(int v) {
        this.c(v);
        return this.Y[v];
    }

    @Override  // com.google.android.gms.internal.measurement.O1
    public final Object remove(int v) {
        this.zza();
        this.c(v);
        Object[] arr_object = this.Y;
        Object object0 = arr_object[v];
        int v1 = this.Z;
        if(v < v1 - 1) {
            System.arraycopy(arr_object, v + 1, arr_object, v, v1 - v - 1);
        }
        --this.Z;
        ++this.modCount;
        return object0;
    }

    @Override
    public final Object set(int v, Object object0) {
        this.zza();
        this.c(v);
        Object[] arr_object = this.Y;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        ++this.modCount;
        return object1;
    }

    @Override
    public final int size() {
        return this.Z;
    }
}

