package problems;

public class remove_element {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        remove_element re = new remove_element();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int newLength = re.removeElement(nums, val);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        // for (int i = 0; i < newLength; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        for (int i:nums){
            System.out.print(nums[i]+" ");
        }
    }
}
