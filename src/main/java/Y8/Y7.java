package Y8;

import M.J;
import Nb.j;
import Z8.o4;
import c9.C0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import java.util.Date;

public final class y7 implements Mutation {
    public final String a;
    public final Date b;
    public final Date c;

    public y7(String s, Date date0, Date date1) {
        this.a = s;
        this.b = date0;
        this.c = date1;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(o4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation SavePlayInstallReferrerMutation($referrerUrl: String!, $whenReferrerClicked: DateTime!, $whenInstallBegan: DateTime!) { savePlayInstallReferrer(referrerUrl: $referrerUrl, whenReferrerClicked: $whenReferrerClicked, whenInstallBegan: $whenInstallBegan) { announcements { __typename ...AnnouncementFragment } } }  fragment AnnouncementFragment on Announcement { id title message sortOrder icon actionUri animationUrl frequency { unit interval } voiceMessageUri detail { title message imageUrl actions { name uri shareInfo { message baseUrl } } } styling { textColor dismissIconColor playButton { playPauseButtonColor playProgressColor bufferProgressColor backgroundColor } background { __typename ... on AnnouncementGradientBackground { colorStops { color stop } direction } ... on AnnouncementSolidColorBackground { color } } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y7)) {
            return false;
        }
        if(!j.a(this.a, ((y7)object0).a)) {
            return false;
        }
        return j.a(this.b, ((y7)object0).b) ? j.a(this.c, ((y7)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "8a1be31f5732c3aefdbd8e11058ba94a787df96b05df95c83e66c3be862e3bd9";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "SavePlayInstallReferrerMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(C0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "referrerUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("whenReferrerClicked");
        u1.a.b(jsonWriter0, customScalarAdapters0, this.b);
        jsonWriter0.name("whenInstallBegan");
        u1.a.b(jsonWriter0, customScalarAdapters0, this.c);
    }

    @Override
    public final String toString() {
        return "SavePlayInstallReferrerMutation(referrerUrl=" + this.a + ", whenReferrerClicked=" + this.b + ", whenInstallBegan=" + this.c + ")";
    }
}

