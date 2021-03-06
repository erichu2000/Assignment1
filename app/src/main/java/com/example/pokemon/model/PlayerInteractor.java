package com.example.pokemon.model;

import com.example.pokemon.entity.Player;

import java.util.List;

/**
 * PlayerInteractor class
 */
public class PlayerInteractor extends Interactor{
    /**
     * makes PlayerInteractor
     * @param myRepository repo
     */
    public PlayerInteractor(Repository myRepository) {
        super(myRepository);
    }

    @Override
    public List<Player> getAllPlayers() {
        return getRepository().getAllPlayers();
    }

    @Override
    public void addPlayer(Player p) {
        getRepository().addPlayer(p);
    }

    @Override
    public void updatePlayer(Player p) {
        getRepository().updatePlayer(p);
    }
}
