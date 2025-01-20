package Y8;

import Ab.e;
import Nb.j;
import com.apollographql.apollo.api.Executable.Variables;
import com.apollographql.apollo.api.Fragment.Data;
import com.sendwave.backend.FragmentHandle;

public abstract class z6 implements o2 {
    public final Variables a;

    public z6(Variables executable$Variables0) {
        this.a = executable$Variables0;
    }

    @Override  // Y8.o2
    public final FragmentHandle a(Data fragment$Data0) {
        j.f(fragment$Data0, "fragment");
        return new FragmentHandle(S6.c(fragment$Data0), this.a);
    }

    public final com.apollographql.apollo.api.Executable.Data b() {
        if(this instanceof y6) {
            return ((y6)this).b;
        }
        if(!(this instanceof x6)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        return null;
    }

    public abstract boolean c();

    public abstract boolean d();
}

