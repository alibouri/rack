package com.drew.metadata.jpeg;

import java.io.Serializable;

public final class c implements Serializable {
    public final int X;
    public final int Y;
    public final int Z;

    public c(int v, int v1, int v2) {
        this.X = v;
        this.Y = v1;
        this.Z = v2;
    }

    @Override
    public final String toString() {
        return String.format("Quantization table %d, Sampling factors %d horiz/%d vert", ((int)this.Z), ((int)(this.Y >> 4 & 15)), ((int)(this.Y & 15)));
    }
}

