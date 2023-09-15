package chapter06;

public class BoxDemo {
    public static void main(String[] args) {
        ColoredBox cb = new ColoredBox();
    }
}

class Box {
    public Box(String s) {

    }

    Box() {

    }

}

class ColoredBox extends Box {

/*    public ColoredBox(String s) {
        super(s);


    }*/

    public ColoredBox() {
        super();


    }
}