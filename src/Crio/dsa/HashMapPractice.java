package Crio.dsa;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        //p_put();
        method2();
    }

    private static void p_put()
    {
//        HashMap<String,String> map = new HashMap<String,String>();
//        map.put("abhilash","first");
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.forEach((k,v) -> {
            System.out.println(k + "->"+ v);
        });
        capitalCities.remove("USA");
        capitalCities.remove("Germany", "Berlin");
        capitalCities.remove("Oslo");
        capitalCities.remove("England", "Cambridge");
//        System.out.println(capitalCities.size());
//        capitalCities.clear();
//        System.out.println(capitalCities.size());
        System.out.println(capitalCities.toString());
    }

    public static void method2() {
        HashMap<String,String> stringMap = new HashMap<String,String>();
        HashMap<String,Integer> studentRollNoMap = new HashMap<String,Integer>();

        studentRollNoMap.put("Abhilash",17);
        studentRollNoMap.put("Hemanth",18);
        studentRollNoMap.put("Naresh",19);

        System.out.println("Roll no of abhilash is : "+ studentRollNoMap.getOrDefault("Abhilash",0));
        System.out.println("Roll no of kumar is : "+ studentRollNoMap.getOrDefault("kumar",16));
        System.out.println("Roll no of hemanth is : "+ studentRollNoMap.get("Hemanth"));
        //System.out.println(studentRollNoMap);
        studentRollNoMap.forEach((k,v) -> {
            System.out.println(k +" ->"+ v);
        });
    }

}
