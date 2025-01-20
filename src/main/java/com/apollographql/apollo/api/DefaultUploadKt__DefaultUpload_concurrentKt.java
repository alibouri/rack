package com.apollographql.apollo.api;

import Ab.t;
import Ec.C;
import Ec.b;
import Ec.k;
import Ec.q;
import Ec.x;
import Nb.j;
import U5.a;

final class DefaultUploadKt__DefaultUpload_concurrentKt {
    public static final Upload toUpload(C c0, String s, q q0) {
        j.f(c0, "<this>");
        j.f(s, "contentType");
        j.f(q0, "fileSystem");
        Builder defaultUpload$Builder0 = new Builder().content(new c(q0, c0)).contentType(s);
        Long long0 = (Long)q0.e(c0).e;
        return long0 == null ? defaultUpload$Builder0.contentLength(-1L).build() : defaultUpload$Builder0.contentLength(((long)long0)).build();
    }

    public static Upload toUpload$default(C c0, String s, q q0, int v, Object object0) {
        if((v & 2) != 0) {
            q0 = q.a;
        }
        return DefaultUploadKt.toUpload(c0, s, q0);
    }

    private static final t toUpload$lambda$1$DefaultUploadKt__DefaultUpload_concurrentKt(q q0, C c0, k k0) {
        Throwable throwable2;
        j.f(k0, "sink");
        x x0 = q0.g(c0);
        try {
            k0.p(b.c(x0.b(0L)));
        }
        catch(Throwable throwable0) {
            if(x0 != null) {
                try {
                    x0.close();
                }
                catch(Throwable throwable1) {
                    a.y(throwable0, throwable1);
                }
            }
            throwable2 = throwable0;
            goto label_16;
        }
        try {
            x0.close();
            throwable2 = null;
        }
        catch(Throwable throwable2) {
        }
    label_16:
        if(throwable2 != null) {
            throw throwable2;
        }
        return t.a;
    }
}

