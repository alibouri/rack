package com.apollographql.apollo.api.json.internal;

import Nb.j;
import java.util.ArrayList;
import java.util.List;

public final class JsonScope {
    public static final int CLOSED = 8;
    public static final int DANGLING_NAME = 4;
    public static final int EMPTY_ARRAY = 1;
    public static final int EMPTY_DOCUMENT = 6;
    public static final int EMPTY_OBJECT = 3;
    public static final JsonScope INSTANCE = null;
    public static final int NONEMPTY_ARRAY = 2;
    public static final int NONEMPTY_DOCUMENT = 7;
    public static final int NONEMPTY_OBJECT = 5;

    static {
        JsonScope.INSTANCE = new JsonScope();
    }

    public final List getPath(int v, int[] arr_v, String[] arr_s, int[] arr_v1) {
        j.f(arr_v, "stack");
        j.f(arr_s, "pathNames");
        j.f(arr_v1, "pathIndices");
        List list0 = new ArrayList();
        for(int v1 = 0; v1 < v; ++v1) {
            switch(arr_v[v1]) {
                case 1: 
                case 2: {
                    list0.add(((int)arr_v1[v1]));
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    String s = arr_s[v1];
                    if(s != null) {
                        list0.add(s);
                    }
                }
            }
        }
        return list0;
    }
}

