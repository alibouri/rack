package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.A0;
import d9.C;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class c {
    public static final List a;

    static {
        List list0 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Announcement", q.K("Announcement")).selections(b.a).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("Announcement", q.K("Announcement")).selections(b.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("announcements", o.t(d9.o.a)).selections(list0).build(), new Builder("splashAnnouncement", d9.o.a).selections(list1).build()});
        List list3 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CustomerAnnouncements", q.K("CustomerAnnouncements")).selections(O.a).build()});
        c.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("announcementsV3", CompiledGraphQL.-notNull(C.a)).selections(list2).build(), new Builder("customerAnnouncements", CompiledGraphQL.-notNull(A0.a)).selections(list3).build()});
    }
}

