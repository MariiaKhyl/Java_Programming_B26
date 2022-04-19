package day48_encapsulation.shape1;

public class SquareShape {

    int side;

    public SquareShape(int side){
        setSide(side);
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if(side > 0){
            this.side = side;
        }
    }
    public int calculateArea(){
        return side*side;
    }
    public int calculatePerimeter(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square Shape: " + "side - " + side+ "\nArea - "+ calculateArea()+"\nPerimeter "+calculatePerimeter();
    }
}
