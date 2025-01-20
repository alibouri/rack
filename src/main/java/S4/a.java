package s4;

public enum a {
    NOT_SPECIFIED,
    DO_NOT_DISPOSE,
    RESTORE_TO_BACKGROUND_COLOR,
    RESTORE_TO_PREVIOUS,
    TO_BE_DEFINED,
    INVALID;

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "Not Specified";
            }
            case 1: {
                return "Don\'t Dispose";
            }
            case 2: {
                return "Restore to Background Color";
            }
            case 3: {
                return "Restore to Previous";
            }
            case 4: {
                return "To Be Defined";
            }
            case 5: {
                return "Invalid value";
            }
            default: {
                return super.toString();
            }
        }
    }
}

