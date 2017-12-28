package com.golovach.Lesson11_IO.AdaptorDecoreator;


import java.io.IOException;

public interface EntityInput {
    public Person readPerson() throws IOException;
}
