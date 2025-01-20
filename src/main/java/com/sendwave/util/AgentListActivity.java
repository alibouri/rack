package com.sendwave.util;

import J2.w;
import R1.d;
import Y8.N;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import f9.E;
import hb.h;
import i9.j;
import q2.u;
import q9.C3;
import q9.b;
import q9.e;
import q9.i;
import q9.k3;
import q9.r1;

public final class AgentListActivity extends k3 {
    public AgentLocationDatabase F0;
    public j G0;

    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        AgentLocationDatabase agentLocationDatabase0;
        super.onCreate(bundle0);
        C3 c30 = r1.b(this);
        r1 r10 = AgentLocationDatabase.m;
        Application application0 = this.getApplication();
        Nb.j.e(application0, "getApplication(...)");
        synchronized(r10) {
            if(AgentLocationDatabase.n == null) {
                Context context0 = application0.getApplicationContext();
                Nb.j.e(context0, "getApplicationContext(...)");
                u u0 = w.w(context0, AgentLocationDatabase.class, "agent_location_db");
                u0.l = false;
                u0.m = true;
                AgentLocationDatabase.n = (AgentLocationDatabase)u0.b();
            }
            agentLocationDatabase0 = AgentLocationDatabase.n;
            Nb.j.c(agentLocationDatabase0);
        }
        this.F0 = agentLocationDatabase0;
        i i0 = (i)new ViewModelProvider(this, new b(this, c30)).a(i.class);
        i0.c0.c(this, this.E0);
        e e0 = new e(i0, null);
        N.k(i0, i0.c0, true, e0);
        j j0 = (j)d.a(this.getLayoutInflater(), 0x7F0D0020, null);  // layout:agent_list
        j0.v(i0);
        j0.u(new E(this, i0.f0, null));
        j0.r(this);
        this.G0 = j0;
        this.setContentView(j0.d);
        j j1 = this.G0;
        if(j1 != null) {
            j1.r.setItemAnimator(null);
            h h0 = this.z();
            if(h0 != null) {
                h0.h0(true);
            }
            return;
        }
        Nb.j.p("binding");
        throw null;
    }
}

