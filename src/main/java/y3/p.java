package Y3;

import Ec.E;
import Ec.b;
import Ec.u;
import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.UploadsHttpBody;
import io.sentry.config.a;
import pc.t;

public final class p extends a {
    public final int i;
    public final Object j;

    public p(int v, Object object0) {
        this.i = v;
        this.j = object0;
        super();
    }

    @Override  // io.sentry.config.a
    public final long B() {
        return this.i == 0 ? ((HttpBody)this.j).getContentLength() : -1L;
    }

    @Override  // io.sentry.config.a
    public final t C() {
        return this.i == 0 ? android.support.v4.media.session.a.C(((HttpBody)this.j).getContentType()) : ((a)this.j).C();
    }

    @Override  // io.sentry.config.a
    public boolean R() {
        return this.i == 0 ? ((HttpBody)this.j) instanceof UploadsHttpBody : super.R();
    }

    @Override  // io.sentry.config.a
    public final void c0(E e0) {
        if(this.i != 0) {
            E e1 = b.b(new u(e0));
            ((a)this.j).c0(e1);
            e1.close();
            return;
        }
        ((HttpBody)this.j).writeTo(e0);
    }
}

