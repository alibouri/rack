package s;

import Nb.j;
import androidx.datastore.preferences.protobuf.i0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class e extends J implements Map {
    public i0 b0;
    public b c0;
    public d d0;

    @Override
    public final Set entrySet() {
        i0 i00 = this.b0;
        if(i00 == null) {
            i00 = new i0(this, 2);
            this.b0 = i00;
        }
        return i00;
    }

    public final boolean i(Collection collection0) {
        for(Object object0: collection0) {
            if(!super.containsKey(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean j(Collection collection0) {
        int v = this.Z;
        for(Object object0: collection0) {
            super.remove(object0);
        }
        return v != this.Z;
    }

    @Override
    public final Set keySet() {
        b b0 = this.c0;
        if(b0 == null) {
            b0 = new b(this);
            this.c0 = b0;
        }
        return b0;
    }

    @Override
    public final void putAll(Map map0) {
        int v = map0.size() + this.Z;
        int v1 = this.Z;
        int[] arr_v = this.X;
        if(arr_v.length < v) {
            int[] arr_v1 = Arrays.copyOf(arr_v, v);
            j.e(arr_v1, "copyOf(this, newSize)");
            this.X = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.Y, v * 2);
            j.e(arr_object, "copyOf(this, newSize)");
            this.Y = arr_object;
        }
        if(this.Z != v1) {
            throw new ConcurrentModificationException();
        }
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override
    public final Collection values() {
        d d0 = this.d0;
        if(d0 == null) {
            d0 = new d(this);
            this.d0 = d0;
        }
        return d0;
    }
}

