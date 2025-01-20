package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintSet;

public final class k {
    public int a;
    public int b;
    public float c;
    public float d;

    public final void a(Context context0, AttributeSet attributeSet0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, n.g);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == 1) {
                this.c = typedArray0.getFloat(1, this.c);
            }
            else if(v2 == 0) {
                int v3 = typedArray0.getInt(0, this.a);
                this.a = v3;
                this.a = ConstraintSet.d[v3];
            }
            else {
                switch(v2) {
                    case 3: {
                        this.d = typedArray0.getFloat(3, this.d);
                        break;
                    }
                    case 4: {
                        this.b = typedArray0.getInt(4, this.b);
                    }
                }
            }
        }
        typedArray0.recycle();
    }
}

