package task.intuit.players.service;

import org.springframework.stereotype.Service;
import task.intuit.players.repository.PlayerRepository;
import task.intuit.players.service.model.PlayerDto;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        playerRepository = null;
        this.playerRepository = playerRepository;
    }

    public PlayerDto getPlayer(String id) {
        playerRepository.findById(id).get();
        return null;
    }

    public PlayerDto getPlayers() {
        playerRepository.findAll();
        return null;
    }

}
