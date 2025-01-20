package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintSet;

public final class l {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;
    public static final SparseIntArray n;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        l.n = sparseIntArray0;
        sparseIntArray0.append(6, 1);
        sparseIntArray0.append(7, 2);
        sparseIntArray0.append(8, 3);
        sparseIntArray0.append(4, 4);
        sparseIntArray0.append(5, 5);
        sparseIntArray0.append(0, 6);
        sparseIntArray0.append(1, 7);
        sparseIntArray0.append(2, 8);
        sparseIntArray0.append(3, 9);
        sparseIntArray0.append(9, 10);
        sparseIntArray0.append(10, 11);
        sparseIntArray0.append(11, 12);
    }

    public final void a(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, n.i);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            switch(l.n.get(v2)) {
                case 1: {
                    this.a = typedArray0.getFloat(v2, this.a);
                    break;
                }
                case 2: {
                    this.b = typedArray0.getFloat(v2, this.b);
                    break;
                }
                case 3: {
                    this.c = typedArray0.getFloat(v2, this.c);
                    break;
                }
                case 4: {
                    this.d = typedArray0.getFloat(v2, this.d);
                    break;
                }
                case 5: {
                    this.e = typedArray0.getFloat(v2, this.e);
                    break;
                }
                case 6: {
                    this.f = typedArray0.getDimension(v2, this.f);
                    break;
                }
                case 7: {
                    this.g = typedArray0.getDimension(v2, this.g);
                    break;
                }
                case 8: {
                    this.i = typedArray0.getDimension(v2, this.i);
                    break;
                }
                case 9: {
                    this.j = typedArray0.getDimension(v2, this.j);
                    break;
                }
                case 10: {
                    this.k = typedArray0.getDimension(v2, this.k);
                    break;
                }
                case 11: {
                    this.l = true;
                    this.m = typedArray0.getDimension(v2, this.m);
                    break;
                }
                case 12: {
                    this.h = ConstraintSet.f(typedArray0, v2, this.h);
                }
            }
        }
        typedArray0.recycle();
    }
}

