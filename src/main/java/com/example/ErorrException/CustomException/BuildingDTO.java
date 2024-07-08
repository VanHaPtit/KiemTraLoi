package com.example.ErorrException.CustomException;

public class BuildingDTO {
    private String Name ;
    private String Email ;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public BuildingDTO(String name, String email) {
        Name = name;
        Email = email;
    }
}
