package Advanced;
/* 随机产生一组数列，并判断偶数有哪些*/
public class NumCount {
	      int array[];
          public void Numcount(int N) {
        	 array = new int[N];
      		for (int i = 0; i < array.length; i++) {
      			array[i] = ((int)(Math.random() * 10000)) % 1001;   //0 - 1000的随机数
      		}
      	
            for (int j = 0; j < array.length; j++) {
      		System.out.println(" "+array[j]);}
            System.out.println("其中偶数的为");
            for (int i = 0; i < array.length; i++) {
				if(array[i] % 2 == 0) {
					System.out.printf("%d  ",array[i]);					
				}
			}
            System.out.println(" ");
            System.out.println("其中奇数的为");
            for (int i = 0; i < array.length; i++) {
				if(array[i] % 2 != 0) {
					System.out.printf("%d  ",array[i]);}				
			     }  
		}
       public void SeacherNum(int num,int array[]){
    	   int i;
    	   int Index = -1;
    	   for (i = 0; i < array.length; i++) {
			if(num == array[i]) {
				Index = i;
			   System.out.println("找到了，是第" +(Index + 1)); 
			    break;
			}
			
		}
    	 if(Index == -1) {
    		 System.out.println("没找到"); 
    	 }
	
       }
}
