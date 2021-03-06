package com.example.pokemon.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import java.util.List;

import com.example.pokemon.entity.Player;
import com.example.pokemon.model.Model;
import com.example.pokemon.model.PlayerInteractor;

/**
 * createPlayerViewModel class
 */

public class CreatePlayerViewModel extends AndroidViewModel {
    private final PlayerInteractor interactor;

    /**
     * createPlayerActivity constructor
     * @param application the application
     */

    public CreatePlayerViewModel(@NonNull Application application) {
        super(application);
        interactor = Model.getInstance().getPlayerInteractor();
    }

    /**
     * updates player
     * @param p player
     */

    public void updatePlayer(Player p) {
        interactor.updatePlayer(p);
    }

    /**
     * adds player
     * @param p player
     */

    public void addPlayer(Player p) {
        interactor.addPlayer(p);
    }

    /**
     * gets players
     * @return player list
     */

    public List<Player> getAllPlayers() {
        return interactor.getAllPlayers();
    }
}
