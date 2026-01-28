package com.example.Hexagonal.Infraestructure.persistence;

@Entity
@table(name = "users")

public final class UserEntity {
    @id
    @generatevalue
    private final long id;
    private final String firstName;
    private final String lastName;

    public UserEntity(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
