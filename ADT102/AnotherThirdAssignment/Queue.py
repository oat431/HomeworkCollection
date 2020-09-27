class Queue:
    qu = []
    size = 0
    front = 0
    rear = 0

    def __init__(self, size):
        self.size = size

    def en_queue(self, data):
        self.qu.append(data)
        self.size = self.size + 1
        self.rear = self.rear + 1

    def de_queue(self):
        temp = self.qu[self.front]
        del self.qu[self.front]
        self.rear = self.rear - 1
        self.size = self.size - 1
        return temp

    def de_que_all(self):
        while not self.is_empty():
            print(self.de_queue().__str__())

    def get_front(self):
        return self.qu[self.front]

    def get_rear(self):
        return self.qu[-1]

    def is_full(self):
        return self.rear == self.get_size()

    def is_empty(self):
        return self.rear == 0

    def get_size(self):
        return self.size
