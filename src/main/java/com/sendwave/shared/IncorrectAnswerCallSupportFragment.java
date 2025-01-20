package com.sendwave.shared;

import Ba.l;
import Nb.j;
import R1.d;
import a5.w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c2.x;
import i9.p0;
import o9.X;

public final class IncorrectAnswerCallSupportFragment extends Fragment {
    public X X0;

    @Override  // androidx.fragment.app.Fragment
    public final void A(Bundle bundle0) {
        super.A(bundle0);
        w.l(this.O().c(), this, new l(29, this), 2);
    }

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        j.f(layoutInflater0, "inflater");
        x x0 = this.j();
        j.d(x0, "null cannot be cast to non-null type com.sendwave.shared.ExtraSecurityChallengeActivity");
        this.X0 = ((ExtraSecurityChallengeActivity)x0).I();
        if(viewGroup0 != null) {
            viewGroup0.removeAllViews();
        }
        LayoutInflater layoutInflater1 = this.K0;
        if(layoutInflater1 == null) {
            layoutInflater1 = this.F(null);
            this.K0 = layoutInflater1;
        }
        View view0 = layoutInflater1.inflate(0x7F0D00E9, viewGroup0, false);  // layout:security_question_failed
        p0 p00 = (p0)d.a.b(view0, 0x7F0D00E9);  // layout:security_question_failed
        p00.r(this);
        p00.u(this.X0);
        return p00.d;
    }

    @Override  // androidx.fragment.app.Fragment
    public final void D() {
        this.X0 = null;
        this.D0 = true;
    }
}

