package com.learning.methodref;

public class MethodRefMain {

    public static void main(String[] args) {
        Square s = new Square(4);
        FIShapes fis = new FIShapes() {
            @Override
            public int getArea(Square sq) {
                return sq.calculateArea();
            }
        };

        System.out.println(fis.getArea(s));

        FIShapes fis1 = (Square square) -> {
            return square.calculateArea();
        };

        System.out.println(fis1.getArea(s));

        FIShapes fis2 = (square) -> {
            return square.calculateArea();
        };

        System.out.println(fis2.getArea(s));

        //name of the class and colon colon + method name
        FIShapes fis3 = Square::calculateArea;
        System.out.println(fis3.getArea(s));


    }
}
