package com.baidu.iit;

/**
 * Created by IntelliJ IDEA.
 * User: lihan01
 * Date: 11-11-10
 * Time: 下午2:26
 * To change this template use File | Settings | File Templates.
 */
public class Rover {
    private Coordinate coordinate;
    public Rover(int x, int y, Coordinate.Direction direction){
        coordinate = new Coordinate(x,y,direction);
    }
    public void receive(String command) {
        System.out.println("move");
    }

    public void move() {
        switch (this.coordinate.getDirection()) {
            case N:
                this.coordinate.setY(this.coordinate.getY()+1);
                break;
             case E:
                this.coordinate.setX(this.coordinate.getX()+1);
                break;
             case W:
                this.coordinate.setX(this.coordinate.getX()-1);
                break;
             case S:
                this.coordinate.setY(this.coordinate.getY()-1);
                break;
             default:
                 throw new IllegalArgumentException();
        }
    }
    public String getWhere(){
       return this.coordinate.toString();
    }
}
