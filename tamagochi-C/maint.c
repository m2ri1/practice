#include <stdio.h>
#include <stdlib.h>

int happiness = 0; // 행복지수 변수
int buttonMenu = 0; //메뉴 버튼의 값 변수, 아두이노의 버튼 변수로 대체

struct Tamagotchi {
    int hunger;     // 배고픔 수준
    int happiness;  // 행복 수준
};

// 다마고치 초기화 함수
void resetTamagotchi(struct Tamagotchi* t) {
    t->hunger = 100;
    t->happiness = 30;

    //다마고치 태어나는 모션
}

int printEmotion() {
    int random;
    random = rand()%9; // 난수 생성
    if (random == 1){
        // 똥치우기 실행
    }
    
    if (happiness == 1){
        printf("행복\n");
    } 
    else if (happiness == 0) {
        printf("슬픔\n");
    }
    return 0;

}

int menu() {
    //행복지수 확인, 놀아주기, 밥주기 선택


    return 0;
}

// 밥 주기 함수
void feed(struct Tamagotchi* t) {
    t->hunger += 10;
    t->happiness += 5;
}

// 놀아주기 함수
void play(struct Tamagotchi* t) {
    t->happiness += 10;
}


int main() {
    struct Tamagotchi myTamagotchi;
    resetTamagotchi(&myTamagotchi);

    while (1) {
        if (buttonMenu == 0) {
            printEmotion();
        }
        else
        menu();
    }

    return 0;
}
