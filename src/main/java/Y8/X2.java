package Y8;

import Nb.j;
import com.sendwave.backend.fragment.SecurityQuestionFragment;

public final class x2 {
    public final String a;
    public final SecurityQuestionFragment b;

    public x2(String s, SecurityQuestionFragment securityQuestionFragment0) {
        this.a = s;
        this.b = securityQuestionFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x2)) {
            return false;
        }
        return j.a(this.a, ((x2)object0).a) ? j.a(this.b, ((x2)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "QuestionForm(__typename=" + this.a + ", securityQuestionFragment=" + this.b + ")";
    }
}

