package ru.levelup;

/**
 * Created by Ирина on 20.11.2017.
 */
public class List<E> {
    private Element head;
    private Element tail;

    public List(){
        head = null;
    }

    public Element getHead(){
        return head;
    }

    public Element getTail(){
        return tail;
    }

    public boolean add(E value){
        Element x = new Element(value);

        if(tail == null){
            head = x;
            tail = x;
            return true;
        } else {
            tail.next = x;
            tail = x;
            return true;
        }
    }

    public boolean remove(E value){
        Element current = head;
        Element previous = head;
        if(tail == null){
            return false;
        }
        while(current.value != value){
            if(current.next == null){
                return false;
            } else{
                previous = current;
                current = current.next;
            }
        }
        if(current == head){
            head = head.next;
        } else {
            previous.next = current.next;
        }
        return true;
    }

    public boolean remove(int index) {
        Element current = head;
        Element previous = head;
        if(tail == null){
            return false;
        }
        for(int i = 0; i<=index; i++){
            if(i == index){
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public Element get(int index){
        Element current = head;
        Element previous = head;
        if(tail == null){
            Element x = new Element("The list is empty");
            return x;
        }
        for(int i = 0; i<=index; i++){
            if(i == index){
                return current;
            }else{
                previous = current;
                current = current.next;
            }
        }
        Element y = new Element("Not found");
        return y;
    }



}