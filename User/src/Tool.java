import javax.print.DocFlavor;

/**
 * ������
 * ����
 * @ author:Tony
 * @ date 2022/5/14 16:47
 * @ version 1.0
 * @ description:TODO
 */
public class Tool {
    char[] invalid = {' ','\'','*','?','<','>','.'};
     static String special = "@#$!<>.";
    /**
     * @ description:�û������25���ַ����ȣ����ܰ����ո񣬵�˫���� �ʺŵ��������
     * @ param:
     * @ return:
    */
        public  boolean isCorrectUserName(String userName){
            boolean isCorrectUserName = true;
            if(userName.length() > 25) return false;

            for (char ch : this.invalid) {
                    if(userName.contains(Character.toString(ch))){
                        isCorrectUserName = false;
                        break;
                    }
            }
            return isCorrectUserName;
        }

        /**
         * ����6-18λ��ֻ�ܰ�����ĸ�����֣�������ţ��»��� @��#��$������
         * �����֣�����ĸ������ǿ�ȶ����� **
         * ���� + ���룬���� + ���ţ� ���� + ��ĸ ǿ��Ϊ�� ***
         * ͬʱ���������ַ���ǿ��Ϊǿ *****
         * @ param:
         * @ return: �������ֵΪ�գ���ô�������֤ʧ�ܣ���֤�ɹ����򷵻��Ǻű�ʾ����ǿ��
        */
        public  String validPassword(String password){
            String power = "";      //����ǿ��
            if(password == null) return power;
<<<<<<< HEAD

=======
            if(password.length() > 18 || password.length() < 6) return power;
>>>>>>> LaoJIU
            for (int i = 0; i < password.length(); i++) {
                 if(!Character.isLetterOrDigit(password.charAt(i))){        //���������ĸ�����֣�����Ҳ���ǺϷ���������ţ���֤���Ƿ���ʽ
                     if(!special.contains(Character.toString(password.charAt(i)))){
                         return power;
                     }
                 }
            }//���濪ʼ�ж��ַ�ǿ��
<<<<<<< HEAD
            if (isNumber(password) || isCharacter(password)) {
                power = "**";
            }else if (isCharacter(password) && isContainsSymboy(password) ){
                power = "***";
            }else if (isDigitAndCharacter(password)){
                power = "*****";
            }else if (isDigitAndSymboy(password)){
                power = "******@";
            }else if (isDigitAndCharacter(password) && isContainsSymboy(password)){
                power = "*****";
            }
=======
            //if, else if����ǰһ���ж�Ϊfalse,�Ż�ִ����һ���ж�
            if(isDigit(password) || isCharacter(password)){    //�Ƿ�ȫ�������ֻ�����ĸ����
                power = "�������";
            }else if(isDigitAndCharacter(password)){      //�Ƿ�ȫ�������ֺ���ĸ����
                power = "�������";
            }else if(isContaiDigit(password)){           //�Ƿ��������
                power = "�������";
            }else if(isContainsSymboy(password)){       //�Ƿ�����������
                //��ǰ�����ж϶�Ϊfalseʱ���Ż���������жϣ���Ϊȫ������
                power = "�������";
            }


>>>>>>> LaoJIU
            return power;
        }
        
        /**
         * �ж�һ���ַ����ǲ���һ��������
         * @ param:
         * @ return: 
        */
        private static boolean isDigit(String password){
            for (int i = 0; i < password.length(); i++) {
                 if(!Character.isDigit(password.charAt(i))){
                     return false;
                 }
            }
            return true;
        }

        /**
         * �ж��ǲ���һ������ĸ
         * @ param:
         * @ return:
        */
        private static boolean isCharacter(String password){
        for (int i = 0; i < password.length(); i++) {
            if(!Character.isDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * �����к��������ַ�
     * @ param:
     * @ return:
    */
    private  boolean isContainsSymboy(String password){
        for (int i = 0; i < password.length(); i++) {
<<<<<<< HEAD
            if (!password.contains(Character.toString(special.charAt(i)))){
                return false;
            }
        }
        return true;
=======
            if (password.contains(Character.toString(special.charAt(i)))){
                return true;
            }
        }
        return false;
>>>>>>> LaoJIU
    }
    
    /**
     * �����к��кϷ���ĸ������
     * @ param: 
     * @ return: 
    */
    private static boolean isDigitAndCharacter(String password){
        for (int i = 0; i < password.length(); i++) {
<<<<<<< HEAD
            if (Character.isLetterOrDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
    private  boolean isDigitAndSymboy(String password){
         boolean  judged =  isContainsSymboy(password);
         boolean  judged2 = isNumber(password);
         if(judged == true || judged2 == true ){
             return true;
         }
         return false;
    }

=======
            if (!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * �������Ƿ��������
     * @ param:
     * @ return:
    */
    private boolean isContaiDigit(String password){
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                return true;}
          }
        return false;
    }


>>>>>>> LaoJIU

}
