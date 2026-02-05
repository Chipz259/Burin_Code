class Stack:
    def __init__(self):
        self.data = []
        self.size = 0

    def push(self, x):
        self.data.append(x)
        self.size += 1

    def pop(self):
        if self.size == 0:
            return None
        self.size -= 1
        return self.data.pop()

    def is_empty(self):
        return self.size == 0


def print_group(stack, group_no):
    temp = Stack()

    print(f"Group {group_no}: ", end="")

    count = 0
    while not stack.is_empty():
        x = stack.pop()
        temp.push(x)

    while not temp.is_empty():
        x = temp.pop()

        if count > 0:
            print(", ", end="")
        print(x, end="")

        stack.push(x)
        count += 1

    print()


m = int(input())
n = int(input())

student_stack = Stack()
for _ in range(n):
    student_stack.push(input())

groups = []
for _ in range(m):
    groups.append(Stack())

idx = 0
while not student_stack.is_empty():
    name = student_stack.pop()
    groups[idx].push(name)
    idx = (idx + 1) % m

for i in range(m):
    print_group(groups[i], i + 1)
