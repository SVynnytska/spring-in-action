package com.springinaction.spittr.data;

import com.springinaction.spittr.Spitter;

public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
