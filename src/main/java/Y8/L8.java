package Y8;

import Nb.j;
import com.sendwave.backend.fragment.SmsTokenFragment;

public final class l8 {
    public final String a;
    public final SmsTokenFragment b;

    public l8(String s, SmsTokenFragment smsTokenFragment0) {
        this.a = s;
        this.b = smsTokenFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l8)) {
            return false;
        }
        return j.a(this.a, ((l8)object0).a) ? j.a(this.b, ((l8)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnSMSToken(__typename=" + this.a + ", smsTokenFragment=" + this.b + ")";
    }
}

