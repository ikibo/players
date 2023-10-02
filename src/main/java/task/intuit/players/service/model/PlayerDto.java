package task.intuit.players.service.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PlayerDto {

    private final String id = null;

    private final PlayerInfoDTO birth = null;

    private final PlayerInfoDTO death = null;

    private final String nameFirst = null;

    private final String nameLast = null;

    private final String nameGiven = null;

    private final Integer weight = null;

    private final Integer height = null;

    private final HandDtoEnum batsHand = null;

    private final HandDtoEnum throwsHand = null;

    private final LocalDate debutGame = null;

    private final LocalDate finalGame = null;

    private final String retroId = null;

    private final String bbRefId = null;

}
