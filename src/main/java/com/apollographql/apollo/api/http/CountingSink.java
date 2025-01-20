package com.apollographql.apollo.api.http;

import Ec.J;
import Ec.N;
import Nb.j;

final class CountingSink implements J {
    private long bytesWritten;
    private final J delegate;

    public CountingSink(J j0) {
        j.f(j0, "delegate");
        super();
        this.delegate = j0;
    }

    @Override  // Ec.J
    public void close() {
        this.delegate.close();
    }

    @Override  // Ec.J
    public void flush() {
        this.delegate.flush();
    }

    public final long getBytesWritten() {
        return this.bytesWritten;
    }

    @Override  // Ec.J
    public N timeout() {
        return this.delegate.timeout();
    }

    @Override  // Ec.J
    public void write(Ec.j j0, long v) {
        j.f(j0, "source");
        this.delegate.write(j0, v);
        this.bytesWritten += v;
    }
}

