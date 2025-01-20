package com.drew.metadata.mov.media;

import com.apollographql.apollo.api.b;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public abstract class QuickTimeMediaDirectory extends QuickTimeDirectory {
    public static final int TAG_CREATION_TIME = 0x5001;
    public static final int TAG_DURATION = 0x5003;
    public static final int TAG_MODIFICATION_TIME = 0x5002;

    public static void addQuickTimeMediaTags(HashMap hashMap0) {
        b.z(0x5001, hashMap0, "Creation Time", 0x5002, "Modification Time");
        hashMap0.put(0x5003, "Duration");
    }
}

