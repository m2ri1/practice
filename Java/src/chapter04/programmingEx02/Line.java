package chapter04.programmingEx02;

public class Line {
    int line;

    public Line(int line) {
        this.line = line;
    }

    boolean isSameLine(Line line) {
        return this.line == line.line;
    }
}
