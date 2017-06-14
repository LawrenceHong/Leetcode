public class Solution {
    public void sortColors(int[] nums) {
        qsort(nums, 0, nums.length -1);
    }
    
    private static void qsort(int[] arr, int left, int right){
        if (left < right){
            int pivot=partition(arr, left, right);        //将数组分为两部分
            qsort(arr, left, pivot-1);                   //递归排序左子数组
            qsort(arr, pivot+1, right);                  //递归排序右子数组
        }
    }
    private static int partition(int[] arr, int left, int right){
        int pivot = arr[left];     //枢轴记录
        while (left<right){
            while (left<right && arr[right]>=pivot) --right;
            arr[left]=arr[right];             //交换比枢轴小的记录到左端
            while (left<right && arr[left]<=pivot) ++left;
            arr[right] = arr[left];           //交换比枢轴小的记录到右端
        }
        //扫描完成，枢轴到位
        arr[left] = pivot;
        //返回的是枢轴的位置
        return left; 
    }
}