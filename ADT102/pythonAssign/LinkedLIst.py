from Node import Node


class LinkedLIst:
    def __init__(self):
        self.head = None
        self.size = 0

    def insert(self, data):
        if self.head is None:
            self.head = Node(data)
            self.size += 1
            return
        temp = self.head
        while not temp.next is None:
            temp = temp.next
        temp.next = Node(data)
        self.size += 1

    def del_at(self, index):
        if index is 0:
            self.head = self.head.next
            self.size -= 1
            return
        temp = self.head
        cur = self.head
        cur = cur.next
        while index > 0:
            cur = cur.next
            temp = temp.next
            index -= 1
        temp.next = cur.next
        self.size -= 1

    def del_first(self):
        self.head = self.head.next
        self.size -= 1

    def del_last(self):
        temp = self.head
        p = self.size - 1
        while p > 1:
            temp = temp.next
            p -= 1
        temp.next = None
        self.size -= 1

    def del_all(self):
        self.head = None
        self.size = 0

    def get_size(self):
        return self.size

    def treaversal(self):
        temp = self.head
        while not temp is None:
            print(temp.data.__str__())
            temp = temp.next
