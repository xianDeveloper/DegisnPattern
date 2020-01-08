package state;

/**
 * @author Johnson
 * @date 2020/1/6 20:57
 */
public class AfterNoonState extends State {
    @Override
    public void writeProgramme(Work w) {
        if(w.getHour()<18){
            System.out.println("time:"+w.getHour()+"-working");
        }else{
            w.setState(new BeforeHomeState());
            w.writeProgramme();
        }
    }
}
