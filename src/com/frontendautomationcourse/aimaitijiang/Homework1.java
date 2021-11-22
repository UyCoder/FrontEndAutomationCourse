package com.frontendautomationcourse.aimaitijiang;

import java.util.Scanner;

/**
 * Project:     FrontEndAutomationCourse
 * Package:     com.frontendautomationcourse.aimaitijiang
 * Created:     2021-11-23  00:58
 * Author:      Ahmed Bughra
 * Email:       AhmedBughra@gmail.com
 * LinkedIn:    https://www.linkedin.com/in/ahmed-bughra/
 * CreatedWith: IntelliJ IDEA
 */

public class Homework1 {
    public static void main(String[] args) {

        // Kullanıcının girdiği sayı numberEntered adındaki variable olarak kayit edilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int numberEntered = scan.nextInt();

        int factorial = 1; // faktoriyel hesaplamasını 1 den başlatmak için

        for(int i = 1; i <= numberEntered; i++)
        {
            factorial = factorial * i;
        }

        // hesaplama sonucu ekrana yansitilir
        System.out.println(numberEntered + "!= " + factorial);
    }
}
