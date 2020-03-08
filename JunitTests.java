package hw6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.test;

class JunitTests {
	//private DiceBag test = new DiceBag();
    
    void test1() {
        //private OrderDie myDie = new OrderDice();
        //myDie.setDescription("red");

        System.out.println("Test 1");
        assertEquals("red", OrderDie.toString("red"));
    }
    
    void test2() {
        System.out.println("Test 2");
        assertEquals(" Dice left: 1\nred\n", DiceBag.toString());
    }
    
    void test3() {
        System.out.println("Test 3");
        assertEquals("red", DiceBag.addToken("red"));
    }
}