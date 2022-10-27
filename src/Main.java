public class Main {
    public static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.setModel("Asus");
        comp1.setProcessor("Intel");
        comp1.setMemory("8 Gb");

        Computer comp2 = new Computer();
        comp2.setModel("HP");
        comp2.setProcessor("AMD");
        comp2.setMemory("2 Gb");

        Computer comp3 = new Computer();
        comp3.setModel("Lenovo");
        comp3.setProcessor("Intel");
        comp3.setMemory("32 Gb");

        Computer comp4 = new Computer();
        comp4.setModel("Mac");
        comp4.setProcessor("M1");
        comp4.setMemory("16 Gb");

        Computer comp5 = new Computer();
        comp5.setModel("Acer");
        comp5.setProcessor("AMD");
        comp5.setMemory("4 Gb");

        Computer[] computers = new Computer[5];
        for (int i = 0 ; i < computers.length; i++) {
            switch (i) {
                case (0) -> computers[i] = comp1;
                case (1) -> computers[i] = comp2;
                case (2) -> computers[i] = comp3;
                case (3) -> computers[i] = comp4;
                case (4) -> computers[i] = comp5;
            }
        }

        System.out.println(computers[2].getProcessor());
    }
}