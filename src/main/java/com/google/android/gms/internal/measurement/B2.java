package com.google.android.gms.internal.measurement;

import Ab.e;
import M.J;
import java.io.IOException;
import java.util.List;

public abstract class b2 implements Cloneable {
    public final c2 X;
    public c2 Y;

    public b2(c2 c20) {
        this.X = c20;
        if(c20.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.Y = (c2)c20.e(4);
    }

    public final b2 b(c2 c20) {
        c2 c21 = this.X;
        if(c21.equals(c20)) {
            return this;
        }
        if(!this.Y.n()) {
            c2 c22 = (c2)c21.e(4);
            c2 c23 = this.Y;
            A2.c.getClass();
            Class class0 = c22.getClass();
            A2.c.a(class0).f(c22, c23);
            this.Y = c22;
        }
        c2 c24 = this.Y;
        A2.c.getClass();
        Class class1 = c24.getClass();
        A2.c.a(class1).f(c24, c20);
        return this;
    }

    public static void c(int v, List list0) {
        String s = J.d(list0.size() - v, "Element at index ", " is null.");
        for(int v1 = list0.size() - 1; v1 >= v; --v1) {
            list0.remove(v1);
        }
        throw new NullPointerException(s);
    }

    @Override
    public final Object clone() {
        Object object0 = (b2)this.X.e(5);
        object0.Y = this.e();
        return object0;
    }

    public final c2 d() {
        c2 c20 = this.e();
        if(!c2.i(c20, true)) {
            throw new e("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return c20;
    }

    public final c2 e() {
        if(!this.Y.n()) {
            return this.Y;
        }
        c2 c20 = this.Y;
        c20.getClass();
        A2.c.getClass();
        Class class0 = c20.getClass();
        A2.c.a(class0).d(c20);
        c20.m();
        return this.Y;
    }

    public final void f() {
        if(!this.Y.n()) {
            c2 c20 = (c2)this.X.e(4);
            c2 c21 = this.Y;
            A2.c.getClass();
            Class class0 = c20.getClass();
            A2.c.a(class0).f(c20, c21);
            this.Y = c20;
        }
    }

    public final void g(byte[] arr_b, int v, W1 w10) {
        if(!this.Y.n()) {
            c2 c20 = (c2)this.X.e(4);
            c2 c21 = this.Y;
            A2.c.getClass();
            Class class0 = c20.getClass();
            A2.c.a(class0).f(c20, c21);
            this.Y = c20;
        }
        try {
            c2 c22 = this.Y;
            A2.c.getClass();
            Class class1 = c22.getClass();
            C2 c23 = A2.c.a(class1);
            c2 c24 = this.Y;
            R1 r10 = new R1();  // initializer: Ljava/lang/Object;-><init>()V
            w10.getClass();
            c23.g(c24, arr_b, 0, v, r10);
        }
        catch(k2 k20) {
            throw k20;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw k2.d();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }
}

