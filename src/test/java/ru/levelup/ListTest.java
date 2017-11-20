package ru.levelup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Ирина on 20.11.2017.
 */
public class ListTest {
    @Test
    public void testAdd_validParams_returnBoolean(){
        // setup
        List list = new List();
        //when
        list.add(Math.random());
        //then
        boolean test;
        if(list.getHead() == null){
            test = false;
        } else{
            test = true;
        }
        Assertions.assertTrue(test);
    }
    @Test
    public void testRemove_validElementAsIndex_returnBoolean(){
        //setup
        List list = new List();
        list.add(33);
        list.add(22);
        list.add(55);
        list.add(66);
        //when
        Element element = new Element(55);
        list.remove(element);
        //then
        boolean test = true;
        Element current = list.getHead();
        Element previous;
        int count=0;
        while(current.next != null){
            if(current.equals(element)){
                test = false;
            }
            previous = current;
            current = current.next;
        }
        Assertions.assertTrue(test);
    }
    @Test
    public void testRemove_validIntAsIndex_returnBoolean(){
        //setup
        List list = new List();
        for(int i = 0; i<=10; i++){
            list.add(Math.random());
        }
        //when
        list.remove(5);
        //then
        boolean test;
        Element current = list.getHead();
        Element previous;
        int count=0;
        while(current.next != null){
            previous = current;
            current = current.next;
            count++;
        }

        if(count != 9){
            test = false;
        } else {
            test = true;
        }
        Assertions.assertTrue(test);
    }

    @Test
    public void testGet_validIntIndex_returnElement(){
        //setup
        List list = new List();
        for(int i = 0; i<=10; i++){
            list.add(Math.random());
        }
        //when
        list.get(5);
        //then
        boolean test = false;
        if(list.get(5) instanceof Element){
            test = true;
        }
        Assertions.assertTrue(test);
    }

}

