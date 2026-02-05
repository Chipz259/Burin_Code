class DataNode:
    def __init__(self, data = None):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.count = 0
        self.head = None
    def traverse(self):
        if self.head is None:
            print("no na ja")
        else:
            current = self.head
            while current is not None:
                print(current.data, end = "")
                if current