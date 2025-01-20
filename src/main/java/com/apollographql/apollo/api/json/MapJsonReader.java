package com.apollographql.apollo.api.json;

import Bb.p;
import Bb.z;
import Nb.j;
import U3.g;
import com.apollographql.apollo.api.json.internal.UtilsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MapJsonReader implements JsonReader {
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final MapJsonReader buffer(JsonReader jsonReader0) {
            j.f(jsonReader0, "<this>");
            if(jsonReader0 instanceof MapJsonReader) {
                return (MapJsonReader)jsonReader0;
            }
            Token jsonReader$Token0 = jsonReader0.peek();
            if(jsonReader$Token0 != Token.BEGIN_OBJECT) {
                throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + jsonReader$Token0 + "` json token").toString());
            }
            List list0 = jsonReader0.getPath();
            Object object0 = -JsonReaders.readAny(jsonReader0);
            j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return new MapJsonReader(((Map)object0), list0);
        }
    }

    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Token.values().length];
            try {
                arr_v[Token.END_OBJECT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.END_ARRAY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.STRING.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.NUMBER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Token.LONG.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final Companion Companion;
    private Map[] containerStack;
    private Iterator[] iteratorStack;
    private int[] nameIndexStack;
    private Object[] path;
    private final List pathRoot;
    private Object peekedData;
    private Token peekedToken;
    private final Object root;
    private int stackSize;

    static {
        MapJsonReader.Companion = new Companion(null);
    }

    public MapJsonReader(Object object0) {
        this(object0, null, 2, null);
    }

    public MapJsonReader(Object object0, List list0) {
        j.f(list0, "pathRoot");
        super();
        this.root = object0;
        this.pathRoot = list0;
        this.path = new Object[0x40];
        this.containerStack = new Map[0x40];
        this.iteratorStack = new Iterator[0x40];
        this.nameIndexStack = new int[0x40];
        this.peekedToken = this.anyToToken(object0);
        this.peekedData = object0;
    }

    public MapJsonReader(Object object0, List list0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            list0 = z.X;
        }
        this(object0, list0);
    }

    private final void advanceIterator() {
        int v = this.stackSize;
        if(v == 0) {
            this.peekedToken = Token.END_DOCUMENT;
            return;
        }
        Iterator iterator0 = this.iteratorStack[v - 1];
        j.c(iterator0);
        Object[] arr_object = this.path;
        int v1 = this.stackSize;
        if(arr_object[v1 - 1] instanceof Integer) {
            Object object0 = arr_object[v1 - 1];
            j.d(object0, "null cannot be cast to non-null type kotlin.Int");
            arr_object[v1 - 1] = (int)(((int)(((Integer)object0))) + 1);
        }
        if(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            this.peekedData = object1;
            this.peekedToken = object1 instanceof Map.Entry ? Token.NAME : this.anyToToken(object1);
            return;
        }
        this.peekedToken = this.path[this.stackSize - 1] instanceof Integer ? Token.END_ARRAY : Token.END_OBJECT;
    }

    private final Token anyToToken(Object object0) {
        if(object0 == null) {
            return Token.NULL;
        }
        if(object0 instanceof List) {
            return Token.BEGIN_ARRAY;
        }
        if(object0 instanceof Map) {
            return Token.BEGIN_OBJECT;
        }
        if(object0 instanceof Integer) {
            return Token.NUMBER;
        }
        if(object0 instanceof Long) {
            return Token.LONG;
        }
        if(object0 instanceof Double) {
            return Token.NUMBER;
        }
        if(object0 instanceof JsonNumber) {
            return Token.NUMBER;
        }
        if(object0 instanceof String) {
            return Token.STRING;
        }
        return object0 instanceof Boolean ? Token.BOOLEAN : Token.ANY;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginArray() {
        return this.beginArray();
    }

    public MapJsonReader beginArray() {
        if(this.peek() != Token.BEGIN_ARRAY) {
            throw new g("Expected BEGIN_ARRAY but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        Object object0 = this.peekedData;
        j.d(object0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        this.increaseStack();
        this.path[this.stackSize - 1] = -1;
        Iterator[] arr_iterator = this.iteratorStack;
        int v = this.stackSize - 1;
        arr_iterator[v] = ((List)object0).iterator();
        this.advanceIterator();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginObject() {
        return this.beginObject();
    }

    public MapJsonReader beginObject() {
        if(this.peek() != Token.BEGIN_OBJECT) {
            throw new g("Expected BEGIN_OBJECT but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        this.increaseStack();
        Map[] arr_map = this.containerStack;
        int v = this.stackSize - 1;
        Object object0 = this.peekedData;
        j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        arr_map[v] = object0;
        this.rewind();
        return this;
    }

    @Override
    public void close() {
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endArray() {
        return this.endArray();
    }

    public MapJsonReader endArray() {
        if(this.peek() != Token.END_ARRAY) {
            throw new g("Expected END_ARRAY but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        int v = this.stackSize - 1;
        this.stackSize = v;
        this.iteratorStack[v] = null;
        this.path[v] = null;
        this.advanceIterator();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endObject() {
        return this.endObject();
    }

    public MapJsonReader endObject() {
        int v = this.stackSize - 1;
        this.stackSize = v;
        this.iteratorStack[v] = null;
        this.path[v] = null;
        this.containerStack[v] = null;
        this.advanceIterator();
        return this;
    }

    private final int findName(String s, List list0) {
        int v = this.nameIndexStack[this.stackSize - 1];
        if(v < list0.size() && j.a(list0.get(v), s)) {
            ++this.nameIndexStack[this.stackSize - 1];
            return v;
        }
        int v1 = list0.indexOf(s);
        if(v1 != -1) {
            this.nameIndexStack[this.stackSize - 1] = v1 + 1;
        }
        return v1;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public List getPath() {
        List list0 = new ArrayList();
        list0.addAll(this.pathRoot);
        int v = this.stackSize;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.path[v1];
            if(object0 != null) {
                list0.add(object0);
            }
        }
        return list0;
    }

    private final String getPathAsString() {
        return p.v0(this.getPath(), ".", null, null, null, 62);
    }

    public final Object getRoot() {
        return this.root;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public boolean hasNext() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.peek().ordinal()]) {
            case 1: 
            case 2: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    private final void increaseStack() {
        Object[] arr_object = this.path;
        if(this.stackSize == arr_object.length) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length * 2);
            j.e(arr_object1, "copyOf(...)");
            this.path = arr_object1;
            Object[] arr_object2 = Arrays.copyOf(this.containerStack, this.containerStack.length * 2);
            j.e(arr_object2, "copyOf(...)");
            this.containerStack = (Map[])arr_object2;
            int[] arr_v = Arrays.copyOf(this.nameIndexStack, this.nameIndexStack.length * 2);
            j.e(arr_v, "copyOf(...)");
            this.nameIndexStack = arr_v;
            Object[] arr_object3 = Arrays.copyOf(this.iteratorStack, this.iteratorStack.length * 2);
            j.e(arr_object3, "copyOf(...)");
            this.iteratorStack = (Iterator[])arr_object3;
        }
        ++this.stackSize;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public boolean nextBoolean() {
        if(this.peek() != Token.BOOLEAN) {
            throw new g("Expected BOOLEAN but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        Object object0 = this.peekedData;
        j.d(object0, "null cannot be cast to non-null type kotlin.Boolean");
        this.advanceIterator();
        return ((Boolean)object0).booleanValue();
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public double nextDouble() {
        double f;
        switch(WhenMappings.$EnumSwitchMapping$0[this.peek().ordinal()]) {
            case 3: 
            case 4: 
            case 5: {
                Object object0 = this.peekedData;
                if(object0 instanceof Integer) {
                    f = (double)((Number)object0).intValue();
                }
                else {
                    if(object0 instanceof Long) {
                        f = UtilsKt.-LongToDoubleExact(((Number)object0).longValue());
                        this.advanceIterator();
                        return f;
                    }
                    if(object0 instanceof Double) {
                        f = ((Number)object0).doubleValue();
                        this.advanceIterator();
                        return f;
                    }
                    if(object0 instanceof String) {
                        f = Double.parseDouble(((String)object0));
                    }
                    else if(object0 instanceof JsonNumber) {
                        f = Double.parseDouble(((JsonNumber)object0).getValue());
                    }
                    else {
                        throw new IllegalStateException(("Expected a Double but got " + object0 + " instead").toString());
                    }
                }
                this.advanceIterator();
                return f;
            }
            default: {
                throw new g("Expected a Double but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public int nextInt() {
        int v;
        switch(WhenMappings.$EnumSwitchMapping$0[this.peek().ordinal()]) {
            case 3: 
            case 4: 
            case 5: {
                Object object0 = this.peekedData;
                if(object0 instanceof Integer) {
                    v = ((Number)object0).intValue();
                }
                else {
                    if(object0 instanceof Long) {
                        v = UtilsKt.-LongToIntExact(((Number)object0).longValue());
                        this.advanceIterator();
                        return v;
                    }
                    if(object0 instanceof Double) {
                        v = UtilsKt.-DoubleToIntExact(((Number)object0).doubleValue());
                        this.advanceIterator();
                        return v;
                    }
                    if(object0 instanceof String) {
                        v = Integer.parseInt(((String)object0));
                    }
                    else if(object0 instanceof JsonNumber) {
                        v = Integer.parseInt(((JsonNumber)object0).getValue());
                    }
                    else {
                        throw new IllegalStateException(("Expected an Int but got " + object0 + " instead").toString());
                    }
                }
                this.advanceIterator();
                return v;
            }
            default: {
                throw new g("Expected an Int but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public long nextLong() {
        long v;
        switch(WhenMappings.$EnumSwitchMapping$0[this.peek().ordinal()]) {
            case 3: 
            case 4: 
            case 5: {
                Object object0 = this.peekedData;
                if(object0 instanceof Integer) {
                    v = (long)((Number)object0).intValue();
                }
                else {
                    if(object0 instanceof Long) {
                        v = ((Number)object0).longValue();
                        this.advanceIterator();
                        return v;
                    }
                    if(object0 instanceof Double) {
                        v = UtilsKt.-DoubleToLongExact(((Number)object0).doubleValue());
                        this.advanceIterator();
                        return v;
                    }
                    if(object0 instanceof String) {
                        v = Long.parseLong(((String)object0));
                    }
                    else if(object0 instanceof JsonNumber) {
                        v = Long.parseLong(((JsonNumber)object0).getValue());
                    }
                    else {
                        throw new IllegalStateException(("Expected Int but got " + object0 + " instead").toString());
                    }
                }
                this.advanceIterator();
                return v;
            }
            default: {
                throw new g("Expected a Long but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public String nextName() {
        if(this.peek() != Token.NAME) {
            throw new g("Expected NAME but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        Object object0 = this.peekedData;
        j.d(object0, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Object[] arr_object = this.path;
        int v = this.stackSize - 1;
        arr_object[v] = ((Map.Entry)object0).getKey();
        this.peekedData = ((Map.Entry)object0).getValue();
        this.peekedToken = this.anyToToken(((Map.Entry)object0).getValue());
        return (String)((Map.Entry)object0).getKey();
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public Void nextNull() {
        if(this.peek() != Token.NULL) {
            throw new g("Expected NULL but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        this.advanceIterator();
        return null;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonNumber nextNumber() {
        JsonNumber jsonNumber0;
        switch(WhenMappings.$EnumSwitchMapping$0[this.peek().ordinal()]) {
            case 3: 
            case 4: 
            case 5: {
                Object object0 = this.peekedData;
                if(object0 instanceof Integer || object0 instanceof Long || object0 instanceof Double) {
                    jsonNumber0 = new JsonNumber(object0.toString());
                }
                else if(object0 instanceof String) {
                    jsonNumber0 = new JsonNumber(((String)object0));
                }
                else {
                    if(!(object0 instanceof JsonNumber)) {
                        throw new IllegalStateException(("Expected JsonNumber but got " + object0 + " instead").toString());
                    }
                    jsonNumber0 = (JsonNumber)object0;
                }
                this.advanceIterator();
                return jsonNumber0;
            }
            default: {
                throw new g("Expected a Number but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public String nextString() {
        String s;
        Object object0 = this.peekedData;
        if(object0 instanceof Integer) {
            s = String.valueOf(((Number)object0).intValue());
        }
        else {
            if(object0 instanceof Long) {
                s = String.valueOf(((Number)object0).longValue());
                this.advanceIterator();
                return s;
            }
            if(object0 instanceof Double) {
                s = String.valueOf(((Number)object0).doubleValue());
                this.advanceIterator();
                return s;
            }
            if(object0 instanceof String) {
                this.advanceIterator();
                return (String)object0;
            }
            if(object0 == null) {
                s = "null";
            }
            else if(object0 instanceof JsonNumber) {
                s = ((JsonNumber)object0).getValue();
            }
            else {
                throw new IllegalStateException(("Expected a String but got " + object0 + " instead").toString());
            }
        }
        this.advanceIterator();
        return s;
    }

    public final Object nextValue() {
        Object object0 = this.peekedData;
        if(object0 == null) {
            throw new g("Expected a non-null value at path " + this.getPathAsString(), 2);
        }
        this.advanceIterator();
        return object0;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public Token peek() {
        return this.peekedToken;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public void rewind() {
        int v = this.stackSize;
        Map map0 = this.containerStack[v - 1];
        this.path[v - 1] = null;
        Iterator[] arr_iterator = this.iteratorStack;
        j.c(map0);
        arr_iterator[v - 1] = map0.entrySet().iterator();
        this.nameIndexStack[this.stackSize - 1] = 0;
        this.advanceIterator();
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public int selectName(List list0) {
        j.f(list0, "names");
        while(this.hasNext()) {
            int v = this.findName(this.nextName(), list0);
            if(v != -1) {
                return v;
            }
            this.skipValue();
        }
        return -1;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public void skipValue() {
        this.advanceIterator();
    }
}

