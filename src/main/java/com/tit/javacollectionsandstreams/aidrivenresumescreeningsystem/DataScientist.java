package com.tit.javacollectionsandstreams.aidrivenresumescreeningsystem;

// Creating a class DataScientist that extends JobRole
class DataScientist extends JobRole {
    public DataScientist(String roleName) {
        super(roleName);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Data Scientist - Role Name: " + getRoleName());
    }
}