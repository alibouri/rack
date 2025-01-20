package p9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import com.sendwave.shared.paybill.AddFavoriteActivity;
import com.sendwave.shared.paybill.AddFavoriteParams;
import com.sendwave.shared.paybill.AddFavoriteResult;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class c0 extends j implements Function2 {
    public int c0;
    public final j0 d0;

    public c0(j0 j00, g g0) {
        this.d0 = j00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((c0)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new c0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        j0 j00 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = j00.b0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                goto label_10;
            }
            case 1: {
                f.b0(object0);
            label_10:
                AddFavoriteParams addFavoriteParams0 = new AddFavoriteParams(j00.Z.X);
                this.c0 = 2;
                object0 = ((d)object0).l(AddFavoriteActivity.class, addFavoriteParams0, AddFavoriteResult.class, this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j00.e0.k(((AddFavoriteResult)object0).X);
        return t.a;
    }
}

