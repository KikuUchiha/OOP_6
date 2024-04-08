package ru.gb.oseminar.data;

import java.time.LocalDate;

public class User {
    private UserData userData;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.userData = new UserData(firstName, secondName, patronymic, dateOfBirth);
    }

    public String getFirstName() {
        return userData.getFirstName();
    }

    public void setFirstName(String firstName) {
        userData.setFirstName(firstName);
    }

    public String getSecondName() {
        return userData.getSecondName();
    }

    public void setSecondName(String secondName) {
        userData.setSecondName(secondName);
    }

    public String getPatronymic() {
        return userData.getPatronymic();
    }

    public void setPatronymic(String patronymic) {
        userData.setPatronymic(patronymic);
    }

    public LocalDate getDateOfBirth() {
        return userData.getDateOfBirth();
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        userData.setDateOfBirth(dateOfBirth);
    }

    public int calculateAge() {
        return UserOperations.calculateAge(userData.getDateOfBirth());
    }

    @Override
    public String toString() {
        return "User{" +
                "userData=" + userData +
                '}';
    }
}
