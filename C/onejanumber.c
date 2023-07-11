#include <stdio.h>

int main() {
  int i, j;

  for (i = 1; i <= 20; i++) {
    if (i <= 2) {
      printf("%d -> %d\n", i, i % 2);
    } else if ((i - 2) <= 8) {
      printf("%d -> %d\n", i, (i - 2) % 8);
    } else if ((i - 12) <= 8) {
      printf("%d -> %d\n", i, (i - 10) % 8);
    }
  }

  return 0;
}