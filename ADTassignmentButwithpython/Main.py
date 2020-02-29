from Stack import Stack
from Queue import Queue
from Student import Student
import csv
# create list to collect the student object
students = []
with open('Studentdata.csv', 'r', encoding='utf8') as csv_file:
    csv_reader = csv.reader(csv_file)
    line_cnt = 0
    for row in csv_reader:
        if line_cnt > 0:
            id = row[0].replace('\t', ' ').strip()
            title = row[1].strip()
            name = row[2].strip()
            last_name = row[3].strip()
            st = Student(str(id), str(title), str(name), str(last_name))
            students.append(st)#put the st which is student object to the students list
        line_cnt = line_cnt + 1

print("===================================Stack data structure===================================")
print('-----------------------------------create stack------------------------------')

stStudent = Stack(45)

print('-----------------------------------Normal Flow------------------------------')
for i in students:
    print("push the ", i.__str__(), "Which is student object to the stack")
    stStudent.push(i)

while not stStudent.is_empty() :
    print("This is the top value of the stack: ", stStudent.peek().__str__())
    print("Then take it out of the top stack by pop() it")
    stStudent.pop()

print('-----------------------------------Using pop all()------------------------------')
print('put the element into the stack again')
for i in students:
    stStudent.push(i)
print('using pop all method')
stStudent.pop_all()

print("==========================================================================================")
print()
print("===================================Queue data structure===================================")
print('-----------------------------------Create Queue----------------------------------')
quStudent = Queue(45)
print('-----------------------------------Normal Flow-----------------------------------')
for i in students:
    print("enqueue the ", i.__str__(), "Which is student object to the queue")
    quStudent.en_queue(i)

while not quStudent.is_empty():
    print("This is the front value of the queue: ", quStudent.get_front().__str__())
    print("Then take it out of the front queue by de_queue() it")
    quStudent.de_queue()

print('------------------------------------Using dequeueAll method----------------------')
print('put the element into the queue again')
for i in students:
    quStudent.en_queue(i)
print('using dequeue all method')
quStudent.de_que_all()

print("==========================================================================================")
