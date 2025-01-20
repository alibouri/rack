package com.drew.metadata.mov.media;

import C4.a;
import com.apollographql.apollo.api.b;
import com.drew.metadata.mov.QuickTimeDirectory;
import java.util.HashMap;

public class QuickTimeSoundDirectory extends QuickTimeDirectory {
    public static final int TAG_AUDIO_FORMAT = 0x301;
    public static final int TAG_AUDIO_SAMPLE_RATE = 0x304;
    public static final int TAG_AUDIO_SAMPLE_SIZE = 0x303;
    public static final int TAG_NUMBER_OF_CHANNELS = 770;
    public static final int TAG_SOUND_BALANCE = 0x305;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        QuickTimeSoundDirectory._tagNameMap = hashMap0;
        QuickTimeMediaDirectory.addQuickTimeMediaTags(hashMap0);
        hashMap0.put(0x301, "Format");
        hashMap0.put(770, "Number of Channels");
        b.z(0x303, hashMap0, "Sample Size", 0x304, "Sample Rate");
        hashMap0.put(0x305, "Balance");
    }

    public QuickTimeSoundDirectory() {
        this.setDescriptor(new a(1, this));
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public String getName() {
        return "QuickTime Sound";
    }

    @Override  // com.drew.metadata.mov.QuickTimeDirectory
    public HashMap getTagNameMap() {
        return QuickTimeSoundDirectory._tagNameMap;
    }
}

