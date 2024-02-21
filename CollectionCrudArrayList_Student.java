package com.mycompany.pratice;

public class CollectionCrudArrayList_Student {
    
    public int studId;
    
    public String name;
    
    public String hobby;

    public CollectionCrudArrayList_Student(int studId, String name, String hobby) {
        this.studId = studId;
        this.name = name;
        this.hobby = hobby;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "CollectionCrudArrayList_Student{" + "studId=" + studId + ", name=" + name + ", hobby=" + hobby + '}';
    }
}
