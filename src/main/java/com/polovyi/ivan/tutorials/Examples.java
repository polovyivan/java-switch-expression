package com.polovyi.ivan.tutorials;

public class Examples {


    public static void main(String[] args) {
        int selectorExpression1 = 1;
        String message = switch (selectorExpression1) {
            case 1:
                yield "#1";
            default:
                throw new IllegalStateException("Unexpected value: " + selectorExpression1);
        };
        System.out.println("message = " + message);

//         won't compile
//        int selectorExpression2 = 1;
//        String message2 = switch (selectorExpression2) {
//
//        };

        int selectorExpression3 = 1;
        String message3 = switch (selectorExpression3) {
            case 1:
                // yield "#1";  // won't compile
                System.out.println("selectorExpression3 = " + selectorExpression3);
                yield "#1";
            default:
                throw new IllegalStateException("Unexpected value: " + selectorExpression3);
        };
        System.out.println("message = " + message3);

//        // won't compile
//        int selectorExpression4 = 1;
//        String message4 = switch (selectorExpression4) {
//            case 1:
//                yield "#1";
//        };

        enum Day {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
        }
        Day day = Day.SUNDAY;
        String message5 = switch (day) {
            case SATURDAY:
            case SUNDAY:
                yield "Rest";
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                yield "Work";
        };
        System.out.println("message5 = " + message5);

        // won't compile
//        int selectorExpression6 = 1;
//        switch (selectorExpression6) {
//            case 1:
//                yield "#1";
//            default:
//                throw new IllegalStateException("Unexpected value: " + selectorExpression6);
//        };

        int selectorExpression7 = 6;
        String message7 = switch (selectorExpression7) {
            case 1, 2, 3:
                yield "<=3";
            case 4, 5:
            case 6:
                yield ">=3";
            default:
                throw new IllegalStateException("Unexpected value: " + selectorExpression7);
        };
        System.out.println("message7 = " + message7);

///////////////////////////////////////////////////////////////////////////////////////////////////////////

        int selectorExpression8 = 1;
        String message8 = switch (selectorExpression8) {
            case 1 -> "#1";
            // case 2 -> yield "#2"; // won't compile
            default -> throw new IllegalStateException("Unexpected value: " + selectorExpression8);
        };
        System.out.println("message = " + message8);

        int selectorExpression9 = 1;
        String message9 = switch (selectorExpression9) {
            case 1 -> {
                // yield "#1";  // won't compile
                System.out.println("selectorExpression9 = " + selectorExpression9);
                yield "#1";
            }

            default -> throw new IllegalStateException("Unexpected value: " + selectorExpression9);
        };
        System.out.println("message = " + message9);


    }

}


