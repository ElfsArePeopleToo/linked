package ru.levelup;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by Ирина on 20.11.2017.
 */
public class ListTest {

    @Test
    public void testAdd_validParams_returnTrue(){
        //setup
        List list = new List();
        //when
        list.add(Math.random());
        //then
        boolean test;
        if(list.getHead() == null){
            test = false;
        } else {
            test = true;
        }
        Assertions.assertTrue(test);
    }

    @Test
    public void testAdd_validParams_returnFalse(){
        //setup
        List list = new List();
        //when

        //then
        boolean test = true;
        if(list.getHead() == null){
            test = false;
        }
        Assertions.assertFalse(test);
    }

    @Test
    public void testRemove_validElement_returnTrue(){
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
    public void testRemove_validElement_returnFalse(){
        // setup
        List list = new List();
        list.add(33);
        list.add(22);
        list.add(55);
        list.add(66);
        // when
        Element element = new Element(100);
        list.remove(element);
        // then
        boolean test = false;
        Element current = list.getHead();
        Element previous;

        while(current.next != null){
            if(current.equals(element)){
                test = true;
            }
            previous = current;
            current = current.next;
        }
        Assertions.assertFalse(test);
    }

    @Test
    public void testRemove_validIntAsIndex_returnTrue(){
        //setup
        List list = new List();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        //when
        Element elementDel = list.get(5);
        list.remove(5);
        //then
        boolean test = true;
        Element current = list.getHead();
        Element previous;

        while(current.next != null){
            if(current == elementDel){
                test = false;
            }
            previous = current;
            current = current.next;
        }


        Assertions.assertTrue(test);
    }

    @Test
    public void testRemove_validIntAsIndex_returnFalse(){
    //setup
    List list = new List();
    int j = 10;
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
    //when
    Element element = new Element(list.get(5));
    list.remove(5);
    //then
    boolean test;
    if(list.get(5).equals(element)){
        test = true;
    } else {
        test = false;
    }

    Assertions.assertFalse(test);
}


    @Test
    public void testGet_validIntIndex_returnElement(){
        //setup
        List list = new List();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        //when
        list.get(5);
        Element element = new Element(5);
        //then
        boolean test = false;
        if(list.get(6).equals(element)){
            test = true;
        }
        Assertions.assertTrue(test);
    }

    @Test
    public void testGet_validIntIndex_returnEmpty() {
        //setup
        List list = new List();
        //when
        Element element = list.get(1);
        //then
        boolean test;
        if(element.equals("The list is empty")){
            test = true;
        }else{
            test = false;
        }
        Assertions.assertTrue(test);
    }

    @Test
    public void testGet_validIntIndex_returnNotFound(){
        //setup
        List list = new List();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        //when
        Element element = list.get(9);
        //then
        boolean test;
        if(element.equals("Not found")){
            test = true;
        } else {
            test = false;
        }
    }

}

///последние 3 теста не проходят, не понимаю как правильно протестировать или вообще стоит переписать метод?
// насчет testRemove_validIntAsIndex_returnFalse() тоже не уверена
