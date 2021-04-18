public class NextGreaterElement {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] resultArray = new int[nums1.length];
		int flag=0, max;        
		for(int i=0;i<nums1.length;i++){
			max=0;
			flag=0;
			for(int j=0;j<nums2.length;j++){
				if(nums2[j]==nums1[i])
					flag=1;
				else if(flag==1 && nums2[j]>nums1[i]){
					max=nums2[j];
					break;
				}
			}
			resultArray[i]= max!=0 ? max : -1 ;
		}
		return resultArray;
    }
}
