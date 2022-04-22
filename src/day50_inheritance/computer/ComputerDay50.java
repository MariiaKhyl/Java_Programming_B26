package day50_inheritance.computer;

public class ComputerDay50 {

    String os;
    int memory;

    public ComputerDay50(String os, int memory){
        this.os = os;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "ComputerDay50{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
