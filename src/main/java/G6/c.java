package g6;

import com.google.android.gms.common.Feature;

public abstract class c {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature0 = new Feature(1L, "name_ulr_private");
        Feature feature1 = new Feature(1L, "name_sleep_segment_request");
        Feature feature2 = new Feature(1L, "get_last_activity_feature_id");
        Feature feature3 = new Feature(1L, "support_context_feature_id");
        Feature feature4 = new Feature(2L, "get_current_location");
        Feature feature5 = new Feature(1L, "get_last_location_with_request");
        c.a = feature5;
        Feature feature6 = new Feature(1L, "set_mock_mode_with_callback");
        Feature feature7 = new Feature(1L, "set_mock_location_with_callback");
        Feature feature8 = new Feature(1L, "inject_location_with_callback");
        Feature feature9 = new Feature(1L, "location_updates_with_callback");
        c.b = feature9;
        c.c = new Feature[]{feature0, feature1, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9, new Feature(1L, "use_safe_parcelable_in_intents"), new Feature(1L, "flp_debug_updates"), new Feature(1L, "google_location_accuracy_enabled"), new Feature(1L, "geofences_with_callback"), new Feature(1L, "location_enabled")};
    }
}

