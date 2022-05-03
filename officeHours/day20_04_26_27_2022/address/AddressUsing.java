package day20_04_26_27_2022.address;

public class AddressUsing {
    public static void main(String[] args) {

        Address address = new Address("Hoffman ave", "Park Ridge", "IL","600","USA");
        System.out.println(address);
        address.setStreet("  ");
        System.out.println(address.getStreet());
        address.setZipcode("600444444");
        System.out.println(address.getZipcode());

    }
}
