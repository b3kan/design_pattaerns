package main.java.composite.json;

import java.util.Collection;
import java.util.List;

public class JSONElement implements JSONObject{

    private Object value;

    @Override
    public List<JSONObject> getNodes() {
        throw new UnsupportedOperationException("Invalid operation");
    }

    @Override
    public void addJsonObject(JSONObject jsonObject) {
        throw new UnsupportedOperationException("Invalid operation");
    }

    @Override
    public void setKey(String key) {
        throw new UnsupportedOperationException("Invalid operation");
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String getKey() {
         throw  new UnsupportedOperationException("Invalid operation");
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public String toJSONString() {
        StringBuilder json = new StringBuilder();
        if (value instanceof Collection){
            json.append("[");
            ((Collection<?>) value).forEach(i -> json.append("\"").append(i).append("\","));
            json.append("]");
        } else {
            json.append("\"").append(value).append("\"");
        }
        return json.toString();
    }
}
