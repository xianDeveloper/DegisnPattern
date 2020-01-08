package state;

/**
 * @author Johnson
 * @date 2020/1/6 20:57
 */
public class HomeState extends State {
    @Override
    public void writeProgramme(Work w) {
        System.out.println("home:"+w.getHour()+"-relaxing");
    }
}
