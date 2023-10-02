package task.intuit.players.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import task.intuit.players.repository.model.PlayerRepoEntity;

public interface PlayerRepository extends JpaRepository<PlayerRepoEntity, String> {

}
