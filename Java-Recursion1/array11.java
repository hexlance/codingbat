public int array11(int[] nums, int index) {
  if (index == nums.length) return 0;
  if (nums[index] == 11) {
    index++;
    return 1 + array11(nums,index);
  } else {
    index++;
    return array11(nums,index);
  }
}