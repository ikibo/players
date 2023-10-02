package task.intuit.players.repository.model;

import lombok.extern.apachecommons.CommonsLog;

import java.util.Map;

public enum HandRepoEnum {
    LEFT("L"), RIGHT("R");

    HandRepoEnum(String value) {
        this.value = value;
    }

    private final String value;

    public String value() {
        return value;
    }

}
