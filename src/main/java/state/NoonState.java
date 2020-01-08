package state;

import state.State;
import state.Work;

/**
 * @author Johnson
 * @date 2020/1/6 20:55
 */
public class NoonState extends State {
    @Override
    public void writeProgramme(Work w) {
        if(w.getHour()<13){
            System.out.println("time:"+w.getHour()+"-eating");
        }else{
            w.setState(new AfterNoonState());
            w.writeProgramme();
        }
    }
}
