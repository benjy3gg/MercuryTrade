package com.home.clicker.events;


/**
 * Exslims
 * 08.12.2016
 */
public interface EventHandler<T extends Event> {
    void handle(T event);
}