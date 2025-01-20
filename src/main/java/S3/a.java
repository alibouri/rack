package S3;

import Ab.t;
import D0.V;
import Nb.j;
import W2.c;
import W2.d;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

public final class a implements Function1 {
    public final int X;
    public final ArrayList Y;

    public a(int v, ArrayList arrayList0) {
        this.X = v;
        this.Y = arrayList0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            j.f(((Placeable.PlacementScope)object0), "$this$layout");
            for(Object object1: this.Y) {
                Placeable.PlacementScope.d(((Placeable.PlacementScope)object0), ((V)object1), 0, 0);
            }
            return t.a;
        }
        j.f(((X2.a)object0), "cursor");
        while(((X2.a)object0).a.moveToNext()) {
            String s = ((X2.a)object0).a(0);
            if(s == null) {
                s = "";
            }
            this.Y.add(s);
        }
        d.a.getClass();
        return new c(t.a);
    }
}

