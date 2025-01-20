package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.e1;
import d9.f1;
import d9.n0;
import d9.p1;
import d9.p;
import d9.r1;
import d9.r;
import d9.s;
import d9.y;
import java.util.List;

public abstract class z {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("backgroundColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("bufferProgressColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("playPauseButtonColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("playProgressColor", CompiledGraphQL.-notNull(n0.a)).build()});
        List list1 = q.L(new CompiledField[]{new Builder("styling", y.a).selections(list0).build(), new Builder("voiceMessageUrl", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = q.L(new CompiledField[]{new Builder("color", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("colorPressed", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("textColor", CompiledGraphQL.-notNull(n0.a)).build()});
        List list3 = q.L(new CompiledField[]{new Builder("actionUri", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("style", CompiledGraphQL.-notNull(s.a)).selections(list2).build(), new Builder("text", CompiledGraphQL.-notNull(r1.a)).build()});
        List list4 = q.K(new Builder("color", CompiledGraphQL.-notNull(n0.a)).build());
        List list5 = q.L(new CompiledField[]{new Builder("background", CompiledGraphQL.-notNull(d9.z.a)).selections(list4).build(), o.s("messageColor", n0.a), new Builder("titleColor", CompiledGraphQL.-notNull(n0.a)).build()});
        List list6 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("audio", p.a).selections(list1).build(), new Builder("button", r.a).selections(list3).build(), new Builder("iconUrl", CompiledGraphQL.-notNull(r1.a)).build(), o.s("message", r1.a), new Builder("styling", CompiledGraphQL.-notNull(f1.a)).selections(list5).build(), new Builder("title", CompiledGraphQL.-notNull(r1.a)).build()});
        z.a = o.A(new Builder("footerAnnouncements", o.t(e1.a)), list6);
    }
}

