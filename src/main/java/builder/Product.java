package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Johnson
 * @date 2019/11/28 20:15
 */
public class Product {
    List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("产品-创建");
        for(String part: parts){
            System.out.println(part);
        }
    }
}
