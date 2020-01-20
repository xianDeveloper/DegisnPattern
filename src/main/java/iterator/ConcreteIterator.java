package iterator;

import java.util.Iterator;

/**
 * @author Johnson
 * @date 2020/1/15 17:54
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {

        return current >= aggregate.count() ? false : true;
    }

    @Override
    public Object next() {
        current++;
        if (current < aggregate.count()) {
            return aggregate.get(current);
        }
        return null;
    }
}
