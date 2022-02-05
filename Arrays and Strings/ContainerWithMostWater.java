public class ContainerWithMostWater {
    public static void main(String[] args){
    }

    public static int maxArea(int [] height){
        
        int a = 0;
        int b = height.length -1;
        int max = 0;
        
        while(a < b){
            if(height[a] < height[b]){
                max = Math.max(max, (b-a)*height[a]);
                a++;
            }else{
                max = Math.max(max, (b-a)*height[b]);
                b--;
            }
        }
        return max;
    }
}
