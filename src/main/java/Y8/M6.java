package Y8;

import M.J;
import Z8.F3;
import c9.o0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.i2;
import e9.a;
import java.util.List;

public final class m6 implements Mutation {
    public final List a;

    public m6(List list0) {
        this.a = list0;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(F3.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RecordAnnouncementEventsMutation($eventInputs: [AnnouncementEventInput!]!, $useCustomerAnnouncements: Boolean!) { recordAnnouncementEvents(events: $eventInputs) { succeeded user { __typename ...AnnouncementsFragment @skip(if: $useCustomerAnnouncements) ...CustomerAnnouncementsFragment @include(if: $useCustomerAnnouncements) } } }  fragment AnnouncementFragment on Announcement { id title message sortOrder icon actionUri animationUrl frequency { unit interval } voiceMessageUri detail { title message imageUrl actions { name uri shareInfo { message baseUrl } } } styling { textColor dismissIconColor playButton { playPauseButtonColor playProgressColor bufferProgressColor backgroundColor } background { __typename ... on AnnouncementGradientBackground { colorStops { color stop } direction } ... on AnnouncementSolidColorBackground { color } } } }  fragment NonTimelyAnnouncementsFragment on CustomerAnnouncements { nonTimelyAnnouncement { id announcement { __typename ... on BottomSheetAnnouncement { id title message voiceMessageUrl iconUrl animationUrl button { text actionUri } frequencySeconds } ... on HeaderAnnouncement { id title titleColor icon button { text style { color colorPressed textColor } actionUri } background { __typename ... on AnnouncementSolidColorBackground { color } ... on TwoColorGradient { colorStart colorEnd } } balanceTextColor } } expireOnDatetime expireOnTimesSeen } }  fragment AnnouncementsFragment on User { id announcementsV3 { announcements { __typename ...AnnouncementFragment } splashAnnouncement { __typename ...AnnouncementFragment } } customerAnnouncements { __typename ...NonTimelyAnnouncementsFragment } }  fragment FooterAnnouncementsFragment on CustomerAnnouncements { footerAnnouncements { id audio { styling { backgroundColor bufferProgressColor playPauseButtonColor playProgressColor } voiceMessageUrl } button { actionUri style { color colorPressed textColor } text } iconUrl message styling { background { color } messageColor titleColor } title } }  fragment CustomerAnnouncementsFragment on User { id announcementsV3 { announcements { __typename ...AnnouncementFragment } splashAnnouncement { __typename ...AnnouncementFragment } } customerAnnouncements { __typename ...NonTimelyAnnouncementsFragment ...FooterAnnouncementsFragment } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m6 ? this.a.equals(((m6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + 0x4CF;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "d1902864b528b6f3383d0ac5f287316af85c343e5a761ef9ec83b55adb03338d";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RecordAnnouncementEventsMutation";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", i2.p2).selections(o0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "eventInputs");
        Adapters.-list(Adapters.-obj$default(a.c, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, this.a);
        jsonWriter0.name("useCustomerAnnouncements");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.TRUE);
    }

    @Override
    public final String toString() {
        return "RecordAnnouncementEventsMutation(eventInputs=" + this.a + ", useCustomerAnnouncements=true)";
    }
}

