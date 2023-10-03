package com.example.demo.form;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

public class AccountForm {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    private String confirmPassword;
    @AssertTrue(message = "パスワードが一致しません")
    //パスワードが一致するかどうかを確認する
    public boolean isPasswordValid() {
        //nonNullはnullか否かを判断する
        return Objects.nonNull(password) && password.equals(confirmPassword);
    }

    private String mail_adrress;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail_adrress() {
        return mail_adrress;
    }

    public void setMail_adrress(String mail_adrress) {
        this.mail_adrress = mail_adrress;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
