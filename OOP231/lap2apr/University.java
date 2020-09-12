package com.company;

public abstract class University {
    protected StudentRegistrationInfo studentRecord;

    protected void setStudentRecord(StudentRegistrationInfo a){
        this.studentRecord = a;
    }
    abstract void seeMygrade();
    abstract void seeMycourse();

}
