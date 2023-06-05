enum class Codes(val code: Int) {
    SHOW(0),
    TRANSLATE(1),
    ADD(2),
    DELETE(3),
    EXIT(4),
    RU(5),
    EN(5),
    ALL(6);

    companion object {
        @Throws(Exception::class)
        fun getEnumByCode(code: Int): Codes {
            for (c in values()) {
                if (c.code == code) {
                    return c
                }
            }
            throw Exception("No equals")
        }
    }
}
