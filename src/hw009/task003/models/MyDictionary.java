package hw009.task003.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyDictionary<TKey, TValue> {
    Map<TKey, TValue> myDictionaryList = new HashMap<TKey, TValue>();


    public void addKeyAndValue(TKey someValueOne, TValue someValueTwo) {
        myDictionaryList.put(someValueOne, someValueTwo);
    }

    public int getSizeOfMap() {
        return myDictionaryList.size();
    }

    public TValue getValueByKey(TKey someValue) {
        return myDictionaryList.get(someValue);
    }

    public Set<Map.Entry<TKey, TValue>> getAll() {
        return myDictionaryList.entrySet();
    }
}
