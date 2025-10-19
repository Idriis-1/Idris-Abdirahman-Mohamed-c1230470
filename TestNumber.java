public class TestNumber {
    public static void main(String[] args) {
        NumberStack<Double> ns = new NumberStack<Double>(5);

        ns.insert(15.8);
        ns.insert(17.7);
        ns.insert(32.4);
        ns.insert(23.5);
        ns.insert(35.6);

        ns.printData();


    }
}
