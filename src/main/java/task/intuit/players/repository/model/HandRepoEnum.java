package task.intuit.players.repository.model;

import java.util.Map;

public enum HandRepoEnum {
    LEFT("L"), RIGHT("R");

    private static final Map<String, HandRepoEnum> inverseMapping = Map.of(LEFT.value, LEFT, RIGHT.value, RIGHT);

    HandRepoEnum(String value) {
        this.value = value;
    }

    private final String value;

    public String value() {
        return value;
    }

    public static HandRepoEnum fromValue(String value) {
        HandRepoEnum found = inverseMapping.get(value);
        if (found == null) {
            throw new IllegalArgumentException("No hand of value: " + value);
        }
        return found;
    }

}
