package ok.generic;

public class Pair<K, T> {
    private K key;
    private T value;

    public Pair(K key, T value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public <K> K getKey() {
        return (K) key;
    }

    public <T> T getValue() {
        return (T) value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(22, "Работает? Вроде бы да");

        Integer i = pair.getKey();
        String s = pair.getValue();
        System.out.println(i);
        System.out.println(s);
        System.out.println();

        pair.setKey(150 + 150);
        i = pair.getKey();
        System.out.println(i);

        pair.setValue("А если так?");
        s = pair.getValue();
        System.out.println(s + " Ага");
    }
}