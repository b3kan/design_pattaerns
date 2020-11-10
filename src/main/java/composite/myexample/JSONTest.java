package main.java.composite.myexample;

import java.util.Arrays;

public class JSONTest {

    public static void main(String... args){
        JSONObject root = new JSONRoot();
        root.setKey("test");

        JSONObject childRoot = new JSONRoot();
        childRoot.setKey("test2");

        JSONObject jsonElement = new JSONElement();
        jsonElement.setValue(Arrays.asList("tbtc", "tltc"));

        childRoot.addJsonObject(jsonElement);

        root.addJsonObject(childRoot);

        System.out.println(root.toJSONString());
    }

}
