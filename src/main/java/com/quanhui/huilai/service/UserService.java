package com.quanhui.huilai.service;

import com.quanhui.huilai.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
    *  根据标签搜索用户
     *
    *  @return int
    */
    public List<User> SqlSearchUserByTags(List<String> list);


    /**
    *  根据内存查询
    * @Param
    *  @return java.util.List<com.quanhui.huilai.model.domain.User>
    */
    public List<User> memorySearchUserByTag(List<String> tagList);

    /**
     * 获取当前用户
     *
     *  @Param
     *  @return
    */
    User getCurrentUser(HttpServletRequest request);


    /**
     *  更改用户
     * @Param
     *  @return
    */
    int updateUser(User user, User loginUser);

    /**
     *  鉴权，是否为管理员
     *  @Param
     *  @return
    */
    boolean isAdmin(HttpServletRequest request);

    /**
     *  鉴权，是否为管理员
     *  @Param
     *  @return
     */
    boolean isAdmin(User loginUser);


    /**
     * 获取最匹配的用户
     *
     * @param num
     * @param user
     * @return
     */
    List<User> matchUsers(long num, User user);
}
