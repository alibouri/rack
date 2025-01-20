package com.drew.metadata.mp4.media;

import com.apollographql.apollo.api.b;
import com.drew.metadata.mp4.Mp4Directory;
import java.util.HashMap;

public abstract class Mp4MediaDirectory extends Mp4Directory {
    public static final int TAG_CREATION_TIME = 101;
    public static final int TAG_DURATION = 103;
    public static final int TAG_LANGUAGE_CODE = 104;
    public static final int TAG_MODIFICATION_TIME = 102;

    public static void addMp4MediaTags(HashMap hashMap0) {
        b.z(101, hashMap0, "Creation Time", 102, "Modification Time");
        b.z(103, hashMap0, "Duration", 104, "ISO 639-2 Language Code");
    }
}

