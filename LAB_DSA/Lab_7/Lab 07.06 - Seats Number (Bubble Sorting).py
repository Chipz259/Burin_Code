import ast
def bubbleSort(lst,last):
    compare = 0
    current = 0
    sorted = False
    while current <= last and sorted is False:
        walker = last
        sorted = True
        while walker > current:
            compare += 1

            walker_ch = lst[walker][0]
            walker_num = int(lst[walker][1:])
            walk_prev_ch = lst[walker - 1][0]
            walk_prev_num = int(lst[walker - 1][1:])
            if walker_ch < walk_prev_ch or (walker_ch == walk_prev_ch and walker_num < walk_prev_num):
                sorted = False
                lst[walker], lst[walker - 1] = lst[walker - 1], lst[walker]

            walker -= 1
        current += 1
        print(lst)
    print("Comparison times:" , compare)

lst = ast.literal_eval(input())
last = int(input())

bubbleSort(lst, last)
