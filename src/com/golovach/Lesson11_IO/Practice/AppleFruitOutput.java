package com.golovach.Lesson11_IO.Practice;

import java.io.DataOutput;
import java.io.IOException;

public class AppleFruitOutput implements FruitOutput{
    private final DataOutput out;

    public AppleFruitOutput(DataOutput out) {
        this.out = out;
    }

    @Override
    public void writeApple(Apple apple) throws IOException {
        out.writeInt(apple.getWeight());
        out.writeInt(apple.getColor().length());
        out.writeChars(apple.getColor());
        out.writeInt(apple.getSupliers().length);
        for (int i = 0; i < apple.getSupliers().length ; i++) {
            out.writeInt(apple.getSupliers()[0] == Apple.SUPP.America ? 1 : 2);
        }
    }
}
