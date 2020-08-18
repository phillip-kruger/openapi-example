package com.github.phillipkruger.openapi.model;

public class Greeting {
    private String message;
    private String to;

    public Greeting() {
    }

    public Greeting(String message, String to) {
        this.message = message;
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Greeting{" + "message=" + message + ", to=" + to + '}';
    }
}
