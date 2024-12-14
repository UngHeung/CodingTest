function solution(nums) {
  const max = nums.length / 2 | 0;
  const map = new Set(nums);
  const mixs = map.size;
  return max < mixs ? max : mixs;
}