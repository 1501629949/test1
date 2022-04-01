package org.bwf.study.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static <T> T json2Object(String strBody, Class<T> c) throws JsonParseException, JsonMappingException, IOException{
        if (strBody == null || "".equals(strBody)) {
            return null;
        }
        else {
            return OBJECT_MAPPER.readValue(strBody, c);
        }
    }

    public static <T> T decodeJson(String strBody, Class<T> c) {
        if (strBody == null || "".equals(strBody)) {
            return null;
        }
        else {
            try {
                return OBJECT_MAPPER.readValue(strBody, c);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static Object json2ComplexObject(String strBody) throws JsonParseException, JsonMappingException, IOException{
        if (strBody == null || "".equals(strBody)) {
            return null;
        }
        else {
            // 每个属性的实际类型是string
            return OBJECT_MAPPER.readValue(strBody, Object.class);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> json2ObjectList(String strBody,Class<T> c) throws JsonParseException, JsonMappingException, IOException{
        if (strBody == null || "".equals(strBody)) {
            return null;
        }
        else {
            JavaType javaType = OBJECT_MAPPER.getTypeFactory().constructParametricType(ArrayList.class, c);
            return (List<T>) OBJECT_MAPPER.readValue(strBody, javaType);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> List<T> decodeJsonToList(String strBody,Class<T> c) {
        if (strBody == null || "".equals(strBody)) {
            return null;
        }
        else {
            JavaType javaType = OBJECT_MAPPER.getTypeFactory().constructParametricType(ArrayList.class, c);
            try {
                return (List<T>) OBJECT_MAPPER.readValue(strBody, javaType);
            } catch (IOException e) {
                e.printStackTrace();

                return null;
            }
        }
    }

    public static List<String> json2List(String strBody) throws JsonParseException, JsonMappingException, IOException{
        return json2ObjectList(strBody, String.class);
    }
    public static String object2Json(Object o) throws JsonProcessingException{
        return OBJECT_MAPPER.writeValueAsString(o);
    }

    public static String encodeObject(Object o) {
        try {
            return OBJECT_MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
