/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.so.thirdtask.Main;
import org.junit.Test; 

public class MainTest {

    public MainTest() {
    }

    @Test
    public void test() {
        Main h = new Main();
        System.out.println(h.sum(h.factorial(100).toString()));
    }
}
