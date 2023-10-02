package task.intuit.players.service;

import org.mapstruct.Mapper;
import task.intuit.players.repository.model.PlayerRepoEntity;
import task.intuit.players.service.model.PlayerDto;

@Mapper(componentModel = "spring")
public interface RepoEntityToDtoMapper {

    PlayerDto playerRepoEntity_2_playerDto(PlayerRepoEntity playerRepoEntity);

}
