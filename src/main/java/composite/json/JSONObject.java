package main.java.composite.json;

import java.util.List;

public interface JSONObject {

    List<JSONObject> getNodes();

    String getKey();

    Object getValue();

    void addJsonObject(JSONObject jsonObject);

    void setKey(String key);

    void setValue(Object value);

    String toJSONString();
}
