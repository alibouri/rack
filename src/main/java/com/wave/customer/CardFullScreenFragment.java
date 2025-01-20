package com.wave.customer;

import Aa.n;
import Ab.o;
import Nb.j;
import R1.d;
import R9.S;
import W4.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c2.U;
import ca.m;

public final class CardFullScreenFragment extends Fragment {
    public final o X0;

    public CardFullScreenFragment() {
        this.X0 = f.A(new n(23, this));
    }

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        j.f(layoutInflater0, "inflater");
        m m0 = (m)d.a(layoutInflater0, 0x7F0D0033, viewGroup0);  // layout:card_full_screen_portrait
        U u0 = this.P0;
        if(u0 == null) {
            throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
        }
        m0.r(u0);
        m0.u(((S)this.X0.getValue()));
        j.e(m0.d, "getRoot(...)");
        return m0.d;
    }
}

