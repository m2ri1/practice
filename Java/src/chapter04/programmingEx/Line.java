package chapter04.programmingEx;

public class Line {
    int length;

    public Line(int length) {
        this.length = length;
    }

    boolean isSameLine(Line o) {
        return o.length == length;
    }
}
