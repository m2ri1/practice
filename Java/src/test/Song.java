package test;

public class Song {
    String title;

    public Song(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    public static void main(String[] args) {

        Song mysong = new Song("Nessum Dorma");
        Song yoursong = new Song("공주는 잠 못 이루고");
        System.out.println("내 노래는 " + mysong.getTitle());
        System.out.println("너의 노래는 " + yoursong.getTitle());
    }

}
