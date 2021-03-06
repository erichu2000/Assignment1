package com.example.pokemon.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Model class
 */

public final class Model {
    /** the data repository */
    private final Repository myRepository;

    private final Map<String, Object> interactorMap;

    /** Singleton Pattern Code
     *  this allows us to get access to this class
     *  anywhere, which will allow our View models to access
     *  the "back end"  more easily
     */
    private static final Model instance = new Model();

    /**
     * gets Instance
     * @return Model
     */

    public static Model getInstance() { return instance; }

    /**
     * Make a new Model instance
     */
    private Model() {
        myRepository = new Repository();
        interactorMap = new HashMap<>();
        registerInteractors();
    }

    /**
     * Create a set of interactors to be used by the application
     */
    private void registerInteractors() {
        interactorMap.put("Player", new PlayerInteractor(myRepository));
    }

    /**
     * gets PlayerInteractor
     * @return PlayerInteractor
     */
    public PlayerInteractor getPlayerInteractor() {
        return (PlayerInteractor) interactorMap.get("Player");
    }
}
