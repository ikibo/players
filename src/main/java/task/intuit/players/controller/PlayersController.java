package task.intuit.players.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import task.intuit.players.repository.PlayerRepository;
import task.intuit.players.repository.model.PlayerRepoEntity;
import task.intuit.players.service.RepoEntityToDtoMapper;
import task.intuit.players.service.model.PlayerDto;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayersController {

    private final PlayerRepository playerRepository;

    private final RepoEntityToDtoMapper mapper;

    public PlayersController(PlayerRepository playerRepository, RepoEntityToDtoMapper mapper) {
        this.playerRepository = playerRepository;
        this.mapper = mapper;
    }

    @GetMapping("/{id}")
    public PlayerDto getPlayer(@PathVariable String id) {
        PlayerRepoEntity playerRepoEntity = playerRepository.findById(id).get();
        return mapper.playerRepoEntity_2_playerDto(playerRepoEntity);
    }

    @GetMapping
    public List<PlayerRepoEntity> getPlayers() {
        return playerRepository.findAll();
    }
}
