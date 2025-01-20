package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.K3;
import com.sendwave.backend.type.ScratchCardBackground;
import com.sendwave.backend.type.ScratchCardIcon;
import com.sendwave.backend.type.z3;
import d9.E0;
import d9.X1;
import d9.f2;
import d9.j3;
import d9.k0;
import d9.k3;
import d9.l3;
import d9.m3;
import d9.n0;
import d9.n3;
import d9.o3;
import d9.p1;
import d9.q1;
import d9.r1;
import d9.t4;
import d9.u3;
import d9.v3;
import d9.w3;
import d9.x3;
import java.util.List;

public abstract class i0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("text", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("backgroundColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("textColor", CompiledGraphQL.-notNull(n0.a)).build(), new Builder("iconUrl", CompiledGraphQL.-notNull(r1.a)).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RewardsPathReward", q.K("ScratchCardRewardPathReward")).selections(d0.a).build()});
        List list2 = q.L(new CompiledField[]{new Builder("step", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("reward", CompiledGraphQL.-notNull(o3.a)).selections(list1).build()});
        List list3 = o.A(new Builder("node", CompiledGraphQL.-notNull(k3.a)), list2);
        List list4 = o.A(new Builder("edges", o.t(m3.a)), list3);
        List list5 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("RewardsPathReward", q.K("ScratchCardRewardPathReward")).selections(d0.a).build()});
        List list6 = q.L(new CompiledField[]{new Builder("step", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("reward", CompiledGraphQL.-notNull(o3.a)).selections(list5).build()});
        List list7 = q.L(new CompiledField[]{o.s("currentStepDescription", r1.a), new Builder("instructionSteps", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(r1.a)))).build()});
        List list8 = q.L(new CompiledField[]{new Builder("currentStep", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("maxVisibleStep", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("pastMilestones", CompiledGraphQL.-notNull(l3.a)).selections(list4).build(), new Builder("upcomingMilestones", o.t(k3.a)).selections(list6).build(), new Builder("instructions", j3.a).selections(list7).build()});
        List list9 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ScratchCardDetails", q.K("ScratchCardDetails")).selections(h0.a).build()});
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        CompiledField compiledField1 = new Builder("whenExpires", E0.a).build();
        CompiledField compiledField2 = new Builder("unlockInstructions", CompiledGraphQL.-notNull(r1.a)).build();
        ScratchCardIcon.H.getClass();
        CompiledField compiledField3 = new Builder("icon", K3.b).build();
        ScratchCardBackground.G.getClass();
        List list10 = q.L(new CompiledField[]{compiledField0, compiledField1, compiledField2, compiledField3, new Builder("background", z3.b).build(), new Builder("details", w3.a).selections(list9).build()});
        List list11 = q.K(new Builder("awardAmount", CompiledGraphQL.-notNull(f2.a)).build());
        List list12 = q.L(new CompiledField[]{new Builder("headerText", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("imageUrl", CompiledGraphQL.-notNull(r1.a)).build()});
        List list13 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CashScratchCardAward", q.K("CashScratchCardAward")).selections(list11).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("CustomScratchCardAward", q.K("CustomScratchCardAward")).selections(list12).build()});
        List list14 = q.L(new CompiledField[]{new Builder("version", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("termsUrl", CompiledGraphQL.-notNull(r1.a)).build()});
        List list15 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), o.s("whenExpires", E0.a), new Builder("award", u3.a).selections(list13).build(), o.s("unlockedDescription", r1.a), new Builder("icon", K3.b).build(), new Builder("background", z3.b).build(), new Builder("scratchCardTerms", d9.z3.a).selections(list14).build()});
        List list16 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ClaimedScratchCardConnection", q.K("ClaimedScratchCardConnection")).selections(l.a).build()});
        List list17 = q.L(new CompiledField[]{o.s("totalAwardsClaimed", f2.a), new Builder("banner", v3.a).selections(list0).build(), new Builder("rewardsPath", n3.a).selections(list8).build(), new Builder("lockedCards", CompiledGraphQL.-list(CompiledGraphQL.-notNull(X1.a))).selections(list10).build(), new Builder("unlockedCards", CompiledGraphQL.-list(CompiledGraphQL.-notNull(t4.a))).selections(list15).build(), new Builder("claimedCards", k0.a).arguments(q.L(new CompiledArgument[]{new com.apollographql.apollo.api.CompiledArgument.Builder(x3.b).value(Boolean.TRUE).build(), new com.apollographql.apollo.api.CompiledArgument.Builder(x3.c).value(8).build()})).selections(list16).build()});
        i0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("scratchCards", x3.d).selections(list17).build()});
    }
}

