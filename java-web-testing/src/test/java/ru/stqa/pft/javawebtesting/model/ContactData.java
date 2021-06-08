package ru.stqa.pft.javawebtesting.model;

public class ContactData {
    private final String name;
    private final String lastname;
    private final String mobilePhone;
    private final String email;

    public ContactData(String name, String lastname, String mobilePhone, String email) {
        this.name = name;
        this.lastname = lastname;
        this.mobilePhone = mobilePhone;
        this.email = email;
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
}
