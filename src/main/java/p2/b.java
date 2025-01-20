package p2;

import android.database.Observable;

public final class B extends Observable {
    public final boolean a() {
        return !this.mObservers.isEmpty();
    }

    public final void b() {
        for(int v = this.mObservers.size() - 1; v >= 0; --v) {
            ((C)this.mObservers.get(v)).a();
        }
    }

    public final void c(int v, int v1) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((C)this.mObservers.get(v2)).d(v, v1);
        }
    }

    public final void d(int v, int v1, Object object0) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((C)this.mObservers.get(v2)).b(v, v1, object0);
        }
    }

    public final void e(int v, int v1) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((C)this.mObservers.get(v2)).c(v, v1);
        }
    }

    public final void f(int v, int v1) {
        for(int v2 = this.mObservers.size() - 1; v2 >= 0; --v2) {
            ((C)this.mObservers.get(v2)).e(v, v1);
        }
    }
}

