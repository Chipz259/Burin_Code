import ast
def selectionSort(lst,last):
    compare = 0
    current = 0
    for current in range(0, last):
        smallest = current
        walker = current + 1

        while walker <= last:
            smallest_ch = lst[smallest][0]
            smallest_num = int(lst[smallest][1:])
            walk_ch = lst[walker][0]
            walk_num = int(lst[walker][1:])

            if walk_ch < smallest_ch or (smallest_ch == walk_ch and smallest_num > walk_num):
                smallest = walker

            compare += 1
            walker += 1

        lst[current], lst[smallest] = lst[smallest], lst[current]
        print(lst)

    print("Comparison times:" , compare)

lst = ast.literal_eval(input())
last = int(input())

selectionSort(lst, last)
