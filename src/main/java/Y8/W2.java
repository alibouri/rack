package Y8;

import Nb.j;

public final class w2 {
    public final x2 a;

    public w2(x2 x20) {
        this.a = x20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof w2 ? j.a(this.a, ((w2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "GenerateSecurityQuestionForm(questionForm=" + this.a + ")";
    }
}

