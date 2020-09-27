class Student:
    def __init__(self, st_id, name, last_name):
        self.st_id = st_id
        self.name = name
        self.last_name = last_name

    def __str__(self):
        return "id:", self.st_id, "name:", self.name, "lastname:", self.last_name
