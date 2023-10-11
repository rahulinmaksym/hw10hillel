
package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Phonebook {

    public List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for(Record record : records) {
            if(Objects.equals(record.getName(), name)) return record;
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for(Record record : records) {
            if(Objects.equals(record.getName(), name)) result.add(record);
        }
        return result;
    }

}
