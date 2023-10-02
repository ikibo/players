package task.intuit.players.repository.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

import static task.intuit.players.repository.model.HandRepoEnum.LEFT;
import static task.intuit.players.repository.model.HandRepoEnum.RIGHT;

@Converter
@Slf4j
public class HandConverter implements AttributeConverter<HandRepoEnum, String> {

    private static final Map<String, HandRepoEnum> inverseMapping = Map.of(LEFT.value(), LEFT, RIGHT.value(), RIGHT);

    @Override
    public String convertToDatabaseColumn(HandRepoEnum hand) {
        return hand.value();
    }

    @Override
    public HandRepoEnum convertToEntityAttribute(String dbData) {
        if (dbData == null) {
            return null;
        }
        HandRepoEnum found = inverseMapping.get(dbData);

        if (found == null) {
           // log.warn("found illegal value for hand in DB, ignoring, data fix needed")
        }
        // this should be handled before data gets into the system, meaning should be no  data with invalid data
        // if this happens , it should be logged and manually foxed
        return found;
    }
}
