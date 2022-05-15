import javax.print.DocFlavor;

/**
 * 工具类
 * 测试
 * @ author:Tony
 * @ date 2022/5/14 16:47
 * @ version 1.0
 * @ description:TODO
 */
public class Tool {
    char[] invalid = {' ','\'','*','?','<','>','.'};
     static String special = "@#$!<>.";
    /**
     * @ description:用户名最多25个字符长度，不能包含空格，单双引号 问号等特殊符号
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
         * 密码6-18位，只能包含字母，数字，特殊符号（下划线 @，#，$，！）
         * 纯数字，纯字母，密码强度都是弱 **
         * 数字 + 密码，数字 + 符号， 数字 + 字母 强度为中 ***
         * 同时存在三种字符，强度为强 *****
         * @ param:
         * @ return: 如果返回值为空，那么密码的验证失败，验证成功，则返回星号表示密码强度
        */
        public  String validPassword(String password){
            String power = "";      //密码强度
            if(password == null) return power;

            if(password.length() > 18 || password.length() < 6) return power;

            for (int i = 0; i < password.length(); i++) {
                 if(!Character.isLetterOrDigit(password.charAt(i))){        //如果不是字母或数字，并且也不是合法的特殊符号，则证明非法格式
                     if(!special.contains(Character.toString(password.charAt(i)))){
                         return power;
                     }
                 }
            }//下面开始判断字符强度

            //if, else if语句里，前一个判断为false,才会执行下一个判断
            if(isDigit(password) || isCharacter(password)){    //是否全部由数字或者字母构成
                power = "★★☆☆☆☆";
            }else if(isDigitAndCharacter(password)){      //是否全部由数字和字母构成
                power = "★★★★☆☆";
            }else if(isContaiDigit(password)){           //是否包含数字
                power = "★★★★☆☆";
            }else if(isContainsSymboy(password)){       //是否包含特殊符号
                //当前三个判断都为false时，才会有有这个判断，故为全部包含
                power = "★★★★★★";
            }

            return power;
        }
        
        /**
         * 判断一个字符串是不是一个纯数字
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
         * 判断是不是一个纯字母
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
     * 密码中含有特殊字符
     * @ param:
     * @ return:
    */
    private  boolean isContainsSymboy(String password){
        for (int i = 0; i < password.length(); i++) {

            if (!password.contains(Character.toString(special.charAt(i)))){
                return false;
            }
        }
        return true;

            if (password.contains(Character.toString(special.charAt(i)))){
                return true;
            }
        }
        return false;
   }
    
    /**
     * 密码中含有合法字母和数字
     * @ param: 
     * @ return: 
    */
    private static boolean isDigitAndCharacter(String password){
        for (int i = 0; i < password.length(); i++) {

            if (Character.isLetterOrDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }


            if (!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 密码中是否包含数字
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




}
