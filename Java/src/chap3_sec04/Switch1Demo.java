package chap3_sec04;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Switch1Demo {

  public static void main(String[] args) {
    int i = 2;
    switch (i) {
      case 3:
        System.out.println("*");
      case 2:
        System.out.println("*");
      case 1:
        System.out.println("*");
    }
  }

}
