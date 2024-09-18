#include <stdio.h>
#include <stdlib.h>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if (n <= 2) return 0;
        
        vector<int> leftMax(n), rightMax(n);
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        
        for (int i = 1; i < n; i++) {
            leftMax[i] = max(leftMax[i-1], height[i]);
        }
        
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = max(rightMax[i+1], height[i]);
        }
        
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += min(leftMax[i], rightMax[i]) - height[i];
        }
        
        return water;
    }
};

int main() {
    Solution solution;
    vector<int> height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
    vector<int> height2 = {4,2,3};
    
    printf("Example 1 output: %d\n", solution.trap(height1));
    printf("Example 2 output: %d\n", solution.trap(height2));
    
    return 0;
}