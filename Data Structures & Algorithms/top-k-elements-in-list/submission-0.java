class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> frequencies = new ArrayList<>();

        // 1. Count frequencies using a single pass
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            // Store as {number, frequency}
            frequencies.add(new int[]{nums[i], count});
        }

        // 2. Sort the list by frequency (descending)
        frequencies.sort((a, b) -> b[1] - a[1]);

        // 3. Pick the top K numbers
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = frequencies.get(i)[0];
        }

        return result;
    }
}
