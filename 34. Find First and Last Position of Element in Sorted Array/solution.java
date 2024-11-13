//Binary Search
class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = findFirstIndex(nums, target);
        ans[1] = findLastIndex(nums, target);
        return ans;

    }
    public int findFirstIndex(int[] nums, int target) {

        int start = 0;
        int n = nums.length;
        int end = n - 1;
        int firstIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
            }
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstIndex;
    }
    public int findLastIndex(int[] nums, int target) {
        int start = 0;
        int n = nums.length;
        int end = n - 1;
        int lastIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastIndex = mid;
            }
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastIndex;
    }
}
//two pointers, binary search
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int firstIndex = -1, lastIndex = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                lastIndex = mid;
                while (firstIndex > 0 && nums[firstIndex - 1] == target) {
                    firstIndex--;
                }
                while (lastIndex < nums.length - 1 && nums[lastIndex + 1] == target) {
                    lastIndex++;
                }
                break;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return new int[]{firstIndex, lastIndex};
    }
}
