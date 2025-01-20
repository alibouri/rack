package com.drew.metadata.gif;

import com.drew.metadata.b;
import java.util.HashMap;
import r4.a;

public class GifControlDirectory extends b {
    public static final int TAG_DELAY = 1;
    public static final int TAG_DISPOSAL_METHOD = 2;
    public static final int TAG_TRANSPARENT_COLOR_FLAG = 4;
    public static final int TAG_TRANSPARENT_COLOR_INDEX = 5;
    public static final int TAG_USER_INPUT_FLAG = 3;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        GifControlDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Delay", 2, "Disposal Method");
        com.apollographql.apollo.api.b.z(3, hashMap0, "User Input Flag", 4, "Transparent Color Flag");
        hashMap0.put(5, "Transparent Color Index");
    }

    public GifControlDirectory() {
        this.setDescriptor(new a(3, this));
    }

    public s4.a getDisposalMethod() {
        return (s4.a)this.getObject(2);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "GIF Control";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return GifControlDirectory._tagNameMap;
    }

    public boolean isTransparent() {
        Boolean boolean0 = this.getBooleanObject(4);
        return boolean0 != null && boolean0.booleanValue();
    }
}

