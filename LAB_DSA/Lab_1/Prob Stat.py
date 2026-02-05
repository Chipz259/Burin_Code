'''Prob Stat'''
def main():
    '''Prob Stat'''
    lst = []
    total = 0
    for _ in range(4):
        num = int(input())
        lst.append(num)
    lst.sort()
    lst.pop(0)
    total = sum(lst)
    print(total)
main()
