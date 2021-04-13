package com.sda.finalproject.dto;

public class OpenWeatherResponse {

    private String name;
    private Main main;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "OpenWeatherResponse{" +
                "name='" + name + '\'' +
                ", main=" + main +
                '}';
    }
}
