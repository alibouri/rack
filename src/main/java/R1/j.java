package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.ConstraintSet;
import j1.a;

public final class j {
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public int g;
    public String h;
    public int i;
    public static final SparseIntArray j;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        j.j = sparseIntArray0;
        sparseIntArray0.append(3, 1);
        sparseIntArray0.append(5, 2);
        sparseIntArray0.append(9, 3);
        sparseIntArray0.append(2, 4);
        sparseIntArray0.append(1, 5);
        sparseIntArray0.append(0, 6);
        sparseIntArray0.append(4, 7);
        sparseIntArray0.append(8, 8);
        sparseIntArray0.append(7, 9);
        sparseIntArray0.append(6, 10);
    }

    public final void a(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, n.f);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            switch(j.j.get(v2)) {
                case 1: {
                    this.e = typedArray0.getFloat(v2, this.e);
                    break;
                }
                case 2: {
                    this.c = typedArray0.getInt(v2, this.c);
                    break;
                }
                case 3: {
                    if(typedArray0.peekValue(v2).type == 3) {
                        typedArray0.getString(v2);
                    }
                    else {
                        String s = a.a[typedArray0.getInteger(v2, 0)];
                    }
                    break;
                }
                case 4: {
                    typedArray0.getInt(v2, 0);
                    break;
                }
                case 5: {
                    this.a = ConstraintSet.f(typedArray0, v2, this.a);
                    break;
                }
                case 6: {
                    this.b = typedArray0.getInteger(v2, this.b);
                    break;
                }
                case 7: {
                    this.d = typedArray0.getFloat(v2, this.d);
                    break;
                }
                case 8: {
                    this.g = typedArray0.getInteger(v2, this.g);
                    break;
                }
                case 9: {
                    this.f = typedArray0.getFloat(v2, this.f);
                    break;
                }
                case 10: {
                    int v3 = typedArray0.peekValue(v2).type;
                    if(v3 == 1) {
                        this.i = typedArray0.getResourceId(v2, -1);
                    }
                    else if(v3 == 3) {
                        String s1 = typedArray0.getString(v2);
                        this.h = s1;
                        if(s1.indexOf("/") > 0) {
                            this.i = typedArray0.getResourceId(v2, -1);
                        }
                    }
                    else {
                        typedArray0.getInteger(v2, this.i);
                    }
                }
            }
        }
        typedArray0.recycle();
    }
}

