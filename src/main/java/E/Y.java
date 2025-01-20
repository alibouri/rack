package E;

import a.a;
import java.util.Comparator;

public final class y implements Comparator {
    public final int X;
    public final I Y;

    public y(I i0, int v) {
        this.X = v;
        this.Y = i0;
        super();
    }

    @Override
    public final int compare(Object object0, Object object1) {
        if(this.X != 0) {
            Object object2 = ((M)object1).getKey();
            Integer integer0 = this.Y.a(object2);
            Object object3 = ((M)object0).getKey();
            return a.j(integer0, this.Y.a(object3));
        }
        Object object4 = ((M)object0).getKey();
        Integer integer1 = this.Y.a(object4);
        Object object5 = ((M)object1).getKey();
        return a.j(integer1, this.Y.a(object5));
    }
}

