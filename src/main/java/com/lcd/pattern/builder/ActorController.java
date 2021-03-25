package com.lcd.pattern.builder;

public class ActorController {
    public Actor controller(ActorBuilder actorBuilder){
        actorBuilder.buildType();
        actorBuilder.buildFace();
        actorBuilder.buildSex();
        actorBuilder.buildCostume();
        actorBuilder.buildHairStyle();
        Actor actor = actorBuilder.createActor();
        return actor;
    }
}
