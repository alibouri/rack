package u;

import U.Z;
import U.d;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.unit.IntSize;
import g0.c;
import s.B;
import v.f0;
import v.k0;

public final class k implements f0 {
    public final k0 a;
    public c b;
    public final ParcelableSnapshotMutableState c;
    public final B d;

    public k(k0 k00, c c0) {
        this.a = k00;
        this.b = c0;
        this.c = d.D(new IntSize(0L), Z.e);
        this.d = new B();
    }

    // Deobfuscation rating: LOW(20)
    @Override  // v.f0
    public final boolean a(Enum enum0, Enum enum1) {
        return enum0.equals(this.b()) && enum1.equals(this.c());
    }

    @Override  // v.f0
    public final Object b() {
        return this.a.f().b();
    }

    @Override  // v.f0
    public final Object c() {
        return this.a.f().c();
    }
}

