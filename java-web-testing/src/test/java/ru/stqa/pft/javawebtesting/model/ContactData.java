package ru.stqa.pft.javawebtesting.model;

public class ContactData {
    private final String name;
    private final String lastname;
    private final String mobilePhone;
    private final String email;
    private String group;

    public ContactData(String name, String lastname, String mobilePhone, String email, String group) {
        this.name = name;
        this.lastname = lastname;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }
}
