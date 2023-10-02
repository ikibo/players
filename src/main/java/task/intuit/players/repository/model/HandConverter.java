package task.intuit.players.repository.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class HandConverter implements AttributeConverter<HandRepoEnum, String> {

    @Override
    public String convertToDatabaseColumn(HandRepoEnum hand) {
        return hand.value();
    }

    @Override
    public HandRepoEnum convertToEntityAttribute(String dbData) {
        return HandRepoEnum.fromValue(dbData);
    }
}
