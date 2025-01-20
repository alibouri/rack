package a9;

import Nb.j;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon;

public final class k3 {
    public final String a;
    public final UserKycIdPhotoStatusIcon b;

    public k3(String s, UserKycIdPhotoStatusIcon userKycIdPhotoStatusIcon0) {
        this.a = s;
        this.b = userKycIdPhotoStatusIcon0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k3)) {
            return false;
        }
        return j.a(this.a, ((k3)object0).a) ? j.a(this.b, ((k3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnUserKycIdPhotoStatusWithTextWithIcon(text=" + this.a + ", icon=" + this.b + ")";
    }
}

