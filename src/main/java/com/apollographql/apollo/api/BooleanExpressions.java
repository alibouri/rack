package com.apollographql.apollo.api;

import Ab.a;
import Ab.e;
import Bb.n;
import Bb.p;
import Nb.j;
import Tb.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

public final class BooleanExpressions {
    @a
    public static final BooleanExpression and(BooleanExpression booleanExpression0, BooleanExpression[] arr_booleanExpression) {
        j.f(booleanExpression0, "<this>");
        j.f(arr_booleanExpression, "other");
        return new And(p.U0(p.G0(n.y0(arr_booleanExpression), booleanExpression0)));
    }

    public static final BooleanExpression and(BooleanExpression[] arr_booleanExpression) {
        j.f(arr_booleanExpression, "other");
        return new And(p.U0(n.y0(arr_booleanExpression)));
    }

    @a
    public static final boolean containsPossibleTypes(BooleanExpression booleanExpression0) {
        j.f(booleanExpression0, "<this>");
        if(!booleanExpression0.equals(True.INSTANCE) && !booleanExpression0.equals(False.INSTANCE)) {
            if(booleanExpression0 instanceof Not) {
                return BooleanExpressions.containsPossibleTypes(((Not)booleanExpression0).getOperand());
            }
            if(booleanExpression0 instanceof Or) {
                Iterable iterable0 = ((Or)booleanExpression0).getOperands();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object0: iterable0) {
                        if(!BooleanExpressions.containsPossibleTypes(((BooleanExpression)object0))) {
                            continue;
                        }
                        return true;
                    }
                }
            }
            else {
                if(!(booleanExpression0 instanceof And)) {
                    goto label_20;
                }
                Iterable iterable1 = ((And)booleanExpression0).getOperands();
                if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                    for(Object object1: iterable1) {
                        if(!BooleanExpressions.containsPossibleTypes(((BooleanExpression)object1))) {
                            continue;
                        }
                        return true;
                    label_20:
                        if(!(booleanExpression0 instanceof Element)) {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                        return ((Element)booleanExpression0).getValue() instanceof BPossibleTypes;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean evaluate(BooleanExpression booleanExpression0, Set set0, String s, Set set1, List list0) {
        j.f(booleanExpression0, "<this>");
        return list0 == null ? BooleanExpressions.evaluate(booleanExpression0, new com.apollographql.apollo.api.a(set0, set1, null, s, 0)) : BooleanExpressions.evaluate(booleanExpression0, new com.apollographql.apollo.api.a(set0, set1, p.l0(list0, 1), s, 0));
    }

    @a
    public static final boolean evaluate(BooleanExpression booleanExpression0, Function1 function10) {
        j.f(booleanExpression0, "<this>");
        j.f(function10, "block");
        if(!booleanExpression0.equals(True.INSTANCE)) {
            if(booleanExpression0.equals(False.INSTANCE)) {
                return false;
            }
            if(booleanExpression0 instanceof Not) {
                return !BooleanExpressions.evaluate(((Not)booleanExpression0).getOperand(), function10);
            }
            if(booleanExpression0 instanceof Or) {
                Iterable iterable0 = ((Or)booleanExpression0).getOperands();
                if(iterable0 instanceof Collection && ((Collection)iterable0).isEmpty()) {
                    return false;
                }
                Iterator iterator0 = iterable0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        return false;
                    }
                    Object object0 = iterator0.next();
                    if(BooleanExpressions.evaluate(((BooleanExpression)object0), function10)) {
                        return true;
                    }
                }
            }
            if(!(booleanExpression0 instanceof And)) {
                goto label_24;
            }
            Iterable iterable1 = ((And)booleanExpression0).getOperands();
            if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                for(Object object1: iterable1) {
                    if(BooleanExpressions.evaluate(((BooleanExpression)object1), function10)) {
                        continue;
                    }
                    return false;
                label_24:
                    if(!(booleanExpression0 instanceof Element)) {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    return ((Boolean)function10.n(((Element)booleanExpression0).getValue())).booleanValue();
                }
            }
        }
        return true;
    }

    private static final boolean evaluate$lambda$2(Set set0, Set set1, List list0, String s, BTerm bTerm0) {
        j.f(bTerm0, "it");
        if(bTerm0 instanceof BVariable) {
            return !(set0 == null ? false : set0.contains(((BVariable)bTerm0).getName()));
        }
        if(bTerm0 instanceof BLabel) {
            j.c(list0);
            return BooleanExpressions.hasDeferredFragment(set1, list0, ((BLabel)bTerm0).getLabel());
        }
        if(!(bTerm0 instanceof BPossibleTypes)) {
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        return p.k0(((BPossibleTypes)bTerm0).getPossibleTypes(), s);
    }

    @a
    public static final Object firstElementOfType(BooleanExpression booleanExpression0, b b0) {
        j.f(booleanExpression0, "<this>");
        j.f(b0, "type");
        if(!booleanExpression0.equals(True.INSTANCE) && !booleanExpression0.equals(False.INSTANCE)) {
            if(!(booleanExpression0 instanceof Element)) {
                if(booleanExpression0 instanceof Not) {
                    return BooleanExpressions.firstElementOfType(((Not)booleanExpression0).getOperand(), b0);
                }
                if(booleanExpression0 instanceof And) {
                    for(Object object1: ((And)booleanExpression0).getOperands()) {
                        if(BooleanExpressions.firstElementOfType(((BooleanExpression)object1), b0) != null) {
                            return ((BooleanExpression)object1) == null ? null : BooleanExpressions.firstElementOfType(((BooleanExpression)object1), b0);
                        }
                        if(false) {
                            break;
                        }
                    }
                    return null;
                }
                if(!(booleanExpression0 instanceof Or)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                for(Object object2: ((Or)booleanExpression0).getOperands()) {
                    if(BooleanExpressions.firstElementOfType(((BooleanExpression)object2), b0) != null) {
                        return ((BooleanExpression)object2) == null ? null : BooleanExpressions.firstElementOfType(((BooleanExpression)object2), b0);
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
            else if(((Nb.e)b0).d(((Element)booleanExpression0).getValue())) {
                Object object0 = ((Element)booleanExpression0).getValue();
                j.d(object0, "null cannot be cast to non-null type U of com.apollographql.apollo.api.BooleanExpressions.firstElementOfType");
                return object0;
            }
        }
        return null;
    }

    private static final boolean hasDeferredFragment(Set set0, List list0, String s) {
        return set0 == null ? true : set0.contains(new DeferredFragmentIdentifier(list0, s));
    }

    public static final BooleanExpression label(String s) {
        return new Element(new BLabel(s));
    }

    public static BooleanExpression label$default(String s, int v, Object object0) {
        if((v & 1) != 0) {
            s = null;
        }
        return BooleanExpressions.label(s);
    }

    public static final BooleanExpression not(BooleanExpression booleanExpression0) {
        j.f(booleanExpression0, "other");
        return new Not(booleanExpression0);
    }

    @a
    public static final BooleanExpression or(BooleanExpression booleanExpression0, BooleanExpression[] arr_booleanExpression) {
        j.f(booleanExpression0, "<this>");
        j.f(arr_booleanExpression, "other");
        return new Or(p.U0(p.G0(n.y0(arr_booleanExpression), booleanExpression0)));
    }

    public static final BooleanExpression or(BooleanExpression[] arr_booleanExpression) {
        j.f(arr_booleanExpression, "other");
        return new Or(p.U0(n.y0(arr_booleanExpression)));
    }

    public static final BooleanExpression possibleTypes(String[] arr_s) {
        j.f(arr_s, "typenames");
        return new Element(new BPossibleTypes(n.z0(arr_s)));
    }

    public static final BooleanExpression variable(String s) {
        j.f(s, "name");
        return new Element(new BVariable(s));
    }
}

