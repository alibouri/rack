package com.sendwave.shared;

import Nb.j;
import R1.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c2.x;
import i9.C;
import o9.X;

public final class ExplanationScreenFragment extends Fragment {
    public X X0;

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        j.f(layoutInflater0, "inflater");
        x x0 = this.j();
        j.d(x0, "null cannot be cast to non-null type com.sendwave.shared.ExtraSecurityChallengeActivity");
        X x1 = ((ExtraSecurityChallengeActivity)x0).I();
        j.f(x1, "<set-?>");
        this.X0 = x1;
        LayoutInflater layoutInflater1 = this.K0;
        if(layoutInflater1 == null) {
            layoutInflater1 = this.F(null);
            this.K0 = layoutInflater1;
        }
        View view0 = layoutInflater1.inflate(0x7F0D0056, viewGroup0, false);  // layout:extra_security_challenge
        C c0 = (C)d.a.b(view0, 0x7F0D0056);  // layout:extra_security_challenge
        c0.r(this);
        X x2 = this.X0;
        if(x2 != null) {
            c0.u(x2);
            return c0.d;
        }
        j.p("viewModel");
        throw null;
    }
}

