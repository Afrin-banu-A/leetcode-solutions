class Solution:
    def minSwaps(self, nums: List[int]) -> int:
        n = len(nums)
        arr = sorted(nums, key=lambda x: (self.digitSum(x), x))
        pos = {}
        for i in range(n):
            pos[arr[i]] = i

        v = [False] * n
        swaps = 0

        for i in range(n):
            if v[i]:
                continue
            j = i
            count = 0
            while not v[j]:
                v[j] = True
                count += 1
                j = pos[nums[j]]

            swaps += count - 1
        return swaps
    def digitSum(self, num):
        total = 0
        while num > 0:
            total += num % 10
            num //= 10
        return total