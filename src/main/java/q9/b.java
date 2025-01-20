package q9;

import Nb.e;
import Nb.j;
import Y8.o;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.sendwave.util.AgentListActivity;
import com.sendwave.util.AgentLocationDatabase;

public final class b implements Factory {
    public final AgentListActivity a;
    public final C3 b;

    public b(AgentListActivity agentListActivity0, C3 c30) {
        this.a = agentListActivity0;
        this.b = c30;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        AgentLocationDatabase agentLocationDatabase0 = this.a.F0;
        if(agentLocationDatabase0 != null) {
            return new i(agentLocationDatabase0, this.b.a(), this.b.k().Y);
        }
        j.p("db");
        throw null;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel b(e e0, MutableCreationExtras mutableCreationExtras0) {
        return o.a(this, e0, mutableCreationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel c(Class class0, CreationExtras creationExtras0) {
        return o.b(this, class0, creationExtras0);
    }
}

