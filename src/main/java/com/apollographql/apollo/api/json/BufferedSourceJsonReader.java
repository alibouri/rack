package com.apollographql.apollo.api.json;

import Ab.e;
import Bb.p;
import Ec.j;
import Ec.l;
import Ec.m;
import U3.g;
import Vb.a;
import com.apollographql.apollo.api.json.internal.JsonScope;
import java.io.EOFException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v7.d;

public final class BufferedSourceJsonReader implements JsonReader {
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion = null;
    private static final m DOUBLE_QUOTE_OR_SLASH = null;
    public static final int INITIAL_STACK_SIZE = 0x40;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private static final m SINGLE_QUOTE_OR_SLASH;
    private static final m UNQUOTED_STRING_TERMINALS;
    private final j buffer;
    private int[] indexStack;
    private int indexStackSize;
    private int[] pathIndices;
    private String[] pathNames;
    private int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private final l source;
    private int[] stack;
    private int stackSize;

    static {
        BufferedSourceJsonReader.Companion = new Companion(null);
        BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH = d.l("\'\\");
        BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH = d.l("\"\\");
        BufferedSourceJsonReader.UNQUOTED_STRING_TERMINALS = d.l("{}[]:, \n\t\r/\\;#=");
    }

    public BufferedSourceJsonReader(l l0) {
        Nb.j.f(l0, "source");
        super();
        this.source = l0;
        this.buffer = l0.w();
        int[] arr_v = new int[0x40];
        arr_v[0] = 6;
        this.stack = arr_v;
        this.stackSize = 1;
        this.pathNames = new String[0x40];
        this.pathIndices = new int[0x40];
        int[] arr_v1 = new int[0x40];
        arr_v1[0] = 0;
        this.indexStack = arr_v1;
        this.indexStackSize = 1;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginArray() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        if((integer0 == null ? this.doPeek() : ((int)integer0)) != 3) {
            throw new g("Expected BEGIN_ARRAY but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        this.push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader beginObject() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        if((integer0 == null ? this.doPeek() : ((int)integer0)) != 1) {
            throw new g("Expected BEGIN_OBJECT but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        this.push(3);
        this.peeked = 0;
        int v = this.indexStackSize;
        this.indexStackSize = v + 1;
        this.indexStack[v] = 0;
        return this;
    }

    @Override
    public void close() {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.buffer.b();
        this.source.close();
    }

    private final int doPeek() {
        int[] arr_v = this.stack;
        int v = this.stackSize;
        int v1 = arr_v[v - 1];
    alab1:
        switch(v1) {
            case 1: {
                arr_v[v - 1] = 2;
                break;
            }
            case 2: {
                int v4 = this.nextNonWhitespace(true);
                this.buffer.G();
                switch(((char)v4)) {
                    case 44: {
                        break alab1;
                    }
                    case 93: {
                        this.peeked = 4;
                        return 4;
                    }
                    default: {
                        this.throwSyntaxError("Unterminated array");
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
            case 4: {
                arr_v[v - 1] = 5;
                int v5 = this.nextNonWhitespace(true);
                this.buffer.G();
                if(((char)v5) != 58) {
                    this.throwSyntaxError("Expected \':\'");
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                break;
            }
            case 3: 
            case 5: {
                arr_v[v - 1] = 4;
                if(v1 == 5) {
                    int v2 = this.nextNonWhitespace(true);
                    this.buffer.G();
                    switch(((char)v2)) {
                        case 44: {
                            break;
                        }
                        case 0x7D: {
                            this.peeked = 2;
                            return 2;
                        }
                        default: {
                            this.throwSyntaxError("Unterminated object");
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                }
                int v3 = (char)this.nextNonWhitespace(true);
                switch(v3) {
                    case 34: {
                        this.buffer.G();
                        this.peeked = 13;
                        return 13;
                    }
                    case 0x7D: {
                        if(v1 != 5) {
                            this.buffer.G();
                            this.peeked = 2;
                            return 2;
                        }
                        this.throwSyntaxError("Expected name");
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    default: {
                        this.throwSyntaxError("Unexpected character: " + ((char)v3));
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
            }
            case 6: {
                arr_v[v - 1] = 7;
                break;
            }
            case 7: {
                if(this.nextNonWhitespace(false) == -1) {
                    this.peeked = 17;
                    return 17;
                }
                this.throwSyntaxError("Malformed JSON");
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            label_32:
                if(v1 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                break;
            }
            default: {
                goto label_32;
            }
        }
        int v6 = (char)this.nextNonWhitespace(true);
        if(v6 != 34) {
            if(v6 != 39 && v6 != 44 && v6 != 59) {
                switch(v6) {
                    case 91: {
                        this.buffer.G();
                        this.peeked = 3;
                        return 3;
                    }
                    case 93: {
                        if(v1 == 1) {
                            this.buffer.G();
                            this.peeked = 4;
                            return 4;
                        }
                        this.throwSyntaxError("Unexpected value");
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    default: {
                        if(v6 != 0x7B) {
                            int v7 = this.peekKeyword();
                            if(v7 != 0) {
                                return v7;
                            }
                            int v8 = this.peekNumber();
                            if(v8 != 0) {
                                return v8;
                            }
                            if(!this.isLiteral(((char)this.buffer.q(0L)))) {
                                this.throwSyntaxError("Expected value");
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            this.throwSyntaxError("Malformed JSON");
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                        this.buffer.G();
                        this.peeked = 1;
                        return 1;
                    }
                }
            }
            this.throwSyntaxError("Unexpected value");
            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
        }
        this.buffer.G();
        this.peeked = 9;
        return 9;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endArray() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        if((integer0 == null ? this.doPeek() : ((int)integer0)) != 4) {
            throw new g("Expected END_ARRAY but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        int v = this.stackSize;
        this.stackSize = v - 1;
        ++this.pathIndices[v - 2];
        this.peeked = 0;
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonReader endObject() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        if((integer0 == null ? this.doPeek() : ((int)integer0)) != 2) {
            throw new g("Expected END_OBJECT but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        int v = this.stackSize;
        this.stackSize = v - 1;
        this.pathNames[v - 1] = null;
        ++this.pathIndices[v - 2];
        this.peeked = 0;
        --this.indexStackSize;
        return this;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public List getPath() {
        return JsonScope.INSTANCE.getPath(this.stackSize, this.stack, this.pathNames, this.pathIndices);
    }

    private final String getPathAsString() {
        return p.v0(this.getPath(), ".", null, null, null, 62);
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public boolean hasNext() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        int v = integer0 == null ? this.doPeek() : ((int)integer0);
        return v != 2 && v != 4;
    }

    private final boolean isLiteral(char c) {
        switch(c) {
            case 35: 
            case 0x2F: 
            case 59: 
            case 61: 
            case 92: {
                this.throwSyntaxError("Unexpected character: " + c);
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            case 9: 
            case 10: 
            case 13: 
            case 0x20: 
            case 44: 
            case 58: 
            case 91: 
            case 93: 
            case 0x7B: 
            case 0x7D: {
                return false;
            }
            default: {
                return true;
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public boolean nextBoolean() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        switch((integer0 == null ? this.doPeek() : ((int)integer0))) {
            case 5: {
                this.peeked = 0;
                int v = this.stackSize - 1;
                ++this.pathIndices[v];
                return true;
            }
            case 6: {
                this.peeked = 0;
                int v1 = this.stackSize - 1;
                ++this.pathIndices[v1];
                return false;
            }
            default: {
                throw new g("Expected a boolean but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public double nextDouble() {
        double f;
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        switch((integer0 == null ? this.doPeek() : ((int)integer0))) {
            case 8: {
                this.peekedString = this.nextQuotedValue(BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH);
                break;
            }
            case 9: {
                this.peekedString = this.nextQuotedValue(BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH);
                break;
            }
            case 10: {
                this.peekedString = this.nextUnquotedValue();
                break;
            }
            case 11: {
                break;
            }
            case 15: {
                this.peeked = 0;
                int v = this.stackSize - 1;
                ++this.pathIndices[v];
                return (double)this.peekedLong;
            }
            case 16: {
                long v1 = (long)this.peekedNumberLength;
                this.buffer.getClass();
                this.peekedString = this.buffer.a0(v1, a.a);
                break;
            }
            default: {
                throw new g("Expected a double but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
        try {
            this.peeked = 11;
            String s = this.peekedString;
            Nb.j.c(s);
            f = Double.parseDouble(s);
        }
        catch(NumberFormatException unused_ex) {
            throw new g("Expected a double but was " + this.peekedString + " at path " + this.getPathAsString(), 2);
        }
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new g("JSON forbids NaN and infinities: " + f + " at path " + this.getPathAsString(), 3);
        }
        this.peekedString = null;
        this.peeked = 0;
        int v2 = this.stackSize - 1;
        ++this.pathIndices[v2];
        return f;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public int nextInt() {
        double f;
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        int v = integer0 == null ? this.doPeek() : ((int)integer0);
        switch(v) {
            case 8: 
            case 9: {
                String s = this.nextQuotedValue((v == 9 ? BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH : BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH));
                try {
                    this.peekedString = s;
                    Nb.j.c(s);
                    int v1 = Integer.parseInt(s);
                    this.peeked = 0;
                    int v2 = this.stackSize - 1;
                    ++this.pathIndices[v2];
                    return v1;
                }
                catch(NumberFormatException unused_ex) {
                    break;
                }
            }
            case 11: {
                break;
            }
            case 15: {
                int v3 = (int)this.peekedLong;
                if(this.peekedLong != ((long)v3)) {
                    throw new g("Expected an int but was " + this.peekedLong + " at path " + this.getPath(), 2);
                }
                this.peeked = 0;
                int v4 = this.stackSize - 1;
                ++this.pathIndices[v4];
                return v3;
            }
            case 16: {
                long v5 = (long)this.peekedNumberLength;
                this.buffer.getClass();
                this.peekedString = this.buffer.a0(v5, a.a);
                break;
            }
            default: {
                throw new g("Expected an int but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
        try {
            this.peeked = 11;
            String s1 = this.peekedString;
            Nb.j.c(s1);
            f = Double.parseDouble(s1);
        }
        catch(NumberFormatException unused_ex) {
            throw new g("Expected an int but was " + this.peekedString + " at path " + this.getPathAsString(), 2);
        }
        if(((double)(((int)f))) != f) {
            throw new g("Expected an int but was " + this.peekedString + " at path " + this.getPathAsString(), 2);
        }
        this.peekedString = null;
        this.peeked = 0;
        int v6 = this.stackSize - 1;
        ++this.pathIndices[v6];
        return (int)f;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public long nextLong() {
        double f;
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        int v = integer0 == null ? this.doPeek() : ((int)integer0);
        switch(v) {
            case 8: 
            case 9: {
                String s = this.nextQuotedValue((v == 9 ? BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH : BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH));
                try {
                    this.peekedString = s;
                    Nb.j.c(s);
                    long v1 = Long.parseLong(s);
                    this.peeked = 0;
                    int v2 = this.stackSize - 1;
                    ++this.pathIndices[v2];
                    return v1;
                }
                catch(NumberFormatException unused_ex) {
                    break;
                }
            }
            case 11: {
                break;
            }
            case 15: {
                this.peeked = 0;
                int v3 = this.stackSize - 1;
                ++this.pathIndices[v3];
                return this.peekedLong;
            }
            case 16: {
                long v4 = (long)this.peekedNumberLength;
                this.buffer.getClass();
                this.peekedString = this.buffer.a0(v4, a.a);
                break;
            }
            default: {
                throw new g("Expected a long but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
        try {
            this.peeked = 11;
            String s1 = this.peekedString;
            Nb.j.c(s1);
            f = Double.parseDouble(s1);
        }
        catch(NumberFormatException unused_ex) {
            throw new g("Expected a long but was " + this.peekedString + " at path " + this.getPathAsString(), 2);
        }
        if(((double)(((long)f))) != f) {
            throw new g("Expected a long but was " + this.peekedString + " at path " + this.getPathAsString(), 2);
        }
        this.peekedString = null;
        this.peeked = 0;
        int v5 = this.stackSize - 1;
        ++this.pathIndices[v5];
        return (long)f;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public String nextName() {
        String s;
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        switch((integer0 == null ? this.doPeek() : ((int)integer0))) {
            case 12: {
                s = this.nextQuotedValue(BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH);
                break;
            }
            case 13: {
                s = this.nextQuotedValue(BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH);
                break;
            }
            case 14: {
                s = this.nextUnquotedValue();
                break;
            }
            default: {
                throw new g("Expected a name but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = s;
        return s;
    }

    private final int nextNonWhitespace(boolean z) {
        int v = 0;
        while(true) {
            long v1 = (long)v;
            if(!this.source.o(v1 + 1L)) {
                break;
            }
            ++v;
            int v2 = this.buffer.q(v1);
            if(v2 != 9 && v2 != 10 && v2 != 13 && v2 != 0x20) {
                this.buffer.skip(((long)v) - 1L);
                switch(v2) {
                    case 35: {
                        this.throwSyntaxError("Malformed JSON");
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    case 0x2F: {
                        if(!this.source.o(2L)) {
                            return 0x2F;
                        }
                        this.throwSyntaxError("Malformed JSON");
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    default: {
                        return v2;
                    }
                }
            }
        }
        if(z) {
            throw new EOFException("End of input");
        }
        return -1;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public Void nextNull() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        if((integer0 == null ? this.doPeek() : ((int)integer0)) != 7) {
            throw new g("Expected null but was " + this.peek() + " at path " + this.getPathAsString(), 2);
        }
        this.peeked = 0;
        int v = this.stackSize - 1;
        ++this.pathIndices[v];
        return null;
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public JsonNumber nextNumber() {
        String s = this.nextString();
        Nb.j.c(s);
        return new JsonNumber(s);
    }

    private final String nextQuotedValue(m m0) {
        String s;
        StringBuilder stringBuilder0 = null;
        long v;
        while((v = this.source.A(m0)) != -1L) {
            if(this.buffer.q(v) == 92) {
                if(stringBuilder0 == null) {
                    stringBuilder0 = new StringBuilder();
                }
                this.buffer.getClass();
                stringBuilder0.append(this.buffer.a0(v, a.a));
                this.buffer.G();
                stringBuilder0.append(this.readEscapeCharacter());
                continue;
            }
            if(stringBuilder0 == null) {
                this.buffer.getClass();
                s = this.buffer.a0(v, a.a);
                this.buffer.G();
                return s;
            }
            this.buffer.getClass();
            stringBuilder0.append(this.buffer.a0(v, a.a));
            this.buffer.G();
            s = stringBuilder0.toString();
            Nb.j.c(s);
            return s;
        }
        this.throwSyntaxError("Unterminated string");
        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public String nextString() {
        Integer integer0 = (int)this.peeked;
        String s = null;
        if(integer0.intValue() == 0) {
            integer0 = null;
        }
        switch((integer0 == null ? this.doPeek() : ((int)integer0))) {
            case 8: {
                s = this.nextQuotedValue(BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH);
                break;
            }
            case 9: {
                s = this.nextQuotedValue(BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH);
                break;
            }
            case 10: {
                s = this.nextUnquotedValue();
                break;
            }
            case 11: {
                String s1 = this.peekedString;
                if(s1 != null) {
                    this.peekedString = null;
                    s = s1;
                }
                break;
            }
            case 15: {
                s = String.valueOf(this.peekedLong);
                break;
            }
            case 16: {
                long v = (long)this.peekedNumberLength;
                this.buffer.getClass();
                s = this.buffer.a0(v, a.a);
                break;
            }
            default: {
                throw new g("Expected a string but was " + this.peek() + " at path " + this.getPathAsString(), 2);
            }
        }
        this.peeked = 0;
        int v1 = this.stackSize - 1;
        ++this.pathIndices[v1];
        return s;
    }

    private final String nextUnquotedValue() {
        long v = this.source.A(BufferedSourceJsonReader.UNQUOTED_STRING_TERMINALS);
        if(v != -1L) {
            this.buffer.getClass();
            return this.buffer.a0(v, a.a);
        }
        return this.buffer.B();
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public Token peek() {
        Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
        switch((integer0 == null ? this.doPeek() : ((int)integer0))) {
            case 1: {
                return Token.BEGIN_OBJECT;
            }
            case 2: {
                return Token.END_OBJECT;
            }
            case 3: {
                return Token.BEGIN_ARRAY;
            }
            case 4: {
                return Token.END_ARRAY;
            }
            case 5: 
            case 6: {
                return Token.BOOLEAN;
            }
            case 7: {
                return Token.NULL;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return Token.STRING;
            }
            case 12: 
            case 13: 
            case 14: {
                return Token.NAME;
            }
            case 15: {
                return Token.LONG;
            }
            case 16: {
                return Token.NUMBER;
            }
            case 17: {
                return Token.END_DOCUMENT;
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    private final int peekKeyword() {
        int v;
        String s1;
        String s;
        switch(this.buffer.q(0L)) {
            case 70: 
            case 102: {
                s = "false";
                s1 = "FALSE";
                v = 6;
                break;
            }
            case 78: 
            case 110: {
                s = "null";
                s1 = "NULL";
                v = 7;
                break;
            }
            case 84: 
            case 0x74: {
                s = "true";
                s1 = "TRUE";
                v = 5;
                break;
            }
            default: {
                return 0;
            }
        }
        int v1 = s.length();
        for(int v2 = 1; v2 < v1; ++v2) {
            if(!this.source.o(1L + ((long)v2))) {
                return 0;
            }
            int v3 = this.buffer.q(((long)v2));
            if(v3 != ((byte)s.charAt(v2)) && v3 != ((byte)s1.charAt(v2))) {
                return 0;
            }
        }
        if(this.source.o(1L + ((long)v1)) && this.isLiteral(((char)this.buffer.q(((long)v1))))) {
            return 0;
        }
        this.buffer.skip(((long)v1));
        this.peeked = v;
        return v;
    }

    private final int peekNumber() {
        int v = 1;
        int v1 = 0;
        int v2 = 0;
        long v3 = 0L;
        boolean z = false;
    alab2:
        while(this.source.o(1L + ((long)v1))) {
            int v4 = this.buffer.q(((long)v1));
            int v5 = (char)v4;
        alab1:
            switch(v5) {
                case 43: {
                    if(v2 != 5) {
                        return 0;
                    }
                    v2 = 6;
                    break;
                }
                case 45: {
                    switch(v2) {
                        case 0: {
                            v2 = 1;
                            z = true;
                            break alab1;
                        }
                        case 5: {
                            v2 = 6;
                            break alab1;
                        }
                        default: {
                            return 0;
                        }
                    }
                }
                case 46: {
                    if(v2 == 2) {
                        v2 = 6;
                        break;
                    }
                    return 0;
                }
                case 69: 
                case 101: {
                    if(v2 != 2 && v2 != 4) {
                        return 0;
                    }
                    v2 = 5;
                    break;
                }
                default: {
                    if(v4 < 0x30 || v4 > 57) {
                        goto label_26;
                    }
                    switch(v2) {
                        case 0: 
                        case 1: {
                            v3 = -((long)(v4 - 0x30));
                            v2 = 2;
                            break;
                        label_26:
                            if(!this.isLiteral(((char)v5))) {
                                break alab2;
                            }
                            return 0;
                        }
                        case 2: {
                            if(v3 == 0L) {
                                return 0;
                            }
                            long v6 = 10L * v3 - ((long)(v4 - 0x30));
                            int v7 = Long.compare(v3, -922337203685477580L);
                            v = (v & (v7 <= 0 ? 0 : 1)) != 0 || v7 == 0 && v6 < v3 ? 1 : 0;
                            v3 = v6;
                            break;
                        }
                        case 5: {
                            v2 = 7;
                            break;
                        }
                        default: {
                            if(v2 == 6) {
                                v2 = 7;
                            }
                        }
                    }
                }
            }
            ++v1;
        }
        int v8 = 0;
        if(v2 == 2 && v != 0 && (v3 != 0x8000000000000000L || z)) {
            if(!z) {
                v3 = -v3;
            }
            this.peekedLong = v3;
            this.buffer.skip(((long)v1));
            this.peeked = 15;
            return 15;
        }
        if(v2 == 2 || v2 == 4 || v2 == 7) {
            this.peekedNumberLength = v1;
            v8 = 16;
            this.peeked = 16;
        }
        return v8;
    }

    private final void push(int v) {
        int[] arr_v = this.stack;
        if(this.stackSize == arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            Nb.j.e(arr_v1, "copyOf(...)");
            this.stack = arr_v1;
            Object[] arr_object = Arrays.copyOf(this.pathNames, this.pathNames.length * 2);
            Nb.j.e(arr_object, "copyOf(...)");
            this.pathNames = (String[])arr_object;
            int[] arr_v2 = Arrays.copyOf(this.pathIndices, this.pathIndices.length * 2);
            Nb.j.e(arr_v2, "copyOf(...)");
            this.pathIndices = arr_v2;
            int[] arr_v3 = Arrays.copyOf(this.indexStack, this.indexStack.length * 2);
            Nb.j.e(arr_v3, "copyOf(...)");
            this.indexStack = arr_v3;
        }
        int v1 = this.stackSize;
        this.stackSize = v1 + 1;
        this.stack[v1] = v;
    }

    private final char readEscapeCharacter() {
        int v2;
        if(this.source.o(1L)) {
            char c = (char)this.buffer.G();
            char c1 = '\n';
            switch(c) {
                case 10: 
                case 34: 
                case 39: 
                case 0x2F: 
                case 92: {
                    return c;
                }
                case 98: {
                    return '\b';
                }
                case 102: {
                    return '\f';
                }
                case 110: {
                    return c1;
                }
                case 0x72: {
                    return '\r';
                }
                case 0x74: {
                    return '\t';
                }
                case 0x75: {
                    if(!this.source.o(4L)) {
                        throw new EOFException("Unterminated escape sequence at path " + this.getPath());
                    }
                    c1 = '\u0000';
                    for(int v = 0; v < 4; ++v) {
                        int v1 = this.buffer.q(((long)v));
                        if(v1 >= 0x30 && v1 <= 57) {
                            v2 = v1 - 0x30;
                        }
                        else if(v1 < 97 || v1 > 102) {
                            if(v1 < 65 || v1 > 70) {
                                this.buffer.getClass();
                                this.throwSyntaxError("\\u" + this.buffer.a0(4L, a.a));
                                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                            }
                            v2 = v1 - 55;
                        }
                        else {
                            v2 = v1 - 87;
                        }
                        c1 = (char)(((char)(c1 << 4)) + v2);
                    }
                    this.buffer.skip(4L);
                    return c1;
                }
                default: {
                    this.throwSyntaxError("Invalid escape sequence: \\" + c);
                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
            }
        }
        this.throwSyntaxError("Unterminated escape sequence");
        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public void rewind() {
        throw new IllegalStateException("BufferedSourceJsonReader cannot rewind.");
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public int selectName(List list0) {
        Nb.j.f(list0, "names");
        if(list0.isEmpty()) {
            return -1;
        }
        while(this.hasNext()) {
            String s = this.nextName();
            int v = this.indexStack[this.indexStackSize - 1];
            if(Nb.j.a(list0.get(v), s)) {
                int[] arr_v = this.indexStack;
                int v1 = this.indexStackSize;
                arr_v[v1 - 1] = v + 1;
                if(arr_v[v1 - 1] == list0.size()) {
                    this.indexStack[this.indexStackSize - 1] = 0;
                }
                return v;
            }
            int v2 = v;
        label_14:
            ++v2;
            v2 = v2 == list0.size() ? 0 : v2 + 1;
            if(v2 == v) {
                this.skipValue();
                continue;
            }
            if(!Nb.j.a(list0.get(v2), s)) {
                goto label_14;
            }
            int[] arr_v1 = this.indexStack;
            int v3 = this.indexStackSize;
            arr_v1[v3 - 1] = v2 + 1;
            if(arr_v1[v3 - 1] == list0.size()) {
                this.indexStack[this.indexStackSize - 1] = 0;
            }
            return v2;
        }
        return -1;
    }

    private final void skipQuotedValue(m m0) {
        long v;
        while((v = this.source.A(m0)) != -1L) {
            if(this.buffer.q(v) == 92) {
                this.buffer.skip(v + 1L);
                this.readEscapeCharacter();
                continue;
            }
            this.buffer.skip(v + 1L);
            return;
        }
        this.throwSyntaxError("Unterminated string");
        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }

    private final void skipUnquotedValue() {
        long v = this.source.A(BufferedSourceJsonReader.UNQUOTED_STRING_TERMINALS);
        j j0 = this.buffer;
        if(v == -1L) {
            v = j0.Y;
        }
        j0.skip(v);
    }

    @Override  // com.apollographql.apollo.api.json.JsonReader
    public void skipValue() {
        int v = 0;
        do {
            Integer integer0 = this.peeked == 0 ? null : ((int)this.peeked);
            switch((integer0 == null ? this.doPeek() : ((int)integer0))) {
                case 1: {
                    this.push(3);
                    ++v;
                    break;
                }
                case 2: {
                    --this.stackSize;
                    --v;
                    break;
                }
                case 3: {
                    this.push(1);
                    ++v;
                    break;
                }
                case 4: {
                    --this.stackSize;
                    --v;
                    break;
                }
                case 8: 
                case 12: {
                    this.skipQuotedValue(BufferedSourceJsonReader.SINGLE_QUOTE_OR_SLASH);
                    break;
                }
                case 9: 
                case 13: {
                    this.skipQuotedValue(BufferedSourceJsonReader.DOUBLE_QUOTE_OR_SLASH);
                    break;
                }
                case 10: 
                case 14: {
                    this.skipUnquotedValue();
                    break;
                }
                case 16: {
                    this.buffer.skip(((long)this.peekedNumberLength));
                }
            }
            this.peeked = 0;
        }
        while(v != 0);
        int v1 = this.stackSize;
        ++this.pathIndices[v1 - 1];
        this.pathNames[v1 - 1] = "null";
    }

    private final Void throwSyntaxError(String s) {
        StringBuilder stringBuilder0 = A3.e.w(s, " at path ");
        stringBuilder0.append(this.getPath());
        throw new g(stringBuilder0.toString(), 3);
    }
}

