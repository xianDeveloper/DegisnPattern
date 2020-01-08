package state;

/**
 * @author Johnson
 * @date 2020/1/6 20:51
 */
public class ForenoonState extends State {
    @Override
    public void writeProgramme(Work w) {

        if(w.getHour()<12){
            System.out.println("time:"+w.getHour()+"-working");
        }else{
            w.setState(new NoonState());
            w.writeProgramme();
        }
    }
}
