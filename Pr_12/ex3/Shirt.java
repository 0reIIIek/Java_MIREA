package ex3;

public class Shirt {
    private String[] strings;
    private int pos = 0;

    public Shirt(String[] strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        pos++;
        if (pos <= this.strings.length) {
            return this.strings[pos-1] + "\n" + this.toString();
        }
        return "";
    }
}
