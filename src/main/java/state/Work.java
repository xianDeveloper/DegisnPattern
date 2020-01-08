package state;

import lombok.Data;

/**
 * @author Johnson
 * @date 2020/1/6 20:51
 */
@Data
public class Work {
    private int hour;
    private State state;

    public Work() {
        state = new ForenoonState();
    }

    public void writeProgramme() {
        state.writeProgramme(this);
    }
}
