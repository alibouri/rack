package com.drew.metadata.photoshop;

import com.drew.metadata.b;
import com.drew.metadata.g;
import java.util.HashMap;

public class DuckyDirectory extends b {
    public static final int TAG_COMMENT = 2;
    public static final int TAG_COPYRIGHT = 3;
    public static final int TAG_QUALITY = 1;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        DuckyDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Quality", 2, "Comment");
        hashMap0.put(3, "Copyright");
    }

    public DuckyDirectory() {
        this.setDescriptor(new g(this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Ducky";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return DuckyDirectory._tagNameMap;
    }
}

