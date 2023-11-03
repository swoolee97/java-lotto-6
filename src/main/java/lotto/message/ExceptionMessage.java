package lotto.message;

public enum ExceptionMessage {
    INPUT_NOT_NUMBER("숫자만 입력 가능합니다"),
    NOT_NATURAL_NUMBER("자연수만 입력 가능합니다"),
    INDIVISIBLE_AMOUNT("구입금액은 1000원 단위여야 합니다");
    private static final String EXCEPTION_MESSAGE_HEADER = "[ERROR] ";
    private final String message;

    private ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return EXCEPTION_MESSAGE_HEADER + this.message;
    }
}
