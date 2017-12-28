package com.golovach.Lesson11_IO.AdaptorDecoreator;


import java.io.DataInput;
import java.io.IOException;

public class EntityDataInput implements EntityInput {
    private final DataInput in;

    public EntityDataInput(DataInput out) {
        this.in = out;
    }

    public Person readPerson() throws IOException {
        String name = in.readUTF();
        int age = in.readInt();
        int count = in.readInt();
        Person.Sex[] sexArray = new Person.Sex[count];
        for (int k = 0; k < sexArray.length; k++) {
            sexArray[k] = in.readBoolean() ? Person.Sex.F : Person.Sex.M;
        }
        return new Person(name, age, sexArray);
    }
}
