import ast
def insertionSort(lst,last):
    compare = 0
    for current in range(1, last+1):
        hold = lst[current]
        walker = current - 1
        while walker >= 0:
            compare += 1
            hold_ch = hold[0]
            hold_num = int(hold[1:])
            walk_ch = lst[walker][0]
            walk_num = int(lst[walker][1:])
            if hold_ch < walk_ch or (hold_ch == walk_ch and hold_num < walk_num):
                lst[walker + 1] = lst[walker]
                walker -= 1
            else:
                break
        lst[walker + 1] = hold
        print(lst)
    print("Comparison times:" , compare)

lst = ast.literal_eval(input())
last = int(input())

insertionSort(lst, last)