package com.apollographql.apollo.api;

import Bb.z;
import Nb.j;
import java.util.List;

public final class CompiledFragment extends CompiledSelection {
    public static final class Builder {
        private List condition;
        private final List possibleTypes;
        private List selections;
        private final String typeCondition;

        public Builder(String s, List list0) {
            j.f(s, "typeCondition");
            j.f(list0, "possibleTypes");
            super();
            this.typeCondition = s;
            this.possibleTypes = list0;
            this.condition = z.X;
            this.selections = z.X;
        }

        public final CompiledFragment build() {
            return new CompiledFragment(this.typeCondition, this.possibleTypes, this.condition, this.selections);
        }

        public final Builder condition(List list0) {
            j.f(list0, "condition");
            this.condition = list0;
            return this;
        }

        public final List getCondition() {
            return this.condition;
        }

        public final List getPossibleTypes() {
            return this.possibleTypes;
        }

        public final List getSelections() {
            return this.selections;
        }

        public final String getTypeCondition() {
            return this.typeCondition;
        }

        public final Builder selections(List list0) {
            j.f(list0, "selections");
            this.selections = list0;
            return this;
        }

        public final void setCondition(List list0) {
            j.f(list0, "<set-?>");
            this.condition = list0;
        }

        public final void setSelections(List list0) {
            j.f(list0, "<set-?>");
            this.selections = list0;
        }
    }

    private final List condition;
    private final List possibleTypes;
    private final List selections;
    private final String typeCondition;

    public CompiledFragment(String s, List list0, List list1, List list2) {
        j.f(s, "typeCondition");
        j.f(list0, "possibleTypes");
        j.f(list1, "condition");
        j.f(list2, "selections");
        super(null);
        this.typeCondition = s;
        this.possibleTypes = list0;
        this.condition = list1;
        this.selections = list2;
    }

    public final List getCondition() {
        return this.condition;
    }

    public final List getPossibleTypes() {
        return this.possibleTypes;
    }

    public final List getSelections() {
        return this.selections;
    }

    public final String getTypeCondition() {
        return this.typeCondition;
    }
}

