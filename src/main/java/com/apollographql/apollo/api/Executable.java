package com.apollographql.apollo.api;

import Nb.j;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Map;

public interface Executable {
    public interface Data {
    }

    public static final class Variables {
        private final Map valueMap;

        public Variables(Map map0) {
            j.f(map0, "valueMap");
            super();
            this.valueMap = map0;
        }

        public final Map getValueMap() {
            return this.valueMap;
        }
    }

    Adapter adapter();

    CompiledField rootField();

    void serializeVariables(JsonWriter arg1, CustomScalarAdapters arg2, boolean arg3);
}

