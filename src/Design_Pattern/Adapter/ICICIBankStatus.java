package Design_Pattern.Adapter;

public enum ICICIBankStatus {
    DONE, FAILED, IN_PROGRESS;

    public static ICICIBankStatus getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
