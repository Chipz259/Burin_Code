import ast
def bubbleSort(lst,last):
    compare = 0
    current = 0
    sorted = False
    while current <= last and sorted is False:
        walker = last
        sorted = True
        while walker > current:
            if lst[walker] < lst[walker - 1]:
                sorted = False
                lst[walker], lst[walker - 1] = lst[walker - 1], lst[walker]
            compare += 1
            walker -= 1
        print(lst)
        current += 1
    print("Comparison times:" , compare)

lst = ast.literal_eval(input())
last = int(input())

bubbleSort(lst, last)
