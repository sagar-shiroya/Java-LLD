package Design_Pattern.Registry;

public class NirmaUniversity {
    public static void main(String[] args) {
        // Create prototype of LLD-2 batch of Jan 2024
        Student JanLLD2_2024 = new Student("Jan2024LLD2", "Sandeep S", "LLD-2", "01-01-2024","10-02-2024", "TTS");

        // Student of Batch Jan2024LLD2: Sagar Shiroya, sagar.shiroya8@gmail.com
        Student sagar = JanLLD2_2024.clone();
        sagar.setName("Sagar Shiroya");
        sagar.setPassword("sdfsdfeasrwegsdg");
        sagar.setEmail("sagar.shiroya8@gmail.com");


        // Create another prototype of DSA batch of Feb 2024
        Student FebDSA_2024 = new Student("Feb2024DSA", "Satyaanshu", "DSA", "01-02-2024", "31-12-2024", "MWF");

        // Student of DSA Feb 2024 Batch: Aman Garg, aman.garg@gmail.com
        Student aman = FebDSA_2024.clone();
        aman.setName("Aman Garg");
        aman.setEmail("aman.garg@gmail.com");
        aman.setPassword("234544sgddfgdf45fghfgh");


        // We can have multiple batches prototype already created, store it and reuse it to clone - It is called REGISTRY Design Pattern
        // Add above two batches to registry
        StudentRegistry registry = StudentRegistry.getInstance();
        registry.addPrototype("Jan2024LLD2", JanLLD2_2024);
        registry.addPrototype("Feb2024DSA", FebDSA_2024);


        // If I want to create one more student to any of the above batches then
        Student ankit = registry.getPrototype("Jan2024LLD2").clone();
        ankit.setName("Ankit Sharma");
        ankit.setEmail("ankit.sharma@gmail.com");
        ankit.setPassword("jkbjkb234jklnsarwe034");

        //Display all batches
        System.out.println("Batches:");
        System.out.println(JanLLD2_2024);
        System.out.println(FebDSA_2024);
        System.out.println();

        //Display all students
        System.out.println("Students:");
        System.out.println(sagar);
        System.out.println(aman);
        System.out.println(ankit);
    }
}
