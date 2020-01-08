package state;

/**
 * @author Johnson
 * @date 2020/1/7 14:33
 */
public class BeforeHomeState extends State {
    @Override
    public void writeProgramme(Work w) {
        if(w.getHour() < 20){
            System.out.println("on the way home");
        }else{
            w.setState(new HomeState());
            w.writeProgramme();
        }
    }
}
