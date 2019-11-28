package prototype;

/**
 * @author Johnson
 * @date 2019/11/21 20:37
 */
public abstract class Prototype {
    private String  id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    @Override
    public abstract  Prototype clone();
}
