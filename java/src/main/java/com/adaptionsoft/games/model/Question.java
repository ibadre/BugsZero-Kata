package com.adaptionsoft.games.model;

public class Question {

    private String type;
    private String statement;

    public Question(String type, String statement) {
        this.type = type;
        this.statement = statement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
