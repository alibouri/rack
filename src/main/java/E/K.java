package E;

import D0.f;
import E0.e;
import E0.g;
import I5.h;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import com.apollographql.apollo.api.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import y.q0;

public final class k implements e {
    public final l X;
    public final h Y;
    public final boolean Z;
    public final LayoutDirection b0;
    public final q0 c0;
    public static final i d0;

    static {
        k.d0 = new i();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public k(l l0, h h0, boolean z, LayoutDirection layoutDirection0, q0 q00) {
        this.X = l0;
        this.Y = h0;
        this.Z = z;
        this.b0 = layoutDirection0;
        this.c0 = q00;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Modifier d(Modifier modifier0) {
        return b.c(this, modifier0);
    }

    @Override  // E0.e
    public final g getKey() {
        return f.a;
    }

    @Override  // E0.e
    public final Object getValue() {
        return this;
    }

    @Override  // androidx.compose.ui.Modifier
    public final boolean i(Function1 function10) {
        return ((Boolean)function10.n(this)).booleanValue();
    }

    public final boolean k(E.h h0, int v) {
        boolean z;
        q0 q00 = this.c0;
        boolean z1 = false;
        if((v == 5 ? v == 6 : true)) {
            z1 = true;
            if(q00 != q0.Y) {
                goto label_9;
            }
        }
        else if((v == 3 ? v == 4 : true)) {
            z1 = true;
            if(q00 != q0.X) {
                goto label_9;
            }
        }
        if(z1) {
            z = true;
        }
        else if((v == 1 ? v == 2 : true)) {
        label_9:
            z = false;
        }
        else {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if(z) {
            return false;
        }
        if(this.m(v)) {
            int v1 = this.X.b();
            return h0.b < v1 - 1;
        }
        return h0.a > 0;
    }

    @Override  // androidx.compose.ui.Modifier
    public final Object l(Object object0, Function2 function20) {
        return function20.j(object0, this);
    }

    public final boolean m(int v) {
        switch(v) {
            case 1: {
                return false;
            }
            case 2: {
                return true;
            }
            default: {
                boolean z = this.Z;
                switch(v) {
                    case 5: {
                        return z;
                    }
                    case 6: {
                        return !z;
                    label_5:
                        LayoutDirection layoutDirection0 = this.b0;
                        if(v == 3) {
                            switch(layoutDirection0.ordinal()) {
                                case 0: {
                                    return z;
                                }
                                case 1: {
                                    return !z;
                                }
                                default: {
                                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                            }
                        }
                        if(v == 4) {
                            switch(layoutDirection0.ordinal()) {
                                case 0: {
                                    return !z;
                                }
                                case 1: {
                                    return z;
                                }
                                default: {
                                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                            }
                        }
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                    default: {
                        goto label_5;
                    }
                }
            }
        }
    }
}

