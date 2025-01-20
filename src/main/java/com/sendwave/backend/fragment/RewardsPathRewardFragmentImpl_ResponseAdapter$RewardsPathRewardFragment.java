package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.q6;
import a9.r6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment implements Adapter {
    public static final RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment a;
    public static final List b;

    static {
        RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.a = new RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment();  // initializer: Ljava/lang/Object;-><init>()V
        RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.b = q.K("__typename");
    }

    public static RewardsPathRewardFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        q6 q60 = null;
        String s;
        for(s = null; jsonReader0.selectName(RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"ScratchCardRewardPathReward"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            q60 = r6.a(jsonReader0, customScalarAdapters0);
        }
        return new RewardsPathRewardFragment(s, q60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, RewardsPathRewardFragment rewardsPathRewardFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(rewardsPathRewardFragment0, "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, rewardsPathRewardFragment0.a);
        q6 q60 = rewardsPathRewardFragment0.b;
        if(q60 != null) {
            r6.b(jsonWriter0, customScalarAdapters0, q60);
        }
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.b(jsonWriter0, customScalarAdapters0, ((RewardsPathRewardFragment)object0));
    }
}

