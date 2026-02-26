import ast
def selectionSort(lst,last):
    compare = 0
    current = 0
    for current in range(0, last):
        smallest = current
        walker = current + 1
        while walker <= last:
            if lst[walker] < lst[smallest]:
                smallest = walker
            compare += 1
            walker += 1
        lst[current], lst[smallest] = lst[smallest], lst[current]
        print(lst)
    print("Comparison times:" , compare)

lst = ast.literal_eval(input())
last = int(input())

selectionSort(lst, last)
