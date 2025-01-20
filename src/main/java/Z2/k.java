package Z2;

import Ab.c;
import Ab.t;
import Nb.a;
import Nb.f;
import Nb.h;
import ac.i;
import k2.I1;
import k2.J1;
import k2.h1;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class k implements f, i {
    public final int X;
    public final Object Y;

    public k(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    public k(Function2 function20) {
        this.X = 1;
        super();
        this.Y = (a)function20;
    }

    @Override  // Nb.f
    public final c a() {
        switch(this.X) {
            case 0: {
                return new a(2, 4, n.class, ((n)this.Y), "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            }
            case 1: {
                return (a)this.Y;
            }
            default: {
                return new h(2, 0, I1.class, ((I1)this.Y), "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            }
        }
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        Object object1 = t.a;
        Object object2 = this.Y;
        switch(this.X) {
            case 0: {
                ((n)object2).k(((Z2.i)object0));
                return object1;
            }
            case 1: {
                return ((Function2)(((a)object2))).j(object0, g0);
            }
            default: {
                Object object3 = ((J1)(((I1)object2))).X.u(((h1)object0), g0);
                return object3 == Eb.a.X ? object3 : object1;
            }
        }
    }

    @Override
    public final boolean equals(Object object0) {
        switch(this.X) {
            case 0: {
                return !(object0 instanceof i) || !(object0 instanceof f) ? false : this.a().equals(((f)object0).a());
            }
            case 1: {
                if(object0 instanceof i && object0 instanceof f) {
                    c c0 = ((f)object0).a();
                    return ((a)this.Y).equals(c0);
                }
                return false;
            }
            default: {
                return !(object0 instanceof i) || !(object0 instanceof f) ? false : this.a().equals(((f)object0).a());
            }
        }
    }

    @Override
    public final int hashCode() {
        switch(this.X) {
            case 0: {
                return this.a().hashCode();
            }
            case 1: {
                return ((a)this.Y).hashCode();
            }
            default: {
                return this.a().hashCode();
            }
        }
    }
}

