package task.intuit.players.repository.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name = "player")
public class PlayerRepoEntity {

    @Id
    private final String id = null;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "year", column = @Column(name = "birth_year")),
            @AttributeOverride( name = "month", column = @Column(name = "birth_month")),
            @AttributeOverride( name = "day", column = @Column(name = "birth_day")),
            @AttributeOverride( name = "country", column = @Column(name = "birth_country")),
            @AttributeOverride( name = "state", column = @Column(name = "birth_state")),
            @AttributeOverride( name = "city", column = @Column(name = "birth_city"))
    })
    private final PlayerInfoRepoDTO birth = null;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride( name = "year", column = @Column(name = "death_year")),
            @AttributeOverride( name = "month", column = @Column(name = "death_month")),
            @AttributeOverride( name = "day", column = @Column(name = "death_day")),
            @AttributeOverride( name = "country", column = @Column(name = "death_country")),
            @AttributeOverride( name = "state", column = @Column(name = "death_state")),
            @AttributeOverride( name = "city", column = @Column(name = "death_city"))
    })
    private final PlayerInfoRepoDTO death = null;

    private final String nameFirst = null;

    private final String nameLast = null;

    private final String nameGiven = null;

    private final Integer weight = null;

    private final Integer height = null;

    @Convert(converter = HandConverter.class)
    private final HandRepoEnum batsHand = null;

    @Convert(converter = HandConverter.class)
    private final HandRepoEnum throwsHand = null;

    private final LocalDate debutGame = null;

    private final LocalDate finalGame = null;

    private final String retroId = null;

    private final String bbRefId = null;

}

