# @param {Integer[]} nums
# @param {Integer} target
# @return {Integer[]}
def two_sum0(nums, target)
    nums.each_with_index do |e, i|
        idx = nums.index(target - e)
        return [i, idx] if idx && idx != i
    end
end

def two_sum(nums, target)
    map = {}
    nums.each_with_index do |e, i|
        return [map[e], i] if map.has_key?(e)
        map[target - e] = i
    end
end