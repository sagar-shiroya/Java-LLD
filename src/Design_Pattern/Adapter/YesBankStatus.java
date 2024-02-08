package Design_Pattern.Adapter;

public enum YesBankStatus {
    Y, N, I;

    public static YesBankStatus getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}
