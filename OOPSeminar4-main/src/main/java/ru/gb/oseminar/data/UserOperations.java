package ru.gb.oseminar.data;

import java.time.LocalDate;

class UserOperations {
    public static int calculateAge(LocalDate dateOfBirth) {
        LocalDate now = LocalDate.now();
        return now.getYear() - dateOfBirth.getYear();
    }
}
