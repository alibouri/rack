package d9;

import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.UnionType;

public abstract class q {
    public static final UnionType a;

    static {
        q.a = new UnionType("AnnouncementBackground", new ObjectType[]{z.a, x.a});
    }
}

