"""
number = int(input("숫자를 입력하세요 :"))
if(number%2) ==0:
    print("짝수입니다.")
else:
    print("홀수입니다.")
"""
"""
age = int(input("나이를 입력하세요 : "))
if age>=20:
    print("성인입니다.")
elif age >=13:
    print("청소년입니다.")
else:
    print("어린이입니다.")
 
"""

print("[내신등급 계산 프로그램]")
mygrade = 0
totalunit = 0  
totalgrade = 0  
subjectcount = int(input("과목수 : "))
for i in range(subjectcount):
    print(i+1, end = " ")
    unit = int(input("과목 단위 수 : "))  
    grade = int(input("석차 등급 : ")) 
    totalunit += unit
    totalgrade += grade*unit
mygrade = totalgrade/totalunit
print("내신 등급은", mygrade, "입니다")
if mygrade > 10:
    print("하권 입니다.")
elif mygrade > 7:
    print("중위권 입니다.")
else:
    print("하위권 입니다.")
