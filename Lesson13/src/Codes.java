enum Codes {
    EXIT(0), PRINT(1), EDIT(2), SORT(3), ADD(4),DELETE(5);

    public int getCode() {
        return code;
    }

    Codes(int code) {
        this.code = code;
    }

    public static Codes getEnumByCode(int code) throws Exception {
        for (Codes c : Codes.values()) {
            if (c.code == code) {
                return c;
            }
        }
        throw new Exception("No equals");
    }

    private final int code;
}
