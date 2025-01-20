package com.airbnb.lottie.compose;

import F0.T;
import M.J;
import Nb.j;
import g0.n;
import v3.k;

public final class LottieAnimationSizeElement extends T {
    public final int X;
    public final int Y;

    public LottieAnimationSizeElement(int v, int v1) {
        this.X = v;
        this.Y = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LottieAnimationSizeElement)) {
            return false;
        }
        return this.X == ((LottieAnimationSizeElement)object0).X ? this.Y == ((LottieAnimationSizeElement)object0).Y : false;
    }

    @Override
    public final int hashCode() {
        return this.X * 0x1F + this.Y;
    }

    @Override  // F0.T
    public final n k() {
        n n0 = new k();  // initializer: Lg0/n;-><init>()V
        n0.l0 = this.X;
        n0.m0 = this.Y;
        return n0;
    }

    @Override  // F0.T
    public final void m(n n0) {
        j.f(((k)n0), "node");
        ((k)n0).l0 = this.X;
        ((k)n0).m0 = this.Y;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("LottieAnimationSizeElement(width=");
        stringBuilder0.append(this.X);
        stringBuilder0.append(", height=");
        return J.f(stringBuilder0, this.Y, ")");
    }
}

