import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    //remove a given element (val) from an array
    //return the number of unique elements in the array
    private static int removeElement(int[] nums, int val) {
        int count = 0;
        LinkedList<Integer> vals = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val){
                count++;
                vals.add(i);
            } else {
                if (!vals.isEmpty()){
                    nums[vals.pollFirst()] = nums[i];
                    vals.add(i);
                }
            }
        }
        return nums.length-count;
    }
}