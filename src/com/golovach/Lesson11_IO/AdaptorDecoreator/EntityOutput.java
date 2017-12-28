package com.golovach.Lesson11_IO.AdaptorDecoreator;


import java.io.IOException;

public interface EntityOutput {
    public void writePerson(Person person) throws IOException;
}
