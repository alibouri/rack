package com.sendwave.shared;

import Nb.j;
import R1.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import c2.x;
import f9.E;
import f9.I;
import f9.f;
import i9.r0;
import o9.Q;
import o9.X;

public final class SecurityQuestionFormFragment extends Fragment {
    public X X0;

    @Override  // androidx.fragment.app.Fragment
    public final View B(LayoutInflater layoutInflater0, ViewGroup viewGroup0) {
        j.f(layoutInflater0, "inflater");
        x x0 = this.j();
        j.d(x0, "null cannot be cast to non-null type com.sendwave.shared.ExtraSecurityChallengeActivity");
        X x1 = ((ExtraSecurityChallengeActivity)x0).I();
        j.f(x1, "<set-?>");
        this.X0 = x1;
        I i0 = new I(0x7F0D00EC, x1, this);  // layout:security_question_form_header
        X x2 = this.X0;
        if(x2 != null) {
            f f0 = new f(new Adapter[]{i0, new E(this, new Q(x2.p0, 0), null)});
            LayoutInflater layoutInflater1 = this.K0;
            if(layoutInflater1 == null) {
                layoutInflater1 = this.F(null);
                this.K0 = layoutInflater1;
            }
            View view0 = layoutInflater1.inflate(0x7F0D00EA, viewGroup0, false);  // layout:security_question_form_base
            r0 r00 = (r0)d.a.b(view0, 0x7F0D00EA);  // layout:security_question_form_base
            r00.r.setItemAnimator(null);
            r00.u(f0);
            r00.r(this);
            X x3 = this.X0;
            if(x3 != null) {
                r00.v(x3);
                return r00.d;
            }
            j.p("viewModel");
            throw null;
        }
        j.p("viewModel");
        throw null;
    }
}

