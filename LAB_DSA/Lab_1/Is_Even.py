'''Is_Even'''
def is_even(k):
    '''Is_Even'''
    last = k[-1]
    if last in "02468":
        return True
    else:
        return False

n = input()
print(is_even(n))
