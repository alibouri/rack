package d9;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;

public abstract class t1 {
    public static final UnionType a;

    static {
        t1.a = new UnionType("HeaderAnnouncementBottomSheetAnnouncement", new ObjectType[]{s1.a, b0.a});
    }
}

