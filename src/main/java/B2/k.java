package B2;

import android.graphics.Matrix;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import java.util.ArrayList;
import s.e;

public final class k extends l {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public String k;

    public k() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.k = null;
    }

    public k(k k0, e e0) {
        j j0;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix0 = new Matrix();
        this.j = matrix0;
        this.k = null;
        this.c = k0.c;
        this.d = k0.d;
        this.e = k0.e;
        this.f = k0.f;
        this.g = k0.g;
        this.h = k0.h;
        this.i = k0.i;
        String s = k0.k;
        this.k = s;
        if(s != null) {
            e0.put(s, this);
        }
        matrix0.set(k0.j);
        ArrayList arrayList0 = k0.b;
        for(int v = 0; v < arrayList0.size(); ++v) {
            Object object0 = arrayList0.get(v);
            if(object0 instanceof k) {
                k k1 = new k(((k)object0), e0);
                this.b.add(k1);
            }
            else {
                if(object0 instanceof j) {
                    j0 = new j(((j)object0));  // initializer: LB2/m;-><init>(LB2/m;)V
                    j0.e = 0.0f;
                    j0.g = 1.0f;
                    j0.h = 1.0f;
                    j0.i = 0.0f;
                    j0.j = 1.0f;
                    j0.k = 0.0f;
                    j0.l = Paint.Cap.BUTT;
                    j0.m = Paint.Join.MITER;
                    j0.n = 4.0f;
                    j0.d = ((j)object0).d;
                    j0.e = ((j)object0).e;
                    j0.g = ((j)object0).g;
                    j0.f = ((j)object0).f;
                    j0.c = ((j)object0).c;
                    j0.h = ((j)object0).h;
                    j0.i = ((j)object0).i;
                    j0.j = ((j)object0).j;
                    j0.k = ((j)object0).k;
                    j0.l = ((j)object0).l;
                    j0.m = ((j)object0).m;
                    j0.n = ((j)object0).n;
                }
                else {
                    if(!(object0 instanceof i)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    j0 = new i(((i)object0));  // initializer: LB2/m;-><init>(LB2/m;)V
                }
                this.b.add(j0);
                String s1 = j0.b;
                if(s1 != null) {
                    e0.put(s1, j0);
                }
            }
        }
    }

    @Override  // B2.l
    public final boolean a() {
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            if(((l)arrayList0.get(v)).a()) {
                return true;
            }
        }
        return false;
    }

    @Override  // B2.l
    public final boolean b(int[] arr_v) {
        boolean z = false;
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.b;
            if(v >= arrayList0.size()) {
                break;
            }
            z |= ((l)arrayList0.get(v)).b(arr_v);
        }
        return z;
    }

    public final void c() {
        this.j.reset();
        this.j.postTranslate(-this.d, -this.e);
        this.j.postScale(this.f, this.g);
        this.j.postRotate(this.c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.k;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if(f != this.d) {
            this.d = f;
            this.c();
        }
    }

    public void setPivotY(float f) {
        if(f != this.e) {
            this.e = f;
            this.c();
        }
    }

    public void setRotation(float f) {
        if(f != this.c) {
            this.c = f;
            this.c();
        }
    }

    public void setScaleX(float f) {
        if(f != this.f) {
            this.f = f;
            this.c();
        }
    }

    public void setScaleY(float f) {
        if(f != this.g) {
            this.g = f;
            this.c();
        }
    }

    public void setTranslateX(float f) {
        if(f != this.h) {
            this.h = f;
            this.c();
        }
    }

    public void setTranslateY(float f) {
        if(f != this.i) {
            this.i = f;
            this.c();
        }
    }
}

