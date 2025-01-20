package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.type.SecurityQuestionFieldFormat;
import com.sendwave.backend.type.SecurityQuestionFieldQuery;
import java.util.List;

public final class w7 {
    public final String a;
    public final SecurityQuestionFieldFormat b;
    public final String c;
    public final SecurityQuestionFieldQuery d;
    public final List e;

    public w7(String s, SecurityQuestionFieldFormat securityQuestionFieldFormat0, String s1, SecurityQuestionFieldQuery securityQuestionFieldQuery0, List list0) {
        this.a = s;
        this.b = securityQuestionFieldFormat0;
        this.c = s1;
        this.d = securityQuestionFieldQuery0;
        this.e = list0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w7)) {
            return false;
        }
        if(!j.a(this.a, ((w7)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((w7)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((w7)object0).c)) {
            return false;
        }
        return j.a(this.d, ((w7)object0).d) ? j.a(this.e, ((w7)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + e.s((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F, 0x1F, this.c)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Field(id=" + this.a + ", fieldFormat=" + this.b + ", fieldLabel=" + this.c + ", fieldQuery=" + this.d + ", answerOptions=" + this.e + ")";
    }
}

