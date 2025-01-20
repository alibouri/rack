package d0;

import Ab.t;
import Nb.k;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import kotlin.jvm.functions.Function0;

public final class a extends k implements Function0 {
    public final b X;
    public final m Y;
    public final j Z;
    public final String b0;
    public final Object c0;
    public final Object[] d0;

    public a(b b0, m m0, j j0, String s, Object object0, Object[] arr_object) {
        this.X = b0;
        this.Y = m0;
        this.Z = j0;
        this.b0 = s;
        this.c0 = object0;
        this.d0 = arr_object;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int v1;
        b b0 = this.X;
        j j0 = this.Z;
        int v = 1;
        if(b0.Y == j0) {
            v1 = 0;
        }
        else {
            b0.Y = j0;
            v1 = 1;
        }
        String s = this.b0;
        if(Nb.j.a(b0.Z, s)) {
            v = v1;
        }
        else {
            b0.Z = s;
        }
        b0.X = this.Y;
        b0.b0 = this.c0;
        b0.c0 = this.d0;
        SaveableStateRegistry.Entry saveableStateRegistry$Entry0 = b0.d0;
        if(saveableStateRegistry$Entry0 != null && v != 0) {
            saveableStateRegistry$Entry0.a();
            b0.d0 = null;
            b0.b();
        }
        return t.a;
    }
}

