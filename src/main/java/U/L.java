package u;

import Bb.A;
import D0.J;
import D0.K;
import D0.L;
import D0.M;
import D0.V;
import D0.X;
import D0.o;
import androidx.compose.ui.unit.IntSize;
import io.sentry.config.a;
import java.util.ArrayList;
import java.util.List;

public final class l implements K {
    public final q a;
    public boolean b;

    public l(q q0) {
        this.a = q0;
    }

    @Override  // D0.K
    public final int a(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).N(v);
        int v1 = Bb.q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).N(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // D0.K
    public final L b(M m0, List list0, long v) {
        Object object1;
        Object object0;
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            object0 = null;
            if(v3 >= v1) {
                break;
            }
            arrayList0.add(((J)list0.get(v3)).a(v));
        }
        if(arrayList0.isEmpty()) {
            object1 = null;
        }
        else {
            object1 = arrayList0.get(0);
            int v4 = ((V)object1).X;
            int v5 = Bb.q.y(arrayList0);
            if(1 <= v5) {
                for(int v6 = 1; true; ++v6) {
                    Object object2 = arrayList0.get(v6);
                    int v7 = ((V)object2).X;
                    if(v4 < v7) {
                        object1 = object2;
                        v4 = v7;
                    }
                    if(v6 == v5) {
                        break;
                    }
                }
            }
        }
        int v8 = ((V)object1) == null ? 0 : ((V)object1).X;
        if(!arrayList0.isEmpty()) {
            object0 = arrayList0.get(0);
            int v9 = ((V)object0).Y;
            int v10 = Bb.q.y(arrayList0);
            if(1 <= v10) {
                for(int v11 = 1; true; ++v11) {
                    Object object3 = arrayList0.get(v11);
                    int v12 = ((V)object3).Y;
                    if(v9 < v12) {
                        object0 = object3;
                        v9 = v12;
                    }
                    if(v11 == v10) {
                        break;
                    }
                }
            }
        }
        if(((V)object0) != null) {
            v2 = ((V)object0).Y;
        }
        boolean z = m0.s();
        q q0 = this.a;
        if(z) {
            this.b = true;
            q0.a.setValue(new IntSize(a.d(v8, v2)));
        }
        else if(!this.b) {
            q0.a.setValue(new IntSize(a.d(v8, v2)));
        }
        X x0 = new X(6, arrayList0);
        return m0.L(v8, v2, A.X, x0);
    }

    @Override  // D0.K
    public final int c(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).O(v);
        int v1 = Bb.q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).O(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // D0.K
    public final int d(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).H(v);
        int v1 = Bb.q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).H(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }

    @Override  // D0.K
    public final int e(o o0, List list0, int v) {
        if(list0.isEmpty()) {
            return 0;
        }
        Integer integer0 = ((J)list0.get(0)).b(v);
        int v1 = Bb.q.y(list0);
        if(1 <= v1) {
            for(int v2 = 1; true; ++v2) {
                Integer integer1 = ((J)list0.get(v2)).b(v);
                if(integer1.compareTo(integer0) > 0) {
                    integer0 = integer1;
                }
                if(v2 == v1) {
                    break;
                }
            }
        }
        return integer0 == null ? 0 : ((int)integer0);
    }
}

