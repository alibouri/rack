package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle;

public final class j3 {
    public final String a;
    public final String b;
    public final UserKycIdPhotoStatusIcon c;
    public final UserKycIdPhotoStatusRectangle d;

    public j3(String s, String s1, UserKycIdPhotoStatusIcon userKycIdPhotoStatusIcon0, UserKycIdPhotoStatusRectangle userKycIdPhotoStatusRectangle0) {
        this.a = s;
        this.b = s1;
        this.c = userKycIdPhotoStatusIcon0;
        this.d = userKycIdPhotoStatusRectangle0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j3)) {
            return false;
        }
        if(!j.a(this.a, ((j3)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((j3)object0).b)) {
            return false;
        }
        return j.a(this.c, ((j3)object0).c) ? j.a(this.d, ((j3)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b)) * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnUserKycIdPhotoStatusWithTextInRectangle(title=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", rectangle=" + this.d + ")";
    }
}

