package task.intuit.players.repository.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Embeddable
public class PlayerInfoRepoDTO {

    private final Integer year = null;

    private final Integer month = null;

    private final Integer day = null;

    private final String country = null;

    private final String state = null;

    private final String city = null;

}
