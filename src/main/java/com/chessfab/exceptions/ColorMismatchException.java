package com.chessfab.exceptions;

import java.util.InputMismatchException;

public class ColorMismatchException extends InputMismatchException {
    public ColorMismatchException() {
        super("Got two incompatible colors.");
    }
}
