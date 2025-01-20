package G0;

import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.lifecycle.SavedStateHandle;
import d0.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import v2.c;

public final class j0 implements c {
    public final int a;
    public final Object b;

    public j0(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // v2.c
    public final Bundle a() {
        switch(this.a) {
            case 0: {
                Map map0 = ((k)this.b).d();
                Bundle bundle0 = new Bundle();
                for(Object object0: ((LinkedHashMap)map0).entrySet()) {
                    String s = (String)((Map.Entry)object0).getKey();
                    List list0 = (List)((Map.Entry)object0).getValue();
                    bundle0.putParcelableArrayList(s, (list0 instanceof ArrayList ? ((ArrayList)list0) : new ArrayList(list0)));
                }
                return bundle0;
            }
            case 1: {
                return SavedStateHandle.a(((SavedStateHandle)this.b));
            }
            default: {
                return ((d)this.b).Z();
            }
        }
    }
}

