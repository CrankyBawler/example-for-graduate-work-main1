package ru.skypro.homework.dto;

public class NewPassword {
    private String Password;
    private String newPassword;

    public String getCurrentPassword() {
        return Password;
    }

    public void setCurrentPassword(String currentPassword) {
        this.Password = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
