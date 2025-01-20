package A;

import Ab.t;
import ac.i;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.coroutines.g;

public final class f implements i {
    public final int X;
    public final ArrayList Y;
    public final MutableState Z;

    public f(ArrayList arrayList0, MutableState mutableState0, int v) {
        this.X = v;
        this.Y = arrayList0;
        this.Z = mutableState0;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        if(this.X != 0) {
            ArrayList arrayList0 = this.Y;
            if(((j)object0) instanceof m) {
                arrayList0.add(((j)object0));
            }
            else if(((j)object0) instanceof n) {
                arrayList0.remove(((n)(((j)object0))).a);
            }
            else if(((j)object0) instanceof l) {
                arrayList0.remove(((l)(((j)object0))).a);
            }
            this.Z.setValue(Boolean.valueOf(!arrayList0.isEmpty()));
            return t.a;
        }
        ArrayList arrayList1 = this.Y;
        if(((j)object0) instanceof d) {
            arrayList1.add(((j)object0));
        }
        else if(((j)object0) instanceof e) {
            arrayList1.remove(((e)(((j)object0))).a);
        }
        this.Z.setValue(Boolean.valueOf(!arrayList1.isEmpty()));
        return t.a;
    }
}

