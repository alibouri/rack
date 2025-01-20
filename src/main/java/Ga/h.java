package ga;

import Ab.t;
import Bb.F;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.R9;
import android.net.Uri.Builder;
import android.net.Uri;
import com.sendwave.backend.type.ActionSource.BUSINESS_SEARCH;
import com.sendwave.util.UNIT;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.m3;
import q9.p1;
import yc.l;

public final class h extends j implements Function2 {
    public Uri c0;
    public int d0;
    public final k e0;
    public final String f0;

    public h(k k0, String s, g g0) {
        this.e0 = k0;
        this.f0 = s;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((h)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new h(this.e0, this.f0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Uri uri0;
        k k0;
        Object object1;
        try {
            object1 = a.X;
            k0 = this.e0;
            switch(this.d0) {
                case 0: {
                    goto label_13;
                }
                case 1: {
                    goto label_10;
                }
                case 2: {
                    goto label_8;
                }
                case 3: 
                case 4: {
                    goto label_6;
                }
                case 5: {
                    goto label_4;
                }
            }
        }
        catch(m3 m30) {
            goto label_34;
        }
        catch(p1 p10) {
            goto label_39;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_4:
        f.b0(object0);
        ((d)object0).g0();
        return t.a;
    label_6:
        f.b0(object0);
        goto label_43;
        try {
        label_8:
            f.b0(object0);
            goto label_31;
        label_10:
            uri0 = this.c0;
            f.b0(object0);
            goto label_24;
        }
        catch(m3 m30) {
            goto label_34;
        }
        catch(p1 p10) {
            goto label_39;
        }
    label_13:
        f.b0(object0);
        Map map0 = F.J(new Ab.k("deal_id", k0.Y.X.X));
        k0.Z.d("click deal action", map0);
        try {
            Uri.Builder uri$Builder0 = Uri.parse(this.f0).buildUpon();
            BUSINESS_SEARCH.X.getClass();
            uri0 = uri$Builder0.appendQueryParameter("action_source", BUSINESS_SEARCH.Y).build();
            this.c0 = uri0;
            this.d0 = 1;
            object0 = k0.c0.e(this);
            if(object0 == object1) {
                return object1;
            }
        label_24:
            Nb.j.c(uri0);
            ((d)object0).o(uri0);
            this.c0 = null;
            this.d0 = 2;
            object0 = k0.c0.e(this);
            if(object0 == object1) {
                return object1;
            }
        label_31:
            ((d)object0).Y(UNIT.X);
        }
        catch(m3 m30) {
        label_34:
            this.c0 = null;
            this.d0 = 3;
            if(l.x(k0.c0, m30, this) == object1) {
                return object1;
            }
        }
        catch(p1 p10) {
        label_39:
            this.c0 = null;
            this.d0 = 4;
            if(l.x(k0.c0, p10, this) == object1) {
                return object1;
            }
        }
    label_43:
        this.d0 = 5;
        object0 = k0.c0.e(this);
        if(object0 == object1) {
            return object1;
        }
        ((d)object0).g0();
        return t.a;
    }
}

