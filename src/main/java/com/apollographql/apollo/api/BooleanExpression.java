package com.apollographql.apollo.api;

import Ab.a;
import Bb.n;
import Bb.p;
import Bb.r;
import Nb.j;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class BooleanExpression {
    public static final class And extends BooleanExpression {
        private final Set operands;

        public And(Set set0) {
            j.f(set0, "operands");
            super(null);
            this.operands = set0;
            if(set0.isEmpty()) {
                throw new IllegalStateException("Apollo: cannot create a \'And\' condition from an empty list");
            }
        }

        public And(BooleanExpression[] arr_booleanExpression) {
            j.f(arr_booleanExpression, "operands");
            this(n.z0(arr_booleanExpression));
        }

        public final Set component1() {
            return this.operands;
        }

        public final And copy(Set set0) {
            j.f(set0, "operands");
            return new And(set0);
        }

        public static And copy$default(And booleanExpression$And0, Set set0, int v, Object object0) {
            if((v & 1) != 0) {
                set0 = booleanExpression$And0.operands;
            }
            return booleanExpression$And0.copy(set0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof And ? j.a(this.operands, ((And)object0).operands) : false;
        }

        public final Set getOperands() {
            return this.operands;
        }

        @Override
        public int hashCode() {
            return this.operands.hashCode();
        }

        @Override  // com.apollographql.apollo.api.BooleanExpression
        @a
        public BooleanExpression simplify() {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.operands) {
                if(!j.a(((BooleanExpression)object0), True.INSTANCE)) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
            for(Object object1: arrayList0) {
                arrayList1.add(((BooleanExpression)object1).simplify());
            }
            BooleanExpression booleanExpression0 = False.INSTANCE;
            if(!arrayList1.contains(booleanExpression0)) {
                if(arrayList1.isEmpty()) {
                    return True.INSTANCE;
                }
                return arrayList1.size() == 1 ? ((BooleanExpression)p.p0(arrayList1)) : new And(p.U0(arrayList1));
            }
            return booleanExpression0;
        }

        @Override
        public String toString() {
            return "And(operands=" + this.operands + ')';
        }
    }

    public static final class Element extends BooleanExpression {
        private final Object value;

        public Element(Object object0) {
            j.f(object0, "value");
            super(null);
            this.value = object0;
        }

        public final Object component1() {
            return this.value;
        }

        public final Element copy(Object object0) {
            j.f(object0, "value");
            return new Element(object0);
        }

        public static Element copy$default(Element booleanExpression$Element0, Object object0, int v, Object object1) {
            if((v & 1) != 0) {
                object0 = booleanExpression$Element0.value;
            }
            return booleanExpression$Element0.copy(object0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Element ? j.a(this.value, ((Element)object0).value) : false;
        }

        public final Object getValue() {
            return this.value;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }

        @a
        public Element simplify() [...] // Inlined contents

        @Override  // com.apollographql.apollo.api.BooleanExpression
        public BooleanExpression simplify() {
            return this;
        }

        @Override
        public String toString() {
            return "Element(value=" + this.value + ')';
        }
    }

    public static final class False extends BooleanExpression {
        public static final False INSTANCE;

        static {
            False.INSTANCE = new False();
        }

        private False() {
            super(null);
        }

        @a
        public False simplify() [...] // Inlined contents

        @Override  // com.apollographql.apollo.api.BooleanExpression
        public BooleanExpression simplify() {
            return this;
        }
    }

    public static final class Not extends BooleanExpression {
        private final BooleanExpression operand;

        public Not(BooleanExpression booleanExpression0) {
            j.f(booleanExpression0, "operand");
            super(null);
            this.operand = booleanExpression0;
        }

        public final BooleanExpression component1() {
            return this.operand;
        }

        public final Not copy(BooleanExpression booleanExpression0) {
            j.f(booleanExpression0, "operand");
            return new Not(booleanExpression0);
        }

        public static Not copy$default(Not booleanExpression$Not0, BooleanExpression booleanExpression0, int v, Object object0) {
            if((v & 1) != 0) {
                booleanExpression0 = booleanExpression$Not0.operand;
            }
            return booleanExpression$Not0.copy(booleanExpression0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Not ? j.a(this.operand, ((Not)object0).operand) : false;
        }

        public final BooleanExpression getOperand() {
            return this.operand;
        }

        @Override
        public int hashCode() {
            return this.operand.hashCode();
        }

        @Override  // com.apollographql.apollo.api.BooleanExpression
        @a
        public BooleanExpression simplify() {
            BooleanExpression booleanExpression0 = this.operand;
            if(booleanExpression0 instanceof True) {
                return False.INSTANCE;
            }
            return booleanExpression0 instanceof False ? True.INSTANCE : this;
        }

        @Override
        public String toString() {
            return "Not(operand=" + this.operand + ')';
        }
    }

    public static final class Or extends BooleanExpression {
        private final Set operands;

        public Or(Set set0) {
            j.f(set0, "operands");
            super(null);
            this.operands = set0;
            if(set0.isEmpty()) {
                throw new IllegalStateException("Apollo: cannot create a \'Or\' condition from an empty list");
            }
        }

        public Or(BooleanExpression[] arr_booleanExpression) {
            j.f(arr_booleanExpression, "operands");
            this(n.z0(arr_booleanExpression));
        }

        public final Set component1() {
            return this.operands;
        }

        public final Or copy(Set set0) {
            j.f(set0, "operands");
            return new Or(set0);
        }

        public static Or copy$default(Or booleanExpression$Or0, Set set0, int v, Object object0) {
            if((v & 1) != 0) {
                set0 = booleanExpression$Or0.operands;
            }
            return booleanExpression$Or0.copy(set0);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Or ? j.a(this.operands, ((Or)object0).operands) : false;
        }

        public final Set getOperands() {
            return this.operands;
        }

        @Override
        public int hashCode() {
            return this.operands.hashCode();
        }

        @Override  // com.apollographql.apollo.api.BooleanExpression
        @a
        public BooleanExpression simplify() {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.operands) {
                if(!j.a(((BooleanExpression)object0), False.INSTANCE)) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
            for(Object object1: arrayList0) {
                arrayList1.add(((BooleanExpression)object1).simplify());
            }
            BooleanExpression booleanExpression0 = True.INSTANCE;
            if(!arrayList1.contains(booleanExpression0)) {
                if(arrayList1.isEmpty()) {
                    return False.INSTANCE;
                }
                return arrayList1.size() == 1 ? ((BooleanExpression)p.p0(arrayList1)) : new Or(p.U0(arrayList1));
            }
            return booleanExpression0;
        }

        @Override
        public String toString() {
            return p.v0(this.operands, " | ", null, null, null, 62);
        }
    }

    public static final class True extends BooleanExpression {
        public static final True INSTANCE;

        static {
            True.INSTANCE = new True();
        }

        private True() {
            super(null);
        }

        @a
        public True simplify() [...] // Inlined contents

        @Override  // com.apollographql.apollo.api.BooleanExpression
        public BooleanExpression simplify() {
            return this;
        }
    }

    private BooleanExpression() {
    }

    public BooleanExpression(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @a
    public abstract BooleanExpression simplify();
}

