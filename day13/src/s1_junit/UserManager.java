package s1_junit;

/**
 * 用户管理
 */
public class UserManager {

    /**
     * 根据用户名和登录
     * @param username 用户名
     * @param password 密码
     * @return 登录结果,true表示登录成功，false表示登录错误
     */
    public boolean login(String username, String password) {
        return "admin".equals(username) && "123".equals(password);
    }

    /**
     * 根据用户名查询用户是否存在
     * @param username 用户名
     * @return true表示已经存在，false表示不存在
     */
    public boolean selectByUsername(String username) {
        if(username.equals("admin")){
            return true;
        }else{
            System.out.println(1/0);
            return false;
        }
    }
}
