/**
 * 
 */
package Advanced;

/**
 * @author Tony
 * @version 1.0
 * @data 2022��5��5������3:25:46
 * @conpyright The GeekTeam
 * @description
 * ǰ��Ҫ�󣺸������������Ϊ��С�������������
 * ���Ƚ�Ҫ���ҵ�Ԫ�ظ�������м�Ԫ�رȽ�
 * 1.���seachNumС���м�Ԫ�أ�ֻ��Ҫ�������ǰ��ε�Ԫ���м�������
 * 2.���seachNum���м�Ԫ����ȣ���ƥ��ɹ������ҳɹ�
 * 3.���seachNum�����м�Ԫ�أ�ֻ��Ҫ�ں���Ԫ���м�������
 */
public class choiceSort {
           void sort(int array[]){
        	  //ѡ������ÿ��ѭ��������i��ֵ��minIndex��ֵ
            for (int i = 0; i < array.length; i++) {
            	int min = array[i];   //������СֵΪi
                int minIndex = i;     //��Сֵ���±�
                for (int j = 1 + i; j < array.length; j++) {
					if (min > array[j]) {
						min = array[j];
						minIndex = j;
					}
					int temp = array[i];
					array[i] = array[minIndex];
					array[minIndex] = temp;
				  }
               } 
            }
           void BinarySearch(int array[],int seachNum) { 
        	   int hight = array.length - 1;    //�Ͻ��±�
        	   int low = 0;                     //�½��±�
        	   while (hight >= low) {
				int mid = (hight  + low) / 2;   //�����е��±�
				if(seachNum > array[mid]) {
					low = mid + 1;
				}
				else if (seachNum < array[mid]) {
					hight = mid - 1;
				}else {
					System.out.println("�ҵ��ˣ��±�Ϊ" +mid);
					break;	
				   }
			 }      	  
           }
           /**  ɾ��Ԫ�ز���
            * 1.�ҵ�Ҫɾ����Ԫ�ص��±�delIndex = 3
            * 2.��Ҫɾ���±꿪ʼ������һ��Ԫ�ظ�ֵ��ǰ���Ԫ��-����
            * 3.�����ܳ��ȼ�һ
            * @param delNum Ҫɾ����Ԫ��
            * @param array  Ҫ����������
            */
           void DeleteNum(int delNum, int array[]) {
        	   int delNumIndex = -1;
        	   int count = array.length;
        	for (int i = 0; i < count; i++) {
				if (delNum == array[i]) {
					delNumIndex = i;
				}
			}
        	for(int i = delNumIndex; i < count - 1; i++) {
        		array[i] = array[i + 1];
        	}
        	for (int i = 0; i < count; i++) {
				System.out.print(array[i] +" ");
			}
        	   
           }
}
