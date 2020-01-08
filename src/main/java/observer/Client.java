package observer;

/**
 * @author Johnson
 * @date 2019/12/26 20:21
 */
public class Client {
    public static void main1(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer = new ConcreteObserver("观察1", subject);
        ConcreteObserver observer1 = new ConcreteObserver("观察2", subject);


        subject.attach(observer);
        subject.attach(observer1);

        subject.getSubjectState();
        subject.setSubjectState("fuck");

        subject.notifyObserver();
    }

    public static void main(String[] args) {
        Client client = new Client();

        client.twoSum(new int[]{0,4,3,0}, 0);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(temp>target){
                continue;
            }
            results[0] = i;
            for(int j=i+1;j<nums.length;j++){
                if(target-temp == nums[j]){
                    results[1] = j;
                    return results;
                }
            }
        }

        return  results;

    }
}
