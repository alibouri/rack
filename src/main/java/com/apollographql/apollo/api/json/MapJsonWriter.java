package com.apollographql.apollo.api.json;

import Ab.e;
import Ab.k;
import Bb.F;
import Bb.K;
import Bb.p;
import Bb.q;
import Bb.r;
import M.J;
import Nb.j;
import Sb.c;
import Sb.d;
import com.apollographql.apollo.api.Upload;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MapJsonWriter implements JsonWriter {
    public static abstract class State {
        public static final class List extends State {
            private final java.util.List list;

            public List(java.util.List list0) {
                j.f(list0, "list");
                super(null);
                this.list = list0;
            }

            public final java.util.List getList() {
                return this.list;
            }

            @Override
            public String toString() {
                return "List (" + this.list.size() + ')';
            }
        }

        public static final class Map extends State {
            private final java.util.Map map;
            private String name;

            public Map(java.util.Map map0, String s) {
                j.f(map0, "map");
                super(null);
                this.map = map0;
                this.name = s;
            }

            public final java.util.Map getMap() {
                return this.map;
            }

            public final String getName() {
                return this.name;
            }

            public final void setName(String s) {
                this.name = s;
            }

            @Override
            public String toString() {
                return J.g(new StringBuilder("Map ("), this.name, ')');
            }
        }

        private State() {
        }

        public State(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    private Object root;
    private boolean rootSet;
    private final java.util.List stack;

    public MapJsonWriter() {
        this.stack = new ArrayList();
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginArray() {
        List mapJsonWriter$State$List0 = new List(new ArrayList());
        this.stack.add(mapJsonWriter$State$List0);
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginObject() {
        Map mapJsonWriter$State$Map0 = new Map(new LinkedHashMap(), null);
        this.stack.add(mapJsonWriter$State$Map0);
        return this;
    }

    @Override
    public void close() {
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endArray() {
        State mapJsonWriter$State0 = (State)this.stack.remove(this.stack.size() - 1);
        if(!(mapJsonWriter$State0 instanceof List)) {
            throw new IllegalStateException("Check failed.");
        }
        this.valueInternal(((List)mapJsonWriter$State0).getList());
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endObject() {
        State mapJsonWriter$State0 = (State)this.stack.remove(this.stack.size() - 1);
        if(!(mapJsonWriter$State0 instanceof Map)) {
            throw new IllegalStateException("Check failed.");
        }
        this.valueInternal(((Map)mapJsonWriter$State0).getMap());
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public void flush() {
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public String getPath() {
        String s;
        ArrayList arrayList0 = new ArrayList(r.b0(this.stack));
        for(Object object0: this.stack) {
            State mapJsonWriter$State0 = (State)object0;
            if(mapJsonWriter$State0 instanceof List) {
                s = String.valueOf(((List)mapJsonWriter$State0).getList().size());
            }
            else {
                if(!(mapJsonWriter$State0 instanceof Map)) {
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                String s1 = ((Map)mapJsonWriter$State0).getName();
                s = s1 == null ? "?" : s1;
            }
            arrayList0.add(s);
        }
        return p.v0(arrayList0, ".", null, null, null, 62);
    }

    private final Object mergeWith(Object object0, Object object1) {
        if(object0 == null) {
            return object1;
        }
        if(object1 == null) {
            return object0;
        }
        if(object0 instanceof java.util.List) {
            if(!(object1 instanceof java.util.List) || ((java.util.List)object0).size() != ((java.util.List)object1).size()) {
                throw new IllegalStateException(("Cannot merge " + object0 + " with " + object1).toString());
            }
            d d0 = q.x(((Collection)object0));
            ArrayList arrayList0 = new ArrayList(r.b0(d0));
            c c0 = d0.a();
            while(c0.Z) {
                int v = c0.a();
                arrayList0.add(this.mergeWith(((java.util.List)object0).get(v), ((java.util.List)object1).get(v)));
            }
            return arrayList0;
        }
        if(object0 instanceof java.util.Map) {
            if(!(object1 instanceof java.util.Map)) {
                throw new IllegalStateException(("Cannot merge " + object0 + " with " + object1).toString());
            }
            LinkedHashSet linkedHashSet0 = K.M(((java.util.Map)object0).keySet(), ((java.util.Map)object1).keySet());
            ArrayList arrayList1 = new ArrayList(r.b0(linkedHashSet0));
            for(Object object2: linkedHashSet0) {
                arrayList1.add(new k(((String)object2), this.mergeWith(((java.util.Map)object0).get(((String)object2)), ((java.util.Map)object1).get(((String)object2)))));
            }
            return F.W(arrayList1);
        }
        if(!object0.equals(object1)) {
            throw new IllegalStateException(("Cannot merge " + object0 + " with " + object1).toString());
        }
        return object0;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter name(String s) {
        j.f(s, "name");
        State mapJsonWriter$State0 = (State)p.w0(this.stack);
        if(!(mapJsonWriter$State0 instanceof Map) || ((Map)mapJsonWriter$State0).getName() != null) {
            throw new IllegalStateException("Check failed.");
        }
        ((Map)mapJsonWriter$State0).setName(s);
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter nullValue() {
        return this.nullValue();
    }

    public MapJsonWriter nullValue() {
        return this.valueInternal(null);
    }

    public final Object root() {
        if(!this.rootSet) {
            throw new IllegalStateException("Check failed.");
        }
        return this.root;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(double f) {
        return this.value(f);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(int v) {
        return this.value(v);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(long v) {
        return this.value(v);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(Upload upload0) {
        return this.value(upload0);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(JsonNumber jsonNumber0) {
        return this.value(jsonNumber0);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(String s) {
        return this.value(s);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(boolean z) {
        return this.value(z);
    }

    public MapJsonWriter value(double f) {
        return this.valueInternal(f);
    }

    public MapJsonWriter value(int v) {
        return this.valueInternal(v);
    }

    public MapJsonWriter value(long v) {
        return this.valueInternal(v);
    }

    public MapJsonWriter value(Upload upload0) {
        j.f(upload0, "value");
        return this.valueInternal(null);
    }

    public MapJsonWriter value(JsonNumber jsonNumber0) {
        j.f(jsonNumber0, "value");
        return this.valueInternal(jsonNumber0);
    }

    public final MapJsonWriter value(Object object0) {
        return this.valueInternal(object0);
    }

    public MapJsonWriter value(String s) {
        j.f(s, "value");
        return this.valueInternal(s);
    }

    public MapJsonWriter value(boolean z) {
        return this.valueInternal(Boolean.valueOf(z));
    }

    private final MapJsonWriter valueInternal(Object object0) {
        State mapJsonWriter$State0 = (State)p.x0(this.stack);
        if(mapJsonWriter$State0 instanceof Map) {
            String s = ((Map)mapJsonWriter$State0).getName();
            if(s == null) {
                throw new IllegalStateException("Check failed.");
            }
            if(((Map)mapJsonWriter$State0).getMap().containsKey(s)) {
                ((Map)mapJsonWriter$State0).getMap().put(s, this.mergeWith(((Map)mapJsonWriter$State0).getMap().get(s), object0));
            }
            else {
                ((Map)mapJsonWriter$State0).getMap().put(s, object0);
            }
            ((Map)mapJsonWriter$State0).setName(null);
            return this;
        }
        if(mapJsonWriter$State0 instanceof List) {
            ((List)mapJsonWriter$State0).getList().add(object0);
            return this;
        }
        this.root = object0;
        this.rootSet = true;
        return this;
    }
}

