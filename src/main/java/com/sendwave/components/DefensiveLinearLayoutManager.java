package com.sendwave.components;

import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.LinearLayoutManager;
import hb.n;

public final class DefensiveLinearLayoutManager extends LinearLayoutManager {
    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final void Z(B b0, F f0) {
        try {
            super.Z(b0, f0);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            n.b(indexOutOfBoundsException0, null, null, 14);
        }
    }

    @Override  // androidx.recyclerview.widget.LinearLayoutManager
    public final boolean y0() {
        return false;
    }
}

