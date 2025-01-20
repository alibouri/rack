package y3;

import O3.j;
import java.util.List;
import u3.e;
import u3.f;
import u3.h;
import u3.l;

public final class a extends j {
    public final int Z;

    public a(int v, List list0) {
        this.Z = v;
        super(list0);
    }

    @Override  // y3.e
    public final e e() {
        switch(this.Z) {
            case 0: {
                return new f(0, ((List)this.Y));
            }
            case 1: {
                return new h(0, ((List)this.Y));
            }
            case 2: {
                return new f(2, ((List)this.Y));
            }
            case 3: {
                return new h(1, ((List)this.Y));
            }
            case 4: {
                return new h(2, ((List)this.Y));
            }
            case 5: {
                return new l(((List)this.Y));
            }
            default: {
                return new f(3, ((List)this.Y));
            }
        }
    }
}

