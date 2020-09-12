class Stack:
    st = []
    top = 0
    size = 0

    def __init__(self, size):
        self.size = size

    def push(self, data):
        self.st.append(data)
        self.top = self.top + 1

    def pop(self):
        temp = self.st[-1]
        del self.st[-1]
        self.top = self.top - 1
        return temp

    def peek(self):
        return self.st[-1]

    def is_empty(self):
        return self.top == 0

    def is_full(self):
        return self.top >= self.size

    def pop_all(self):
        while not self.is_empty():
            print(self.pop().__str__())

    def get_size(self):
        return self.size
