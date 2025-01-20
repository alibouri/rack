package X9;

import Ab.t;
import com.sendwave.backend.fragment.AnnouncementFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

public final class c implements Function0 {
    public final Function3 X;
    public final AnnouncementFragment Y;
    public final String Z;
    public final boolean b0;

    public c(Function3 function30, AnnouncementFragment announcementFragment0, String s, boolean z) {
        this.X = function30;
        this.Y = announcementFragment0;
        this.Z = s;
        this.b0 = z;
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.Y.getId();
        this.X.h(s, this.Z, Boolean.valueOf(this.b0));
        return t.a;
    }
}

