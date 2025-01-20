package u;

import Ab.e;
import Nb.j;
import Nb.k;
import a1.g;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function1;

public final class z extends k implements Function1 {
    public final int X;
    public final B Y;
    public final long Z;

    public z(B b0, long v, int v1) {
        this.X = v1;
        this.Y = b0;
        this.Z = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        long v3;
        long v2;
        switch(this.X) {
            case 0: {
                this.Y.getClass();
                long v4 = this.Z;
                switch(((t)object0).ordinal()) {
                    case 0: 
                    case 1: 
                    case 2: {
                        return new IntSize(v4);
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
            case 1: {
                if(this.Y.v0 != null && this.Y.z0() != null && !j.a(this.Y.v0, this.Y.z0())) {
                    switch(((t)object0).ordinal()) {
                        case 0: 
                        case 1: 
                        case 2: {
                            break;
                        }
                        default: {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                }
                return new g(0L);
            }
            default: {
                B b0 = this.Y;
                O o0 = b0.q0.a.b;
                long v = this.Z;
                long v1 = 0L;
                if(o0 == null) {
                    v2 = 0L;
                }
                else {
                    IntSize intSize0 = new IntSize(v);
                    v2 = ((g)((Function1)o0.a).n(intSize0)).a;
                }
                O o1 = b0.r0.a.b;
                if(o1 == null) {
                    v3 = 0L;
                }
                else {
                    IntSize intSize1 = new IntSize(v);
                    v3 = ((g)((Function1)o1.a).n(intSize1)).a;
                }
                switch(((t)object0).ordinal()) {
                    case 0: {
                        v1 = v2;
                        break;
                    }
                    case 1: {
                        break;
                    }
                    case 2: {
                        return new g(v3);
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                return new g(v1);
            }
        }
    }
}

