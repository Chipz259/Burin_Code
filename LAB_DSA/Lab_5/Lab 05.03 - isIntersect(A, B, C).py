def isIntersect(a, b, c):
    return bool(set(a) & set(b) & set(c))

import ast

a = ast.literal_eval(input().strip())
b = ast.literal_eval(input().strip())
c = ast.literal_eval(input().strip())

print(isIntersect(a, b, c))