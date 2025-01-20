package B;

import A3.e;
import Ab.t;
import D0.V;
import Nb.k;
import O0.u;
import Pb.a;
import android.graphics.Matrix;
import android.graphics.Path;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.jvm.functions.Function1;
import m0.b;
import n0.j;
import yc.d;

public final class d0 extends k implements Function1 {
    public final int X;
    public final Object Y;
    public final int Z;
    public final int b0;

    public d0(int v, V v1, int v2, int v3) {
        this.X = v3;
        this.Z = v;
        this.Y = v1;
        this.b0 = v2;
        super(1);
    }

    public d0(Object object0, int v, int v1, int v2) {
        this.X = v2;
        this.Y = object0;
        this.Z = v;
        this.b0 = v1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)this.Y), this.Z, this.b0);
                return t.a;
            }
            case 1: {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)this.Y), -this.Z, -this.b0);
                return t.a;
            }
            case 2: {
                int v4 = a.H(((float)(this.Z - ((V)this.Y).X)) / 2.0f);
                int v5 = a.H(((float)(this.b0 - ((V)this.Y).Y)) / 2.0f);
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)this.Y), v4, v5);
                return t.a;
            }
            case 3: {
                int v6 = a.H(((float)(this.Z - ((V)this.Y).X)) / 2.0f);
                int v7 = a.H(((float)(this.b0 - ((V)this.Y).Y)) / 2.0f);
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)this.Y), v6, v7);
                return t.a;
            }
            case 4: {
                Placeable.PlacementScope.g(((Placeable.PlacementScope)object0), ((V)this.Y), this.Z, this.b0);
                return t.a;
            }
            default: {
                O0.a a0 = ((u)object0).a;
                int v = ((u)object0).b(this.Z);
                int v1 = ((u)object0).b(this.b0);
                CharSequence charSequence0 = a0.e;
                if(v >= 0 && v <= v1 && v1 <= charSequence0.length()) {
                    Path path0 = new Path();
                    a0.d.f.getSelectionPath(v, v1, path0);
                    int v2 = a0.d.h;
                    if(v2 != 0 && !path0.isEmpty()) {
                        path0.offset(0.0f, ((float)v2));
                    }
                    long v3 = d.d(0.0f, ((u)object0).f);
                    Matrix matrix0 = new Matrix();
                    matrix0.setTranslate(b.d(v3), b.e(v3));
                    path0.transform(matrix0);
                    ((j)this.Y).a.addPath(path0, b.d(0L), b.e(0L));
                    return t.a;
                }
                StringBuilder stringBuilder0 = e.v(v, v1, "start(", ") or end(", ") is out of range [0..");
                stringBuilder0.append(charSequence0.length());
                stringBuilder0.append("], or start > end!");
                throw new IllegalArgumentException(stringBuilder0.toString().toString());
            }
        }
    }
}

