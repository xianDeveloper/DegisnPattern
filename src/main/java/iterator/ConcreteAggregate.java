package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Johnson
 * @date 2020/1/15 17:55
 */
public class ConcreteAggregate extends Aggregate {

    private List<Object> items = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public void set(int index, Object value){
        items.add(index, value);
    }
}
