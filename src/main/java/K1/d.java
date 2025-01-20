package k1;

import java.util.ArrayList;
import java.util.Objects;

public final class d extends b {
    static {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add("ConstraintSets");
        arrayList0.add("Variables");
        arrayList0.add("Generate");
        arrayList0.add("Transitions");
        arrayList0.add("KeyFrames");
        arrayList0.add("KeyAttributes");
        arrayList0.add("KeyPositions");
        arrayList0.add("KeyCycles");
    }

    @Override  // k1.b
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return !(object0 instanceof d) || Objects.equals(this.d(), ((d)object0).d()) ? super.equals(object0) : false;
    }
}

