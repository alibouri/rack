package Q3;

import Ab.k;
import Ab.t;
import Bb.B;
import Bb.K;
import Bb.r;
import Eb.a;
import Fb.j;
import N3.D;
import N3.Q;
import N3.d;
import W5.f;
import Y8.G6;
import Y8.H6;
import Y8.N0;
import Y8.N;
import Y8.O0;
import Y8.P0;
import Y8.R6;
import Y8.R9;
import Y8.S6;
import Y8.i0;
import Y8.k0;
import Y8.y6;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.fragment.BillInvoiceListFragment;
import com.sendwave.backend.fragment.LinkedAccountFragment;
import com.sendwave.shared.ProposedBillField;
import d9.J1;
import d9.M;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import o9.w1;

public final class h extends j implements Function1 {
    public final int c0;
    public int d0;
    public final Object e0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final Object i0;

    public h(Object object0, Object object1, Object object2, Object object3, Object object4, g g0, int v) {
        this.c0 = v;
        this.e0 = object0;
        this.f0 = object1;
        this.g0 = object2;
        this.h0 = object3;
        this.i0 = object4;
        super(1, g0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.c0) {
            case 0: {
                return new h(((ApolloResponse)this.e0), ((ApolloRequest)this.f0), ((l)this.g0), ((CustomScalarAdapters)this.h0), ((Set)this.i0), ((g)object0), 0).v(t.a);
            }
            case 1: {
                return new h(((String)this.e0), ((List)this.f0), ((UUID)this.g0), ((R6)this.h0), ((R9)this.i0), ((g)object0), 1).v(t.a);
            }
            default: {
                return new h(((w1)this.e0), ((String)this.f0), ((UUID)this.g0), ((List)this.h0), ((Optional)this.i0), ((g)object0), 2).v(t.a);
            }
        }
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Set set0;
        switch(this.c0) {
            case 0: {
                Object object3 = a.X;
                int v = this.d0;
                l l0 = (l)this.g0;
                switch(v) {
                    case 0: {
                        f.b0(object0);
                        ApolloResponse apolloResponse0 = (ApolloResponse)this.e0;
                        if(apolloResponse0.data == null) {
                            set0 = B.X;
                            goto label_57;
                        }
                        else {
                            ApolloRequest apolloRequest0 = (ApolloRequest)this.f0;
                            Nb.j.f(apolloRequest0, "<this>");
                            d d0 = (d)apolloRequest0.getExecutionContext().get(d.b);
                            d d1 = (d)apolloResponse0.executionContext.get(d.b);
                            O3.a a0 = (d0 == null ? O3.a.b : d0.a).a((d1 == null ? O3.a.b : d1.a));
                            if(apolloRequest0.getExecutionContext().get(Q.a) != null) {
                                throw new ClassCastException();
                            }
                            D d2 = (D)apolloRequest0.getExecutionContext().get(D.b);
                            if((d2 == null ? false : d2.a)) {
                                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                                linkedHashMap0.put("memory-cache-only", "true");
                                a0 = a0.a(new O3.a(linkedHashMap0));
                            }
                            Nb.j.c(apolloResponse0.data);
                            this.d0 = 1;
                            object0 = l0.a.f(apolloRequest0.getOperation(), apolloResponse0.data, ((CustomScalarAdapters)this.h0), a0, this);
                            if(object0 != object3) {
                                set0 = (Set)object0;
                                goto label_57;
                            }
                        }
                        break;
                    }
                    case 1: {
                        f.b0(object0);
                        set0 = (Set)object0;
                    label_57:
                        LinkedHashSet linkedHashSet0 = K.M(set0, ((Set)this.i0));
                        this.d0 = 2;
                        if(l0.a.b(linkedHashSet0, this) != object3) {
                            return t.a;
                        }
                        break;
                    }
                    case 2: {
                        f.b0(object0);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return object3;
            }
            case 1: {
                Object object4 = a.X;
                int v1 = this.d0;
                R6 r61 = (R6)this.h0;
                switch(v1) {
                    case 0: {
                        f.b0(object0);
                        ArrayList arrayList1 = new ArrayList(r.b0(((List)this.f0)));
                        for(Object object5: ((List)this.f0)) {
                            arrayList1.add(new J1(((String)((k)object5).X), ((String)((k)object5).Y)));
                        }
                        String s1 = ((UUID)this.g0).toString();
                        Nb.j.e(s1, "toString(...)");
                        P0 p00 = new P0(((String)this.e0), s1, arrayList1);
                        this.d0 = 1;
                        object0 = r61.f(p00, G6.X, this);
                        if(object0 == object4) {
                            return object4;
                        }
                        break;
                    }
                    case 1: {
                        f.b0(object0);
                        break;
                    }
                    case 2: {
                        f.b0(object0);
                        return object0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                N0 n00 = ((O0)((y6)object0).b).a;
                N.l(n00, ((R9)this.i0).a);
                FragmentHandle fragmentHandle0 = ((y6)object0).a(n00.a.b);
                this.d0 = 2;
                object0 = r61.e(fragmentHandle0, LinkedAccountFragment.class, this);
                return object0 == object4 ? object4 : object0;
            }
            default: {
                Object object1 = a.X;
                switch(this.d0) {
                    case 0: {
                        f.b0(object0);
                        R6 r60 = ((w1)this.e0).h0;
                        String s = ((UUID)this.g0).toString();
                        Nb.j.e(s, "toString(...)");
                        ArrayList arrayList0 = new ArrayList(r.b0(((List)this.h0)));
                        for(Object object2: ((List)this.h0)) {
                            Present optional$Present0 = S6.a(((ProposedBillField)object2).Z);
                            arrayList0.add(new M(((ProposedBillField)object2).X, optional$Present0));
                        }
                        k0 k00 = new k0(((String)this.f0), s, arrayList0, ((Optional)this.i0));
                        this.d0 = 1;
                        object0 = R6.d(r60, k00, H6.Z, null, this, 4);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f.b0(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                BillInvoiceListFragment billInvoiceListFragment0 = ((i0)((y6)object0).b).a.c;
                return billInvoiceListFragment0 != null ? new k(((y6)object0), billInvoiceListFragment0) : null;
            }
        }
    }
}

