import random
answer = random.randint(1, 100)

guess = None

while guess != answer:
    guess = int(input("숫자를 입력하세요: "))
    
    if guess > answer:
        print("down")
    elif guess < answer:
        print("up")
    

print("축하합니다!!!!드디 숫자를 맞췄습니다.")
