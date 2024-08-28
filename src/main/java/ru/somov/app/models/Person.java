package ru.somov.app.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Empty error")
    @Size(min = 2, max = 30, message = "Size error")
    private String name;

    @Min(value = 0, message = "Min age error")
    private int age;

    @NotEmpty(message = "Empty error")
    @Email(message = "Email form error")
    private String email;

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Format error(Country, City, Postal Code(6 digits))")
    private String address;

    public Person() {

    }

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
