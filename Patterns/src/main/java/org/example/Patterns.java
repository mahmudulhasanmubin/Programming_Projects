package org.example;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\nPlease Enter Your Choice to See Pattern: \n");
            System.out.println("1. Solid Rectangle ");
            System.out.println("2. Hollow Rectangle ");
            System.out.println("3. Half Pyramid ");
            System.out.println("4. Inverted Half Pyramid ");
            System.out.println("5. Inverted Half Pyramid(rotated by 180 degree) ");
            System.out.println("6. Half Pyramid with Numbers ");
            System.out.println("7. Inverted Half Pyramid with Numbers ");
            System.out.println("8. Floyd's Triangle ");
            System.out.println("9. 0-1 Triangle ");
            System.out.println("10. Butterfly Pattern ");
            System.out.println("11. Solid Rhombus ");
            System.out.println("12. Number Pyramid ");
            System.out.println("13. Palindromic Pattern ");
            System.out.println("14. Diamond Pattern ");
            System.out.println("15. Square ");
            System.out.println("16. Hill Pattern ");
            System.out.println("17. Inverted Hill ");
            System.out.println("18. Heart Shape ");
            System.out.println("19. Pascal Triangle Pattern ");
            System.out.println("20. Hollow Diamond Pattern ");
            System.out.println("21. Hollow Heart Shape Pattern ");
            System.out.println("22. Spiral of Numbers Pattern ");
            System.out.println("23. Hollow Parallelogram Pattern ");
            System.out.println("24. Solid Parallelogram Pattern ");
            System.out.println("25. Hourglass Asterisk Pattern ");
            System.out.println("26. Cross Pattern ");
            System.out.println("27. Zigzag Pattern ");
            System.out.println("28. Square Pattern ");
            System.out.println("29. Triangle of Odd Number Pattern ");
            System.out.println("30. Diamond of Numbers Pattern ");
            System.out.println("31. Chessboard Pattern ");
            System.out.println("32. Pyramid of Asterisks with Numbers Pattern ");
            System.out.println("33. Solid Hexagon Pattern ");
            System.out.println("0. Exit... ");
            choice = sc.nextInt();

            int row, column, height, size;


            switch (choice) {
                case 1:
                    System.out.println("1. Solid Rectangle ");
                    //Solid Rectangle
                    /*
                     *****
                     *****
                     *****
                     *****
                     */

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();
                    System.out.println("Enter Your Column Value: ");
                    column = sc.nextInt();

                    for (int i = 1; i <= row; i++) {//inner loop
                        for (int j = 1; j <= column; j++) {//outer loop
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("2. Hollow Rectangle ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();
                    System.out.println("Enter Your Column Value: ");
                    column = sc.nextInt();

                    //Hollow Rectangle
                    /*
                     *****
                     *   *
                     *   *
                     *****
                     */
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= column; j++) {
                            if (i == 1 || j == 1 || i == row || j == column) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("3. Half Pyramid ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Half Pyramid
                    /*

                     *
                     **
                     ***
                     ****

                     */
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("4. Inverted Half Pyramid ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Inverted Half Pyramid
                    /*

                     ****
                     ***
                     **
                     *

                     */
                    for (int i = row; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("5. Inverted Half Pyramid(rotated by 180 degree) ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Inverted Half Pyramid(rotated by 180 degree)
                    /*
                     *
                     **
                     ***
                     ****

                     */
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {//space print
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {//inner loop ---> star print
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("6. Half Pyramid with Numbers ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Half Pyramid with Numbers
                            /*
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                             */
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    System.out.println("7. Inverted Half Pyramid with Numbers ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Inverted Half Pyramid with Numbers
                            /*
                            1 2 3 4
                            1 2 3
                            1 2
                            1
                             */
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i + 1; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 8:
                    System.out.println("8. Floyd's Triangle ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Floyd's Triangle
                            /*
                            1
                            2 3
                            4 5 6
                            7 8 9 10
                            11 12 13 14
                             */
                    int number = 1;
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(number + " ");
                            number++;
                        }
                        System.out.println();
                    }
                    break;

                case 9:
                    System.out.println("9. 0-1 Triangle ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //0-1 Triangle
                            /*
                             1
                             0  1
                             1  0  1
                             0  1  0  1
                             */

                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            if ((i + j) % 2 == 0) {//even
                                System.out.print(" 1 ");
                            } else {
                                System.out.print(" 0 ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 10:
                    System.out.println("10. Butterfly Pattern ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Butterfly Pattern
                    /*

                     *      *
                     **    **
                     ***  ***
                     ********
                     ********
                     ***  ***
                     **    **
                     *      *

                     */

                    //Upper Half
                    for (int i = 1; i <= row; i++) {
                        //1st part
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        //spaces
                        int spaces = 2 * (row - i);
                        for (int j = 1; j <= spaces; j++) {
                            System.out.print(" ");
                        }
                        //2nd part
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    //Lower Half
                    for (int i = row; i >= 1; i--) {
                        //1st part
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        //spaces
                        int spaces = 2 * (row - i);
                        for (int j = 1; j <= spaces; j++) {
                            System.out.print(" ");
                        }
                        //2nd part
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 11:
                    System.out.println("11. Solid Rhombus ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Solid Rhombus
                    /*
                     ****
                     ****
                     ****
                     ****

                     */
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= row; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 12:
                    System.out.println("12. Number Pyramid ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Number Pyramid
                            /*
                               1
                               22
                               333
                               4444
                             */

                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {
                            System.out.print(" ");
                        }
                        //numbers -> print row no, row no time
                        for (int j = 1; j <= i; j++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 13:
                    System.out.println("13. Palindromic Pattern ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Palindromic Pattern
                                /*
                                     1
                                    212
                                   32123
                                  4321234
                                 */

                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {
                            System.out.print(" ");
                        }
                        //1st half
                        for (int j = i; j >= 1; j--) {
                            System.out.print(j);
                        }
                        //2nd half
                        for (int j = 2; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    break;

                case 14:
                    System.out.println("14. Diamond Pattern ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    //Diamond Pattern
                    /*
                     *
                     ***
                     *****
                     *******
                     *******
                     *****
                     ***
                     *

                     */

                    //upper half
                    for (int i = 1; i <= row; i++) {
                        //spaces
                        for (int j = 1; j <= row - i; j++) {
                            System.out.print(" ");
                        }
                        //stars
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = row; i >= 1; i--) {
                        //spaces
                        for (int j = 1; j <= row - i; j++) {
                            System.out.print(" ");
                        }
                        //stars
                        for (int j = 1; j <= 2 * i - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 15:
                    System.out.println("15. Square ");

                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 16:
                    System.out.println("16. Hill Pattern ");
                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    for (int i = 1; i<=row; i++) {//row, constant
                        for (int j = i; j <= row; j++) {//column
                            System.out.print(" ");
                        }
                        for (int j = 1; j < i; j++) {
                            System.out.print("*");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                        break;
                case 17:
                    System.out.println("17. Inverted Hill ");
                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    for (int i = 1; i<=row; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = i; j < row; j++) {//one less column
                            System.out.print("*");
                        }
                        for (int j = i; j <= row; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 18:

                    //Hear Shape Pattern
                    System.out.println("18. Heart Shape ");
                    System.out.println("Enter Your Row Value (Greater than 6): ");
                    row = sc.nextInt();

                    // declare and initialize variable for output size
                    final String msg = " I love Panda ";

                    // nested for loop to print the upper part of Heart
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j <= 4 * row; j++) {
                            double pos1 = Math.sqrt(Math.pow(i - row, 2) + Math.pow(j - row, 2));
                            double pos2 = Math.sqrt(Math.pow(i - row, 2) + Math.pow(j - 3 * row, 2));

                            if (pos1 < row + 0.5 || pos2 < row + 0.5) {
                                System.out.print('*');
                            } else {
                                System.out.print(' ');
                            }
                        }
                        System.out.print(System.lineSeparator());
                    }

                    // for loop to print the lower part of Heart
                    for (int i = 1; i <= 2 * row; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(' ');
                        }

                        for (int j = 0; j < 4 * row + 1 - 2 * i; j++) {
                            if (i >= 2 && i <= 4) {
                                int position = j - (4 * row - 2 * i - msg.length()) / 2;
                                if (position < msg.length() && position >= 0) {
                                    if (i == 3) {
                                        System.out.print(msg.charAt(position));
                                    } else {
                                        System.out.print(' ');
                                    }
                                }
                                else {
                                    System.out.print('*');
                                }
                            }
                            else {
                                System.out.print('*');
                            }
                        }
                        System.out.print(System.lineSeparator());
                    }
                    break;

                case 19:

                    //Pascal Triangle Pattern
                    /*
                        1
                       1 1
                      1 2 1
                     1 3 3 1
                    1 4 6 4 1

                     */
                    System.out.println("19. Pascal Triangle Pattern ");
                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {
                            System.out.print(" ");
                        }
                        int coefficient = 1;
                        for (int k = 1; k <= i; k++){
                            System.out.print(coefficient+" ");
                            coefficient =(coefficient*(i-k)/k);
                        }
                        System.out.println();
                    }
                    break;

                case 20:
                    System.out.println("20. Hollow Diamond Pattern ");
                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();

                    // Upper half of the diamond
                    for (int i = 1; i <= row; i++) {
                        // Print leading spaces
                        for (int j = i; j < row; j++) {
                            System.out.print(" ");
                        }
                        // Print stars with spaces in between
                        System.out.print("*");
                        if (i > 1) { // Only print middle spaces if row is more than 1
                            for (int k = 1; k < 2 * (i - 1); k++) {
                                System.out.print(" ");
                            }
                            System.out.print("*");
                        }
                        System.out.println();
                    }

                    // Lower half of the diamond
                    for (int i = row - 1; i >= 1; i--) {
                        // Print leading spaces
                        for (int j = row; j > i; j--) {
                            System.out.print(" ");
                        }
                        // Print stars with spaces in between
                        System.out.print("*");
                        if (i > 1) { // Only print middle spaces if row is more than 1
                            for (int k = 1; k < 2 * (i - 1); k++) {
                                System.out.print(" ");
                            }
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 21:

                    System.out.println("21. Hollow Heart Shape Pattern ");
                    System.out.println("Enter Your Row Value: ");
                    row = sc.nextInt();
                    for (int i = 1; i <= row; i++) {
                        for (int j = 1; j <= row - i; j++) {
                            
                        }
                    }

                    break;
                case 22:
                    System.out.println("22. Spiral of Numbers Pattern ");

                    System.out.println("Enter Your Spiral Expected Size: ");
                    size =sc.nextInt(); // Size of the spiral

                    int[][] spiral = new int[size][size];
                    int num = 1;
                    int rowStart = 0, rowEnd = size - 1, colStart = 0, colEnd = size - 1;

                    while (rowStart <= rowEnd && colStart <= colEnd) {
                        for (int i = colStart; i <= colEnd; i++) {
                            spiral[rowStart][i] = num++;
                        }
                        rowStart++;
                        for (int i = rowStart; i <= rowEnd; i++) {
                            spiral[i][colEnd] = num++;
                        }
                        colEnd--;
                        if (rowStart <= rowEnd) {
                            for (int i = colEnd; i >= colStart; i--) {
                                spiral[rowEnd][i] = num++;
                            }
                            rowEnd--;
                        }
                        if (colStart <= colEnd) {
                            for (int i = rowEnd; i >= rowStart; i--) {
                                spiral[i][colStart] = num++;
                            }
                            colStart++;
                        }
                    }

                    // Print the spiral
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            System.out.print(spiral[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 23:
                    System.out.println("23. Hollow Parallelogram Pattern ");

                    System.out.println("Enter Your Parallelogram Height Value: ");
                    height = sc.nextInt(); // Height of the parallelogram

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= height; j++) {
                            if (j == 1 || j == height || i == 1 || i == height) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 24:
                    System.out.println("24. Solid Parallelogram Pattern ");

                    System.out.println("Enter Your Parallelogram Height Value: ");
                    height = sc.nextInt(); // Height of the parallelogram

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= height; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 25:
                    System.out.println("25. Hourglass Asterisk Pattern ");

                    System.out.println("Enter Your Hourglass Asterisk Height Value: ");
                    height = sc.nextInt(); // Height of the hourglass
                    for (int i = height; i >= 1; i--) {
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 2; i <= height; i++) {
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 26:
                    System.out.println("26. Cross Pattern ");

                    System.out.println("Enter Your Cross Pattern: ");
                    size = sc.nextInt(); // Size of the cross

                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            if (i == (size + 1) / 2 || j == (size + 1) / 2) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 27:
                    System.out.println("27. Zigzag Pattern ");

                    System.out.println("Enter Your Zigzag Pattern: ");
                    size = sc.nextInt(); // Height of the zigzag

                    for (int i = 1; i <= size; i++) {
                        if (i % 2 == 1) {
                            for (int j = 1; j <= size; j++) {
                                System.out.print("* ");
                            }
                        } else {
                            System.out.print("  ");
                        }
                        System.out.println();
                    }
                    break;

                case 28:
                    System.out.println("28. Square Pattern ");

                    System.out.println("Enter Your Square Pattern Size: ");
                    size = sc.nextInt();// Size of the square pattern
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            if ((i + j) % 2 == 0) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 29:
                    System.out.println("29. Triangle of Odd Number Pattern ");

                    System.out.println("Enter Your Triangle of Odd Number Pattern Size: ");
                    height = sc.nextInt(); // Height of the triangle
                    number = 1; // Starting odd number
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(number + " ");
                            number += 2; // Increase to the next odd number
                        }
                        System.out.println();
                    }
                    break;
                case 30:
                    System.out.println("30. Diamond of Numbers Pattern ");

                    System.out.println("Enter Your Diamond of Numbers Pattern Size: ");
                    size = sc.nextInt(); // Height of the diamond
                    for (int i = 1; i <= size; i++) {
                        for (int j = size; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    for (int i = size - 1; i >= 1; i--) {
                        for (int j = size; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;

                case 31:
                    System.out.println("31. Chessboard Pattern ");

                    System.out.println("Enter Your Chessboard Pattern Size: ");
                    size = sc.nextInt(); // Size of the chessboard
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            if ((i + j) % 2 == 0) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 32:
                    System.out.println("32. Pyramid of Asterisks with Numbers Pattern ");

                    System.out.println("Enter Your Pyramid of Asterisks with Numbers Pattern Size: ");
                    height = sc.nextInt(); // Height of the pyramid

                    for (int i = 1; i <= height; i++) {
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print(j + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 33:
                    System.out.println("33. Solid Hexagon Pattern ");

                    System.out.println("Enter Your Solid Hexagon Pattern Row Value: ");
                    row = sc.nextInt(); // Size of the hexagon
                    for (int i = 1; i <= row; i++) {
                        for (int j = row; j > i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("* ");
                        for (int j = 1; j < (i - 1) * 2; j++) {
                            if (i > 1) {
                                System.out.print(" ");
                            }
                        }
                        if (i > 1) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = row - 1; i >= 1; i--) {
                        for (int j = row; j > i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("* ");
                        for (int j = 1; j < (i - 1) * 2; j++) {
                            if (i > 1) {
                                System.out.print(" ");
                            }
                        }
                        if (i > 1) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exit Successfully...");
                    break;

                default:
                    System.out.println("Invalid Choice. Try Again.");
                    break;
            }
            if (choice != 0) {
                System.out.println("\nWanna Continue? (Y/N): ");
                sc.nextLine();
                String continueChoice = sc.nextLine();
                if (!continueChoice.equalsIgnoreCase("Y")) {
                    choice = 0;
                }
            }
        }while(choice != 0);
            sc.close();
    }
}