package Advanced;
/* �������һ�����У����ж�ż������Щ*/
public class NumCount {
	      int array[];
          public void Numcount(int N) {
        	 array = new int[N];
      		for (int i = 0; i < array.length; i++) {
      			array[i] = ((int)(Math.random() * 10000)) % 1001;   //0 - 1000�������
      		}
      	
            for (int j = 0; j < array.length; j++) {
      		System.out.println(" "+array[j]);}
            System.out.println("����ż����Ϊ");
            for (int i = 0; i < array.length; i++) {
				if(array[i] % 2 == 0) {
					System.out.printf("%d  ",array[i]);					
				}
			}
            System.out.println(" ");
            System.out.println("����������Ϊ");
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
			   System.out.println("�ҵ��ˣ��ǵ�" +(Index + 1)); 
			    break;
			}
			
		}
    	 if(Index == -1) {
    		 System.out.println("û�ҵ�"); 
    	 }
	
       }
}
