package com.sabu.builder;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/28
 */
public class BuilderMain {

    public static void main(String[] args) {
        Doctor doctor =  Doctor.builder()
                .id(1L)
                .name("Sunny Shrestha")
                .address("Lalitpur")
                .regNo(12125L)
                .qualification("MBBS")
                .mobileNumber("9845125432")
                .build();

        System.out.println(doctor);
    }
}
