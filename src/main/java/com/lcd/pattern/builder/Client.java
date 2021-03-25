package com.lcd.pattern.builder;

public class Client {
    public static void main(String[] args) {
        ActorBuilder heroBuilder = new HeroBuilder();
        ActorController actorController = new ActorController();
        Actor actor = actorController.controller(heroBuilder);
        System.out.println(actor.getType());
        System.out.println(actor.getSex());
        System.out.println(actor.getFace());
        System.out.println(actor.getCostume());
        System.out.println(actor.getHairstyle());
    }
}
