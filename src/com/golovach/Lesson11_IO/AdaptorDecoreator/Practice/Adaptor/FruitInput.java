package com.golovach.Lesson11_IO.AdaptorDecoreator.Practice.Adaptor;

import java.io.IOException;

public interface FruitInput {
    Fruit readApple()  throws IOException;
}
