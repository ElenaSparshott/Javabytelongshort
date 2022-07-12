public class Main {
    public static void main(String[] args) {

//        byte myByteNum = 10;
//
//        short myShortNum =20;
//
//        int myIntNum  = 50;
//
//        float myFloat = (float) 5.25F;
//
//        double numberOfPounds = 200d;
//        double totalKG = numberOfPounds * 0.4539237d;
////        long myLongNum = 50000 + (myByteNum + myShortNum + myIntNum) * 10;
//
//        boolean isAlien = false;
//            if(isAlien == false) {
//                System.out.println("It is not an alien");
//                System.out.println("hello");
//            }

        double myVar = 20.00d;

        double myNum = 80.00d;

        double myTotal = (myNum + myVar) * 100.00d;

        double myRem = myTotal % 40.00d;
        System.out.println(myRem);

        boolean isNoRemainder = (myRem == 0) ? true :false;
        System.out.println(isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("There is a remainder here");
        }
    }
}