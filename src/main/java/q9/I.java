package q9;

import N9.l;
import Nb.j;
import V8.c;
import V8.e;
import Y8.R6;
import ac.B0;
import ac.o0;
import androidx.lifecycle.ViewModel;
import com.sendwave.util.AgentLocationDatabase;

public final class i extends ViewModel {
    public final R6 Y;
    public final String Z;
    public final k b0;
    public final c c0;
    public final B0 d0;
    public final B0 e0;
    public final h f0;

    public i(AgentLocationDatabase agentLocationDatabase0, R6 r60, String s) {
        j.f(agentLocationDatabase0, "db");
        j.f(r60, "repo");
        super();
        this.Y = r60;
        this.Z = s;
        this.b0 = agentLocationDatabase0.s();
        this.c0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        B0 b00 = o0.c("");
        this.d0 = b00;
        this.e0 = o0.c(Boolean.TRUE);
        this.f0 = new h(o0.F(b00, new l(null, this, 11)), 0);
    }
}

