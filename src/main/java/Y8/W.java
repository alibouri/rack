package Y8;

import M.J;
import Z8.m;
import c9.f;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.b;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class w implements Query {
    public final boolean a;

    public w(boolean z) {
        this.a = z;
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(m.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query AnnouncementsV3Query($useCustomerAnnouncements: Boolean!) { session { user { __typename ...AnnouncementsFragment @skip(if: $useCustomerAnnouncements) ...CustomerAnnouncementsFragment @include(if: $useCustomerAnnouncements) } } }  fragment AnnouncementFragment on Announcement { id title message sortOrder icon actionUri animationUrl frequency { unit interval } voiceMessageUri detail { title message imageUrl actions { name uri shareInfo { message baseUrl } } } styling { textColor dismissIconColor playButton { playPauseButtonColor playProgressColor bufferProgressColor backgroundColor } background { __typename ... on AnnouncementGradientBackground { colorStops { color stop } direction } ... on AnnouncementSolidColorBackground { color } } } }  fragment NonTimelyAnnouncementsFragment on CustomerAnnouncements { nonTimelyAnnouncement { id announcement { __typename ... on BottomSheetAnnouncement { id title message voiceMessageUrl iconUrl animationUrl button { text actionUri } frequencySeconds } ... on HeaderAnnouncement { id title titleColor icon button { text style { color colorPressed textColor } actionUri } background { __typename ... on AnnouncementSolidColorBackground { color } ... on TwoColorGradient { colorStart colorEnd } } balanceTextColor } } expireOnDatetime expireOnTimesSeen } }  fragment AnnouncementsFragment on User { id announcementsV3 { announcements { __typename ...AnnouncementFragment } splashAnnouncement { __typename ...AnnouncementFragment } } customerAnnouncements { __typename ...NonTimelyAnnouncementsFragment } }  fragment FooterAnnouncementsFragment on CustomerAnnouncements { footerAnnouncements { id audio { styling { backgroundColor bufferProgressColor playPauseButtonColor playProgressColor } voiceMessageUrl } button { actionUri style { color colorPressed textColor } text } iconUrl message styling { background { color } messageColor titleColor } title } }  fragment CustomerAnnouncementsFragment on User { id announcementsV3 { announcements { __typename ...AnnouncementFragment } splashAnnouncement { __typename ...AnnouncementFragment } } customerAnnouncements { __typename ...NonTimelyAnnouncementsFragment ...FooterAnnouncementsFragment } }";
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof w ? this.a == ((w)object0).a : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "94738c68fa7ebd57c9e8bbd3ada049ee3fb206d745723c6b3e5fd8efe0b59176";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "AnnouncementsV3Query";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(f.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        J.m(jsonWriter0, "writer", customScalarAdapters0, "customScalarAdapters", "useCustomerAnnouncements");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(this.a));
    }

    @Override
    public final String toString() {
        return b.r(new StringBuilder("AnnouncementsV3Query(useCustomerAnnouncements="), this.a, ")");
    }
}

