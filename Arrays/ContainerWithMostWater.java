public class ContainerWithMostWater {
    public static int maxArea(int []height){
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while(start < end){
            maxArea = Math.max(maxArea, (end-start)*Math.min(height[start], height[end]));
            if(height[start] < height[end])
            start++;
            else
            end--;
        }
        return maxArea;
    }
    public static void main(String args[]){
        int []heights = {1,8,6,2,5,4,9,3,7};
        System.out.println(maxArea(heights));
    }
}
