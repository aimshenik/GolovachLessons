package com.golovach.Lesson11_IO.Practice;

import java.io.DataInput;
import java.io.IOException;

public class AppleFruitInput implements FruitInput {
    private final DataInput in;

    public AppleFruitInput(DataInput in) {
        this.in = in;
    }

    @Override
    public Apple readApple() throws IOException {
        int weight = in.readInt();
        int colorLength = in.readInt();
        String color = "";
        for (int i = 0; i < colorLength; i++) {
            color += in.readChar();
        }
        int suppLength = in.readInt();
        Apple.SUPP[] supps = new Apple.SUPP[suppLength];
        for (int i = 0; i < suppLength; i++) {
            supps[i] = (in.readInt() == 1 ? Apple.SUPP.America : Apple.SUPP.Columbia);
        }
        return new Apple(weight, color, supps);
    }
}
