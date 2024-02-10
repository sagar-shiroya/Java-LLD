package Design_Pattern.Registry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> batchesMap;
    private static StudentRegistry instance;

    private StudentRegistry() {
        this.batchesMap = new HashMap<>();
    }

    public void addPrototype(String batchName, Student batchPrototype){
        batchesMap.put(batchName, batchPrototype);
    }

    public Student getPrototype(String batchName){
        return batchesMap.get(batchName);
    }

    public static StudentRegistry getInstance(){
        if(instance == null){
            instance = new StudentRegistry();
        }
        return instance;
    }
}
