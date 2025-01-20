package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.AnnouncementFrequencyUnit;
import com.sendwave.backend.type.w;
import d9.B;
import d9.Q3;
import d9.n0;
import d9.o0;
import d9.o1;
import d9.p1;
import d9.q1;
import d9.r1;
import d9.t;
import d9.u;
import d9.y;
import java.util.List;

public abstract class b {
    public static final List a;

    static {
        AnnouncementFrequencyUnit.o.getClass();
        List list0 = q.L(new CompiledField[]{new Builder("unit", CompiledGraphQL.-notNull(w.b)).build(), new Builder("interval", CompiledGraphQL.-notNull(q1.a)).build()});
        List list1 = q.L(new CompiledField[]{new Builder("message", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("baseUrl", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = q.L(new CompiledField[]{new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("uri", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("shareInfo", Q3.a).selections(list1).build()});
        List list3 = q.L(new CompiledField[]{new Builder("title", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("message", CompiledGraphQL.-notNull(r1.a)).build(), o.s("imageUrl", r1.a), new Builder("actions", CompiledGraphQL.-list(CompiledGraphQL.-notNull(u.a))).selections(list2).build()});
        List list4 = q.L(new CompiledField[]{new Builder("playPauseButtonColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("playProgressColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("bufferProgressColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("backgroundColor", CompiledGraphQL.-notNull(n0.a)).build()});
        List list5 = q.L(new CompiledField[]{new Builder("color", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("stop", CompiledGraphQL.-notNull(o1.a)).build()});
        List list6 = q.L(new CompiledField[]{new Builder("colorStops", o.t(o0.a)).selections(list5).build(), new Builder("direction", CompiledGraphQL.-notNull(q1.a)).build()});
        List list7 = q.K(new Builder("color", CompiledGraphQL.-notNull(n0.a)).build());
        List list8 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AnnouncementGradientBackground", q.K("AnnouncementGradientBackground")).selections(list6).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AnnouncementSolidColorBackground", q.K("AnnouncementSolidColorBackground")).selections(list7).build()});
        List list9 = q.L(new CompiledField[]{new Builder("textColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("dismissIconColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("playButton", CompiledGraphQL.-notNull(y.a)).selections(list4).build(), new Builder("background", CompiledGraphQL.-notNull(d9.q.a)).selections(list8).build()});
        b.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("title", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("message", CompiledGraphQL.-notNull(r1.a)).build(), o.s("sortOrder", q1.a), o.s("icon", r1.a), o.s("actionUri", r1.a), o.s("animationUrl", r1.a), new Builder("frequency", d9.w.a).selections(list0).build(), new Builder("voiceMessageUri", r1.a).build(), new Builder("detail", t.a).selections(list3).build(), new Builder("styling", B.a).selections(list9).build()});
    }
}

