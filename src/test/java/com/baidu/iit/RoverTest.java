package com.baidu.iit;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: lihan01
 * Date: 11-11-10
 * Time: 下午2:28
 * To change this template use File | Settings | File Templates.
 */
public class RoverTest {
    @Test
    public void testRover() {
        Rover rover = new Rover(1, 2, Coordinate.Direction.N);
        Assert.assertEquals("(1,2,N)", rover.getWhere());
    }

    @Test
    public void testRoverMove_N() {
        Rover rover = new Rover(1, 2, Coordinate.Direction.N);
        rover.move();
        Assert.assertEquals("(1,3,N)", rover.getWhere());
    }


    @Test
    public void testRoverMove_E() {
        Rover rover = new Rover(1, 2, Coordinate.Direction.E);
        rover.move();
        Assert.assertEquals("(2,2,E)", rover.getWhere());
    }

       @Test
    public void testRoverMove_S() {
        Rover rover = new Rover(1, 2, Coordinate.Direction.S);
        rover.move();
        Assert.assertEquals("(1,1,S)", rover.getWhere());
    }

       @Test
    public void testRoverMove_W() {
        Rover rover = new Rover(1, 2, Coordinate.Direction.W);
        rover.move();
        Assert.assertEquals("(0,2,W)", rover.getWhere());
    }
}
