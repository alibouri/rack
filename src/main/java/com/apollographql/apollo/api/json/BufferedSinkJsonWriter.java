package com.apollographql.apollo.api.json;

import Bb.p;
import Ec.k;
import Nb.j;
import com.apollographql.apollo.api.Upload;
import com.apollographql.apollo.api.json.internal.JsonScope;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BufferedSinkJsonWriter implements JsonWriter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static final String access$hexString(Companion bufferedSinkJsonWriter$Companion0, byte b) {
            return bufferedSinkJsonWriter$Companion0.hexString(b);
        }

        private final String hexString(byte b) {
            return "0123456789abcdef".charAt(b >>> 4) + "0123456789abcdef".charAt(b & 15);
        }

        public final void string(k k0, String s) {
            String s2;
            j.f(k0, "sink");
            j.f(s, "value");
            String[] arr_s = BufferedSinkJsonWriter.REPLACEMENT_CHARS;
            k0.y(34);
            int v = s.length();
            int v1 = 0;
            int v2 = 0;
            while(v1 < v) {
                int v3 = s.charAt(v1);
                if(v3 < 0x80) {
                    String s1 = arr_s[v3];
                    if(s1 != null) {
                        s2 = s1;
                        goto label_19;
                    }
                }
                else {
                    switch(v3) {
                        case 0x2028: {
                            s2 = "\\u2028";
                            break;
                        }
                        case 0x2029: {
                            s2 = "\\u2029";
                            break;
                        }
                        default: {
                            goto label_23;
                        }
                    }
                label_19:
                    if(v2 < v1) {
                        k0.m(v2, v1, s);
                    }
                    k0.R(s2);
                    v2 = v1 + 1;
                }
            label_23:
                ++v1;
            }
            if(v2 < v) {
                k0.m(v2, v, s);
            }
            k0.y(34);
        }
    }

    public static final Companion Companion = null;
    private static final String HEX_ARRAY = "0123456789abcdef";
    private static final String[] REPLACEMENT_CHARS;
    private String deferredName;
    private final String indent;
    private int[] pathIndices;
    private String[] pathNames;
    private int[] scopes;
    private final k sink;
    private int stackSize;

    static {
        BufferedSinkJsonWriter.Companion = new Companion(null);
        String[] arr_s = new String[0x80];
        for(int v = 0; v < 0x20; ++v) {
            arr_s[v] = "\\u00" + Companion.access$hexString(BufferedSinkJsonWriter.Companion, ((byte)v));
        }
        arr_s[34] = "\\\"";
        arr_s[92] = "\\\\";
        arr_s[9] = "\\t";
        arr_s[8] = "\\b";
        arr_s[10] = "\\n";
        arr_s[13] = "\\r";
        BufferedSinkJsonWriter.REPLACEMENT_CHARS = arr_s;
    }

    public BufferedSinkJsonWriter(k k0) {
        j.f(k0, "sink");
        this(k0, null, 2, null);
    }

    public BufferedSinkJsonWriter(k k0, String s) {
        j.f(k0, "sink");
        super();
        this.sink = k0;
        this.indent = s;
        this.scopes = new int[0x40];
        this.pathNames = new String[0x40];
        this.pathIndices = new int[0x40];
        this.pushScope(6);
    }

    public BufferedSinkJsonWriter(k k0, String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            s = null;
        }
        this(k0, s);
    }

    private final void beforeName() {
        int v = this.peekScope();
        if(v == 5) {
            this.sink.y(44);
        }
        else if(v == 3) {
        }
        else {
            throw new IllegalStateException("Nesting problem.");
        }
        this.newline();
        this.replaceTop(4);
    }

    private final void beforeValue() {
        int v = this.peekScope();
        switch(v) {
            case 1: {
                this.replaceTop(2);
                this.newline();
                return;
            }
            case 2: {
                this.sink.y(44);
                this.newline();
                return;
            }
            default: {
                if(v != 4) {
                    switch(v) {
                        case 6: {
                            this.replaceTop(7);
                            return;
                        }
                        case 7: {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                        default: {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                }
                String s = this.getSeparator();
                this.sink.R(s);
                this.replaceTop(5);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginArray() {
        this.writeDeferredName();
        return this.open(1, "[");
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter beginObject() {
        this.writeDeferredName();
        return this.open(3, "{");
    }

    private final JsonWriter close(int v, int v1, String s) {
        int v2 = this.peekScope();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.deferredName != null) {
            throw new IllegalStateException(("Dangling name: " + this.deferredName).toString());
        }
        int v3 = this.stackSize;
        this.stackSize = v3 - 1;
        this.pathNames[v3 - 1] = null;
        ++this.pathIndices[v3 - 2];
        if(v2 == v1) {
            this.newline();
        }
        this.sink.R(s);
        return this;
    }

    @Override
    public void close() {
        this.sink.close();
        if(this.stackSize > 1 || this.stackSize == 1 && this.scopes[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endArray() {
        return this.close(1, 2, "]");
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter endObject() {
        return this.close(3, 5, "}");
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public void flush() {
        if(this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.sink.flush();
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public String getPath() {
        return p.v0(JsonScope.INSTANCE.getPath(this.stackSize, this.scopes, this.pathNames, this.pathIndices), ".", null, null, null, 62);
    }

    private final String getSeparator() {
        return this.indent == null || this.indent.length() == 0 ? ":" : ": ";
    }

    public final JsonWriter jsonValue(String s) {
        j.f(s, "value");
        this.writeDeferredName();
        this.beforeValue();
        this.sink.R(s);
        int v = this.stackSize - 1;
        ++this.pathIndices[v];
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter name(String s) {
        j.f(s, "name");
        int v = this.stackSize;
        if(v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if(this.deferredName != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.deferredName = s;
        this.pathNames[v - 1] = s;
        return this;
    }

    private final void newline() {
        if(this.indent == null) {
            return;
        }
        this.sink.y(10);
        int v = this.stackSize;
        for(int v1 = 1; v1 < v; ++v1) {
            this.sink.R(this.indent);
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter nullValue() {
        return this.jsonValue("null");
    }

    private final JsonWriter open(int v, String s) {
        this.beforeValue();
        this.pushScope(v);
        this.pathIndices[this.stackSize - 1] = 0;
        this.sink.R(s);
        return this;
    }

    private final int peekScope() {
        int v = this.stackSize;
        if(v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.scopes[v - 1];
    }

    private final void pushScope(int v) {
        int[] arr_v = this.scopes;
        if(this.stackSize == arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            j.e(arr_v1, "copyOf(...)");
            this.scopes = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.pathNames, this.pathNames.length * 2);
            j.e(arr_object, "copyOf(...)");
            this.pathNames = (String[])arr_object;
            int[] arr_v2 = Arrays.copyOf(this.pathIndices, this.pathIndices.length * 2);
            j.e(arr_v2, "copyOf(...)");
            this.pathIndices = arr_v2;
        }
        int v1 = this.stackSize;
        this.stackSize = v1 + 1;
        this.scopes[v1] = v;
    }

    private final void replaceTop(int v) {
        this.scopes[this.stackSize - 1] = v;
    }

    public BufferedSinkJsonWriter value(Upload upload0) {
        j.f(upload0, "value");
        this.nullValue();
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(double f) {
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new IllegalArgumentException(("Numeric values must be finite, but was " + f).toString());
        }
        return this.jsonValue(String.valueOf(f));
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(int v) {
        return this.jsonValue(String.valueOf(v));
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(long v) {
        return this.jsonValue(String.valueOf(v));
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(Upload upload0) {
        return this.value(upload0);
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(JsonNumber jsonNumber0) {
        j.f(jsonNumber0, "value");
        return this.jsonValue(jsonNumber0.getValue());
    }

    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(String s) {
        j.f(s, "value");
        this.writeDeferredName();
        this.beforeValue();
        BufferedSinkJsonWriter.Companion.string(this.sink, s);
        int v = this.stackSize - 1;
        ++this.pathIndices[v];
        return this;
    }

    // Deobfuscation rating: LOW(20)
    @Override  // com.apollographql.apollo.api.json.JsonWriter
    public JsonWriter value(boolean z) {
        return z ? this.jsonValue("true") : this.jsonValue("false");
    }

    private final void writeDeferredName() {
        if(this.deferredName != null) {
            this.beforeName();
            String s = this.deferredName;
            j.c(s);
            BufferedSinkJsonWriter.Companion.string(this.sink, s);
            this.deferredName = null;
        }
    }
}

