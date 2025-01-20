package Y8;

import Bb.F;
import Bb.q;
import J2.w;
import Nb.j;
import T3.d;
import Tb.b;
import Z0.m;
import Z0.n;
import a1.f;
import a1.k;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.unit.Density;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import b1.a;
import b4.H0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledNotNullType;
import com.apollographql.apollo.api.CompiledVariable;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;
import m0.e;
import org.xml.sax.Attributes;
import v.h;

public abstract class o {
    public static List A(Builder compiledField$Builder0, List list0) {
        return q.K(compiledField$Builder0.selections(list0).build());
    }

    public static List B(String s, com.apollographql.apollo.api.CompiledArgument.Builder compiledArgument$Builder0, Builder compiledField$Builder0, List list0) {
        return q.K(compiledField$Builder0.arguments(q.K(compiledArgument$Builder0.value(new CompiledVariable(s)).build())).selections(list0).build());
    }

    public static List C(CompiledArgument[] arr_compiledArgument, Builder compiledField$Builder0, List list0) {
        return q.K(compiledField$Builder0.arguments(q.L(arr_compiledArgument)).selections(list0).build());
    }

    public static void D(int v, Adapter adapter0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, String s) {
        adapter0.toJson(jsonWriter0, customScalarAdapters0, v);
        jsonWriter0.name(s);
    }

    public static void E(boolean z, Adapter adapter0, JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, String s) {
        adapter0.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(z));
        jsonWriter0.name(s);
    }

    public static String F(int v) {
        switch(v) {
            case 1: {
                return "NONE";
            }
            case 2: {
                return "ADDING";
            }
            case 3: {
                return "REMOVING";
            }
            default: {
                return "null";
            }
        }
    }

    public static String G(int v) {
        switch(v) {
            case 1: {
                return "REMOVED";
            }
            case 2: {
                return "VISIBLE";
            }
            case 3: {
                return "GONE";
            }
            case 4: {
                return "INVISIBLE";
            }
            default: {
                return "null";
            }
        }
    }

    public static int H(String s) {
        if(s == null) {
            throw new NullPointerException("Name is null");
        }
        if(s.equals("pad")) {
            return 1;
        }
        if(s.equals("reflect")) {
            return 2;
        }
        if(!s.equals("repeat")) {
            throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.GradientSpread." + s);
        }
        return 3;
    }

    public static int I(String s) {
        if(s == null) {
            throw new NullPointerException("Name is null");
        }
        if(s.equals("px")) {
            return 1;
        }
        if(s.equals("em")) {
            return 2;
        }
        if(s.equals("ex")) {
            return 3;
        }
        if(s.equals("in")) {
            return 4;
        }
        if(s.equals("cm")) {
            return 5;
        }
        if(s.equals("mm")) {
            return 6;
        }
        if(s.equals("pt")) {
            return 7;
        }
        if(s.equals("pc")) {
            return 8;
        }
        if(!s.equals("percent")) {
            throw new IllegalArgumentException("No enum constant com.caverock.androidsvg.SVG.Unit." + s);
        }
        return 9;
    }

    public static ViewModel a(Factory viewModelProvider$Factory0, b b0, CreationExtras creationExtras0) {
        j.f(b0, "modelClass");
        j.f(creationExtras0, "extras");
        return viewModelProvider$Factory0.c(F.y(b0), creationExtras0);
    }

    public static ViewModel b(Factory viewModelProvider$Factory0, Class class0, CreationExtras creationExtras0) {
        j.f(class0, "modelClass");
        j.f(creationExtras0, "extras");
        return viewModelProvider$Factory0.a(class0);
    }

    public static void c(Class class0) {
        j.f(class0, "modelClass");
        ViewModelProviders.a.getClass();
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    public static n d(n n0, n n1) {
        if(n1 instanceof Z0.b && n0 instanceof Z0.b) {
            m m0 = new m(n0, 0);
            float f = ((Z0.b)n1).b;
            if(Float.isNaN(f)) {
                f = ((Number)m0.invoke()).floatValue();
            }
            return new Z0.b(((Z0.b)n1).a, f);
        }
        if(n1 instanceof Z0.b && !(n0 instanceof Z0.b)) {
            return n1;
        }
        return !(n1 instanceof Z0.b) && n0 instanceof Z0.b ? n0 : n1.c(new m(n0, 1));
    }

    public static int e(float f, Density density0) {
        float f1 = density0.w(f);
        return Float.isInfinite(f1) ? 0x7FFFFFFF : Math.round(f1);
    }

    public static float f(long v, Density density0) {
        if(!k.a(a1.j.b(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        if(density0.n() >= 1.03f) {
            a a0 = b1.b.a(density0.n());
            float f = a1.j.c(v);
            return a0 == null ? density0.n() * f : a0.b(f);
        }
        return density0.n() * a1.j.c(v);
    }

    public static long g(long v, Density density0) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : a.a.c(density0.j0(e.d(v)), density0.j0(e.b(v)));
    }

    public static float h(long v, Density density0) {
        if(!k.a(a1.j.b(v), 0x100000000L)) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return density0.w(density0.E(v));
    }

    public static long i(long v, Density density0) {
        return v == 0x7FC000007FC00000L ? 0x7FC000007FC00000L : w.m(density0.w(f.b(v)), density0.w(f.a(v)));
    }

    public static long j(float f, Density density0) {
        if(density0.n() < 1.03f) {
            return q.P(f / density0.n(), 0x100000000L);
        }
        a a0 = b1.b.a(density0.n());
        return a0 == null ? q.P(f / density0.n(), 0x100000000L) : q.P(a0.a(f), 0x100000000L);
    }

    public static final void k(int v, View view0, ViewGroup viewGroup0) {
        j.f(view0, "view");
        j.f(viewGroup0, "container");
        int v1 = h.d(v);
        ViewGroup viewGroup1 = null;
        if(v1 == 0) {
            ViewParent viewParent1 = view0.getParent();
            if(viewParent1 instanceof ViewGroup) {
                viewGroup1 = (ViewGroup)viewParent1;
            }
            if(viewGroup1 != null) {
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view0 + " from container " + viewGroup1);
                }
                viewGroup1.removeView(view0);
            }
        }
        else {
            switch(v1) {
                case 1: {
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to VISIBLE");
                    }
                    ViewParent viewParent0 = view0.getParent();
                    if(viewParent0 instanceof ViewGroup) {
                        viewGroup1 = (ViewGroup)viewParent0;
                    }
                    if(viewGroup1 == null) {
                        if(Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view0 + " to Container " + viewGroup0);
                        }
                        viewGroup0.addView(view0);
                    }
                    view0.setVisibility(0);
                    return;
                }
                case 2: {
                    if(Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to GONE");
                    }
                    view0.setVisibility(8);
                    return;
                }
            }
            if(v1 == 3) {
                if(Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view0 + " to INVISIBLE");
                }
                view0.setVisibility(4);
            }
        }
    }

    public static int l(int v, int v1, int v2, int v3) {
        return androidx.datastore.preferences.protobuf.j.M(v) + v1 + v2 + v3;
    }

    public static int m(Optional optional0, int v, int v1) {
        return (optional0.hashCode() + v) * v1;
    }

    public static int n(CurrencyAmount currencyAmount0, int v, int v1) {
        return (currencyAmount0.hashCode() + v) * v1;
    }

    public static int o(Attributes attributes0, int v) {
        return H0.a(attributes0.getLocalName(v)).ordinal();
    }

    public static long p(int v, String s, String s1) {
        j.c(s);
        return N4.h.q(s1, new d(8), v);
    }

    public static Ab.e q(JsonReader jsonReader0, String s) {
        Assertions.missingField(jsonReader0, s);
        return new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }

    public static CompiledArgument r(String s, com.apollographql.apollo.api.CompiledArgument.Builder compiledArgument$Builder0) {
        return compiledArgument$Builder0.value(new CompiledVariable(s)).build();
    }

    public static CompiledField s(String s, CustomScalarType customScalarType0) {
        return new Builder(s, customScalarType0).build();
    }

    public static CompiledNotNullType t(ObjectType objectType0) {
        return CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(objectType0)));
    }

    public static CurrencyAmount u(JsonReader jsonReader0) {
        String s = jsonReader0.nextString();
        j.c(s);
        return CurrencyAmount.c(s);
    }

    public static IllegalStateException v(JsonReader jsonReader0, String s, CustomScalarAdapters customScalarAdapters0, String s1, String s2) {
        j.f(jsonReader0, s);
        j.f(customScalarAdapters0, s1);
        return new IllegalStateException(s2);
    }

    public static String w(long v, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static String x(JsonReader jsonReader0, String s, CustomScalarAdapters customScalarAdapters0, String s1) {
        j.f(jsonReader0, s);
        j.f(customScalarAdapters0, s1);
        String s2 = jsonReader0.nextString();
        j.c(s2);
        return s2;
    }

    public static String y(String s, Fragment fragment0, String s1) {
        return s + fragment0 + s1;
    }

    public static String z(StringBuilder stringBuilder0, int v, char c) {
        stringBuilder0.append(v);
        stringBuilder0.append(c);
        return stringBuilder0.toString();
    }
}

