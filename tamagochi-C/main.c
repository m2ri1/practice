#include <stdio.h>
#include <stdlib.h>

// 버튼 변수, 아두이노의 버튼 누를 시 값을 해당 변수에 저장 ( 0에서 1씩 추가 )
int buttonMenu = 0; //메뉴
int buttonOp1 = 0; //옵션 1
int buttonOp2 = 0; //옵션 2

// 다마고치 상태
int poop;       // 똥 방치 상태
int hunger;     // 배고픔 수준
int happiness;  // 행복 수준

// 함수 선언
int resetTamagotchi(); // 다마고치 리셋 함수
int printEmotion(); // 상태 출력 함수
int menu(); // 메뉴 화면 실행 함수
int pooping(); // 똥 실행 함수
void happyUp(); // 행복지수 +10
void happyDown(); // 행복지수 -10
void feed(); // 밥 주기 함수
void play(); // 놀아주기 함수


int resetTamagotchi() {
    hunger = 50;
    happiness = 30;
    poop = 0;
    buttonMenu = 0; 
    buttonOp1 = 0; 
    buttonOp2 = 0; 

    //다마고치 태어나는 모션
    return 0;
}

int printEmotion() {
    int random;
    random = rand()%9; // 난수 생성해서 랜덤으로 똥 싸기
    if (random == 1){
        hunger-=1;
        pooping();

    }
    
    else if (happiness > 10){
        // 행복한 상태 모션
        hunger-=1;
    } 
    else if (happiness <= 10) {
        // 슬픈 상태 모션
        hunger-=1;

    }
    return 0;

}

int pooping(){
    while(1)
    {
        poop = 7;
        //똥 방치 모션
        poop -= 1;
        if (poop <= 0) happyDown();
        if (buttonOp1 == 1) break;

    }
    poop = 0;
    //똥치우기 모션   
    happyUp();

    return 0;
}

int menu() {
    if (buttonMenu == 1) return 0;

    else if (buttonOp1 ==1) {// 밥주기 선택 창
        if (buttonOp1 >= 2) {
        buttonOp1 = 0;
        feed();
        }
    }

    else if (buttonOp2 == 1) { // 놀아주기 선택 창
        if (buttonOp2 >= 2) {
        buttonOp2 = 0;
        play(); 
        }
    }
    return 0;
}

void happyUp(){
    happiness += 10;
    // 행복 모션

}

void happyDown(){
    if (happiness > 0) 
    happiness -= 10;
    
    // 슬픔 모션

}

void feed() {
    // 밥 먹는 모션
    hunger = 30;
    happyUp();
}

void play() {
    // 노는 모션
    hunger -= 10;
    happyUp();
    
}


int main() {
    resetTamagotchi();

    while (1) {
        if (buttonMenu == 1) {
            buttonMenu = 0;
            menu();
            buttonMenu = 0;
        }

        else if (buttonOp2 == 1) {
        resetTamagotchi();
        }

        else{
        printEmotion();
        }

        if (hunger <= 0){
        happiness = 10;
        }
    
    }
}
