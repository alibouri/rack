package d0;

import U.Z;
import U.t0;
import U0.D;
import androidx.compose.runtime.saveable.SaveableStateRegistry.Entry;
import e0.n;

public final class b implements t0 {
    public m X;
    public j Y;
    public String Z;
    public Object b0;
    public Object[] c0;
    public SaveableStateRegistry.Entry d0;
    public final D e0;

    public b(m m0, j j0, String s, Object object0, Object[] arr_object) {
        this.X = m0;
        this.Y = j0;
        this.Z = s;
        this.b0 = object0;
        this.c0 = arr_object;
        this.e0 = new D(4, this);
    }

    @Override  // U.t0
    public final void a() {
        this.b();
    }

    public final void b() {
        String s;
        j j0 = this.Y;
        if(this.d0 != null) {
            throw new IllegalArgumentException(("entry(" + this.d0 + ") is not null").toString());
        }
        if(j0 != null) {
            D d0 = this.e0;
            Object object0 = d0.invoke();
            if(object0 != null && !j0.a(object0)) {
                if(!(object0 instanceof n)) {
                    s = object0 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                }
                else if(((n)object0).f() != Z.b && ((n)object0).f() != Z.e && ((n)object0).f() != Z.c) {
                    s = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
                else {
                    s = "MutableState containing " + ((n)object0).getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                }
                throw new IllegalArgumentException(s);
            }
            this.d0 = j0.c(this.Z, d0);
        }
    }

    @Override  // U.t0
    public final void c() {
        SaveableStateRegistry.Entry saveableStateRegistry$Entry0 = this.d0;
        if(saveableStateRegistry$Entry0 != null) {
            saveableStateRegistry$Entry0.a();
        }
    }

    @Override  // U.t0
    public final void d() {
        SaveableStateRegistry.Entry saveableStateRegistry$Entry0 = this.d0;
        if(saveableStateRegistry$Entry0 != null) {
            saveableStateRegistry$Entry0.a();
        }
    }
}

