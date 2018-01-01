package com.golovach.Lesson11_IO.AdaptorDecoreator.Practice.Adaptor;


import java.io.IOException;

public interface FruitOutput {
    void writeApple(Apple apple) throws IOException;
}
