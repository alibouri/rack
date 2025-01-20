package b4;

import E7.g;
import io.sentry.Z;
import io.sentry.a0;
import io.sentry.b0;
import io.sentry.c0;
import io.sentry.d0;
import io.sentry.e0;
import io.sentry.f0;
import io.sentry.g0;
import io.sentry.h0;
import io.sentry.vendor.gson.stream.a;
import java.util.ArrayList;
import java.util.List;
import m5.b;

public final class m {
    public final int a;
    public ArrayList b;

    public m(int v) {
        this.a = v;
        if(v != 1) {
            super();
            this.b = null;
            return;
        }
        super();
        this.b = new ArrayList();
    }

    public m(List list0) {
        this.a = 2;
        super();
        if(list0 == null) {
            list0 = new ArrayList(0);
        }
        this.b = new ArrayList(list0);
    }

    public void a(l l0) {
        if(this.b == null) {
            this.b = new ArrayList();
        }
        for(int v = 0; v < this.b.size(); ++v) {
            if(((l)this.b.get(v)).a.b > l0.a.b) {
                this.b.add(v, l0);
                return;
            }
        }
        this.b.add(l0);
    }

    public void b(m m0) {
        if(m0.b == null) {
            return;
        }
        if(this.b == null) {
            this.b = new ArrayList(m0.b.size());
        }
        for(Object object0: m0.b) {
            this.a(((l)object0));
        }
    }

    // Deobfuscation rating: LOW(20)
    public c0 c() {
        return this.b.isEmpty() ? null : ((c0)b.r(1, this.b));
    }

    public boolean d() {
        if(this.b.size() == 1) {
            return true;
        }
        c0 c00 = this.c();
        this.g();
        if(this.c() instanceof f0) {
            f0 f00 = (f0)this.c();
            this.g();
            e0 e00 = (e0)this.c();
            if(f00 != null && c00 != null && e00 != null) {
                Object object0 = c00.getValue();
                e00.a.put(f00.a, object0);
                return false;
            }
        }
        else if(this.c() instanceof d0) {
            d0 d00 = (d0)this.c();
            if(c00 != null && d00 != null) {
                Object object1 = c00.getValue();
                d00.a.add(object1);
            }
        }
        return false;
    }

    public boolean e(b0 b00) {
        Object object0 = b00.g();
        if(this.c() == null && object0 != null) {
            g0 g00 = new g0(object0);
            this.b.add(g00);
            return true;
        }
        if(this.c() instanceof f0) {
            f0 f00 = (f0)this.c();
            this.g();
            ((e0)this.c()).a.put(f00.a, object0);
            return false;
        }
        if(this.c() instanceof d0) {
            ((d0)this.c()).a.add(object0);
        }
        return false;
    }

    public void f(h0 h00) {
        boolean z;
        int v = a0.a[((a)h00.Y).O().ordinal()];
        ArrayList arrayList0 = this.b;
        a a0 = (a)h00.Y;
        switch(v) {
            case 1: {
                a0.a();
                arrayList0.add(new d0());
                z = false;
                break;
            }
            case 2: {
                a0.l();
                z = this.d();
                break;
            }
            case 3: {
                h00.b();
                arrayList0.add(new e0());
                z = false;
                break;
            }
            case 4: {
                h00.f();
                z = this.d();
                break;
            }
            case 5: {
                arrayList0.add(new f0(a0.nextName()));
                z = false;
                break;
            }
            case 6: {
                z = this.e(new Z(h00, 0));
                break;
            }
            case 7: {
                z = this.e(new g(this, 11, h00));
                break;
            }
            case 8: {
                z = this.e(new Z(h00, 1));
                break;
            }
            case 9: {
                a0.G();
                z = this.e(new T9.b(20));
                break;
            }
            case 10: {
                z = true;
                break;
            }
            default: {
                z = false;
            }
        }
        if(!z) {
            this.f(h00);
        }
    }

    public void g() {
        ArrayList arrayList0 = this.b;
        if(arrayList0.isEmpty()) {
            return;
        }
        arrayList0.remove(arrayList0.size() - 1);
    }

    @Override
    public String toString() {
        if(this.a != 0) {
            return super.toString();
        }
        if(this.b == null) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        for(Object object0: this.b) {
            stringBuilder0.append(((l)object0).toString());
            stringBuilder0.append('\n');
        }
        return stringBuilder0.toString();
    }
}

