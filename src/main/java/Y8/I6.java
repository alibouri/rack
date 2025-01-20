package Y8;

import M.J;
import Nb.j;
import Z8.C3;
import c9.n0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.AnnouncementEventType;
import d9.i2;

public final class i6 implements Mutation {
    public final AnnouncementEventType a;
    public final String b;

    public i6(AnnouncementEventType announcementEventType0, String s) {
        j.f(announcementEventType0, "eventType");
        j.f(s, "announcementId");
        super();
        this.a = announcementEventType0;
        this.b = s;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(C3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RecordAnnouncementEventMutation($eventType: AnnouncementEventType!, $announcementId: String!) { recordAnnouncementEvent(eventType: $eventType, announcementId: $announcementId) { user { __typename ...AnnouncementsFragment } } }  fragment AnnouncementFragment on Announcement { id title message sortOrder icon actionUri animationUrl frequency { unit interval } voiceMessageUri detail { title message imageUrl actions { name uri shareInfo { message baseUrl } } } styling { textColor dismissIconColor playButton { playPauseButtonColor playProgressColor bufferProgressColor backgroundColor } background { __typename ... on AnnouncementGradientBackground { colorStops { color stop } direction } ... on AnnouncementSolidColorBackground { color } } } }  fragment NonTimelyAnnouncementsFragment on CustomerAnnouncements { nonTimelyAnnouncement { id announcement { __typename ... on BottomSheetAnnouncement { id title message voiceMessageUrl iconUrl animationUrl button { text actionUri } frequencySeconds } ... on HeaderAnnouncement { id title titleColor icon button { text style { color colorPressed textColor } actionUri } background { __typename ... on AnnouncementSolidColorBackground { color } ... on TwoColorGradient { colorStart colorEnd } } balanceTextColor } } expireOnDatetime expireOnTimesSeen } }  fragment AnnouncementsFragment on User { id announcementsV3 { announcements { __typename ...AnnouncementFragment } splashAnnouncement { __typename ...AnnouncementFragment } } customerAnnouncements { __typename ...NonTimelyAnnouncementsFragment } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i6)) {
            return false;
        }
        return j.a(this.a, ((i6)object0).a) ? j.a(this.b, ((i6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "4852efad5f63977b4f4a6ed9d5bebb08a314e677215ad149a9ae446e3a3bbc23";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RecordAnnouncementEventMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(n0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "eventType");
        j.f(this.a, "value");
        jsonWriter0.value(this.a.a());
        jsonWriter0.name("announcementId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, this.b);
    }

    @Override
    public final String toString() {
        return "RecordAnnouncementEventMutation(eventType=" + this.a + ", announcementId=" + this.b + ")";
    }
}

