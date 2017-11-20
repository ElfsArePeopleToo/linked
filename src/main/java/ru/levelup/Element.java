package ru.levelup;
/**
 * Created by Ирина on 20.11.2017.
 */
public class Element<E> {
    public E value;
    public Element next;

    public Element(E value){
        this.value = value;
    }
}