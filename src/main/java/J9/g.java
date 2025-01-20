package J9;

import Nb.j;
import com.wave.components.PlayStoreUpdaterFragment;
import kotlin.jvm.functions.Function0;

public final class g implements Function0 {
    public final int X;
    public final PlayStoreUpdaterFragment Y;

    public g(PlayStoreUpdaterFragment playStoreUpdaterFragment0, int v) {
        this.X = v;
        this.Y = playStoreUpdaterFragment0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.X) {
            case 0: {
                Object object1 = this.Y.Y0;
                if(object1 != null) {
                    return object1;
                }
                j.p("storage");
                throw null;
            }
            case 1: {
                Object object2 = this.Y.Y0;
                if(object2 != null) {
                    return object2;
                }
                j.p("storage");
                throw null;
            }
            default: {
                Object object0 = this.Y.Y0;
                if(object0 != null) {
                    return object0;
                }
                j.p("storage");
                throw null;
            }
        }
    }
}

