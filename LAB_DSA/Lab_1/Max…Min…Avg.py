import json
my_list = json.loads(input())
ma_val = my_list[0]
mi_val = my_list[0]
total = 0

for i in my_list:
    total += i
    if i < mi_val:
        mi_val = i
    if i > ma_val:
        ma_val = i
total /= len(my_list)
print(f"({ma_val}, {mi_val}, {round(total, 2)})")