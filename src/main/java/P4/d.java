package p4;

public enum d {
    BI_RGB,
    BI_RLE8,
    BI_RLE4,
    BI_BITFIELDS,
    BI_HUFFMAN_1D,
    BI_JPEG,
    BI_RLE24,
    BI_PNG,
    BI_ALPHABITFIELDS,
    BI_CMYK,
    BI_CMYKRLE8,
    BI_CMYKRLE4;

    @Override
    public final String toString() {
        switch(this.ordinal()) {
            case 0: {
                return "None";
            }
            case 1: {
                return "RLE 8-bit/pixel";
            }
            case 2: {
                return "RLE 4-bit/pixel";
            }
            case 3: {
                return "Bit Fields";
            }
            case 4: {
                return "Huffman 1D";
            }
            case 5: {
                return "JPEG";
            }
            case 6: {
                return "RLE 24-bit/pixel";
            }
            case 7: {
                return "PNG";
            }
            case 8: {
                return "RGBA Bit Fields";
            }
            case 9: {
                return "CMYK Uncompressed";
            }
            case 10: {
                return "CMYK RLE-8";
            }
            case 11: {
                return "CMYK RLE-4";
            }
            default: {
                throw new IllegalStateException("Unimplemented compression type " + super.toString());
            }
        }
    }
}

