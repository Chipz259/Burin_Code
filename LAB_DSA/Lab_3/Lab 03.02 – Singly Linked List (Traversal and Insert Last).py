class DataNode:
    def __init__(self, data=None):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.count = 0
        self.head = None

    def traverse(self):
        if self.head is None:
            print("This is an empty list.")
        else:
            current = self.head
            while current is not None:
                print(current.data, end="")
                if current.next is not None:
                    print(" -> ", end="")
                current = current.next
            print()

    def insert_last(self, data):
        if data is not None: data = data.strip()
        pNew = DataNode(data)
        self.count += 1
        if self.head is None:
            self.head = pNew
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = pNew

    def insert_front(self, data):
        if data is not None: data = data.strip()
        pNew = DataNode(data)

        pNew.next = self.head
        self.head = pNew
        self.count += 1

    def insert_before(self, node, data):
        if data is not None: data = data.strip()
        pNew = DataNode(data)

        if self.head is None:
            print("Cannot insert, " + node + " does not exist.")
            return

        if self.head.data == node:
            pNew.next = self.head
            self.head = pNew
            self.count += 1
            return

        current = self.head
        while current.next is not None:
            if current.next.data == node:
                pNew.next = current.next
                current.next = pNew
                self.count += 1
                return
            current = current.next

        print("Cannot insert, " + node + " does not exist.")

    def delete(self, data):
        if data is not None:
            data = data.strip()
        if self.head is None:
            print("Cannot delete, " + data + " does not exist.")
            return

        if self.head.data == data:
            self.head = self.head.next
            self.count -= 1
            return

        current = self.head
        while current.next is not None:
            if current.next.data == data:
                current.next = current.next.next
                self.count -= 1
                return
            current = current.next

        print("Cannot delete, " + data + " does not exist.")

def main():
  mylist = SinglyLinkedList()
  for _ in range(int(input())):
    text = input()
    condition, data = text.split(": ")
    if condition == "F":
      mylist.insert_front(data)
    elif condition == "L":
      mylist.insert_last(data)
    elif condition == "B":
      mylist.insert_before(*data.split(", "))
    elif condition == "D":
      mylist.delete(data)
    else:
      print("Invalid Condition!")
  mylist.traverse()

main()