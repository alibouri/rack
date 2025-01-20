package Y8;

import Nb.j;
import Nb.x;
import Z8.Q4;
import c9.K0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class j8 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(Q4.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ScratchCardsRefreshQuery { session { user { __typename ...ScratchCardsFragment } } }  fragment RewardsPathRewardFragment on RewardsPathReward { __typename ... on ScratchCardRewardPathReward { background } }  fragment ScratchCardDetailsFragment on ScratchCardDetails { iconUrl title body }  fragment ClaimedScratchCardsFragment on ClaimedScratchCardConnection { pageInfo { hasNextPage } edges { node { id whenExpires iconUrl awardText awardSubtext details { __typename ...ScratchCardDetailsFragment } } } }  fragment ScratchCardsFragment on User { id scratchCards { totalAwardsClaimed banner { text backgroundColor textColor iconUrl } rewardsPath { currentStep maxVisibleStep pastMilestones { edges { node { step reward { __typename ...RewardsPathRewardFragment } } } } upcomingMilestones { step reward { __typename ...RewardsPathRewardFragment } } instructions { currentStepDescription instructionSteps } } lockedCards { id whenExpires unlockInstructions icon background details { __typename ...ScratchCardDetailsFragment } } unlockedCards { id whenExpires award { __typename ... on CashScratchCardAward { awardAmount } ... on CustomScratchCardAward { headerText imageUrl } } unlockedDescription icon background scratchCardTerms { version termsUrl } } claimedCards(last: 8, includeExpired: true) { __typename ...ClaimedScratchCardsFragment } } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == j8.class;
    }

    @Override
    public final int hashCode() {
        return x.a(j8.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "7607c4d01a49b953ced769663ab0b4b59c8e74e4a04c163d9abe7319b40eb368";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ScratchCardsRefreshQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(K0.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}

