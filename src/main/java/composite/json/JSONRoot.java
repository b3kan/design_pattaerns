package main.java.composite.json;

import java.util.ArrayList;
import java.util.List;

public class JSONRoot implements JSONObject{

    private List<JSONObject> jsonObjects = new ArrayList<>();
    private String key;

    @Override
    public List<JSONObject> getNodes() {
        return jsonObjects;
    }

    @Override
    public void addJsonObject(JSONObject jsonObject) {
        jsonObjects.add(jsonObject);
    }

    @Override
    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public void setValue(Object value) {
        throw  new UnsupportedOperationException("Invalid operation");
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        throw  new UnsupportedOperationException("Invalid operation");
    }

    @Override
    public String toJSONString() {
        StringBuilder json = new StringBuilder();
        json.append("{");
        json.append("\"").append(key).append("\":");
        for (int i=0; i<jsonObjects.size(); i++){
            json.append(jsonObjects.get(i).toJSONString());
        }
        json.append("}");
        return json.toString();
    }
}
