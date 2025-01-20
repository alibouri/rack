package com.apollographql.apollo.api;

import Ab.t;
import Ba.l;
import Ec.F;
import Ec.N;
import Ec.b;
import Ec.e;
import Ec.k;
import Nb.j;
import java.io.File;
import java.io.FileInputStream;

public final class FileUpload {
    public static final DefaultUpload toUpload(File file0, String s) {
        j.f(file0, "<this>");
        j.f(s, "contentType");
        Builder defaultUpload$Builder0 = new Builder().content(new l(24, file0)).contentLength(file0.length()).contentType(s);
        String s1 = file0.getName();
        j.e(s1, "getName(...)");
        return defaultUpload$Builder0.fileName(s1).build();
    }

    private static final t toUpload$lambda$1(File file0, k k0) {
        j.f(k0, "sink");
        j.f(file0, "<this>");
        F f0 = b.c(new e(new FileInputStream(file0), N.d));
        try {
            k0.p(f0);
        }
        catch(Throwable throwable0) {
            T4.l.F(f0, throwable0);
            throw throwable0;
        }
        T4.l.F(f0, null);
        return t.a;
    }
}

