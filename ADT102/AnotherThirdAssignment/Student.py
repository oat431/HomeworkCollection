class Student:
    st_id = ''
    title = ''
    name = ''
    last_name = ''

    def __init__(self, st_id, title, name, last_name):
        self.st_id = st_id
        self.title = title
        self.name = name
        self.last_name = last_name

    def __str__(self):
        return "id: ", self.st_id, " title: ", self.title, " name ", self.name, " last name: ", self.last_name
