package m8;

public final class a extends Exception {
    public final int X;
    public final String Y;

    public a(int v, String s) {
        super(s);
        this.Y = s;
        this.X = v;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Error type: ");
        switch(this.X) {
            case 1: {
                s = "INVALID_COUNTRY_CODE";
                break;
            }
            case 2: {
                s = "NOT_A_NUMBER";
                break;
            }
            case 3: {
                s = "TOO_SHORT_AFTER_IDD";
                break;
            }
            case 4: {
                s = "TOO_SHORT_NSN";
                break;
            }
            case 5: {
                s = "TOO_LONG";
                break;
            }
            default: {
                s = "null";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(". ");
        stringBuilder0.append(this.Y);
        return stringBuilder0.toString();
    }
}

