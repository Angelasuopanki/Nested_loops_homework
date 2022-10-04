package com.company;

public class Main {

    public static void main(String[] args) {
        homework42();
    }

    static void homework11() {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void homework12() {
        for (int row = 1; row <= 5; row++) {
            for (int col = row; col <= row + 4; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void homework2() {
        boolean same = false;
        int[] a = {1, 2, 4, 7, 8};
        int[] b = {9, 0, 10, 5, 100};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    same = true;
                    break;
                }
            }
        }
        System.out.println(same);
    }

    static void homework3() {
        int[] nums = {3, 7, 4};
        for (int k = 0; k < nums.length; k++) {
            for (int l = 0; l < nums.length; l++) {
                if (k != l) {
                    System.out.println(10 * nums[k] + nums[l]);
                }
            }
        }
    }

    static void homework41() {
        for (int row = 1; row <= 6; row++) {
            for (int col = 6; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void homework42() {
        for (int row = 1; row <= 6; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int i = 5; i >= row; i--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
