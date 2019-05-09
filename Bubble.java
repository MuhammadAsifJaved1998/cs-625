class Bubble {
public static void mian(String [] args) {
int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9,287, 49};
int a, b, c;
int size;
size = 10;
System.out.print("Original array is:");
for( int i =0; i<size; i++)
System.out.print(" " + nums[i]);
System.out.println();
for(a=1; a < size; a++)
for(b=size-1; b >= a; b--) {
if(nums[b-1] > nums [b]) {
size = nums[b-1];
nums[b-1] = nums [b];
nums[b] = size;
}
}
System.out.print("Sorted arrya is:");
for(int i=0; i < size; i++)
System.out.print(" " + nums[i]);
System.out.println();
}
}